//Islands problem using DFS
import java.util.Scanner;

public class IslandProgram{

    static int m, n;
    static int[][] grid;
    static boolean[][] visited;

    static void dfs(int row, int col) {
        if (row < 0 || row >= m || col < 0 || col >= n)
            return;

        if (grid[row][col] == 0 || visited[row][col])
            return;

        visited[row][col] = true;

        dfs(row - 1, col); // Up
        dfs(row + 1, col); // Down
        dfs(row, col - 1); // Left
        dfs(row, col + 1); // Right
        dfs(row - 1, col - 1); // Up-Left
        dfs(row - 1, col + 1); // Up-Right  
        dfs(row + 1, col - 1); // Down-Left
        dfs(row + 1, col + 1); // Down-Right
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        m = sc.nextInt();
        System.out.println("Enter the number of columns:");
        n = sc.nextInt();

        grid = new int[m][n];
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int islands = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j);
                    islands++;
                }
            }
        }

        System.out.println(islands);

        sc.close();
    }
}
