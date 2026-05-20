package adventure_story;

import java.util.ArrayList;

public class Inventory {
	
//Inventory	
	ArrayList<String> inventory;
	int coins;
		
//Constructor	
	public Inventory(){
		inventory = new ArrayList<>();
		coins = 5;
	}
	
//Adds new items	
	public void addItem(String newItem) {
		if(inventory.contains(newItem)) {
			System.out.println("You already have the item!");
		}
		else {
			inventory.add(newItem);
			System.out.println(newItem + " has been added to your inventory.");
		}
	}
	
//Removes Items	
	public void removeItem(String usedItem) {
		if(inventory.remove(usedItem)) {
			System.out.println(usedItem + " has been removed from your inventory.");
		}
		else {
			System.out.println("There is no such item in your inventory!");
		}
	}
	
//Shows Items	
	public void showInventory() {
		System.out.println("Inventory:");
		for(int i = 0; i < inventory.size(); i++) {
			System.out.println(inventory.get(i));
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
