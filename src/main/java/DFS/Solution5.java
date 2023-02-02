package DFS;
// Time complexity O(N^2)
// Space complexity O(1)
public class Solution5 {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++)
                if (grid[i][j] == '1'){
                    dfs(i,j,grid);
                    count++;
                }
        }
        return count;
    }

    void dfs(int row, int col, char[][] grid){
        if (row < 0 || row == grid.length || col < 0 || col == grid[0].length){
            return;
        }

        if (grid[row][col] != '1'){
            return;
        }

        grid[row][col] = 'V';

        dfs(row + 1, col, grid);
        dfs(row - 1, col, grid);
        dfs(row, col + 1, grid);
        dfs(row, col - 1, grid);

    }
}
