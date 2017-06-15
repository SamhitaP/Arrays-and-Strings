import java.util.Scanner;
public class Zero_Matrix {
public static void main(String[] args){
	int[][] matrix=new int[50][50];
	
	System.out.println("Enter the matrix size by no of rows and then colums:\n");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter row count m:\n");
	int m=sc.nextInt();
	System.out.println("Enter column count n:\n");
	int n=sc.nextInt();
	System.out.println("Enter the matrix values:\n");
	for(int i=1;i<=m;i++){
		for(int j=1;j<=n;j++){
		  matrix[i][j]=sc.nextInt();	
		}
	}
	int[][] new_matrix=nullrow(matrix,m,n);
	for(int i=1;i<=m;i++){
		for(int j=1;j<=n;j++){
		  System.out.print(new_matrix[i][j]);
		}
		System.out.println("\n");
	}
}
static int[][] nullrow(int[][] matrix,int m,int n){
	for(int i=1;i<=m;i++){
		for(int j=1;j<=n;j++){
			if(matrix[i][j]==0){
				for(int k=1;k<=n;k++){
					matrix[i][k]=0;
				}
				break;
			}
		}
	}
	return matrix;
}
}
