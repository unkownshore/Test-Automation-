import java.util.Scanner;


public class conditionalstatement {
	
	public static void listchoice() {
		String one ="enter 1 for Italian";
		String two ="enter 2 for American";
		String three ="enter 3 for Mexican";
	}

	public static void main(String[] args) {

      Scanner kb  = new Scanner (System.in);
      
      System.out.println("Do you feel hungry?");
      String hungry =kb.nextLine();
      
      if ((hungry.equalsIgnoreCase("yes"))||(hungry.equalsIgnoreCase("y"))) {
    	 System.out.print("List of your choice");
    	 listchoice();
    	 //fdjfdfdjf
      }
      
      
          	 
	}

}
