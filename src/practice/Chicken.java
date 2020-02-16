package practice;


import java.util.Scanner;

public class Chicken {

public static void main(String[] args) {
	
	int choice;
	boolean condition = true;
	
	Scanner scanner = new Scanner(System.in);
	while(condition) {
		 System.out.println(
				 "�١�WINNER WINNER CHICKEN WINNER�ڡ�"+
						 "\nSELECT YOUR FAVORITE CHICKEN BRAND!!!!!"+
		 		"\n1. BHC"+
		 		"\n2. DDORAE ORAE"+
		 		"\n3. GOOBNE"+
		 		"\n4. YES YES"+
		 		"\n5. KFC"+
		 		"\n6. HOSICK'S 2 CHICKENS"+
		 		"\n7. MY FAVORITE IS NOT IN THIS LIST"+
		 		"\nPLEASE ENTER THE NUMBER OF YOUR CHOICE"
		 		);
		  
		  
		  choice = scanner.nextInt();
		  
		  switch (choice) {
		     case 1:    System.out.println("WINNNNNER");
		        break;
		     case 2: 	System.out.println("YOU ARE A VERY PRECIOUS PERSON");
		    	 		        break;
		     case 3:    System.out.println("YOU ARE A NO-JAM PERSON");
		        break;
		     case 4:    System.out.println("GU-ROM-YO DANG-YON-HA-JYO NENE CHICKEN~");
		        break;
		     case 5:    System.out.println("CLASSIC PERSON!");
		        break;
		     case 6:    System.out.println("VERY AJAE-TIC");
		        break;
		     case 7:    System.out.println("PICKY DONKEY");
		        break;
		        
		  }
		  
		  System.out.println("TRY AGAIN?---> (1) YES (2) NO <---ENTER NUMBER");
		  if(scanner.nextInt() == 2) {
				condition= false;			  
		  }

	}
	scanner.close();
} }