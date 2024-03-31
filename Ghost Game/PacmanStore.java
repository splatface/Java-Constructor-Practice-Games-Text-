import java.io.*;

public class PacmanStore{
  
  
  // The price of a weapon
  private double price;
  
  // The weapon being sold
  private PlayerWeapon stock;
  
  // The customer(player) visiting the store
  private Player customer1;
  
  
  
  
  // The 1st constructor for the store
  public PacmanStore(){
    price = 50.00;
  }
  
  /* The 2nd constructor
   * used to allow the player to interact with the things they want to buy
   * 
   * @param input_price price of the weapon
   * @param input_stock stock of the weapon
   * @param customer
   */
  
  public PacmanStore(double input_price, PlayerWeapon input_stock, Player customer){
    price = input_price;
    stock = input_stock;
    customer1 = customer;
  }
  
  
  
  // Sets the price of the weapon
  public void setPrice(double price){
    this.price = price;
  }
  
  
  // Sets the stock in the store of the weapon
  public void setStock(PlayerWeapon stock){
    this.stock = stock;
  }
  
  
  // Sets the customer
  public void setCustomer1(Player customer1){
    this.customer1 = customer1;
  }
  
  
  // Returns the price of the weapon
  public double getPrice(){
    return price;
  }
  
  
  // Returns the stock of the weapon
  public PlayerWeapon getStock(){
    return stock;
  }
  
  
  // Returns the customer
  public Player customer1(){
    return customer1;
  }
  
  
  
  
  public void storeMenu() throws IOException{
    
    while(true){
      
      System.out.println("Our store sells eco-friendly swords, broken swords, wrecked swords, and jurassic swords");
      System.out.println("for the price of " + price);
      System.out.println("");
      System.out.println("Would you like to purchase a sword? y/n \n");
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      String decide;
      decide = br.readLine();
      
      
      if(decide == "y"){
        boolean bought;
        bought = sell_Stock();
        if(bought == true){
          customer1.equipWeapon(stock);
        }
        
      }
    }
  }
  
  // If item is in stock, it can be sold
  
  public boolean sell_Stock(){
    if(customer1.getGold() >= price){
      customer1.loseGold(price);
      System.out.println("You have bought the " + stock.getName());
      return true;
    }
    else{
      System.out.println("You cannot buy the " + stock.getName());
      return false;
    }
  }
}
