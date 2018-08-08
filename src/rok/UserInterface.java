package rok; 
import java.util.Scanner;

public class UserInterface {
	
	private Scanner ui; 
	private Player player; 
	private Map map; 
	
	public UserInterface(){
		player = new Player(50,50,50); 
		map = new Map(); 
		ui = new Scanner(System.in); 		
	}

//starting menu of game -- build character(only name for now)
	public void startMenu(){
		System.out.println("Hello, Welcome to ruins of Karthaal. Lets setup your character.");
		System.out.println("What's your name?");
		player.setName(ui.next());
		if(player.getName().equals("superuser")){
			player.setHealth(100000);
			player.setGold(100000);
			player.setMagicka(100000);
			player.setLevel(99);
		}
	}
	
//method for overworld commands i.e. traversing map 
	public void overWorldCommands(String input) {
		if(input.toLowerCase().equals("north")){
			map.roomNorth();
		}else if(input.toLowerCase().equals("south")){
			map.roomSouth();
		}else if(input.toLowerCase().equals("east")){
			map.roomEast();
		}else if(input.toLowerCase().equals("west")){
			map.roomWest();
		}else if(input.toLowerCase().equals("menu")){
			player.printMenu();
			this.menuInput(ui.nextInt());
		}else {
			System.out.println("Sorry, I don't recognize that command");
		}
	}
//takes input for ingame menu 
//TODO fix exiting bc it doesn't work
	public void menuInput(int input) {
		if(input == 1) {
			player.printInventory();
		}else if(input == 1) {
			System.exit(0);
		}
	}
	
//main commmand for UI	
	public void start(){
		this.startMenu(); 
		while(true) {
		this.overWorldCommands(ui.next()); 
		}
	}	
}
