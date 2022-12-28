package com.peerbits.matrix;


import java.util.Scanner;

class SearchEleMat {
    public boolean searchAnElement(int mat[][], int target) {
        boolean isExist = false;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == target) {
                    isExist = true;
                    break;
                }
            }
        }
        return isExist;
    }
}

public class SearchElementMatrix {

    public static void main(String[] args) {

        System.out.println("Enter size of row and column:");

        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        int matrix[][] = new int[row][col];
        
        System.out.println("Enter elements into matrix:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j]=scanner.nextInt();
            }
        }

        System.out.println("Enter target element:");
        
        int target = scanner.nextInt();
        scanner.close();
        SearchEleMat searchEleMat = new SearchEleMat();

        boolean isExist = searchEleMat.searchAnElement(matrix,target);

        if ((isExist)) {
            System.out.println("Target element " + target + " is exist in matrix");
        } else {
            System.out.println("Target element " + target + " is not exist in matrix");
        }

    }
    
    /**
     * 	3
		5
		7
		10
		11
		16
		20
		23
		30
		34
		60
		Enter target element:
		3
		Target element 3is exist in matrix
     */
}
