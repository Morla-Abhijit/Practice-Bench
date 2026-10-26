package collectionsProblems;

import java.util.PriorityQueue;

public class PriorityJobQueue {

    private final PriorityQueue<Job> queue =
            new PriorityQueue<>();

    public synchronized void submit(Job job) {
        queue.offer(job);
        notifyAll();
    }

    public synchronized Job take() throws InterruptedException {

        while (queue.isEmpty()) {
            wait();
        }

        return queue.poll();
    }

    public synchronized int size() {
        return queue.size();
    }
}
