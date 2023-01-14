package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {
    @Test
    public void whenComparatorAscByName() {
        Comparator<Job> ascName = new JobAscByName();
        int rsl = ascName.compare(
                new Job("Ivan", 33),
                new Job("Dmitriy", 46)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorDescByName() {
        Comparator<Job> descName = new JobDescByName();
        int rsl = descName.compare(
                new Job("Ivan", 33),
                new Job("Dmitriy", 46)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorEqualByName() {
        Comparator<Job> descName = new JobDescByName();
        int rsl = descName.compare(
                new Job("Andrei", 33),
                new Job("Andrei", 46)
        );
        assertThat(rsl).isEqualTo(0);
    }

    @Test
    public void whenComparatorAscByPriority() {
        Comparator<Job> ascPriority = new JobAscByPriority();
        int rsl = ascPriority.compare(
                new Job("Ivan", 33),
                new Job("Dmitriy", 46)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorDescByPriority() {
        Comparator<Job> descPriority = new JobDescByPriority();
        int rsl = descPriority.compare(
                new Job("Ivan", 33),
                new Job("Dmitriy", 46)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorEqualByPriority() {
        Comparator<Job> ascPriority = new JobAscByPriority();
        int rsl = ascPriority.compare(
                new Job("Ivan", 46),
                new Job("Dmitriy", 46)
        );
        assertThat(rsl).isEqualTo(0);
    }

    @Test
    public void whenComparatorByDescNameAndDescPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorByAscPriorityAndAscName() {
        Comparator<Job> cmpPriorityName = new JobAscByPriority().thenComparing(new JobAscByName());
        int rsl = cmpPriorityName.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorByAscNameAndDescPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 2),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }
}