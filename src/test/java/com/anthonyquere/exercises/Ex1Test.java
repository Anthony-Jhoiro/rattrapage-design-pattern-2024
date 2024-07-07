package com.anthonyquere.exercises;

import com.anthonyquere.code.FizzBuzz;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class Ex1Test {
    /**
     * <div color="white">
     * ## Exercise 1: Fizz
     * <br>
     * In the `FizzBuzz` class, write a method `execute` that takes one argument, an array of strings, later called "arguments", and returns a string.
     * <p>
     * The first string in the arguments array is always the wanted functionality.
     * The next string are the other arguments.
     * No argument checking is required.
     * <p>
     * Example:
     * <pre>
     *     new FizzBuzz().execute(new String[]{"count", "10"});
     * </pre>
     * The functionality is "count", with the argument "10".
     * <hr>
     * <p>
     *
     * Function 1: "count"
     * <p>
     * Arguments: <span color="red">"maxCount"</span>
     * <p>
     * Return a string with the numbers from 1 to maxCount, separated by a line break character.
     * For each number, print the number and a tab character.
     * If the number is divisible by 3, print "Fizz" on the line.
     * </div>
     *
     */
    @Test
    void exercise1() {
        var args = new String[]{"count", "10"};

        var result = new FizzBuzz().execute(args);

        var lines = Arrays.stream(result.split("\n")).toList();

        var fizzKeyword = "Fizz";

        assertThat(lines.get(0)).contains(fizzKeyword);
        assertThat(lines.get(1)).doesNotContain(fizzKeyword);
        assertThat(lines.get(2)).doesNotContain(fizzKeyword);
        assertThat(lines.get(3)).contains(fizzKeyword);
        assertThat(lines.get(4)).doesNotContain(fizzKeyword);
        assertThat(lines.get(5)).doesNotContain(fizzKeyword);
        assertThat(lines.get(6)).contains(fizzKeyword);
        assertThat(lines.get(7)).doesNotContain(fizzKeyword);
        assertThat(lines.get(8)).doesNotContain(fizzKeyword);
        assertThat(lines.get(9)).contains(fizzKeyword);
    }
}
