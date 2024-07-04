package elice;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        solution(matrix);
    }

    public static void solution(int[][] matrix) {
        int leftToRight = 0, rightToLeft = 0;

        for(int i = 0; i < matrix.length; i++) {
            leftToRight += matrix[i][i];
            rightToLeft += matrix[i][matrix.length-1-i];
        }
        System.out.println(Math.max(leftToRight, rightToLeft));
    }
}

