package rok; 
public class Map {
	private Room[][] rooms; 
	private Room currentRoom; 
	private int row;
	private int col; 
	boolean startEdge; 
	boolean edge; 
	Map(){
		rooms = new Room[6][6]; 
		row = 0; 
	    col = 0; 
	    currentRoom = rooms[row][col]; 
	    startEdge = true; 
	    edge = false; 
	    
		rooms[0][0] = new Room("You wake up in a serene meadow not remembering your name. "
				+ "You seem to have belongins besides a rucksack and the ragged clothes that you are wearing. "
				+ "Before you leave, you struggle to remember your name. ", 
				"a serene meadow with nothing of value.", 0 , false); 
		
		rooms[0][1] = new Room("You find yourself in a dense wooded area. A skeleton lies on the groud clutching a small bag.", 
				"A dense wooded area with a skeleton clutching a bag", 1, false); ; 
	}
//TODO make secondary description appear any time player enters a rooms for the second time	
	void roomNorth(){
		if(row == 0 ){
			System.out.println("A dark forrest looms ahead.... you cannot continue in this direction");
		}else{
			row++;
			currentRoom = rooms[row][col];
			currentRoom.printDescriptions(); 
		}
		
	}
	void roomSouth(){
		if(row == rooms[0].length-1){
			System.out.println("A steep mountain blocks your path. You attempt to climb it but fail.... you cannot continue in this direction");
		}else{
			row--;
			currentRoom = rooms[row][col];
			currentRoom.printDescriptions(); 
		}
	}
	void roomEast(){
		if(col == rooms[0].length-1){
			System.out.println("A perilous wasteland  looms in the distance.... you cannot continue in this direction");
		}else{
			col++;
			currentRoom = rooms[row][col];
			currentRoom.printDescriptions(); 
		}
	}
	void roomWest(){ 
		if(edge){
			System.out.println("You attempt to move in this direction and almost fall into a bottomless crevice.... you cannot continue in this direction");
		}else if(startEdge) {
			startEdge = false; 
			System.out.println("You attempt to move in this direction and almost fall into a bottomless crevice.... you cannot continue in this direction");
			edge = true; 
		}else if(!edge){
			if(col > 0) {
			col--;
			edge = false; 
			}
			currentRoom = rooms[row][col];
			currentRoom.printDescriptions(); 
			if(col == 0) {
				edge = true; 
			}
		}

	}
}
