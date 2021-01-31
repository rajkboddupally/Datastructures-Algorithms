package arrays;

/*
A matrix diagonal is a diagonal line of cells starting from some cell in either the topmost row or leftmost column and going in the bottom-right direction until reaching the matrix's end. For example, the matrix diagonal starting from mat[2][0], where mat is a 6 x 3 matrix, includes cells mat[2][0], mat[3][1], and mat[4][2].

Given an m x n matrix mat of integers, sort each matrix diagonal in ascending order and return the resulting matrix.



Example 1:


Input: mat = [[3,3,1,1],[2,2,1,2],[1,1,1,2]]
Output: [[1,1,1,1],[1,2,2,2],[1,2,3,3]]
Example 2:

Input: mat = [[11,25,66,1,69,7],[23,55,17,45,15,52],[75,31,36,44,58,8],[22,27,33,25,68,4],[84,28,14,11,5,50]]
Output: [[5,17,4,1,52,7],[11,11,25,45,8,69],[14,23,25,44,58,15],[22,27,31,36,50,66],[84,28,75,33,55,68]]


Constraints:

m == mat.length
n == mat[i].length
1 <= m, n <= 100
1 <= mat[i][j] <= 100
 */

import java.util.*;

public class MatrixDiagnonalSort {

    public static void main(String[] args) {

        int[][] mat = {{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}};

        print(mat);

        System.out.println();
        System.out.println();

        //int[][] sortedMat = diagonalSort(mat);

        //row sort
        for (int i = 0; i < mat.length; i++) {
            diagonalSort1(mat, i, 0);
        }

        //column
        for (int i = 0; i < mat[0].length; i++) {
            diagonalSort1(mat, 0, i);
        }

        print(mat);


    }

    private static void print(int[][] sortedMat) {

        for (int i = 0; i < sortedMat.length; i++) {
            for (int j = 0; j < sortedMat[0].length; j++) {
                System.out.print(sortedMat[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static int[][] diagonalSort(int[][] mat) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                map.computeIfAbsent(i - j, k -> new PriorityQueue<>()).add(mat[i][j]);
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = map.get(i - j).poll();
            }
        }

        return mat;
    }


    private static int[][] diagonalSort1(int[][] mat, int r, int c) {

        int rowLength = mat.length;
        int colLength = mat[0].length;
        List<Integer> list = new ArrayList<>();

        for (int i = r, j = c; i < rowLength && j < colLength; i++, j++) {
            list.add(mat[i][j]);
        }
        Collections.sort(list);

        for (Integer i:list) {
            mat[r++][c++] = i;
        }

        return mat;
    }
}
