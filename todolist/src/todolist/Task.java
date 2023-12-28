package todolist;

public class Task {
	private String title;
	private String description;
	private String due_date;
	private String status;
	
	// geters
	public String getTitle() {
		return this.title;
	}
	
	public String geDescription() {
		return this.description;
	}
	
	public String getDate() {
		return this.due_date;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	
	// setters
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setDate(String date) {
		this.due_date = date;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}
