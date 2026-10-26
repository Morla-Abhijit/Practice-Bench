package collectionsProblems;

public class Producer implements Runnable {

    private final PriorityJobQueue queue;

    public Producer(PriorityJobQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {

            int priority = (int)(Math.random() * 10);

            queue.submit(
                    new Job(
                            Thread.currentThread().getName() + "-" + i,
                            priority
                    )
            );
        }
    }
}