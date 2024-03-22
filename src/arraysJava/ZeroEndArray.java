package arraysJava;

public class ZeroEndArray {
public static void main(String[] args) {
	int[] a= {6,1,0,5,0,3,0,4,4};
	MoveZeroToEnd(a);
}

static void MoveZeroToEnd(int[] a){
	int n=a.length;
	for(int i=0;i>n;i++) {
		if(a[i]==0) {
			//while(n>=0)
			a[i]=a[n--];
		}
	}
	
	for(int f:a) System.out.print(f+" ");
}
}
