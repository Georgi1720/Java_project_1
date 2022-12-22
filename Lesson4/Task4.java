package Lesson4;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int mat[][] = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}};
        System.out.println(Arrays.deepToString(updateMatrix(mat)));
    }

    public static int[][] updateMatrix(int[][] mat) {
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        int[][] steps = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (mat[row][col] == 0) {
                    queue.add(new int[]{row, col});
                } else {
                    mat[row][col] = -1;
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] curPoint = queue.poll();
            int curRow = curPoint[0];
            int curCol = curPoint[1];
            for (int[] step : steps) {
                int newRow = curRow + step[0];
                int newCol = curCol + step[1];
                if ((newRow >= 0) && (newRow < mat.length) && (newCol >= 0) && (newCol < mat[0].length) &&
                        (mat[newRow][newCol] == -1)) {
                    mat[newRow][newCol] = mat[curRow][curCol] + 1;
                    queue.add(new int[]{newRow, newCol});
                }
            }
        }
        return mat;
    }
}
