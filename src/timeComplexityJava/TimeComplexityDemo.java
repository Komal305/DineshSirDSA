package timeComplexityJava;


public class TimeComplexityDemo {
public static void main(String[] args) {
	double now=System.currentTimeMillis();
//
	int n=999999999;
	findSum(n);
	System.out.println("current time :"+ (System.currentTimeMillis()-now));
//	
	 
}
	
//public static void findSum(long n) {
//	System.out.println(n*(n+1)/2);
//}

public static void findSum(long n) {
	long sum=0;
	for (long i = 1; i <=n; i++) {
		sum +=i;
	}
	System.out.println(sum);
	}
//	4999999950000000
	//current time :33.0






	 

}
