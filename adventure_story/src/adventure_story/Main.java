package adventure_story;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//Start of adventure		
	    System.out.println("It's the story of moodmood. He was born in scholars who valued books and knowledge. But he didn't want to go this way, he wanted adventure. So he chose his way. Now you will play as moodmood and choose the paths for him.");
	    System.out.println("You bumped into a stranger, he is asking if he can teach you fishing.\n 1.Learn fishing from stranger.\n 2.Ignore the stranger.");
	    int choice1 = scanner.nextInt();
	    
//First choice	    
	    if(choice1 == 1) {
	    	System.out.println("You learned fishing and got a fishing rod from the stranger!\nAdvice: Got lucky this time, stay away from strangers.");
	    	String newItem = "Fishing rod";
	    	Inventory.addItem(newItem);
	    	System.out.println("You are crossing a river!\n 1. Fish.\n 2. Continue adventure.");
	    	
//Second Choice	    	
	    	int choice2 = scanner.nextInt();
	    	if(choice2 == 1) {
	    		System.out.println("You caught a salmon!\nAdvice: This fish can be cooked for eating.");
	    		newItem = "Salmon";
	    		Inventory.addItem(newItem);
	    	}
	    	else {
	    		System.out.println("You continued your adventure!\nAdvice: You might need fish to eat later.");
	    	}
	    }
	    else {
	    	System.out.println("You ignored the stranger!");
	    }
	    System.out.println("You were walking through a forest and found an axe beside a guy.\n 1. Take the axe without asking,\n 2. Ask the guy for the axe\n 3. Walk away.");

//Third choice	    
	    int choice3 = scanner.nextInt();
	    switch(choice3) {
	    case 1 : 
	    	System.out.println("You took the axe without asking.\nAdvice: That is called stealing, its best if you don't do it.");
	    	String newItem = "Axe";
	    	Inventory.addItem(newItem);
	    	break;
	    case 2 :
	    	System.out.println("You asked the guy if you can take the axe. He asked for 7 silver coins.");
	    	Inventory.showInventory();
	    	System.out.println("1. Buy the axe\n2. Curse him and walk away");

//Forth choice	    	
	    	int choice4 = scanner.nextInt();
	    	if(choice4 == 1) {
	    		System.out.println("You don't enough coins to buy the axe!");
	    	}
	    	else {
	    		System.out.println("You cursed him and walked away.\nAdvice: Learn some manners!");
	    	}
	    	break;
	    case 3 : 
	    	System.out.println("You walked away!");
	    	break;
	    }
//End	    
	    System.out.println("The adventure ends here. It shall continue later!");

	}

}
