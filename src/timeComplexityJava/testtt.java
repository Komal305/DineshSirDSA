package timeComplexityJava;

public class testtt {
public static void main(String[] args) {
int[]	A = {-7, 1, 5, 2, -4, 3, 0};
int n =A.length;
int[]	p=new int[n];
p[0]=A[0];
for(int i=1;i<n; i++){
	p[i]=p[i-1]+A[i];
}
//for(int a:p) System.out.print(","+a);
int ans=-1;


for(int i=0;i<n; i++){
	
	int l=0;int r=0;
	
	if(i==0) l=0;
	else l=p[i-1];
	
	r=p[n-1]-p[i];
	
	if(i==r)
		System.out.println(i+"   r="+r+" l="+l);

}

//for(int a:p) System.out.print(","+a);

//int L=0;
//int R=0;	
//for(int i=0;i<A.length-1; i++){
//	
//for(int j=0;j<i;j++) {
//	L+=A[j];
//}
//
//for(int k=i+1; k<A.length; k++)
//	{
//	R+=A[k];
//	}
//
//if(R==L)
//	System.out.println(i+"   r="+R+" l="+L);
//}

}
}
