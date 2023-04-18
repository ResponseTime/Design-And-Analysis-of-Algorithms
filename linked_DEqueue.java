import java.util.LinkedList;

class Deque {
    LinkedList<Integer> l;

    // construct an empty deque
    public Deque() {
        l = new LinkedList<Integer>();
    }

    // is the deque empty?
    public boolean isEmpty() {
        if (l.size() == 0) {
            return true;
        }
        return false;
    }

    // return the number of items on the deque
    public int size() {
        return l.size();
    }

    // add the item to the front
    public void addFirst(int item) {
        l.addFirst(item);
    }

    // add the item to the back
    public void addLast(int item) {
        l.addLast(item);
    }

    // remove and return the item from the front
    public int removeFirst() {
        return l.removeFirst();
    }

    // remove and return the item from the back
    public int removeLast() {
        return l.removeLast();
    }

}

public class linked_DEqueue {
    public static void main(String[] args) {
        Deque d = new Deque();
        d.addFirst(23);
        d.addLast(66);
        System.out.println(d.size());
        for (int i : d.l) {
            System.out.println(i);
        }
    }
}