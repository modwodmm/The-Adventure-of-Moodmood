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
		System.out.println("You earned " + newCoins + " coins");
	}
	
//Removes coins	
	public void removeCoins(int usedCoins) {
		if(coins < usedCoins) {
			System.out.println("You don't have enough coins!!");
		}
		else {
			coins -= usedCoins;
			System.out.println(usedCoins + " coins were used");
		}
	}
	
//Handles purchasing logic	
	public void buyItem(String newItem, int usedCoins) {
		if(coins < usedCoins) {
			System.out.println("You don't have enough coins!!");
		}
		else {
			coins -= usedCoins;
			addItem(newItem);
			System.out.println("You bought " + newItem);
			System.out.println(usedCoins + " coins were used");
		}
	}
	
//Buys property	
	public void buyProperty(String property, int usedCoins) {
		if(coins < usedCoins) {
			System.out.println("You don't have enough coins!!");
		}
		else {
			coins -= usedCoins;
			System.out.println("You bought " + property);
		}
	}
	
//Books trip	
	public void bookTrip(int usedCoins, String trip) {
		if(coins < usedCoins) {
			System.out.println("You don't have enough coins!!");
		}
		else {
			coins -= usedCoins;
			System.out.println("You booked " + trip);
			System.out.println("Now your mind is fresh and bank account a bit lighter!");
		}
	}
	
}
