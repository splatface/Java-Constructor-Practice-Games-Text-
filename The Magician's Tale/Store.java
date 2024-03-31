import java.io.*;
public class Store{  //unfinished
  
  //price
  private double price;
  
  //stock
  private int stock;
  
  //the customer
  private Magician magician1;
  
  
  //Sets price
  public void setPrice(double price){
    this.price = price;
  }
  
  //Sets stock
  public void setStock(int stock){
    this.stock = stock;
  }
  
  
  //Sets customer
  public void setMagician1(Magician magician1){
    this.magician1 = magician1;
  }
  
  
  //Returns price
  public double getPrice(){
    return price;
  }
  
  //Returns stock
  public int getStock(){
    return stock;
  }
  
  //Returns customer
  public Magician magician1(){
    return magician1;
  }
  
  //1st contructor
  public Store(){
    price = 100.00;
  }
  
  /*2nd constructor
   * 
   * @param input_price of weapon
   * @param input_stock of weapon
   * @param customer
   */
  
  public Store(double input_price, int input_stock, Magician magician){
    price = input_price;
    stock = input_stock;
    magician1 = magician;
  }
}