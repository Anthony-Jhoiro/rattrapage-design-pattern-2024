package com.anthonyquere.exercises;

import com.anthonyquere.code.FizzBuzz;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import static org.assertj.core.api.Assertions.assertThat;

class Ex6Test {
    /**
     * <div color="white">
     * ## Exercise 6: One rule to rule them all
     * <br>
     * New function! "rule", the rule function is the same as the count function
     * except that only add the rule specified as arguments.
     * <br
     * Examples:
     * <pre>
     *     var result = new FizzBuzz().execute(new String[]{"rule", "5", "Fizz"});
     * </pre>
     * Should have the same output as the count function with 5 as max count but only with the Fizz rule
     * <pre>
     *     var result = new FizzBuzz().execute(new String[]{"rule", "5", "Buzz", "Muffin"});
     * </pre>
     * Should have the same output as the count function with 5 as max count but only with the Buzz and Muffin rules
     */
    @Test
    void exercise6() {

        Map<String, Consumer<List<String>>> rulesMap = Map.of(
                "Fizz", this::verify_fizz_rule,
                "Buzz", this::verify_buzz_rule,
                "Muffin", this::verify_muffin_rule
        );

        Map<String, Consumer<List<String>>> notAppliedRulesMap = Map.of(
                "Fizz", lines -> verify_not_applied(lines, "Fizz"),
                "Buzz", lines -> verify_not_applied(lines, "Buzz"),
                "Muffin", lines -> verify_not_applied(lines, "Muffin")
        );

        var rules = rulesMap.keySet();

        for (var appliedRule1 : rules) {
            for (var appliedRule2 : rules) {
                var appliedRules = new HashSet<>(List.of(appliedRule1, appliedRule2));

                var notAppliedRules = new HashSet<>(rules);
                notAppliedRules.removeAll(appliedRules);


                var arguments = new ArrayList<>(List.of("rule", "10"));
                arguments.addAll(appliedRules);

                var args = arguments.toArray(new String[0]);

                var result = new FizzBuzz().execute(args);
                var lines = Arrays.stream(result.split("\n")).toList();

                appliedRules.stream().map(rulesMap::get).forEach(rule -> rule.accept(lines));
                notAppliedRules.stream().map(notAppliedRulesMap::get).forEach(rule -> rule.accept(lines));
            }
        }
    }

    void verify_muffin_rule(List<String> lines) {
        String muffinKeyword = "Muffin";
        assertThat(lines.get(0)).doesNotContain(muffinKeyword);
        assertThat(lines.get(1)).doesNotContain(muffinKeyword);
        assertThat(lines.get(2)).contains(muffinKeyword);
        assertThat(lines.get(3)).contains(muffinKeyword);
        assertThat(lines.get(4)).doesNotContain(muffinKeyword);
        assertThat(lines.get(5)).doesNotContain(muffinKeyword);
    }

    void verify_fizz_rule(List<String> lines) {
        String fizzKeyword = "Fizz";
        assertThat(lines.get(0)).contains(fizzKeyword);
        assertThat(lines.get(1)).doesNotContain(fizzKeyword);
        assertThat(lines.get(2)).doesNotContain(fizzKeyword);
        assertThat(lines.get(3)).contains(fizzKeyword);
        assertThat(lines.get(4)).doesNotContain(fizzKeyword);
        assertThat(lines.get(5)).doesNotContain(fizzKeyword);
    }

    void verify_buzz_rule(List<String> lines) {
        String buzzKeyword = "Buzz";
        assertThat(lines.get(0)).contains(buzzKeyword);
        assertThat(lines.get(1)).doesNotContain(buzzKeyword);
        assertThat(lines.get(2)).doesNotContain(buzzKeyword);
        assertThat(lines.get(3)).doesNotContain(buzzKeyword);
        assertThat(lines.get(4)).doesNotContain(buzzKeyword);
        assertThat(lines.get(5)).contains(buzzKeyword);
    }

    void verify_not_applied(List<String> lines, String keyword) {
        lines.forEach(line -> assertThat(line).doesNotContain(keyword));
    }
}
