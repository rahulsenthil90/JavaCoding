package JavaCoding;

public class ex10 {
    public static void main(String[] args) {
		int arr[]={4,2,6,8,3,2};
		PrintArray(arr,0);
	}
	public static void PrintArray(int A[],int i){
	    if(i==A.length){
	        return;
	    }
	    System.out.print(A[i]+" ");
	    PrintArray(A,i+1);
	}
}
