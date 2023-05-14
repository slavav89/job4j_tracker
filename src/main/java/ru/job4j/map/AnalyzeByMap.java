package ru.job4j.map;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int count = 0;
        double score = 0.0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
                count++;
            }
        }
        return score / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> pupilAverage = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int count = 0;
            double score = 0.0;
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
                count++;
            }
            Label pup = new Label(pupil.name(), score / count);
            pupilAverage.add(pup);
        }
        return pupilAverage;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> subjectAverage = new ArrayList<>();
        Map<String, Integer> a = new LinkedHashMap<>();
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                a.merge(subject.name(), subject.score(), Integer::sum);
            }
            count++;
        }
        for (Map.Entry<String, Integer> entry : a.entrySet()) {
            Label pup = new Label(entry.getKey(), (double) entry.getValue() / count);
            subjectAverage.add(pup);
        }
        return subjectAverage;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> student = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double score = 0.0;
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
            }
            Label pup = new Label(pupil.name(), score);
            student.add(pup);
        }
        student.sort(Comparator.naturalOrder());
        return student.get(student.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> subjectAverage = new ArrayList<>();
        Map<String, Integer> a = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                a.merge(subject.name(), subject.score(), Integer::sum);
            }
        }
        for (Map.Entry<String, Integer> entry : a.entrySet()) {
            Label pup = new Label(entry.getKey(), (double) entry.getValue());
            subjectAverage.add(pup);
        }
        subjectAverage.sort(Comparator.naturalOrder());
        return subjectAverage.get(subjectAverage.size() - 1);
    }
}