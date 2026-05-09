package adventure_story;

public class Inventory {
	
//Inventory	
	static String[] inventory = {"", "", "", "", "", "", "", "", "", ""};
	
//Adds new items	
	public static void addItem(String newItem) {
		
		boolean isFree = false;
		
		for(int i = 0; i < inventory.length; i++) {
			if(inventory[i].isEmpty()) {
				inventory[i] = newItem;
				System.out.println(newItem + " has been added to your inventory!");
				break;
			}
		}
		if(!isFree) {
			System.out.println("You don't have any space in your inventory!");
		}
	}
	
//Shows inventory	
	public static void showInventory() {
		
		for(int i = 0; i < inventory.length; i++) {
			System.out.println(inventory[i]);
		}
	}
}
