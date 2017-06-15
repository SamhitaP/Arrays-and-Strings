import java.util.Scanner;
public class String_Rotation {
public static void main(String[] args){
	System.out.println("Enter the first string:\n");
	Scanner sc = new Scanner(System.in);
	String str=sc.nextLine();
	System.out.println("Enter the rotated string:\n");
	String r_str=sc.nextLine();
	int len=str.length();
	if(r_str.length()==len)
	isSubstring(str,r_str,len);
	else
		System.out.println("Enter a rotation of the same string:\n");
}
static void isSubstring(String str,String r_str,int len){
	int start=0;
	for(Character c:str.toCharArray()){
		if(r_str.charAt(0)==c){
			start=str.indexOf(c);
			break;
		}
			
	}
	int i=0;
	start++;
	for(i=1;i<len;i++){
		System.out.println("Debug:"+i+" "+start);
		if(r_str.charAt(i)==str.charAt(start)){
			if(start==len-1)
				start=0;
			else start++;
		}
		else{
			System.out.println("String is not a rotation of the original\n");
			break;
		}
			
	}
	if(i==len)
	System.out.println("Rotated Strings of each other\n");
}
}
