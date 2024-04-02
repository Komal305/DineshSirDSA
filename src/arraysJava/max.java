package arraysJava;

public class max {
public static void main(String[] args) {
	int[] a= {7};
	int n=a.length-1;
	int c=0;
	//int j=0;
	if(a.length==0)
	for(int i=n;i>=0;i--) {
		if(a[i]!=a[n-1]) {
			c++;
			
		}
		
	}
	System.out.println(c);
}

//public int[] solve(int[] A, int B) {
//
//    for(int k=0;k<B;k++){}
//    int temp=A[A.length-1];
//    for(int i=A.length-1; i<=0; i--){
//     A[i-1]=A[i];
//
//    }
//}
}