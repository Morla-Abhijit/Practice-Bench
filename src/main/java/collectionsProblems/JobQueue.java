package collectionsProblems;

import java.util.ArrayDeque;
import java.util.Deque;

public class JobQueue {

    private final Deque<Job> queue = new ArrayDeque<>();

    public synchronized void submit(Job job) {
        queue.offerLast(job);
        notifyAll();
    }

    public synchronized Job take() throws InterruptedException {

        while (queue.isEmpty()) {
            wait();
        }

        return queue.pollFirst();
    }

    public synchronized int size() {
        return queue.size();
    }
}
