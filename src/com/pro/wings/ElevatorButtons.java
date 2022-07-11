package com.pro.wings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ElevatorButtons {
	public static void main(String[] args) {
		Integer[] arr = { 20, 24, 30, 50, 55, 45, 65, 15, 75, 5 };

		int currentFloor = 50;
		int currentDirection = -1;

		List<Integer> l1 = Arrays.asList(arr);

		nextStops(currentFloor, currentDirection, l1);
	}

	public static void nextStops(int currentFloor, int currentDirection, List<Integer> l1) {

		if (currentDirection == 1) {

			List<Integer> l2 = l1.stream().filter(i -> i > currentFloor).sorted().collect(Collectors.toList());

			System.out.println(l2);
		}
		if (currentDirection == -1) {
			List<Integer> l3 = l1.stream().filter(i -> i < currentFloor)
					.sorted((i1, i2) -> (i1 > i2) ? -1 : (i1 > i2) ? 1 : 0).collect(Collectors.toList());
			System.out.println(l3);
		}

	}
}