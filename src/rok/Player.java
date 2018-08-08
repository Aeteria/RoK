package rok; 
public class Player {
	private int gold; 
	private int health;
	private int magicka; 
	private int experience; 
	private int xpCap; 
	private int level;  
	private String name; 
	private Item[] inventory;  
	//private int exCode; 
	
	public Player(){	
		gold = 0; 
		health = 0; 
		magicka = 0;
		xpCap = 100; 
		level = 1; 
	}
	
	public Player(int gold, int health, int magicka){
		this.gold = gold; 
		this.health = health; 
		this.magicka = magicka; 
		xpCap = 100; 
		level = 1; 
	}
	
	public int getHealth(){
		return health; 
	}
	
	public void setHealth(int amount){
		health = amount;  
	}
	
	public int getMagicka(){
		return magicka; 
	}
	
	public void setMagicka(int amount){
		magicka = amount; 
	}
	
	public int getGold(){
		return gold; 
	}
	
	public void setGold(int amount){
		gold = amount; 
	}
	
	public int getXP(){
		return experience; 
	}
	
	public void setXP(int amount){
		experience = amount; 
	}
	
	public void gainXP(int amount) {
		experience += amount;
		if(experience >= xpCap) {
			experience -= xpCap;
			level++;
		}
	}
	
	public int getLevel(){
		return level; 
	}
	
	public void setLevel(int lvl){
		level = lvl; 
	}
	public String getName(){
		return name; 
	}
	public void setName(String n){
		name = n; 
	}
	public void updateXpCap(){
		if(experience >= xpCap){
			xpCap *= 1.5; 
		}
	}

	public void printInventory(){
		for(int i = 0; i < inventory.length; i++ ){
			if(i%3 == 0){
				System.out.println(); 
			}
			System.out.print("[" + (i + 1) + "] " + inventory[i].getName() + "  ");
		}
	}
	
	public void printMenu(){
		System.out.println("[1] Inventory");
		System.out.println("[2] Exit");
	}
}
