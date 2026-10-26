package collectionsProblems;

public class Main {

    public static void main(String[] args) {

        PriorityJobQueue queue = new PriorityJobQueue();

        for (int i = 0; i < 3; i++) {
            new Thread(
                    new Producer(queue),
                    "Producer-" + i
            ).start();
        }

        for (int i = 0; i < 2; i++) {
            new Thread(
                    new Consumer(queue),
                    "Consumer-" + i
            ).start();
        }
    }
}
