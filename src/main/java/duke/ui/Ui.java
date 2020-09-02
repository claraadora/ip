package duke.ui;

import java.util.List;
import java.util.Scanner;

import duke.task.Task;
import duke.task.TaskList;

/**
 * Deals with user interactions by scanning and printing.
 */
public class Ui {
    private Scanner sc;
    private final String helloMessage = "Hello! I'm Clara! :D How may I help you? :)";
    private final String byeMessage = "Bye! Have a great day and hope to see you soon! :D";
    private final String errorHeader = "Apologies!";

    public Ui() {
        this.sc = new Scanner(System.in);
    }

    /**
     * Returns the command of the user.
     * @return user's command.
     */
    public String getCommand() {
        return this.sc.nextLine();
    }

    /**
     * Prints to the console with a tab.
     * @param message Message to be printed.
     */
    public void print(String message) {
        System.out.println("\t" + message);
    }

    /**
     * Prints the welcome message.
     */
    public void printHello() {
        print(helloMessage);
    }

    /**
     * Prints the farewell message.
     */
    public void printBye() {
        print(byeMessage);
    }

    /**
     * Prints list of tasks.
     * @param taskList List of tasks to be printed.
     * @param isForFind Is a keyword-matched task list
     */

    public void printTasks(TaskList taskList, boolean isForFind) {
        List<Task> tasks = taskList.getTasks();

        if (tasks.size() > 0) {
            print(isForFind ? "These are the tasks that you are looking for.:)"
                    : "These are the tasks in your list. Jiayous! :)");
        } else {
            print("You have no task in your list. :D");
        }

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(String.format("\t%d. %s", i + 1, tasks.get(i).toString()));
        }
    }
}
