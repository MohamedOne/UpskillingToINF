import java.util.*;

public class Employee {
	private int id;
	private String name;
	
	public Employee(int id, int name) {
		this.id = id;
		this.name = name;
	}
	
	public void setId(int id) { this.id = id; }
	public void setName(String name) { this.name = name; }
	public int getId() { return this.id; }
	public String getName() { return this.name; }
}

class Manager extends Employee {
	private int experience;
}

class Specialist extends Employee {
}

class Developer extends Employee {
}
	
