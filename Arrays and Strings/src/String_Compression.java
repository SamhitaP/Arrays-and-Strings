import java.util.Scanner;
public class String_Compression {
public static void main(String[] args)throws Exception{
	
	System.out.println("Enter the String:\n");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int len=str.length();
	String final_str=count(str,len);
	System.out.println("The compressed string is:"+final_str+"\n");
}
public static String count(String str,int len){
	int[] k=new int['z'-'a'];
	char[] l=new char['z'-'a'];
	Character temp=str.charAt(0);
	String new_string="";
	char[] s=new char['z'-'a'];
	int i=0;
for(Character c:str.toCharArray())
{
	s[i]=c;
//	System.out.println(s[i]);
	i++;
}
int j=0;
for(j=0;j<(str.length()-1);j++) {
	  k[s[j]-'a']++;
//	  System.out.println("Debug:"+s[j]+" "+(s[j]-'a')+" "+k[s[j]-'a']+"\n");
		if(temp!=s[j+1]){
			temp=s[j+1];
			k[s[j+1]-'a']=0;
			new_string=new_string+s[j]+Integer.toString(k[s[j]-'a']);
//			System.out.println("Final String:"+new_string);
		          }
		
	}
k[s[j]-'a']++;
new_string=new_string+s[j]+Integer.toString(k[s[j]-'a']);
	
	if(new_string.length()==len)
		return str;
	else
	return new_string;
}
}
