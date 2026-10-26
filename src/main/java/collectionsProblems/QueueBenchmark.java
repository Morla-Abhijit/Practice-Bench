package collectionsProblems;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class QueueBenchmark {

    private static final int N = 1_000_000;

    public static void main(String[] args) {

        benchmarkArrayList();
        benchmarkArrayDeque();
    }

    private static void benchmarkArrayList() {

        ArrayList<Integer> list = new ArrayList<>();

        long start = System.nanoTime();

        for (int i = 0; i < N; i++) {
            list.add(i);
        }

        for (int i = 0; i < N; i++) {
            list.remove(0);
        }

        long end = System.nanoTime();

        System.out.println(
                "ArrayList: "
                        + (end - start) / 1_000_000
                        + " ms"
        );
    }

    private static void benchmarkArrayDeque() {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        long start = System.nanoTime();

        for (int i = 0; i < N; i++) {
            deque.offerLast(i);
        }

        for (int i = 0; i < N; i++) {
            deque.pollFirst();
        }

        long end = System.nanoTime();

        System.out.println(
                "ArrayDeque: "
                        + (end - start) / 1_000_000
                        + " ms"
        );
    }
}
