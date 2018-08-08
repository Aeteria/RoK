package rok; 
public class Armor extends Item {
	private int defence; 
	
	public Armor(){
		super();
		defence = 0; 
	}
	
	public Armor(String name, String description, int defence){
		super(name, description);
		this.defence = defence; 
	}
	
	public int getDefence(){
		return defence; 
	}
	
	public void setDefence(int defence){
		this.defence = defence; 
	}
}
