package rok; 
public class Weapon extends Item {
	private int attack; 
	
	public Weapon(){
		super();
		attack = 0; 
	}
	
	public Weapon(String name, String description, int attack){
		super(name, description);
		this.attack = attack; 
	}
	
	public int getAttack(){
		return attack; 
	}
	
	public void setAttack(int attack){
		this.attack = attack; 
	}
}
