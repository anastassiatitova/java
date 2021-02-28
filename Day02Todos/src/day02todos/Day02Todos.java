package day02todos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Day02Todos {

    static ArrayList<Todo> todoList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static int displayMenu() {
    	int choice = 0;
        try {
        	 System.out.print("Please make a choice [0-4]:\n"
                    + "1. Add a todo\n"
                    + "2. List all todos (numbered)\n"
                    + "3. Delete a todo\n"
                    + "4. Modify a todo\n"
                    + "0. Exit\n"
                    + "Your choice is:");
            choice = input.nextInt();
            input.nextLine();
         } catch (InputMismatchException ex) {
            System.out.println("Error: choice is an integer. " + ex.getMessage());
        }
        return choice;
    }

    public static void addTodo() {
        try {
            System.out.print("Enter task description: ");
            String task = input.nextLine();
            System.out.print("Enter due Date (yyyy/mm/dd): ");
            String dueDate = input.nextLine();
            System.out.print("Enter hours of work (integer): ");
            int hours = input.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Error: wrong input. " + ex.getMessage());
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: wrong input. " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        boolean check = true;
        while (check) {
        	int choice = displayMenu();
            switch (choice) {
                case 0:
                    System.out.println("Exiting. Good bye!");
                    check = false;
                    break;
                case 1:
                    addTodo();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("This is not a valid Menu Option! Please Select Another");
            }
        }

    }

}
