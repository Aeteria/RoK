package rok; 
public class Shop {
	private String name;
	private String[] items;
	
	public Shop() {
		name = "";
	}
	
	public Shop(String name, String[] items) {
		this.name = name;
		this.items = items;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String[] getItems() {
		return items;
	}
	
	public void setItems(String[] items) {
		this.items = items;
	}
	
	public void printItems() {
		for(int i = 0; i < items.length; i++) {
			System.out.println((i+1)+") "+ items[i]);
		}
	}
}
