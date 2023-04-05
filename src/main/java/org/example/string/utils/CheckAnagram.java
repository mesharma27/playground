package org.example.string.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckAnagram {
    public static Boolean isAnagram(List<String> input) {
        long count = input.stream().collect(Collectors.groupingBy(s-> {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            return new String(c);
        })).values().stream().distinct().count();
        return  count ==1;
    }
}
