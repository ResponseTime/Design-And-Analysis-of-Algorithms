import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        double i = 0.0;
        String champ = " ";
        while (!StdIn.isEmpty()) {
            i = i + 1.0;
            String tk = StdIn.readString();
            if (StdRandom.bernoulli(1.0 / i)) {
                champ = tk;
            }
        }
        StdOut.println(champ);
    }

}
