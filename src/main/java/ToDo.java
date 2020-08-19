/**
 * Tasks without any date/time attached to it.
 */

public class ToDo extends Task {
    public ToDo(String description, boolean isDone) {
        super(description, isDone);
    }

    @Override
    public String toString() {
        String box = this.isDone ? "\u2713" : "\u2718";
        return String.format("[T][%s] %s", box, this.description);
    }
}