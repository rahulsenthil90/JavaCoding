package JavaCoding;

import java.util.*;
public class ex09 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		PrintNumber(i);
		sc.close();
	}
	public static void PrintNumber(int N){
	    if(N==0){
	        return;
	    }
	    PrintNumber(N-1);
	    System.out.print(N+" ");
	}
}
