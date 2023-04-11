class uf {
    private int[] arr;

    uf(int n) {
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
    }

    void union(int x, int y) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[x]) {
                arr[i] = arr[y];
            }
        }
    }

    void connected(int x, int y) {
        if (arr[x] == arr[y]) {
            System.out.println("Connected");
        } else {
            System.out.println("Not connected");
        }
    }

    void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class quick_find {
    public static void main(String[] args) {
        uf u = new uf(10);
        u.print();
        u.union(1, 2);
        u.union(2, 3);
        u.union(3, 4);
        u.union(4, 5);
        u.union(5, 6);
        u.union(6, 7);
        u.union(7, 8);
        u.union(8, 9);
        u.print();
        u.connected(1, 8);
    }
}