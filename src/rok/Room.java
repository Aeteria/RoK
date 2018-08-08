package rok; 
public class Room {
	private String descriptionA; 
	private String descriptionB; 
	private int numEnemies; 
	private boolean isTown;
	private Town town;
	
	public Room(){
	}
	
	public Room(String descriptionA, String descriptionB, int numEnemies, boolean isTown){
		this.descriptionA = descriptionA; 
		this.descriptionB = descriptionB;
		this.numEnemies = numEnemies; 
		if(isTown) {
			town = new Town();
		}
	}
	
	public String getDescriptions(){
		return descriptionA; 
	}
	
	public void setDescription(String description){
		descriptionA = description;  
	}
	
	public String getBreifDesc(){
		return descriptionB; 
	}
	
	public void setBreifDesc(String description){
		descriptionB = description; 
	}
	
	public int getNumEnemies(){
		return numEnemies; 
	}
	
	public void setNumEnemies(int nNum){
		numEnemies = nNum; 
	}
	
	public boolean isTown(){
		return isTown; 
	}
	
	public void setTown(boolean isTown){
		this.isTown = isTown;
	}
	
	public Town getTown(){
		return town; 
	}
	
	public void setTown(Town town){
		this.town = town; 
	}
}
