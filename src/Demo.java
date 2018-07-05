
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo {
	
	
	public static void main(String[] args) {
		
		while(true)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the series");
			String s=sc.nextLine();
			getArrayFromInteger(s);
		}
	}



	private static void getArrayFromInteger(String s) {
		int sum=0;
		
		Integer[]n=new Integer[s.length()];
		for(int j=0;j<s.length();j++) {
			n[j]=Character.getNumericValue(s.charAt(j));
		}
	
		List<Integer> l=Arrays.asList(n);
		for(int i=0;i<l.size()-1;i++) {
			if(l.get(i)==l.get(i+1)) {
				sum=sum+l.get(i);
				
			}
			if(i+2==(l.size()-1)) {
				
				if(l.get(i+2)==l.get(0))
				sum=sum+l.get(i+2);
			}
		}
		
		System.out.println("sum "+sum);
	}

}
