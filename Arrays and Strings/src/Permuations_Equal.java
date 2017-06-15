	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.Reader;
	import java.nio.file.FileStore;
	import java.nio.file.FileSystem;
	import java.nio.file.Path;
	import java.nio.file.PathMatcher;
	import java.nio.file.WatchService;
	import java.nio.file.attribute.UserPrincipalLookupService;
	import java.nio.file.spi.FileSystemProvider;
	import java.util.Scanner;
	import java.util.Set;
public class Permuations_Equal {
public static void main(String[] args){
      System.out.println("Enter the first string\n");
      Scanner sc=new Scanner(System.in);
      String st=sc.nextLine();
      System.out.println("Enter the second string\n");
//      Scanner sc1=new Scanner(System.in);
      String st1=sc.nextLine();
     boolean ct= perm(st,st1);
    String res= (ct)?"Both are permutations of each other\n":"Both are not permutations\n";
     System.out.println(res);
    }
public static boolean perm(String st,String st1){
	int count=0;
	 for(int i=0;i<st.length();i++){
		 for(int j=0;j<st1.length();j++){
			 if(count==st.length() && count==st1.length())
				 return true;
			 if(st.charAt(i)==st1.charAt(j))	 
		    	count++;
		 } 
	 }
	 return false;
	
   }
 }
