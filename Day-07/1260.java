class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        List<List<Integer>> result = new ArrayList<>();
        k = k % total;

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(0);
            }
            result.add(row);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int prev = i * n + j;
                int temp = (prev + k) % total;
                int newrow = temp / n;
                int newcol = temp % n;

                result.get(newrow).set(newcol, grid[i][j]);
            }
        }
        return result;
    }
}
