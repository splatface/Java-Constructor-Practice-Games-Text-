public class PlayerWeapon{
  
  
  // The number of blade tips the weapon has
  private int bladeNum;
  
  // The attack damage the weapon does
  private int attack;
  
  // The name of the weapon
  private String name;
  
  // The worth of the weapon
  private double worth;
  
  
  
  
  /* The constructor of the weapon
   * @param name of the given weapon
   */
  
  public PlayerWeapon(String name, double worth, int attack){
    bladeNum = 1;
    this.attack = attack;
    this.name = name;
    this.worth = worth;
  }
  
  
  
  // Sets the number of blades
  public void setBladeNum(int bladeNum){
    this.bladeNum = bladeNum;
  }
  
  
  // Sets the damage the weapon does
  public void setAttack(int attack){
    this.attack = attack;
  }
  
  
  // Sets the weapon's name
  public void setName(String name){
    this.name = name;
  }
  
  
  // Returns the number of blades
  public int getBladeNum(){
    return bladeNum;
  }
  
  
  // Returns the damage the weapon does
  public int getAttack(){
    return attack;
  }
  
  
  // Returns the weapon's name
  public String getName(){
    return name;
  }
  
  
  // Returns all the info about the weapon the player has
  public String toString(){
    String str = "Your weapon does " + attack + " damage , is called " + name + " , and also has " + bladeNum + " blades.";
    return str;
  }
}