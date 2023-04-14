class unf {
    private int[] arr;

    unf(int N) {
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i;
        }
    }

    int root(int x) {
        while (x != arr[x]) {
            x = arr[x];
        }
        return x;
    }

    void union(int x, int y) {
        int xroot = root(x);
        int yroot = root(y);
        arr[yroot] = xroot;
    }

    void connected(int x, int y) {
        if (root(x) == root(y)) {
            System.out.println("Connected");
        }
    }

    public void percolates(int[][] matrix) {
        int top = 1;
        int bottom = 1;

        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 1) {
                union(top, i);
            }
        }
        for (int i = 0; i < matrix[matrix.length - 1].length; i++) {
            if (matrix[matrix.length - 1][i] == 1) {
                union(bottom, i);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class percolate {
    public static void main(String[] args) {
        unf u = new unf(10);
        int[][] arr = { { 1, 0, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
        u.percolates(arr);
        u.connected(1, 1);
    }
}