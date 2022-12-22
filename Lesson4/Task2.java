package Lesson4;

import java.util.ArrayDeque;

public class Task2 {
    public static void main(String[] args) {
        int grid[][] = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        System.out.println(maxAreaOfIsland(grid));

    }

    public static int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        ArrayDeque<int[]> stack = new ArrayDeque<>();
        boolean[][] isView = new boolean[grid.length][grid[0].length];
        int[][] steps = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                int area = 0;
                if (grid[row][col] == 1 && !isView[row][col]) {
                    stack.add(new int[]{row, col});
                    isView[row][col] = true;
                    area++;
                }
                while (!stack.isEmpty()) {
                    int[] curPoint = stack.pop();
                    int curRow = curPoint[0];
                    int curCol = curPoint[1];
                    for (int[] step : steps) {
                        int newRow = curRow + step[0];
                        int newCol = curCol + step[1];
                        if ((newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length &&
                                grid[newRow][newCol] == 1 && !isView[newRow][newCol])) {
                            stack.add(new int[]{newRow, newCol});
                            isView[newRow][newCol] = true;
                            area++;
                        }
                    }
                }
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}
