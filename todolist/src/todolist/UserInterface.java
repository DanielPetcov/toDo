package todolist;
import java.util.Scanner;

public class UserInterface {
	private int input;
	Scanner scanner;
	TaskManager taskManager;
	
	public UserInterface() {
		scanner = new Scanner(System.in);
		taskManager = new TaskManager();
	}
	
	public void displayMenu() {
		System.out.println("*******************");
		System.out.println("1. See tasks.");
		System.out.println("2. Add task.");
		System.out.println("3. Delete a task.");
		System.out.println("4. Change task status.");
		System.out.println("5. Exit.");
		System.out.println("*******************");
		System.out.println();
	}
	
	public void dislapyTasks() {
		taskManager.seeTasks();
	}
	
	public void addTask() {
		taskManager.addTask();
	}
	
	public void deleteTask() {
		taskManager.deleteTask();
	}
	
	public void changeStatus() {
		taskManager.changeStatus();
	}
	
	public int getUserInput() {
		System.out.print("-> ");
		input = scanner.nextInt();
		return input;
	}
}
