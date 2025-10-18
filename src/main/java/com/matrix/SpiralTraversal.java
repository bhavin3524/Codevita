package com.matrix;

class SpiralTest {
    public void spiralTraversalTest(int[][] matrix, int i, int j, boolean[][] visited) {
        if (matrix.length != visited.length || i < 0 || j < 0 || i >= matrix.length || j >= matrix.length || visited[i][j]) {
            return;
        }

        visited[i][j] = true;

        System.out.println(" " + matrix[i][j]);

        int right = j;
        if (shouldInvokeThisMethod(matrix, i, j, visited)) {
            spiralTraversalTest(matrix, i, ++right, visited);
        }

        int down = i;
        spiralTraversalTest(matrix, ++down, j, visited);

        int left = j;
        spiralTraversalTest(matrix, i, --left, visited);

        int up = i;
        spiralTraversalTest(matrix, --up, j, visited);
    }


    private boolean shouldInvokeThisMethod(int[][] matrix, int i, int j, boolean[][] visited) {
        if (i == 0) {
            return Boolean.TRUE;
        }

        int r = i - 1;

        if (checkOutOfBoundIndex(r, matrix) || checkOutOfBoundIndex(i, matrix) || checkOutOfBoundIndex(j, matrix)) {
            return Boolean.FALSE;
        }

        if (visited[r][j]) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    private boolean checkOutOfBoundIndex(int i,int[][] matrix) {
        return i < 0 || i >= matrix.length;
    }
}


public class SpiralTraversal {
    public static void main(String[] args) {
        SpiralTest spiralTest = new SpiralTest();

        int[][] matrix = {
                {11, 12, 13, 14, 15, 16},
                {21, 22, 23, 24, 25, 26},
                {31, 32, 33, 34, 35, 36},
                {41, 42, 43, 44, 45, 46},
                {51, 52, 53, 54, 55, 56},
                {61, 62, 63, 64, 65, 66}
        };

        boolean[][] visited = {
                {false, false, false, false, false, false},
                {false, false, false, false, false, false},
                {false, false, false, false, false, false},
                {false, false, false, false, false, false},
                {false, false, false, false, false, false},
                {false, false, false, false, false, false}
        };

        spiralTest.spiralTraversalTest(matrix, 0, 0, visited);
    }
}
