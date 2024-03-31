public class Areas{
  
  //name of location  
  private String name;

  //store at location
  private Store store;
  
  //enemy at location
  private Enemies enemy;
  
  /* constructor of the area
   * 
   * @param name
   * @param store
   * @param enemy
   */
  
  public Areas(String name, Store store, Enemies enemy){
    this.name = name;
    this.store = store;
    this.enemy = enemy;
  }
  
  //Sets name
  public void setName(String name){
    this.name = name;
  }
  
  
  //Sets store
  public void setStore(Store store){
    this.store = store;
  }
  
  
  //Sets enemy
  public void setEnemy(Enemies enemy){
    this.enemy = enemy;
  }
  
  
  //Returns name
  public String getName(){
    return name;
  }
  
  
  //Returns store
  public Store getStore(){
    return store;
  }
  
  
  //Returns enemy
  public Enemies getEnemy(){
    return enemy;
  }
}