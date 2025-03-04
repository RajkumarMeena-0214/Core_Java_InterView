package com.collection.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class ArrayToStream {
	public static void main(String[] args) {
		String[] str = { "a", "v", "x","a", "b" };
		Stream<String> stream = Arrays.stream(str);
		stream.distinct().sorted().forEach(System.out::println);
	}
}