import java.util.Scanner;
class Item {
    String task;
    int priority;

    Item() {
      
    }
}

public class ToDo {
    public static void main(String[] args) {
        int size = 5; // default
        if (args.length > 0) {
            try {
                size = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid argument, using default size 5.");
            }
        }

        Scanner sc = new Scanner(System.in);
        Item[] list = new Item[size];
      
        for (int i = 0; i < size; i++) {
            list[i] = new Item(); // allocate memory for each Item

            System.out.print("Task #" + i + ": ");
            list[i].task = sc.nextLine();

            System.out.print("Priority from 1 (highest) to 5 (lowest): ");
            list[i].priority = sc.nextInt();
            sc.nextLine(); // consume newline
        }

        System.out.println("\nTo-Do List (by priority):");
        for (int p = 1; p <= 5; p++) {
            for (int i = 0; i < size; i++) {
                if (list[i].priority == p) {
                    System.out.println(p + " " + list[i].task);
                }
            }
        }
    }
}
