package com.test;

import java.util.Arrays;

public class Calculator<T> {

    public static int add(final String expression) {
        final String[] numbers = expression.split("\\D");

        return Arrays.stream(numbers)
                .map(Integer::parseInt)
                .reduce(Integer::sum)
                .orElse(0);
    }
}
