import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int min;
    static int max;
	static int[] A, b;
	
	public static void solution(int x, int y) {
		if(x==N-1) {
			if(y>max)	max=y;
			if(y<min)	min=y;
		}
		int z;
		for(int i=0;i<4;i++) {
			if(b[i]>0) {
				z=y;
				if(i==0)		z=z+A[x+1];
				else if(i==1)	z=z-A[x+1];
				else if(i==2)	z=z*A[x+1];
				else if(i==3)	z=z/A[x+1];
				b[i]--;
				solution(x+1, z);
				b[i]++;
			}
		}
	}
	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
		N=Integer.parseInt(br.readLine());
		A=new int[N];
        
		String n[]=br.readLine().split(" ");
        
		for(int i=0;i<N;i++) {
			A[i]=Integer.parseInt(n[i]);
		}
        
		b=new int[4];
        
		n=br.readLine().split(" ");
        
		for(int i=0;i<4;i++) {
			b[i]=Integer.parseInt(n[i]);
		}
		
		min=Integer.MAX_VALUE;
		max=Integer.MIN_VALUE;
		
		solution(0, A[0]);
		
		System.out.println(max+"\n"+min);
	}
}