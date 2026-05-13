package adventure_story;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Inventory inventory = new Inventory();
		
		Scanner scanner = new Scanner(System.in);
		
//Start of adventure		
	    System.out.println("It's the story of moodmood. He was born in scholars who valued books and knowledge. But he didn't want to go this way, he wanted adventure. So he chose his way. Now you will play as moodmood and choose the paths for him.");
	    System.out.println("You bumped into a stranger, he is asking if he can teach you fishing.\n 1.Learn fishing from stranger.\n 2.Ignore the stranger.");
	    int choice1 = scanner.nextInt();
	    
//1st choice	    
	    if(choice1 == 1) {
	    	System.out.println("You learned fishing and got a fishing rod from the stranger!\nAdvice: Got lucky this time, stay away from strangers.");
	    	inventory.addItem("Fishing rod");
	    	System.out.println("You are crossing a river!\n 1. Fish.\n 2. Continue adventure.");
	    	
//2nd Choice	    	
	    	int choice2 = scanner.nextInt();
	    	if(choice2 == 1) {
	    		System.out.println("You caught a salmon!\nAdvice: This fish can be cooked for eating.");
	    		inventory.addItem("Salmon");
	    	}
	    	else {
	    		System.out.println("You continued your adventure!\nAdvice: You might need fish to eat later.");
	    	}
	    }
	    else {
	    	System.out.println("You ignored the stranger!");
	    }
	    System.out.println("You were walking through a forest and found an axe beside a guy.\n 1. Take the axe without asking,\n 2. Ask the guy for the axe\n 3. Walk away.");

//3rd choice	    
	    int choice3 = scanner.nextInt();
	    switch(choice3) {
	    case 1 : 
	    	System.out.println("You took the axe without asking.\nAdvice: That is called stealing, its best if you don't do it.");
	    	inventory.addItem("Axe");
	    	break;
	    case 2 :
	    	System.out.println("You asked the guy if you can take the axe. He asked for 7 silver coins.");
	    	inventory.showInventory();
	    	System.out.println("1. Buy the axe\n2. Curse him and walk away");

//4th choice	    	
	    	int choice4 = scanner.nextInt();
	    	if(choice4 == 1) {
	    		inventory.removeCoins(7);
	    	}
	    	else {
	    		System.out.println("You cursed him and walked away.\nAdvice: Learn some manners!");
	    	}
	    	break;
	    case 3 : 
	    	System.out.println("You walked away!");
	    	break;
	    }
	    
//World loop	    
        boolean exploring = true;
        while(exploring) {
        	//Full map	    
    	    System.out.println("Choose a direction from the following: ");
    	    System.out.println("1. North - City center\n2. East - Farms & Mines\n3. South - Forest\n4. West - River bank");

//5th choice	    
    	    int choice5 = scanner.nextInt();
    	    switch(choice5) {
    	    case 1:
//City Center loop    	    	
    	    	boolean inCityCenter = true;
    	    	while(inCityCenter) {
    	    		System.out.println("You are in the city center. You can work here, live here and buy daily necessities. Where would you like to go:");
        	    	System.out.println("1. Supermart\n2. Workshop\n3. Dealership\n4. Go back");
        	    	
//6th choice	    	
        	    	int choice6 = scanner.nextInt();
        	    	switch(choice6) {
        	    	case 1 :
        	    		boolean inMart = true;
//Supermark loop        	    		
        	    		while(inMart) {
        	    			System.out.println("You are in the supermart. Buy any of the following:");
            	    		System.out.println("1. Milk - 1 coin\n2. Bread - 2 coins\n3. Wine - 5 coins\n4. Leave");
            	    		
//7th choice	    		
            	    		int choice7 = scanner.nextInt();
            	    		switch(choice7) {
            	    		case 1 :
            	    			inventory.buyItem("Milk", 1);
            	    			break;
            	    		case 2 :
            	    			inventory.buyItem("Bread", 2);
            	    			break;
            	    		case 3 :
            	    			inventory.buyItem("Wine", 5);
            	    			System.out.println("Advice: That was a dumb decision. You should work on your financial decision making");
            	    			break;
            	    		case 4 :
            	    			System.out.println("You left the supermart.\nAdvice: Should've bought something so you don't starve later!");
            	    			inMart = false;
            	    			break;
            	    		}
        	    		}
        	    		break;
        	    	case 2 :
//Workshop loop        	    		
        	    		boolean inWorkshop = true;
        	    		while(inWorkshop) {
        	    			System.out.println("You are in the workshop. Choose the following:");
        	    			System.out.println("1. Apply for a job\n2. Checkout tools\n3. Leave");
        	    			
//8th choice     			
        	    			int choice8 = scanner.nextInt();
        	    			switch(choice8) {
        	    			case 1 :
        	    				System.out.println("You applied for a job. The shopowner offered you a job for 7 coins a day.");
        	    				System.out.println("1. Accept\n2. Reject");
        	    				
//9th choice    				
        	    				int choice9 = scanner.nextInt();
        	    				if(choice9 == 1) {
        	    					System.out.println("You accepted the job. Choose the amount of days to work.");
        	    					System.out.println("1. A day\n2. A week\n3. A month");
        	    			
//10th choice
        	    					int choice10 = scanner.nextInt();
        	    					switch(choice10) {
        	    					case 1 :
        	    						inventory.addCoins(7);
        	    						break;
        	    					case 2 :
        	    						inventory.addCoins(49);
        	    						break;
        	    					case 3 :
        	    						inventory.addCoins(210);
        	    						break;
        	    					}
        	    				}
        	    				else {
        	    					System.out.println("You rejected the job offer.\nAdvice: You should've accepted the job as coins are a necesity later on");
        	    				}
        	    				break;
        	    			case 2 :
//Tools loop        	    				
        	    				boolean checkingTools = true;
        	    				while(checkingTools) {
        	    					System.out.println("You are checking out the tools. Buy any of the following for your further adventure:\n(More tools will be unlocked as you progress.)");
            	    				System.out.println("1. Axe - 5 coins\n2. Pickaxe - 3 coins\n3. Hoe - 4 coins\n4. Fishing rod - 2 coins\n5. Leave");
//11th choice    				
            	    				int choice11 = scanner.nextInt();
            	    				switch(choice11) {
            	    				case 1 :
            	    					inventory.buyItem("Axe", 5);
            	    					break;
            	    				case 2 :
            	    					inventory.buyItem("Pickaxe", 3);
            	    					break;
            	    				case 3 :
            	    					inventory.buyItem("Hoe", 4);
            	    					break;
            	    				case 4 :
            	    					inventory.buyItem("Fishing rod", 2);
            	    					break;
            	    				case 5 :
            	    					System.out.println("You left without buying anything.\nAdvice: You should've bought some tools to help you later.");
            	    					checkingTools = false;
            	    					break;
            	    				}
        	    				}
        	    				break;
        	    			case 3 :
        	    				System.out.println("You left the workshop!\nAdvice: You should've worked here to get coins.");
        	    				inWorkshop = false;
        	    				break;
        	    			}
        	    		}
        	    		break;
        	    	case 3 :
//Dealer loop        	    		
        	    		boolean inDealer = true;
        	    		while(inDealer) {
        	    			System.out.println("You are at the dealership. You can buy property here.");
        	    			System.out.println("1. Ask for property and price.\n2. Ask for farm land price.\n3. Ask for camping trip price.\n4. Leave");
//12th choice
        	    			int choice11 = scanner.nextInt();
        	    			switch(choice11) {
        	    			case 1 :
//Housing loop        	    				
        	    				boolean checkingHousing = true;
        	    				while(checkingHousing) {
        	    					System.out.println("Here are the available properties:");
            	    				System.out.println("1. City Center - 4 lots - 30000 coins");
            	    				System.out.println("2. City Center - 2 lots - 14500 coins");
            	    				System.out.println("3. Forest - 3 lots - 16800 coins");
            	    				System.out.println("4. City Center - 5 lots - 36250 coins");
            	    				System.out.println("5. Forest - 6 lots - 33600 coins");
            	    				System.out.println("6. Forest - 2 lots - 11200 coins");
            	                    System.out.println("7. Leave");
//13th choice            	                    
            	                    int choice13 = scanner.nextInt();
            	                    switch(choice13) {
            	                    case 1 :
            	                    	inventory.buyProperty("City Center - 4 lots", 30000);
            	                    	break;
            	                    case 2 :
            	                    	inventory.buyProperty("City Center - 2 lots", 14500);
            	                    	break;
            	                    case 3 :
            	                    	inventory.buyProperty("Forest - 3 lots", 16800);
            	                    	break;
            	                    case 4 :
            	                    	inventory.buyProperty("City Center - 5 lots", 36250);
            	                    	break;
            	                    case 5 :
            	                    	inventory.buyProperty("Forest - 6 lots", 33600);
            	                        break;
            	                    case 6 :
            	                    	inventory.buyProperty("Forest - 2 lots", 11200);
            	                    	break;
            	                    case 7 :
            	                    	System.out.println("You left without buying anything!");
            	                    	checkingHousing = false;
            	                    	break;
            	                    }
            	                    
        	    				}
        	    				break;
        	    			case 2 :
//Farm land loop        	    				
        	    				boolean checkingFarm = true;
        	    				while(checkingFarm) {
        	    					System.out.println("Here are the avaiable farm lots:");
        	    					System.out.println("1.East - 2 Farm lots - 8600 coins");
        	    					System.out.println("2.East - 3 Farm lots - 12900 coins");
        	    					System.out.println("3.East - 5 Farm lots - 21500 coins");
        	    					System.out.println("4. Leave");
//14th choice        	    					
        	    					int choice14 = scanner.nextInt();
        	    					switch(choice14) {
        	    					case 1 :
        	    						inventory.buyProperty("East - 2 Farm lot", 8600);
        	    						break;
        	    					case 2 :
        	    						inventory.buyProperty("East - 3 Farm lots", 12900);
        	    						break;
        	    					case 3 :
        	    						inventory.buyProperty("East - 5 Farm lots", 21500);
        	    						break;
        	    					case 4 :
        	    						System.out.println("You left without buying anything!");
        	    						checkingFarm = false;
        	    						break;
        	    					}
        	    				}
        	    				break;
        	    			case 3 :
//Booking camping loop        	    				
        	    				boolean checkingCamping = true;
        	    				while(checkingCamping) {
        	    					System.out.println("Here are the available places to book camping:");
        	    					System.out.println("1.River bank - 1 day trip - 1500 coins");
        	    					System.out.println("2.River bank - 3 days trip - 4500 coins");
        	    					System.out.println("3.River bank - 7 days trip - 10500 coins");
        	    					System.out.println("4. Leave");
//15th choice
        	    					int choice15 = scanner.nextInt();
        	    					switch(choice15) {
        	    					case 1 :
        	    						inventory.bookTrip(1500, "River bank - 1 day trip");
        	    						break;
        	    					case 2 :
        	    						inventory.bookTrip(4500, "River bank - 3 days trip");
        	    						break;
        	    					case 3 :
        	    						inventory.bookTrip(10500, "River bank - 7 days trip");
        	    						break;
        	    					case 4 :
        	    						System.out.println("You left without buying anything!");
        	    						checkingCamping = false;
        	    						break;
        	    					}
        	    				}
        	    				break;
        	    			case 4 :
        	    				System.out.println("You left the dealership!");
        	    				inDealer = false;
        	    				break;
        	    			}
        	    		}
        	    		break;
        	    	case 4 :
        	    		System.out.println("You left the city center.");
        	    		inCityCenter = false;
        	    		break;
        	    	}
    	    	}
    	    	break;
    	    case 2 :
    	    	break;
    	    case 3 :
    	    	break;
    	    case 4 :
    	    	break;
    	    }
        }
//End	    
	    System.out.println("The adventure ends here. It shall continue later!");
	    
	    scanner.close();

	}

}
