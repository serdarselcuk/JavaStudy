package replit;
import java.util.Scanner;

public class shopingList_3 {

	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
			
			String[][] item =new String[10][2];  //storing items in array
			double price = 0;//store the prices as an array
			int count = 1;					// as an item number and also position in array
			double totalPrice = 0;			// calculating the total price here
			
			while(count <=10){				//it wants us to accept a list includes max 10 item
			  
			  System.out.println("Enter Item"+count+" and its price:"); //taking items name and prices
			  item[count-1][0] = scan.nextLine();//item name as an user input
			  price = scan.nextDouble();// item price as an user input
			  scan.nextLine();					// to cleaning the pushed enter from previous line
			  item[count-1][1] = ""+price;
			  totalPrice+=price;	// added the price to the total
			  
			  
			  if(count==10)					// on the last item declaration we don't need to ask
				  break;					//							"do you wanna add new item?" 
			  								
			  System.out.println("Add one more item?");
			  String countinue = scan.nextLine();
			  if(countinue.equalsIgnoreCase("no")){// if user don't want to add a new item "break"
			    break;}
			  
			  count++;							//add 1 to count that used for item declaration
			}
	
			int i = 0;   // to follow where we are in for-each loop
			for (String[] each2 : item) {//this is for the first layer of 2d array
				
				System.out.print("item"+(i+1)+": ");
				int itemselect = 0;  // it's for select the item that has been assigned as
									//	first or second item in 2 dimensional layer
				
				for (String each1: each2) { // here started forEach loop for 2. dimensional layer
					
					System.out.print(each1); // first it will write item name than in the 2. turn 
											// it will write the price
					if(itemselect == 0) { // if it was the 1. turn we don't need to write price 
											//						ass string
						System.out.print(" price: ");
					}
					itemselect++;	// we need to change item selection to understand if we will 
										// write on the report "price :" or not
				}
				if (i==item.length || item[i+1][0]==null) { // if we are on the and of the array or
					System.out.println(" \nTotal price: "+totalPrice);						// there is no item after that we must stop
					break;
					}else {           // if loop will continue we will need "' " as string 
										//						in the report
						System.out.print(", ");
						i++;		// actually we need an int being available to control 
									//									if there is an item or not
						}
			}
			
	  }
	}

