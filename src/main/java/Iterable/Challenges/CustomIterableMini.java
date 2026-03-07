package Iterable.Challenges;


import java.util.Iterator;

public class CustomIterableMini implements Iterable<Integer> {

    private int limit;

    public CustomIterableMini(int limit) {
        this.limit = limit;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private int current = 0;

            @Override
            public boolean hasNext() {
                return current <= limit;
            }

            @Override
            public Integer next() {
                int value = current;
                current += 2; // move to next even number
                return value;
            }
        };
    }

    // Simple test
    public static void main(String[] args) {
        CustomIterableMini evens = new CustomIterableMini(10);
        for (int n : evens) {
            System.out.print(n + " "); // Output: 0 2 4 6 8 10
        }
    }
}