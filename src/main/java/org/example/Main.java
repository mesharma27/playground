package org.example;

import org.example.string.utils.CheckAnagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<String> input = new ArrayList<>();
        input.add("act");
        input.add("cat");
        input.add("tac");
        input.add("cta");
        Boolean result = CheckAnagram.isAnagram(input);
        System.out.println(result);

    }
}