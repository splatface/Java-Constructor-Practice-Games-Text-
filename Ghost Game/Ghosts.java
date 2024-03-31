public class Ghosts{
  
  
  // The ghost's colour
  private String colour;
  
  // The ghost's size
  private double size;
  
  // The ghost's level(changes as the player's level increases)
  private int level;
  
  // The ghost's powers
  private String powers;
  
  // The ghost's weapon
  private PlayerWeapon weapon;
  
  // The ghost's gold
  private double gold;
  
  // The ghost's xp
  private int xp;
  
  // The ghost's life(lives)
  private int life;
  
  // The ghost's name
  private String name;
  
  
  
  
  /* The constructor for the ghosts
   * @param colour
   * @param powers
   * @param gold
   * @param xp
   * @param name
   */
  public Ghosts(String colour, String powers, double gold, int xp, String name){
    this.colour = colour;
    this.powers = powers;
    this.gold = gold;
    this.xp = xp;
    size = 5;
    level = 1;
    life = 10;
    this.name = name;
  }
  
  
  // Sets the ghost's colour
  public void setColour(String colour){
    this.colour = colour;
  }
  
  
  // Sets the ghost's size
  public void setSize(double size){
    this.size = size;
  }
  
  
  // Sets the ghost's level
  public void setLevel(int level){
    this.level = level;
  }
  
  
  // Sets the ghost's powers
  public void setPowers(String powers){
    this.powers = powers;
  }
  
  
  // Sets the ghost's weapon
  public void equipWeapon(PlayerWeapon weapon){
    this.weapon = weapon;
  }
  
  
  //Sets the ghost's gold
  public void setGold(double gold){
    this.gold = gold;
  }
  
  
  // Sets the ghost's xp
  public void setXp(int xp){
    this.xp = xp;
  }
  
  
  // Sets the ghost's lives
  public void setLife(int life){
    this.life = life;
  }
  
  
  // Sets the ghost's name
  public void setName(String name){
    this.name = name;
  }
  
  
  // Returns the ghost's colour
  public String getColour(){
    return colour;
  }
  
  
  // Returns the ghost's size
  public double getSize(){
    return size;
  }
  
  
  // Returns the ghost's level
  public int getLevel(){
    return level;
  }
  
  
  // Returns the ghost's powers
  public String getPowers(){
    return powers;
  }
  
  
  // Returns the ghost's gold
  public double getGold(){
    return gold;
  }
  
  
  // Returns the ghost's xp
  public int getXp(){
    return xp;
  }
  
  // Returns the ghost's weapon
  public PlayerWeapon getWeapon(){
    return weapon;
  }
  
  
  // Returns the ghost's name
  public String getName(){
    return name;
  }
  // Returns the ghost's lives
  public int getLife(){
    return life;
  }
  
  
  // Returns the ghost's info in pacman[
  public String toString(){
    String str = "The ghost's colour are:" + colour + ". The ghost's size are:" + size + ". The ghost's levels are:" + level + ". The ghost's powers are:" + powers + ".";
    return str; 
  }
}