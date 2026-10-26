package collectionsProblems;

public class Job implements Comparable<Job> {

    private final String id;
    private final int priority;
    private final long createdAt;

    public Job(String id, int priority) {
        this.id = id;
        this.priority = priority;
        this.createdAt = System.nanoTime();
    }

    public String getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Job other) {
        // Higher priority first
        int priorityCmp = Integer.compare(other.priority, this.priority);

        if (priorityCmp != 0) {
            return priorityCmp;
        }

        // FIFO for same priority
        return Long.compare(this.createdAt, other.createdAt);
    }

    @Override
    public String toString() {
        return "Job{id='" + id + "', priority=" + priority + '}';
    }
}
