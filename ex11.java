package JavaCoding;

public class ex11 {
    public static void main(String[] args) {
	    int a[]={1,4,2,3,5,7,3,4};
	    int x=5;
	    System.out.print(FirstIndex(a,x,0));
	}
	public static int FirstIndex(int a[],int x,int i){
	    if(i==a.length){
	        return -1;
	    }
	    if(a[i]==x){
	        return i;
	    }
	    else{
	       int idx=FirstIndex(a,x,i+1);
	       return idx;
	    }
	}
}
