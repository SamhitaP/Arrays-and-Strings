import java.util.Scanner;
public class MarixRotate90Degree {
	public static void main(String[] args){
		System.out.println("Enter the n of the matrix size:\n");
		Scanner sc=new Scanner(System.in);	
		int n=sc.nextInt();
		int[][] a=new int[50][50];
		System.out.println("Enter the values:\n");
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
			a[i][j]=sc.nextInt();
			}
			
		}
		verticalInverse(a,n);
	}
	static void verticalInverse(int[][] a,int n){
		System.out.println("The 90 degree rotated matrix  is:\n");
		 for(int i=1;i<=n;i++){
			 for(int j=n;j>0;j--){
				 System.out.print(a[j][i]);
			 }
			 System.out.println("\n");
		 }
	}
}
