package com.anthonyquere.exercises;

import com.anthonyquere.code.FizzBuzz;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class Ex5Test {
    /**
     * <div color="white">
     * ## Exercise 5: The muffin rule
     * <br>
     * In the same method as Exercise one, add a new functionality.
     * <hr>
     * <p>
     * the muffin rule is the same as the Fizz or Buzz rule.
     * But instead of printing "Fizz" or "Buzz", print "Muffin" on line with index equals to 3 and 2.
     * <p>
     * Warning: the previous functionality must still working and target function must also work with the muffin rule the output of the count function in consideration.
     * </div>
     *
     */
    @Test
    void exercise5_target() {
        var muffinKeyword = "Muffin";

        assertThat(executeTargetAtIndex(0)).doesNotContain(muffinKeyword);
        assertThat(executeTargetAtIndex(1)).doesNotContain(muffinKeyword);
        assertThat(executeTargetAtIndex(2)).contains(muffinKeyword);
        assertThat(executeTargetAtIndex(3)).contains(muffinKeyword);
        assertThat(executeTargetAtIndex(4)).doesNotContain(muffinKeyword);
        assertThat(executeTargetAtIndex(5)).doesNotContain(muffinKeyword);
        assertThat(executeTargetAtIndex(6)).doesNotContain(muffinKeyword);
        assertThat(executeTargetAtIndex(7)).doesNotContain(muffinKeyword);
        assertThat(executeTargetAtIndex(8)).doesNotContain(muffinKeyword);
        assertThat(executeTargetAtIndex(9)).doesNotContain(muffinKeyword);
    }

    private String executeTargetAtIndex(int index) {
        var args = new String[]{"target", String.valueOf(index)};
        return new FizzBuzz().execute(args);
    }

    @Test
    void exercise5_count() {
        var args = new String[]{"count", "10"};

        var result = new FizzBuzz().execute(args);

        var lines = Arrays.stream(result.split("\n")).toList();

        var muffinKeyword = "Muffin";

        assertThat(lines.get(0)).doesNotContain(muffinKeyword);
        assertThat(lines.get(1)).doesNotContain(muffinKeyword);
        assertThat(lines.get(2)).contains(muffinKeyword);
        assertThat(lines.get(3)).contains(muffinKeyword);
        assertThat(lines.get(4)).doesNotContain(muffinKeyword);
        assertThat(lines.get(5)).doesNotContain(muffinKeyword);
        assertThat(lines.get(6)).doesNotContain(muffinKeyword);
        assertThat(lines.get(7)).doesNotContain(muffinKeyword);
        assertThat(lines.get(8)).doesNotContain(muffinKeyword);
        assertThat(lines.get(9)).doesNotContain(muffinKeyword);
    }
}
