package TapAcedmy.BitManipulation;

public class solve {

	public static void main(String[] args) {
		pow(2, 2, 3);
		//System.out.println();
	}
	public static void pow(int x, int n, int d) {
	    long a = x;
	    long res = 1L;
	    while (n > 0) {
	        if (n % 2 == 1) {
	            res *= a;
	            res %= d;
	            //System.out.println();
	        }
	        a *= a;
	        a %= d;
	        n = n >> 1;
	        //System.out.println();
	    }
	    res = (res + d) % d;
	    //return (int) res;
	    System.out.println((int)res);
	}


}
