package ru.job4j.stream.exercise;

import java.util.stream.Stream;

public class StreamOfMethod {
    public static Stream<Character> createStream() {
        return Stream.of('a', 'b', 'c');
    }
}
