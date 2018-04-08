import java.util.*;

public class WashSystem{

   static Scanner s = new Scanner(System.in);
   
   private static WashCard[] card = new WashCard[10];
   private static Customer[] customer = new Customer[10];
   
   public static void main(String[] args){
   
   card[0] = new WashCard("12345", 500.0);
   card[1] = new WashCard("28374", 700.0);
   card[2] = new WashCard("47583", 1000.0);
   card[3] = new WashCard("47859", 200.0);
   card[4] = new WashCard("38475", 400.0);
      
   customer[0] = new Customer("Tobias", "Ørnevej 33, 3422 NV", "238493274", card[0]);
   customer[1] = new Customer("Anna", "Rævehøjvej 74, 8354 Gentofte", "238493274", card[1]);
   customer[2] = new Customer("Lise", "Svanholm Vænge 43, 4596 Stenløse", "238493274", card[2]);
   customer[3] = new Customer("Claus", "Toftegårsvej 34, 1353 Ølstykke", "238493274", card[3]);
   customer[4] = new Customer("Jarl", "IT Boulevard 54, 2345", "238493274", card[4]);
   
   WashOption();
   
   }
      public static void WashOption(){
      
      Scanner s = new Scanner(System.in);
    
      System.out.println("Welcome to Super Shine");
      menuPromptOption();
      int input = s.nextInt();
      
      if (input == 1){
         menuPromptBuy();
         switchBuy();
      } else if(input == 2){
         depositPrompt();
      } else if (input == 3){
         checkBalance();
      }
   }
      
      //Wash car option (menuprompt1)            
  
   public static void menuPromptOption(){
      System.out.println("Would you like to buy a car wash or deposit money on your wash card?");
      System.out.println("1: Car wash");
      System.out.println("2: Deposit money");
      System.out.println("3: Check balance");
   }
   
   public static void menuPromptBuy(){
      System.out.println("What type of car wash option would you like to purchase?");
      System.out.println("1: Standard 50 kr.");
      System.out.println("2: Medium 100 kr.");
      System.out.println("3: Luxury 150 kr.");
   }

   public static void depositPrompt(){
      System.out.println("How much money would you like to deposit on your wash card?");
      int input2 = s.nextInt();
      card[0].setMoney(card[0].getMoney() + input2);
      System.out.println("You have now deposited " + input2 + " kr. on your wash card. " + "Your new balance is now " + card[0].getMoney() + " kr.");   
      System.out.println();
      printReceipt();
      System.out.println();
      returnStart();
   }

   public static void switchBuy(){ 
      int input = s.nextInt();
      switch (input){
         case 1:
            if(card[0].getMoney() >= 50){
               System.out.println("You have purchased a Standard option!");
               card[0].setMoney(card[0].getMoney() - 50); 
               System.out.println("You have now " + card[0].getMoney() + " kr. left on your WashCard");
               System.out.println();
               printReceipt();
               System.out.println();
               returnStart();
            }else{
               System.out.println("You have insufficient funds, please deposit more money on your wash card.");
               returnStart();
            }
            break;
              
         case 2:
            if(card[0].getMoney() >= 100){
               System.out.println("You have purchased a Medium option");
               card[0].setMoney(card[0].getMoney() - 100);
               System.out.println("You have now " + card[0].getMoney() + " kr. left on your WashCard");
               System.out.println();
               printReceipt();
               System.out.println();
               returnStart();
            }else{
               System.out.println("You have insufficient funds, please deposit more money on your wash card.");
               returnStart();
            }
            break;   
            
         case 3:
            if(card[0].getMoney() >= 150){
               System.out.println("You have purchased a Luxury option");
               card[0].setMoney(card[0].getMoney() - 150);
               System.out.println("You have now " + card[0].getMoney() + " kr. left on your WashCard");
               System.out.println();
               printReceipt();
               System.out.println();
               returnStart();
            }else{
               System.out.println("You have insufficient funds, please deposit more money on your wash card.");
               returnStart();
            }
            break;         
      }        
   }

   public static void printReceipt(){
      System.out.println("Would you like to have a receipt? (y/n)");
      String input3 = s.next();
      if(input3.equals("y")){
         customer[0].getCustomerInfo();
         }
   }
   
   public static void checkBalance() {
      System.out.println("Your balance on card ID " + card[0].getID() + " is " + card[0].getMoney());
      System.out.println();
      returnStart();     
   }
   
   public static void returnStart() {
      System.out.println("Would you like to go back to the start menu? (y/n)");
         String input4 = s.next();
         if (input4.equals("y")){
            WashOption();
         } else {
              System.out.println("Thank you for your visit, see you soon!");
         }
   }
}