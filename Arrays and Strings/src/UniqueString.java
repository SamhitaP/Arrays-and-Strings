
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

	public class UniqueString {
		 public static void main(String[] args) throws Exception{
			 System.out.println("Enter the String to find if it is unique:\n");
			    Scanner sc=new Scanner(System.in);
			    String st=sc.nextLine();
			    Boolean ans=uni(st);
			    String res=(ans)? "The string is unique\n":"The string is not unique\n";
			    System.out.println(res);
			    
		    }
		 public  static boolean uni(String st)
		  {
		  /* StringBuilder sb=new StringBuilder();
		   for(int k-0;st.length();k++)
		     sb.append(st.charAt[k]);*/
		    for (int i=0;i<st.length();i++){
		      for(int j=0;j<i;j++){
		        if(st.charAt(i)==st.charAt(j))
		          return false;
		      }
		    }
		    return true;
		  }
		


}
