package com.anthonyquere.exercises;

import com.anthonyquere.code.FizzBuzz;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class Ex2Test {
    /**
     * <div color="white">
     * ## Exercise 2: Buzz
     * <br>
     * In the same method as Exercise one, add a new functionality.
     * <p>
     * The first string in the arguments array is always the wanted functionality.
     * <hr>
     * <p>
     *
     * Function 1: "count"
     * <p>
     * Arguments: <span color="red">"maxCount"</span>
     * <p>
     * Return a string with the numbers from 1 to maxCount, separated by a line break character.
     * For each number, print the number and a tab character.
     * If the number is divisible by 5, print "Buzz" on the line.
     * <p>
     * Warning: the previous functionality must still working.
     * </div>
     *
     */
    @Test
    void exercise2() {
        var args = new String[]{"count", "10"};

        var result = new FizzBuzz().execute(args);

        var lines = Arrays.stream(result.split("\n")).toList();

        var buzzKeyword = "Buzz";

        assertThat(lines.get(0)).contains(buzzKeyword);
        assertThat(lines.get(1)).doesNotContain(buzzKeyword);
        assertThat(lines.get(2)).doesNotContain(buzzKeyword);
        assertThat(lines.get(3)).doesNotContain(buzzKeyword);
        assertThat(lines.get(4)).doesNotContain(buzzKeyword);
        assertThat(lines.get(5)).contains(buzzKeyword);
        assertThat(lines.get(6)).doesNotContain(buzzKeyword);
        assertThat(lines.get(7)).doesNotContain(buzzKeyword);
        assertThat(lines.get(8)).doesNotContain(buzzKeyword);
        assertThat(lines.get(9)).doesNotContain(buzzKeyword);
    }
}
