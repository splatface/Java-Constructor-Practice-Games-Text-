public class Player{
  
  
  // The player's name
  private String name;
  
  // The player's level
  private int level;
  
  // The player's xp
  private double xp;
  
  // The player's power(s)
  private String power;
  
  // The player's gold
  private double gold;
  
  // The player's weapon
  private PlayerWeapon weapon;
  
  // The player's intelligence
  private int intelligence;
  
  // The player's strength
  private int strength;
  
  // The player's lives
  private int life;
  
  
  
  
  
  /* The constructor of the player
   * 
   * @param name
   * @param power
   */
  
  public Player(String name, String power, int strength){
    this.name = name;
    this.power = power;
    this.strength = strength;
    level = 1;
    xp = 0;
    gold = 50;
    intelligence = 5;
    life = 20;
  }
  
  
  // Sets the player's name
  public void setName(String name){
    this.name = name;
  }
  
  
  // Sets the player's level
  public void setLevel(int level){
    this.level = level;
  }
  
  
  // Sets the player's xp
  public void setXp(double xp){
    this.xp = xp;
  }
  
  
  // Sets the player's power(s)
  public void setPower(String power){
    this.power = power;
  }
  
  
  // Sets the player's gold
  public void setGold(double gold){
    this.gold = gold;
  }
  
  
  // Sets the player's weapon
  public void setWeapon(PlayerWeapon weapon){
    this.weapon = weapon;
  }
  
  
  // Sets the player's life
  public void setLife(int life){
    this.life = life;
  }
  
  
  // Increases the player's intelligence
  public void addIntelligence(int intelligence){
    this.intelligence = this.intelligence + intelligence;
  }
  
  
  // Increases the player's strength
  public void addStrength(int strength){
    this.strength = this.strength + strength;
  }
  
  
  // Returns the player's name
  public String getName(){
    return name;
  }
  
  
  // Returns the player's level
  public int getLevel(){
    return level;
  }
  
  
  // Returns the player's xp
  public double getXp(){
    return xp;
  }
  
  
  // Returns the player's power
  public String getPower(){
    return power;
  }
  
  
  // Returns the player's gold
  public double getGold(){
    return gold;
  }
  
  
  // Returns the player's weapon
  public PlayerWeapon getWeapon(){
    return weapon;
  }
  
  
  // Returns the player's intelligence
  public int getIntelligence(){
    return intelligence;
  }
  
  
  // Returns the player's strength
  public int getStrength(){
    return strength;
  }
  
  
  // Returns the player's life(lives)
  public int getLife(){
    return life;
  }
  
  
  // Adds gold to the player's amount
  public void addGold(double gold){
    this.gold = this.gold + gold;
  }
  
  
  // Decreases the amount of gold the player has
  public void loseGold(double gold){
    this.gold = this.gold - gold;
  }
  
  
  // Equips the player's weapon
  public void equipWeapon(PlayerWeapon weapon){
    this.weapon = weapon;
  }
  
  
  // When the player loses a life
  public  void loseLife(int life){
    this.life = life - life;
  }
  
  
  // Increases the player's xp
  public void addXp(int xp){
    this.xp = xp + xp;
  }
  
  //  Returns all of the player's info
  public String toString(){
    String str = "Your stats are: level:" + level + "  xp:" + xp + "  powers:" + power + "  gold:" + gold + "  weapon:" + weapon;
    return str;
  }
}