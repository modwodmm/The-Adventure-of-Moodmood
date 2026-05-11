package adventure_story;

public class Inventory {
	
	String[] inventory;
	int coins;
	
	public Inventory(){
		inventory = new String[10];
		coins = 5;
	}
	
	public void addItem(String newItem) {
		
		boolean freeSpace = false;
		
		for(int i = 0; i < inventory.length; i++) {
			if(inventory[i] == null) {
				inventory[i] = newItem;
				freeSpace = true;
				break;
			}
		}
		if(!freeSpace) {
			System.out.println("Your inventory is full!!");
		}
	}
	
	public void removeItem(String usedItem) {
		for(int i = 0; i < inventory.length; i++){
			if(inventory[i] != null && inventory[i].equals(usedItem)) {
				inventory[i] = null;
				break;
			}
		}
	}
	
	public void showInventory() {
		System.out.println("Inventory:");
		for(int i = 0; i < inventory.length; i++) {
			if(inventory[i] != null) {
				System.out.println(inventory[i]);
			}
		}
		System.out.println("Coins: \n" + coins + " coins");
	}
	
	public void addCoins(int newCoins) {
		coins += newCoins;
	}
	
	public void removeCoins(int usedCoins) {
		if(coins < usedCoins) {
			System.out.println("You don't have enough coins to use!!");
		}
		else {
			coins -= usedCoins;
		}
	}
	
}
