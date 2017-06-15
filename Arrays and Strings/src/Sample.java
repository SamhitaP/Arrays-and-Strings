	
	import java.util.Scanner;
	
public class Sample {
public static void main(String[] args){
	System.out.println("Enter the string:\n");
	Scanner sc=new Scanner(System.in);
	String input=sc.nextLine();
	System.out.println("Enter the length of the actual string:\n");
	int s_length=sc.nextInt();
	String result=space(input);
	System.out.println("The new string is:"+result);
}
static String space(String input){
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<input.length();i++){
		sb.append(input.charAt(i));
	if(sb.charAt(i)==' ')
		sb.replace(i,i+1,"%20");
    }
return sb.toString();
   
  }
}

