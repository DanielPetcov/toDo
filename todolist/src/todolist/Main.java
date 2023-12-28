package todolist;

public class Main {
	public static void main(String[] args) {
		int input;
		UserInterface ui = new UserInterface();
		
		do {
			ui.displayMenu();
			input = ui.getUserInput();
			
			switch(input) {
			case 1:
				ui.dislapyTasks();;
				break;
			case 2:
				ui.addTask();
				break;
			case 3:
				ui.deleteTask();
				break;
			case 4:
				System.out.println("bye");
				input = -1;
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
		} while(input != -1);
	}
}
