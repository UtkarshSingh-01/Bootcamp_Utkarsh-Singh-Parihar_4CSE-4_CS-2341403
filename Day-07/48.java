class Solution {
    public void rotate(int[][] m) {
        int n = m.length, k = n - 1;
        for (int i = 0; i < n >> 1; i++)
            for (int j = i; j < k - i; j++) {
                int t = m[i][j];
                m[i][j] = m[k - j][i];
                m[k - j][i] = m[k - i][k - j];
                m[k - i][k - j] = m[j][k - i];
                m[j][k - i] = t;
            }
    }
}
