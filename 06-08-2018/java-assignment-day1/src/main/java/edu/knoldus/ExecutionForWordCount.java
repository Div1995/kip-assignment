package edu.knoldus;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
i

public class ExecutionForWordCount {
  public static void main(String[] args) {

    String wordsList = "my name is Divyanshu Divyanshu is my name";
    List<String> items = Arrays.asList(wordsList.split(" "));
    Map<String, Long> wordCount = items.stream().collect(groupingBy(Function.identity(), /*summingInt(e -> 1)*/Collectors.counting()));
    List result = wordCount.keySet().stream()
        .map(key -> Arrays.asList(key, wordCount.get(key)))
        .collect(Collectors.toList());
    System.out.println(result);

  }
}
