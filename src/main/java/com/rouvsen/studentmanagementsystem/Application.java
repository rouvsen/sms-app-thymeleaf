package com.rouvsen.studentmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		int[] arr = {1, 1, 2, 2, 3, 3, 4};

		Set<Integer> set = new HashSet<>();

		int duplicated = -1;

		List<Integer> duplicatedLists = new ArrayList<>();

		for(int i = 0; i < arr.length; i++) {
			if(!set.add(arr[i])) {
				duplicatedLists.add(arr[i]);
			}
		}

		for(int i = 0; i < arr.length; i++) {
			if(!duplicatedLists.contains(arr[i])) {
				System.out.println(arr[i]);
			}
		}

	}
}
