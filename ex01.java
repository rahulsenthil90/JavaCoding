package JavaCoding;

public class ex01
{
	public static void main(String[] args) {
		String st="youcandoit";
		char a[]=st.toCharArray();
		int i=0,j=a.length-1;
		while(i<j){
		    while(a[i]!='a'&&a[i]!='e'&&a[i]!='i'&&a[i]!='o'&&a[i]!='u'){
		        i++;
		    }
		    
		    while(a[j]!='a'&&a[j]!='e'&&a[j]!='i'&&a[j]!='o'&&a[j]!='u'){
		        j--;
		        
		    }
		    if(i>=j){
		        break;
		    }
		    char t=a[i];
		    a[i]=a[j];
		    a[j]=t;
		    i++;
		    j--;
		}
		for(i=0;i<a.length;i++){
		    System.out.print(a[i]);
		}
	}
}
