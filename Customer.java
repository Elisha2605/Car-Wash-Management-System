public class Customer{

   private String name;
   private String address;
   private String phone;
   private WashCard card;
   
   //Constructor
   public Customer(String name, String address, String phone, WashCard card){
      this.name = name;
      this.address = address;
      this.phone = phone;
      this.card = card;
   }

   
   
   //Setter og Getter
   
   public void setCustomerInfo(String name, String address, String phone, WashCard card){
      this.name = name;
      this.address = address;
      this.phone = phone;
      this.card = card;
   }
   
   public String getName(){
      return name;
   }
   
   public String getAddress(){
      return address;
   }

   public String getPhone(){
      return phone;
   }
   
   public void getCustomerInfo(){
      System.out.println("Name: " + getName());
      System.out.println("Address: " + getAddress());
      System.out.println("Phone: " + getPhone());
      System.out.println();
      card.getBalance();
      System.out.println("--------------------------------------------------");
   }
    
}