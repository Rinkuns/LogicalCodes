package com.sasken.Rinkun;

/*Reducing Dishes: Monica has cooked N dishes and collected the data on the level of satisfaction for all the dishes from a guest. 
  The guest returns an array, where the i th element of the array is the liking level of the i th dish, also the time taken to cook 
  the i th dish is i.
Like-to-time coefficient of a dish is calculated by multiplying the time taken to cook food with it’s liking level. i.e i*input2[i]. 
Total like-to-time coefficient is calculated by summing up all individual coefficients of dishes.
You want the total like-to-time coefficient to be maximum, you can also remove some dishes, in which a new coefficient is calculated 
using the left dishes.
Find the maximum sum of all possible like-to-time coefficients.

Input Specification:
input1: N, number of dishes
input2: Array representing the liking value of each dish.

Output Specification:
Return maximum like-to-time coefficient possible

Example1:

input1: 3
input2: {-1,3,4}
Output: 17

Explanation:

She should not cancel cooking the first dish, since total coefficient without canceling equals 1(-1) + 2(3) + 3(4) = 17
If she would have cancelled cooking for the first dish, the like-to-time coefficient would be 1(3) + 2(4) = 11
Hence, she should cook all 3 dishes from maximum like-to-time coefficient possible.*/

import java.util.ArrayList;
import java.util.Collections;
public class Dish {
	public static void main(String[] args) {
		int input1=3;
		int[]  input2= {-1,3,4};		
		System.out.println(dish(input2, input1));
	}
	static int dish(int[] input2,int input1) {				
		int max=0;
		ArrayList<Integer> array2=new ArrayList<Integer>();
		
		for (int i = 0; i < input1; i++) {
			array2.add(input2[i]);
			
		}
		Collections.sort(array2);
		int max1=array2.get(array2.size()-1);
		
		for (int i = 0; i < array2.size(); i++) {
			if(array2.get(i)<0 && (Math.abs(array2.get(i))>=max1)) {
				array2.remove(i);
				i=-1;
			}
		}
		for (int i = 1; i <= array2.size(); i++) {
			max=max+(i*array2.get(i-1));
		}
		return (max);
	}
}
