package todolist;
import java.util.ArrayList;
import java.util.Scanner;
public class TaskManager {
	private ArrayList<Task> tasks = new ArrayList<Task>();
	private Scanner scanner;
	public void seeTasks() {
		
		if(tasks.isEmpty()) {
			System.out.println("There are no tasks.");
			System.out.println();
			return;
		}
		
		int j = 0;
		for(Task i : tasks) {
			System.out.printf("#%d\n", j+1);
			System.out.println("Title: " + i.getTitle());
			System.out.println("Description: " + i.getTitle());
			System.out.println("Due-Date: " + i.getTitle());
			System.out.println("Status: " + i.getStatus());
			System.out.println();
			j++;
		}
	}
	
	public void addTask() {
		scanner = new Scanner(System.in);
		Task task = new Task();
		
		System.out.print("Title: ");
		task.setTitle(scanner.nextLine());
		
		System.out.print("Description: ");
		task.setDescription(scanner.nextLine());
		
		System.out.print("Due-Date: ");
		task.setDate(scanner.nextLine());
		
		System.out.println("Status: unfinished");
		task.setStatus("unfinished");
		System.out.println();
		
		tasks.add(task);
	}
	
	public void changeStatus() {
		if(tasks.isEmpty()) {
			System.out.println("There are no tasks to change status.\n");
			return;
		}
		
		scanner = new Scanner(System.in);
		System.out.print("Enter the number of the task: ");
		int input = scanner.nextInt();
		scanner.nextLine();
		
		if(input > tasks.size()) {
			System.out.println("The index is too big.\n");
			return;
		}
		
		System.out.print("Enter the status of the task: ");
		String status = scanner.nextLine();
		
		Task task = tasks.get(input-1);
		task.setStatus(status);
		System.out.println("The task's status was successfully changed.\n");
		
	}
	
	public void deleteTask() {
		if(tasks.isEmpty()) {
			System.out.println("There are no tasks to delete.\n");
			return;
		}
		
		scanner = new Scanner(System.in);
		System.out.print("Enter the number of the task: ");
		int input = scanner.nextInt();
		
		if(input > tasks.size()) {
			System.out.println("The index is too big.\n");
			return;
		}
		
		tasks.remove(input - 1);
		System.out.println("The task was successfully removed.\n");
	}
	
}
