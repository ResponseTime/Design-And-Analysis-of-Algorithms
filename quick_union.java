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
}

public class quick_union {
    public static void main(String[] args) {
        unf u = new unf(10);
        u.union(1, 2);
        u.union(2, 3);
        u.union(1, 4);
        u.connected(3, 4);
    }

}
