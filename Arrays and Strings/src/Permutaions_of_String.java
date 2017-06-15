
	import java.util.Scanner;
	
	
public class Permutaions_of_String {
  public static void main(String[] args){
	  System.out.println("Enter a plaindrome input string:\n");
	  Scanner sc=new Scanner(System.in);
	  String str=sc.nextLine();
	  StringBuilder sb=new StringBuilder();
	  
	  for(int i=0;i<str.length();i++)
		sb.append(str.charAt(i));  
      int len=str.length();
      perm(sb,0,len-1);
  }
  static void perm(StringBuilder str,int start,int end){
	  if(start==end)
		  System.out.println(str.toString());
  
  else{
	  for(int i=start;i<=end;i++){
		  char temp=str.charAt(start);
		  str.setCharAt(start, str.charAt(i));
		  str.setCharAt(i, temp);
	  
   perm(str,start+1,end);
      temp=str.charAt(start);
	  str.setCharAt(start, str.charAt(i));
	  str.setCharAt(i, temp);
	  }
  }
 }
}