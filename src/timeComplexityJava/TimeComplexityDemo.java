package timeComplexityJava;

import java.util.Scanner;

public class TimeComplexityDemo {
public static void main(String[] args) {
	long now=System.currentTimeMillis();

	int n=99999999;
	TimeComplexityDemo t=new TimeComplexityDemo();
	findSum(n);
	System.out.println("current time :"+ (System.currentTimeMillis()-now));
	
}
	
//public int findSum(int n) {
//	return n*(n+1)/2;
//}

public static void findSum(int n) {
	int sum=0;
	for (int i = 0; i < n; i++) {
		sum +=i;
	}
	System.out.println(sum);
}



}
