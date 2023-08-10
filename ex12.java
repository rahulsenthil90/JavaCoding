package JavaCoding;

public class ex12 {
    public static void main(String[] args) {
	    int n=5;
	    System.out.print(Factorial(n));
	}
	public static int Factorial(int n){
        if(n==0){
            return 1;
        }	   
	    int i=Factorial(n-1);
	    return n*i;
	}
}
