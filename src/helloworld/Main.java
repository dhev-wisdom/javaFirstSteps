package helloworld;
import java.util.Random;
import java.security.SecureRandom;
import java.util.Scanner;
	
public class Main {
	
	public static void main (String[] args) {
		// TODO
		// Loops
		
//		System.out.print("What day is this? ");
//		
//		SecureRandom secureRandom = new SecureRandom();
//		Random random = new Random();
//		
//		int secRand = secureRandom.nextInt();
//		
//		do {
//			System.out.println("Secure random number is " + secRand);
//		} while (secRand > 0 && secRand < 100000);
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int day = random.nextInt(8);
//		System.out.println("Random number is: " + day);
//		switch (day) {
//			case (1):
//				System.out.println("Today is Monday");
//				break;
//			case (2):
//				System.out.println("Today is Tuesday");
//				break;
//			case (5):
//				System.out.println("Today is Friday");
//				break;
//			case (3):
//				System.out.println("Today is Wednesday");
//				break;
//			case (4):
//				System.out.println("Today is Thursday");
//				break;
//			default:
//				System.out.println("Check your input and try again");
//		}
		
		
		// For loop
//		int i = 1;
//		for (; i <=10; i+=2) {
//			System.out.println("" + i);
//		}
//		System.out.println("Loop has ended");
//		System.out.println("i at the end of the loop: " + i);
		
		// for each loop
//		String[] cars = {"Bentley", "Toyota", "Mercedez", "Mazda", "Peugot"};
//		for (String car : cars) {
//			System.out.println(car + "s");
//		}
//		System.out.println("Those are all the cars we have");
		
		int[] nums = {1, 3, 4, 32, 45, 21, 1233, 98};
//		for (int num:nums) {
//			System.out.println(num + " x 2 = " + num*2);
//		}
//		
//		// Find maximun
//		int max = nums[0];
//		for (int num:nums) {
//			if (num > max) max = num;
//		}
//		System.out.println("The highest number in the array is: " + max);
		
//		block1: for (int i = 1; i < 10; i++) {
//			System.out.println("This is block1");
//			System.out.println("i is " + i);
//			block2: for (int j = 10; j < 200; j+=20) {
//				System.out.println("This is block2");
//				System.out.println("j is " + j);
//				block3: for (int x = 3; x < 81; x+=3) {
//					System.out.println("This is block3");
//					System.out.println("x is " + x);
//					if (x > 21) break block2;
//				}
//			}
//		}
		
//		int j = 1;
//		int inc = ++j;
//		System.out.println("inc: " + inc);
//		System.out.println("j: " + j);
//		inc = ++j;
//		System.out.println("inc afterwards: " + inc);
//		System.out.println("j afterwards: " + j);
		
		// Method
		// Methods are different from functions
		// All methods are functions but not all functions are methods
		// Methods are functions that belong to a class and changes the state of the object it's called upon (usually)
		
		
		
	}
}