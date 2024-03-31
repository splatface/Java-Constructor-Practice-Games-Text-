public class Map{
  
  
  // The name of the loaction
  private String name;
  
  // The store at the loaction
  private PacmanStore building;
  
  // The monster at this loaction
  private Ghosts ghost;
  
  
  /* The constructor of the map
   * 
   * @param name of the loaction
   * @param store at the loaction
   * @param monster at the loaction
   */
  
  public Map(String name, PacmanStore building, Ghosts ghost){
    this.name = name;
    this.building = building;
    this.ghost = ghost;
  }
  
  // Sets the name of the loaction
  public void setName(String name){
    this.name = name;
  }
  
  
  // Sets the store at the loaction
  public void setBuilding(PacmanStore building){
    this.building = building; 
  }
  
  // Sets the monster at the loaction
  public void setGhost(Ghosts ghost){
    this.ghost = ghost;
  }
  
  // Returns the name of the loaction
  public String getName(){
    return name;
  }
  
  // Returns the store at the loaction\
  public PacmanStore getBuilding(){
    return building;
  }
  
  // Returns the monster at the loaction
  public Ghosts getGhost(){
    return ghost;
  }
  
  
  // Returns all info about the map
  public String toString(){
    String str = "You are at the " + name;
    return str;
  }
}