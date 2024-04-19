package arraysJava;

public class max {
public static void main(String[] args) {
//	int[] a= {1, 2, 3, 4, 5};
//	int B=4;
	//String[] a = {"abcdefgh", "aefghijk", "abcefgh"};
	String a="ABCD";
	max m=new max();
	m.solve(a);
    }
public int solve(String A) {
	int count=0;
for(int i=0; i<A.length(); i++){
   char c=A.toLowerCase().charAt(i);
   //char[] v={a,e,i,o,u,A,E,I,O,U};
       if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
           A.substring(i, A.length()-1);
           count++;
       }
}
return 1;
    }
}
