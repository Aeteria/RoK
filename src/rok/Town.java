package rok; 
public class Town {
	private String name;
	private Building[] bld; 
	private String adjective; 
	
	public Town() {
		name = "";
		adjective = "";
	}
	
	public Town(String name, Building[] bldgs, String adj) {
		this.name = name;
		bld = bldgs; 
		adjective = adj; 
	}
	
	public void printTown() {
		System.out.print("You enter a " + adjective + " Town.");
	}
	
	public void printBuildings(){
		System.out.print("This Town contains a ");
		for(int i = 0; i < bld.length; i++){
			System.out.print(bld[i].getName());
			System.out.print("and a ");
			if(i == bld.length - 1) {
				System.out.println("."); 
			}
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
