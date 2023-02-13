package ru.job4j.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FunctionCalculateTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunctionCalculate function = new FunctionCalculate();
        List<Double> result = function.diapason(10, 13, x -> x - 1);
        List<Double> expected = Arrays.asList(9D, 10D, 11D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResult() {
        FunctionCalculate function = new FunctionCalculate();
        List<Double> result = function.diapason(1, 4, x -> x * x + 1);
        List<Double> expected = Arrays.asList(2D, 5D, 10D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenIndicativeFunctionThenIndicativeResult() {
        FunctionCalculate function = new FunctionCalculate();
        List<Double> result = function.diapason(3, 5, x -> Math.pow(3, x));
        List<Double> expected = Arrays.asList(27D, 81D);
        assertThat(result).containsAll(expected);
    }
}