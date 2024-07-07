package com.anthonyquere.code;

import java.util.Arrays;
import java.util.Objects;

public class FizzBuzz {


    public String execute(String[] args) {
        System.out.println("Command: " + Arrays.toString(args));

        if (Objects.equals(args[0], "count")) {
            var maxCount = Integer.parseInt(args[1]);
            var result = new StringBuilder();

            for (int i = 0; i < maxCount; i++) {
                var line = new StringBuilder("%d\t".formatted(i));

                if (i % 3 == 0) {
                    line.append("Fizz");
                }

                line.append("\n");
                result.append(line);
            }

            return result.toString();
        }

        return "";
    }
}
