package matrix;

public class matrixmul {

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
   
        int c[][] = new int[rows][cols];  
  


        
        for(int i=0;i<rows;i++){    
        	for(int j=0;j<cols;j++){    
        	
        		
            c[i][j]=0;      
        	for(int k=0;k<rows;k++)      
        	{      
        	c[i][j]+=a[i][k]*b[k][j];      
        	}  
        	System.out.print(c[i][j]+" ");  
        	} 
        	System.out.println();
        	}    
        
        
		
		
	}

}
