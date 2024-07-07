package com.anthonyquere.exercises;

import com.anthonyquere.code.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ex3Test {
    /**
     * <div color="white">
     * ## Exercise 3: The target command
     * <br>
     * In the same method as Exercise one, add a new functionality.
     * <p>
     * The first string in the arguments array is always the wanted functionality.
     * <hr>
     * <p>
     *
     * Function 2: "target"
     * <p>
     * Arguments: <span color="red">"number"</span>
     * <p>
     * Return a string with the same result as the count function for the line at number index.
     * <p>
     * Examples:
     * <pre>
     *     var result = new FizzBuzz().execute(new String[]{"target", "5"});
     * </pre>
     * Should output: "Buzz"
     * <pre>
     *     var result = new FizzBuzz().execute(new String[]{"target", "6"});
     * </pre>
     * Should output: "FizzBuzz"
     * <p>
     * Warning: the previous functionality must still working!!.
     * </div>
     *
     */
    @Test
    void exercise3() {
        var fizzKeyword = "Fizz";
        var buzzKeyword = "Buzz";

        assertThat(executeTargetAtIndex(0)).contains(buzzKeyword).contains(fizzKeyword);
        assertThat(executeTargetAtIndex(1)).doesNotContain(buzzKeyword).doesNotContain(fizzKeyword);
        assertThat(executeTargetAtIndex(2)).doesNotContain(buzzKeyword).doesNotContain(fizzKeyword);
        assertThat(executeTargetAtIndex(3)).doesNotContain(buzzKeyword).contains(fizzKeyword);
        assertThat(executeTargetAtIndex(4)).doesNotContain(buzzKeyword).doesNotContain(fizzKeyword);
        assertThat(executeTargetAtIndex(5)).contains(buzzKeyword).doesNotContain(fizzKeyword);
        assertThat(executeTargetAtIndex(6)).doesNotContain(buzzKeyword).contains(fizzKeyword);
        assertThat(executeTargetAtIndex(7)).doesNotContain(buzzKeyword).doesNotContain(fizzKeyword);
        assertThat(executeTargetAtIndex(8)).doesNotContain(buzzKeyword).doesNotContain(fizzKeyword);
        assertThat(executeTargetAtIndex(9)).doesNotContain(buzzKeyword).contains(fizzKeyword);
    }

    private String executeTargetAtIndex(int index) {
        var args = new String[]{"target", String.valueOf(index)};
        return new FizzBuzz().execute(args);
    }
}
