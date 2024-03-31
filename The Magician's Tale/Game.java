import java.io.*;
import java.util.*;
public class Game{
  
  // Starter Area
  private Areas starterArea;
  
  // Second Area
  private Areas inTheClouds;
  
  // Planets
  private Areas saturn;
  
  // Space
  private Areas blackHoles;
  
  // Magician
  private Magician magician;
  
  // Enemy
  private Enemies enemies;
  
  // Boss Enemy
  private Enemies BossEnemy;
  
  // Starter Area
  private Areas Starting;
  
  // Final Area
  private Areas Final;
  
  // Current Location
  private Areas Current;
  
  // Heal Times Left
  private int heal = 10;
  
  // Powers Sold
  private MagiciansPower weakFlame;
  private MagiciansPower strongFlame;
  private MagiciansPower fieryFlame;
  private MagiciansPower flickeringFlame;
  
  public void changeLocation() throws IOException{
    
    int think;
    
    String whereGo;
    whereGo = "Where do you want to go? \n (1) Starting Area \n (2) CloudLand \n (3) Saturn \n (4) Blackholes in Space";
    System.out.println(whereGo);
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    think = Integer.parseInt(br.readLine());
    
    if(think == 1){
      Current = starterArea;
    }
    else if(think == 2){
      Current = inTheClouds;
    }
    else if(think == 3){
      Current = saturn;
    }
    else if(think == 4){
      Current = blackHoles;
    }
    else{
      System.out.println("Area not found. Please try again.");
      System.out.println(whereGo);
    }
  }
  /*constructor
   * 
   * @param player
   * @param enemy
   * @param boss enemy
   * @param starting location
   * @param final location
   */
  public Game(Magician magician, Enemies enemies, Enemies BossEnemy, Areas Starting, Areas Final){
    this.magician = magician;
    this.enemies = enemies;
    this.BossEnemy = BossEnemy;
    this.Starting = Starting;
    this.Final = Final;
  }
  
  public void actualGameLoop() throws IOException{
    
    if(magician.getLevel() >= 100){
      System.out.println("Max number of levels acquired.");
    }
    
    if(enemies.getLife() == 0){
      System.out.println("Magician Wins! Enemy Loses!");
    }
    
    Areas destination = null;
    
    // Hooks br to standard input
    BufferedReader rr = new BufferedReader(new InputStreamReader(System.in));
    
    int decide;
    
    while(magician.getLife() >= 0 && enemies.getLife() >= 0){
      if(enemies.getLife() == 100){
        System.out.println("Enemy has too many lives. Unkillable enemy. Avoid at all costs.");
      }
      else if (enemies.getLife() >= 80){
        System.out.println("Your enemy has 80 or more lives.");
      }
      else if (enemies.getLife() >= 50){
        System.out.println("Your enemy has 50 or more lives.");
      }
      else{
        System.out.println("Your enemy has 20 lives.");
      }
      if(magician.getLife() == 0){
        System.out.println("You lost the battle!");
      }
      if(enemies.getLife() == 0){
        System.out.println("Magician Wins! Enemy Loses!");
      }
      // Shows stats
      System.out.println(magician.toString());
      
      String whatDo = "What do you want to do? \n (1) Fight A Enemy \n (2) Go Somewhere \n (3) Heal " +  heal + " times left \n (4) Buy Something From Store";
      System.out.println(whatDo);
      decide = Integer.parseInt(rr.readLine());
      
      if(decide == 1){
        fightEnemy(enemies);
      }
      else if(decide == 2){
        changeLocation();
      }
      else if(decide == 3 && heal >= 0){
        magician.setLife(magician.getLife() + 1);
        heal --;
      }
      else{
        System.out.println("Do you want to buy a weapon? y/n");
        BufferedReader vr = new BufferedReader(new InputStreamReader(System.in));
        String yn = vr.readLine();
        
        if(Current == starterArea && yn == "y"){
          System.out.println("You can buy the weak flame.");
          System.out.println("Do you want to buy the weak flame? y/n");
          BufferedReader vv = new BufferedReader(new InputStreamReader(System.in));
          String ny = vv.readLine();
          if(ny == "y" && magician.getGold() >= 5.80){
            System.out.println("You have bought the weak flame.");
            magician.setPower(weakFlame);
            System.out.println(whatDo);
          }
          else{
            System.out.println(whatDo);
          }
        }
        else if(Current == inTheClouds && yn == "y"){
          System.out.println("The power sold at this area is the strong flame.");
          System.out.println("Do you want to buy the strong flame? y/n");
          BufferedReader rv = new BufferedReader(new InputStreamReader(System.in));
          String nooryes = rv.readLine();
          if(nooryes == "y" && magician.getGold() >= 15.20){
            System.out.println("You have bought the strong flame.");
            magician.setPower(strongFlame);
            System.out.println(whatDo);
          }
          else{
            System.out.println(whatDo);
          }
        }
        else if(Current == saturn && yn == "y"){
          System.out.println("The fiery flame is sold at this store.");
          System.out.println("Do you want to buy it? y/n");
          BufferedReader bv = new BufferedReader(new InputStreamReader(System.in));
          String yesorno = bv.readLine();
          if(yesorno == "y" && magician.getGold() >= 30.50){
            System.out.println("You have bought the fiery flame.");
            magician.setPower(fieryFlame);
            System.out.println(whatDo);
          }
          else{
            System.out.println(whatDo);
          }
        }
        else if(Current == blackHoles && yn == "y"){
          System.out.println("At this store, they sell flickering flames.");
          System.out.println("Do you want to buy the flickering flame? y/n");
          BufferedReader ve = new BufferedReader(new InputStreamReader(System.in));
          String nory = ve.readLine();
          if(nory == "y" && magician.getGold() >= 50.00){
            System.out.println("You have bought flickering flames.");
            magician.setPower(flickeringFlame);
            System.out.println(whatDo);
          }
        }
        else{
          System.out.println("Exiting store.");
          System.out.println(whatDo);
        }
      }
    }
    if(magician.getLife() > 0 && enemies.getLife() == 0){
      System.out.println("Magician wins!!!!!!!!!!!!!!!!!!!!!!!!!!! \n");
    }
    else{
      System.out.println("Magician loses!!!!!!!!!!!!!!!!!!!!!!!!!! \n");
    }
  }
  public void fightEnemy(Enemies enemies)throws IOException{
    int attack = 2;
    int enemy_attack;
    int decide2;
    int decide3;
    Random generator = new Random();
    String menu = "(1) attack (2) run (3) do nothing";
    
    BufferedReader cv = new BufferedReader(new InputStreamReader(System.in));
    
    while(magician.getLife() >= 0 && enemies.getLife() >= 0){
      System.out.println(menu);
      System.out.println("The enemies lives:" + enemies.getLife());
      System.out.println("Your magician's lives:" + enemies.getLife());
      
      decide2 = Integer.parseInt(cv.readLine());
      
      if(decide2 == 1){
        if(magician.getPower() != null){
          attack = generator.nextInt(magician.getStrength() + magician.getPower()) + 1;
        }
        else{
          magician.setPower(weakFlame);
          System.out.println("You have gotten a free weapon.");
          System.out.println(whatDo);
        }
        if(magician.getLife() >= 0 && attack == 1){
          enemies.setLife(enemies.getLife() - 1);
        }
      }
      if(decide2 == 2){
        System.out.println(whereGo);
        BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
        decide3 = Integer.parseInt(bb.readLine());
        if(decide3 == 1){
          Current = starterArea;
        }
        else if(decide3 == 2){
          Current = inTheClouds;
        }
        else if(decide3 == 3){
          Current = saturn;
        }
        else{
          Current = blackHoles;
        }
        if(decide2 == 3){
        magician.setLife(magician.getLife() - 1);
        System.out.println("You have automatically lost a life.");
        
      }
      }
      enemy_attack = generator.nextInt(1) + 1;
      if(enemies.getLife() > 0 && enemy_attack == 1){
        magician.setLife(magician.getLife() - 1);
      }
      else{
        System.out.println("The magician will not be attacked by this enemy.");
      }
    }
  }
  public void magicianAddXp(int xp){
    magician.addXp(xp);
    if(enemies.getLife() == 0){
      magician.addXp(1);
    }
    if(magician.getLife() >= 0){
      magician.addGold(enemies.getGold());
      magician.addXp(enemies.getXp());
    }
    if(xp == 100){
      magician.setLevel(magician.getLevel() + 1);
    }
  }
}