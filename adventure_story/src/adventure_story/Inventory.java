package adventure_story;

public class Inventory {
	
//Inventory	
	String[] inventory;
	int coins;
		
//Constructor	
	public Inventory(){
		inventory = new String[10];
		coins = 5;
	}
	
//Adds new items	
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
	
//Removes Items	
	public void removeItem(String usedItem) {
		for(int i = 0; i < inventory.length; i++){
			if(inventory[i] != null && inventory[i].equals(usedItem)) {
				inventory[i] = null;
				break;
			}
		}
	}
	
//Shows Items	
	public void showInventory() {
		System.out.println("Inventory:");
		for(int i = 0; i < inventory.length; i++) {
			if(inventory[i] != null) {
				System.out.println(inventory[i]);
			}
		}
		System.out.println("Coins: \n" + coins + " coins");
	}
	
//Adds coins	
	public void addCoins(int newCoins) {
		coins += newCoins;
		System.out.println("You earned " + newCoins + "coins");
	}
	
//Removes coins	
	public void removeCoins(int usedCoins) {
		if(coins < usedCoins) {
			System.out.println("You don't have enough coins to use!!");
		}
		else {
			coins -= usedCoins;
			System.out.println(usedCoins + "coins were used");
		}
	}
	
//Handles purchasing logic	
	public void buyItem(String newItem, int usedCoins) {
		if(coins < usedCoins) {
			System.out.println("You don't have enough coin!!");
		}
		else {
			coins -= usedCoins;
			addItem(newItem);
			System.out.println("You bought " + newItem);
			System.out.println(usedCoins + "coins were used");
		}
	}
	
}
