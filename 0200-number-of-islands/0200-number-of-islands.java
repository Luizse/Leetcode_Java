class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    callDFS(grid, i, j);
                }
            }
        }
        return count;
    }

    public void callDFS(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0'; // Mark the current cell as visited

        // Recursively call DFS in four directions
        callDFS(grid, i, j + 1); // right
        callDFS(grid, i, j - 1); // left
        callDFS(grid, i + 1, j); // down
        callDFS(grid, i - 1, j); // up
    }
}
