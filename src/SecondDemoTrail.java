import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SecondDemoTrail {
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
	List<Integer> l1=new ArrayList<>();
	List<Integer> l2=new ArrayList<>();
	
	for(int i=0;i<(n.length)/2;i++) {
		l1.add(n[i]);
		
	}
	
	for(int x=(n.length/2);x<n.length;x++) {
		l2.add(n[x]);
		
	}
	
		
		for(int i2=0;i2<l2.size();i2++) {
			
			if(l2.get(i2)==l1.get(i2)) {
			sum=l2.get(i2)+l1.get(i2)+sum;
		}
	
		}
		
	
System.out.println("sum  "+sum);	

}}
	