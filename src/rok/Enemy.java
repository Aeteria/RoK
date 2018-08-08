package rok; 
public class Enemy {
	private Player pEN = new Player(); 
	private int attack; 
	private int hp; 
	private int dropGold;
	private int dropXP; 
	
	public Enemy(){
	}
	
	public Enemy(int attack, int hp){
		this.attack = attack; 
		this.hp = hp; 
		dropGold = (int) (((Math.random()*pEN.getLevel())*12)+(5));
		dropXP = (int) (((Math.random()*pEN.getLevel())*20)+(5));
	}
	
	public int getAttack(){
		return attack; 
	}
	
	public void setAttack(int amount){
		attack = amount; 
	}
	
	public int getHP(){
		return hp; 
	}
	
	public void setHP(int amount){
		hp = amount; 
	}
	
	public int getDropGold(){
		return dropGold; 
	}
	
	public void setDropGold(int amount){
		dropGold = amount; 
	}
	
	public int getDropXP(){
		return dropXP; 
	}
	
	public void setDropXP(int amount){
		dropXP = amount; 
	}
	
	public void updateDropGold(){
		dropGold = (int) (((Math.random()*pEN.getLevel())*12)+(5));
	}
	
	public void updateDropXP(){
		dropXP = (int) (((Math.random()*pEN.getLevel())*20)+(5));
	}
	
	public void updateEnemy(){
		updateDropXP(); 
		updateDropGold(); 
	}
}
