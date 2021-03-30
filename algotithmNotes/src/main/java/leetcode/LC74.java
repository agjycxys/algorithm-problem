package leetcode;

import java.util.Arrays;

public class LC74 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 23;

        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        long count = Arrays.stream(matrix).filter(o -> Arrays.stream(o).anyMatch(e -> e == target)).count();
        return count > 0;
    }
}
