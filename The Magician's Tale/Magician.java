public class Magician{
  
  // level
  private int level;
  // health
  private int health;
  // strength
  private double strength;
  // power
  private MagiciansPower power;
  // type
  private String type;
  // name
  private String name;
  // gold
  private double gold;
  // xp
  private int xp;
  // lives
  private int life;
  
  
  
  /* constructor of the magician
   * 
   * @param power
   * @param type
   * @param name
   * @param health
   * @param strength
   */
  
  public Magician(String name, String type, MagiciansPower power, int health, double strength, int life){
    this.power = power;
    this.type = type;
    this.name = name;
    this.health = health;
    this.strength = strength;
    this.life = life;
    level = 1;
    gold = 100.00;
    xp = 0;
  }
  
  // Sets the name of magician
  public void setName(String name){
    this.name = name;
  }
  
  // Sets the type of magician(ie. conjurer)
  public void setType(String type){
    this.type = type;
  }
  
  // Sets the power(s) of the magician
  public void setPower(MagiciansPower power){
    this.power = power;
  }
  
  // Sets the magician's health
  public void setHealth(int health){
    this.health = health;
  }
  
  // Sets the magician's level
  public void setLevel(int level){
    this.level = level;
  }
  
  // Sets the magician's strength
  public void setStrength(double strength){
    this.strength = strength;
  }
  
  // Sets the magician's gold
  public void setGold(double gold){
    this.gold = gold;
  }
  
  // Sets the magician's xp
  public void setXp(int xp){
    this.xp = xp;
  }
  
  // Sets the magician's lives
  public void setLife(int life){
    this.life = life;
  }
  
  
  // Returns name
  public String getName(){
    return name;
  }
  
  
  // Returns type
  public String getType(){
    return type;
  }
  
  
  // Returns power(s)
  public MagiciansPower getPower(){
    return power;
  }
  
  
  // Equips power(s)
  public MagiciansPower equipPower(){
    return power;
  }
  
  
  // Returns health
  public int getHealth(){
    return health;
  }
  
  
  // Returns level
  public int getLevel(){
    return level;
  }
  
  
  // Returns strength
  public double getStrength(){
    return strength;
  }
  
  
  // Returns gold
  public double getGold(){
    return gold;
  }
  
  
  // Returns xp
  public int getXp(){
    return xp;
  }
  
  
  // Returns life
  public int getLife(){
    return life;
  }
  
  
  // Loses gold
  public double loseGold(double gold){
    this.gold = this.gold - gold;
  }
  
  
  //Gains gold
  public double addGold(double gold){
    this.gold = this.gold + gold;
  }
  
  
  // Loses life
  public int loseLife(int life){
    this.life = this.life - life;
  }
  
  
  // Gains life
  public int gainLife(int life){
    this.life = this.life + life;
  }
  
  
  // Adds xp
  public int addXp(int xp){
    this.xp = this.xp + xp;
  }
  
  
  // Returns all info about the magician
  public String toString(){
    String str = "Your magician's stats are: level:" + level + ", strength:" + strength + ", gold:" + gold + ", xp:" + xp + ", health:" + health + ", power:" + power + ", type:" + type;
    return str;
  }
}