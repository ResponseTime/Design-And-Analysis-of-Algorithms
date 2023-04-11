class wuf {
    int[] arr;
    int[] sz;

    wuf(int n) {
        arr = new int[n];
        sz = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
            sz[i] = 0;
        }
    }

    int root(int x) {
        while (x != arr[x]) {
            x = arr[x];
        }
        return x;
    }

    void union(int x, int y) {
        int i = root(x);
        int j = root(y);
        if (sz[i] < sz[j]) {
            arr[i] = j;
            sz[i] += 1;
        } else {
            arr[j] = i;
            sz[j] += 1;
        }
        sz[i] += 1;
        sz[j] += 1;
    }

    void connected(int x, int y) {
        if (root(x) == root(y)) {
            System.out.println("Connected");
        }
    }

    void size(int x, int y) {
        System.out.println(sz[x]);
        System.out.println(sz[y]);
    }
}

public class weighted_quick_union {
    public static void main(String[] args) {
        wuf w = new wuf(10);
        w.union(1, 2);
        w.union(2, 3);
        w.union(5, 6);
        w.union(6, 7);
        w.union(7, 8);
        w.size(1, 5);
        w.union(1, 5);
        w.size(1, 5);
        w.connected(1, 7);
    }
}
