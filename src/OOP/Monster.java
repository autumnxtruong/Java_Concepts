package OOP;

public class Monster {

	private String name;

	public Monster(String ipName) {
		this.name = ipName;
	}
	
	
	//---- OTHER METHODS -------------------------------------------------------------------------
	public String attack() {
		return "!^_&^$@+%$* I don't know how to attack!";
	}

	//---- GETTER & SETTER METHODS----------------------------------------------------------------
	public String getName() {
		return name;
	}

	public void setName(String ipName) {
		this.name = ipName;
	}
	
	
	
	
}
