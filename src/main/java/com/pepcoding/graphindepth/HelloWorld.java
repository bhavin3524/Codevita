package com.pepcoding.graphindepth;


class SpiralExample
{
	
//	public int decreaseRow(int n,int m,int a[][],boolean b[][])
//	{
//		
////		int finalRow = decreaseRow(--n, m, a, b);
////		return finalRow;
//	}
	
	
	private int decreaseRow(int n, int m, int[][] a, boolean[][] b) {
		
		return 0;
	}
    public void printSpiralMatrix(int a[][],int n,int m,int value,boolean b[][])
    {
        
		if (n > 4 || m > 4 || n < 0 || m < 0 || b[n][m] == true) {
//			System.out.println("Inside:");
			return;
		}
		
//		if(n==2 && m==2)
//		{
//		}
//        System.out.println("n=:"+n+"m=:"+m);
        b[n][m]=true;
        
        a[n][m]=value;
        int row=n;
        int col=m+1;
        
        value++;
        
        row=n-1;
        col=m;
//        printSpiralMatrix(a,row,col,value,b);
        
        printSpiralMatrix(a,row,col,value,b);
        row=n+1;
        col=m;
        printSpiralMatrix(a,row,col,value,b);
        row=n;
        col=m-1;
        printSpiralMatrix(a,row,col,value,b);
        
//        row=decreaseRow(n,m,a,b);
        
        row=n-1;
        col=m;
        printSpiralMatrix(a,row,col,value,b);
        
        for(int i=0;i<5;i++)
        {
        	for(int j=0;j<5;j++)
        	{
        		System.out.print(a[i][j]+"  ");
        	}
        	System.out.println();
        }
        
        // printSpiralMatrix(a,n,++m,++value);
        // printSpiralMatrix(a,++n,m,++value);
        // printSpiralMatrix(a,n,--m,++value);
        // printSpiralMatrix(a,--n,m,++value);
    }

}
public class HelloWorld{

     public static void main(String []args){
        // System.out.println("Hello World");
        
        int matrix[][]=new int[5][5];
        
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                // System.out.println(i+""+j);
                matrix[i][j]=0;
            }
        }        
        boolean tempMatrix[][]=new boolean[5][5];
        
        SpiralExample sp=new SpiralExample();
        sp.printSpiralMatrix(matrix,0,0,1,tempMatrix);
     }
}
