
import java.util.Scanner;
public class Palindrome_Permutation {
public static void main(String[] args) throws Exception{
	System.out.println("Enter the String:\n");
	Scanner sc=new Scanner(System.in);
	String str=null;
	  
		str=sc.nextLine();
		String news=str.replace(" ", "");
//	    System.out.println(news);
	int[] arr=new int['z'-'a'+1];
	int count=0;
	for(char c:news.toCharArray() ){
		int x=c-'a';
		System.out.println("Debug step:"+x);
		if(x!=-1) {
			arr[x]++;
			if(arr[x]%2==1)
				count++;
			else
				count--;
		}
		
		
	}
	if(count>1)
		System.out.println("Not Pailndrome\n");
	else
		System.out.println("It is a Pailndrome\n");
   }
 }
