package collectionsProblems;

public class Consumer implements Runnable {

    private final PriorityJobQueue queue;

    public Consumer(PriorityJobQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        try {

            while (true) {
                Job job = queue.take();
                System.out.println(
                        Thread.currentThread().getName()
                                + " processed "
                                + job
                );
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
