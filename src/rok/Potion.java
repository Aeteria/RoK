package rok; 
public class Potion extends Item{
	private int health; 
	private int magic; 
	
	public Potion(){
		super();
		health = 0; 
		magic = 0; 
	}
	
	public Potion(String name, String description, int health, int Magic){
		super(name, description);
		this.health = health; 
		this.magic = Magic; 
	}
	
	public int getHealth(){
		return health; 
	}
	
	public void setHealth(int health){
		this.health = health; 
	}
	
	public int getMagic(){
		return magic; 	
	}
	
	public void setMagic(int magic){
		this.magic = magic; 
	}
}
