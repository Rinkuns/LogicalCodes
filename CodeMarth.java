package com.sasken.Rinkun;

import java.util.Arrays;
import java.util.Scanner;

public class CodeMarth {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter total number of participants: ");
		int n = scanner.nextInt();
		System.out.println("Enter top scorers: ");
		int top = scanner.nextInt();
		System.out.println("Enter n scores: ");
		int[] score = new int[n];
		
		for (int i = 0; i < n; i++) {
		score[i] = scanner.nextInt();
		}
		int ans = 0;
		Arrays.sort(score);
		for (int i = n - 1; i >= n - top; i--) {
		ans = ans + score[i];
		}
		System.out.println("Sum: " + ans);
		scanner.close();
		}
}