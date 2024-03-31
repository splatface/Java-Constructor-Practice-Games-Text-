public class Enemies{
  // level
  private int level;
  // xp
  private int xp;
  // power
  private String power;
  // name
  private String name;
  // gold
  private double gold;
  // strength
  private int strength;
  // health
  private int health;
  // lives
  private int life;
  
  /* constructor of the magician's enemies
   * 
   * @param name
   * @param power
   * @param strength
   * @param health
   * @param xp
   * @param gold
   * @param level
   * @param life
   */
  
  public Enemies(String name, String power, int strength, int health, int xp, double gold, int level, int life){
    this.name = name;
    this.power = power;
    this.strength = strength;
    this.health = health;
    this.xp = xp;
    this.gold = gold;
    this.level = level;
    this.life = life;
  }
  
  
  //Sets name
  public void setName(String name){
    this.name = name;
  }
  
  
  //Sets power
  public void setPower(String power){
    this.power = power;
  }
  
  
  //Sets strength
  public void setStrength(int strength){
    this.strength = strength;
  }
  
  
  //Sets health
  public void setHealth(int health){
    this.health = health;
  }
  
  
  //Sets xp
  public void setXp(int xp){
    this.xp = xp;
  }
  
  
  //Sets gold
  public void setGold(double gold){
    this.gold = gold;
  }
  
  
  //Sets level
  public void setLevel(int level){
    this.level = level;
  }
  
  
  //Sets life
  public void setLife(int life){
    this.life = life;
  }
  
  
  //Returns name
  public String getName(){
    return name;
  }
  
  
  //Returns power
  public String getPower(){
    return power;
  }
  
  
  //Returns strength
  public int getStrength(){
    return strength;
  }
  
  
  //Returns health
  public int getHealth(){
    return health;
  }
  
  
  //Returns xp
  public int getXp(){
    return xp;
  }
  
  
  //Returns gold
  public double getGold(){
    return gold;
  }
  
  
  //Returns level
  public int getLevel(){
    return level;
  }
  
  
  //Returns life
  public int getLife(){
    return life;
  }
  
  
  //Loses life
  public void loseLife(int life){
    this.life = this.life - life;
  }
  
  //Returns all info about enemies
  public String toString(){
    String str = "Enemies stats: level:" + level;
    return str;
  }
}