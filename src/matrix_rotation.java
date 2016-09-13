import java.util.Arrays;

public class matrix_rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to rotate an array in place by 90 degrees
		// new column = total rows - current row
		// new row = current column value
		int A[][] = {{1,2,3},{4,5,6},{7,8,9}};
		matrix_rotation obj = new matrix_rotation();
		
		for(int i=0;i<A.length;i++)
		{
		for(int j=0;j<A[0].length;j++)	
			{
			System.out.print(" "+A[i][j]);
			}
		System.out.println();
		
		}
		int A_transpose[][] = obj.transpose(A);
		for(int i=0;i<A.length;i++)
		{
		for(int j=0;j<A[0].length;j++)	
			{
			System.out.print(" "+A_transpose[i][j]);
			}
		System.out.println();
		}
		int A_reverse[][] = obj.reverse(A);
		for(int i=0;i<A.length;i++)
		{
		for(int j=0;j<A[0].length;j++)	
			{
			System.out.print(" "+A_reverse[i][j]);
			}
		System.out.println();
		}
		
		}
	
		
	int [][] transpose(int A[][])
	{
	for(int i=0;i<A.length;i++)
		{
			for(int j=i+1;j<A[0].length;j++)
			{	
					int temp = A[i][j];
					A[i][j]= A[j][i];
					A[j][i] = temp;
			}
		}
	return A;
		
	}	
	
	int [][] reverse(int A[][])
	{
	for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A.length/2;j++)
			{	
					int temp = A[i][j];
					A[i][j]= A[i][j+A[0].length-1];
					A[i][j+A[0].length-1] = temp;
			}
		}
	return A;
		
	}	
	
	}


