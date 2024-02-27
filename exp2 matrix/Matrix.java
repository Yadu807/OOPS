import java.util.Scanner;
class Matrix
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("No rows of martrix:");
	int n=sc.nextInt();
	System.out.println("No colums of matrix:");
	int m=sc.nextInt();
        int[][] mat1=new int[m][n];
        int[][] mat2=new int[m][n];
        int[][] summat=new int[m][n];
        System.out.println("Enter the first matrix:\n");
        for(int i=0;i<n;i++)
        {
        for(int j=0;j<m;j++)
        {
        mat1[i][j]=sc.nextInt();
        
       }
       }
       System.out.println("Enter the second matrix:\n");
       for(int i=0;i<n;i++)
         {
        for(int j=0;j<m;j++)
        {
        mat2[i][j]=sc.nextInt();
        
       }
       }
       System.out.println("sum is ");
       for(int i=0;i<n;i++)
       {
       for(int j=0;j<n;j++)
       {
       summat[i][j]=mat1[i][j]+mat2[i][j];
       System.out.print(summat[i][j]+"\t");
       }
       
       System.out.println();
       }}}
