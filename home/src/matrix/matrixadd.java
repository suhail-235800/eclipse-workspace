package matrix;

public class matrixadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


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
   
        int sum[][] = new int[rows][cols];  
  

        for(int i = 0; i < rows; i++){  
            for(int j = 0; j < cols; j++){  
                sum[i][j] = a[i][j] - b[i][j];  
            }  
        }  
  
        System.out.println("addition of two matrices: ");  
        for(int i = 0; i < rows; i++){  
            for(int j = 0; j < cols; j++){  
               System.out.print(sum[i][j] + " ");  
            }  
            System.out.println();  
        }  
		
	}

}
