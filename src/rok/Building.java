package rok; 
public class Building {
	private String name; 
	private String outDesc;
	private String inDesc; 
	public Building(String nameB, String extDesc, String intDesc){
		name = nameB; 
		outDesc = extDesc; 
		inDesc= intDesc; 
	}
	
	public String getName(){
		return name; 
	}
	
	public void setName(String nameB){
		name = nameB; 
	}
	
	public String getIntDesc(){
		return inDesc; 
	}
	
	public void seIntDesc(String intDesc){
		inDesc = intDesc; 
	}
	public String getOutDesc(){
		return outDesc; 
	}
	
	public void setOutDesc(String extDesc){
		outDesc = extDesc; 
	}
}
