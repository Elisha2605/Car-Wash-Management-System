public class WashCard{

   private String ID;
   private double money;
     
   
   public WashCard(String ID, double money){
      this.ID = ID;
      this.money = money;
   }
   
   public void setWashCard(String ID, double money){
      this.ID = ID;
      this.money = money;
   }
   
   public void setMoney(double money){
      this.money = money;
   
   }

   public String getID(){
      return ID;
   } 
   
   public double getMoney(){
      return money;
   }
   
   public void getBalance(){
      System.out.println("Customer ID: " + getID());
      System.out.println("Balance: " + getMoney());
   }
   
   

}