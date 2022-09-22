package matrix;

import java.util.Scanner;

public class matrix1 {

	public static void main(String[] args) {
		

		
        int rows, cols;  
      
        int a[][] = {  
                          {4, 5, 6},  
                          {3, 4, 1},  
                          {1, 2, 3}  
                       };  
  
       
          int b[][] = {  
                          {2, 0, 3},  
                         {2, 3, 1},  
                         {1, 1, 1}  
                     };  
  
         
        rows = a.length;  
        cols = a[0].length;  
   
        int diff[][] = new int[rows][cols];  
  

        for(int i = 0; i < rows; i++){  
            for(int j = 0; j < cols; j++){  
                diff[i][j] = a[i][j] - b[i][j];  
            }  
        }  
  
        System.out.println("Subtraction of two matrices: ");  
        for(int i = 0; i < rows; i++){  
            for(int j = 0; j < cols; j++){  
               System.out.print(diff[i][j] + " ");  
            }  
            System.out.println();  
        }  
    }  
		
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int m,n,i,j
		
		Scanner in = new Scanner(System.in);
        System.out.println("Enter the number "
                           + "of rows of the matrix");
        m = in.nextInt();
        System.out.println("Enter the number "
                           + "of columns of the matrix");
        n = in.nextInt();

        
        int a[][] = new int[m][n];

        
        System.out.println("Enter the elements of the matrix");
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)
                a[i][j] = in.nextInt();

        // Display the elements of the matrix
        System.out.println("Elements of the matrix are");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++)
                System.out.print(a[i][j] + "  ");
            System.out.println();
        }
        */

