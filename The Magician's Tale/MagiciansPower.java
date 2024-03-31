public class MagiciansPower{
  
  // damage the power does
  
  private double damage;
  
  // level of the attack(ie. 1 = least damage, 2 = less damage, ...)
  
  private int level;
  
  // price
  private double price;
  
  /* constructor of the powers
   * 
   * @param damage
   * @param level
   */
  
  public MagiciansPower(double damage, int level, double price){
    this.damage = damage;
    this.level = level;
    this.price = price;
  }
  
  //Sets the damage
  public void setDamage(double damage){
    this.damage = damage;
  }
  
  
  //Sets the level
  public void setLevel(int level){
    this.level = level;
  }
  
  
  //Sets the price
  public void setPrice(double price){
    this.price = price;
  }
  
  
  //Returns damage
  public double getDamage(){
    return damage;
  }
  
  
  //Returns level of attack
  public int getLevel(){
    return level;
  }
  
  
  //Returns the price
  public double getPrice(){
    return price;
  }
}