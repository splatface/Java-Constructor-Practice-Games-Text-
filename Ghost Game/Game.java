import java.io.*;
import java.util.*;

public class Game{
  
  // The easiest area
  private Map superEasyArea;
  
  // The easy area
  private Map easyArea;
  
  // The hard area
  private Map hardArea;
  
  // The hardest/final area
  private Map superHardArea;
  
  // The player of the game
  private Player player;
  
  // The ghost the player is fighting
  private Ghosts ghost;
  
  // The boss monster
  private Ghosts BossGhost;
  
  // The starting loaction
  private Map Starting;
  
  // The final loaction
  private Map Final;
  
  // The player's current loaction
  private Map Current;
  
  // The amount of times the player can heal themselves
  private int heal = 10;
  
  // The swords sold at each store
  private PlayerWeapon basicSword;
  private PlayerWeapon cheapSword;
  private PlayerWeapon badSword;
  private PlayerWeapon jurassicSword;
  
  // Defines the Current Loaction
  
  public void changeLocation()throws IOException{
    int think;
    String menu1 = " Where do you want to go? \n (1)   easiest area \n (2)   easy area \n (3)   hard area \n (4)   final and hardest area";
    System.out.println(menu1);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    think = Integer.parseInt(br.readLine());
    
    if(think == 1){
      Current = this.superEasyArea;
    }
    else if(think == 2){
      Current = this.easyArea;
    }
    else if(think == 3){
      Current = this.hardArea;
    }
    else{
      Current = this.superHardArea;
    }
    if(player.getLife() == 0){
      System.out.println(menu1);
    }
  }
  
  /* Generates the starting variables
   * 
   * @param player
   * @param ghosts
   * @param boss monster
   * @param starting loaction
   * @param final loaction
   */
  
  public Game(Player player, Ghosts ghost, Ghosts BossGhost, Map Starting, Map Final){
    this.player = player;
    this.ghost = ghost;
    this.BossGhost = BossGhost;
    this.Starting = Starting;
    this.Final = Final;
  }
  
  // If something goes wrong, it will throw IOException
  
  public void actualGameLoop() throws IOException{
    
    if(player.getLevel() > 100){
      System.out.println("Infinite amount of levels. 888888888888");
    }
    
    if(BossGhost.getLife() == 0){
      System.out.println("You win!");
    }
    
    Map destination = null;
    // Hooks up br to the standard input
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int decide;
    
    while(player.getLife() >= 0 && BossGhost.getLife() >= 0){
      // an infinite amount of ghosts
      if(ghost.getLife() == 100){
        ghost = BossGhost;
      }
      else if(ghost.getLife() == 80){
        ghost.setLife(60);      
      }
      else if(ghost.getLife() == 60){
        ghost.setLife(40);
      }
      else{
        ghost.setLife(20);
      }
      if(player.getLife() == 0){
        System.out.println("You lost. Revive and try again.");
      }
      // Calling on the player's stats from the other class
      System.out.println(player.toString());
      
      String whatdo = "What do you want to do? \n (1)   fight ghost \n (2)   go to a location \n (3)   heal your character ,only " + heal + " times left \n (4)   go to store at this location";
      System.out.println(whatdo);
      decide = Integer.parseInt(br.readLine());
      
      if(decide == 1){
        fightGhost(ghost);
      }
      else if(decide == 2){
        changeLocation();
      }
      else if(decide == 3 && heal >= 0){
        player.setLife(player.getStrength()* 2);
        heal --;
      }
      else if(decide == 4){
        // Asks player if player wants a new weapon
        System.out.println("Do you want to buy a weapon? y or n");
        BufferedReader rv = new BufferedReader(new InputStreamReader(System.in));
        String yn = rv.readLine();
        
        // player in superEasyArea? Buy Weapon?
        if(Current == superEasyArea && yn.equals("y")){
          System.out.println("You can buy the Basic Sword");
          System.out.println("Would you like to purchase this sword? y or n");
          BufferedReader rr = new BufferedReader(new InputStreamReader(System.in));
          String ny = rr.readLine();
          // Bought basic sword
          if(ny == "y"){
            if(player.getGold() >= 0){
              System.out.println("You have bought the Basic Sword.");
              player.setWeapon(basicSword);
            }
            else{
              System.out.println("You do not have enough money to buy this sword. You can earn more money by defeating ghosts.");
              System.out.println(whatdo);
            }
          }
          else if(ny == "n"){
            System.out.println(whatdo);
          }
        }
        // Player in easyArea? Buy sword?
        else if(Current == easyArea && yn.equals("y")){
          System.out.println("You can buy the Cheap Sword.");
          System.out.println("Would you like to purchase this sword? y or n");
          BufferedReader vv = new BufferedReader(new InputStreamReader(System.in));
          String nory = vv.readLine();
          // Bought cheap sword
          if(nory == "y"){
            if(player.getGold() >= 10){
              System.out.println("You have bought the Cheap Sword.");
              player.setWeapon(cheapSword);
            }
            else{
              System.out.println("You do not have enought money to buy this sword. You can earn more money by defeating ghosts.");
              System.out.println(whatdo);
            }
          }
          // Failsafe3
          else{
            System.out.println(whatdo);
          }
        }
        else if(Current == hardArea && yn.equals("y")){
          System.out.println("You can buy the Bad Sword.");
          System.out.println("Would you like to purchase this sword? y or n");
          BufferedReader vb = new BufferedReader(new InputStreamReader(System.in));
          String yorn = vb.readLine();
          if(yorn == "y"){
            if(player.getGold() >= 20){
              System.out.println("You have bought the Bad Sword.");
              player.setWeapon(badSword);
            }
            else{
              System.out.println(whatdo);
            }
          }
          else{
            System.out.println(whatdo);
          }
        }
        else if(Current == superHardArea && yn.equals("y")){
          System.out.println("You can buy the Jurassic Sword.");
          System.out.println("Would you like to purchase this sword? y or n");
          BufferedReader bv = new BufferedReader(new InputStreamReader(System.in));
          String ynor = bv.readLine();
          if(ynor == "y"){
            if(player.getGold() >= 1000000){
              System.out.println("You have bought the Jurassic Sword.");
              player.setWeapon(jurassicSword);
            }
            else{
              System.out.println(whatdo);
            }
          }
          else{
            System.out.println(whatdo);
          }
        }
      }
    }
    if(player.getLife() > 0 && ghost.getLife() == 0){
      System.out.println("\n !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
      System.out.println(player.getName() + "Wins!!!!!!");
      System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
    else{
      System.out.println("You have lost the battle.");
    }
  }
  
  
  /* When fighting monster
   * 
   * @param monster being fought
   * @exception IOException when reading not working
   */
  
  public void fightGhost(Ghosts ghost)throws IOException{
    int attack = 0;
    int ghost_attack;
    int decide2;
    int decide3;
    Random generator = new Random();
    String menu = "(1)   attack \n (2)   run away \n (3)   try";
    
    
    // Hooks up br to standard input
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    while(player.getLife() >= 0 && ghost.getLife() >= 0){
      
      System.out.println(menu);
      System.out.println("The ghost's lives:" + ghost.getLife());
      System.out.println("Your lives:" + player.getLife());
      
      decide2 = Integer.parseInt(br.readLine());
      
      if(decide2 == 1){
        // player has weapon?
        if(player.getWeapon() != null){
          attack = generator.nextInt(player.getStrength() +
                                     player.getWeapon().getAttack()) + 1;
        }
        // no weapon
        else{
          attack = generator.nextInt(player.getStrength()) + 1;
        }
        // player attacks ghost
        if(player.getLife() >= 0 && attack == 1){
          ghost.setLife(ghost.getLife() - 1);
        }
      }
      else{
        System.out.println("You need more lives.");
      }
      
      // allows the player to go to a different loaction
      
      if(decide2 == 2){
        System.out.println("Where do you want to go?");
        System.out.println("(1)   easiest area");
        System.out.println("(2)   easy area");
        System.out.println("(3)   hard area");
        System.out.println("(4)   final area");
        BufferedReader rr = new BufferedReader(new InputStreamReader(System.in));
        decide3 = Integer.parseInt(rr.readLine());
        if(decide3 == 1){
          Current = superEasyArea;
        }
        else if(decide3 == 2){
          Current = easyArea;
        }
        else if(decide3 == 3){
          Current = hardArea;
        }
        else{
          Current = superHardArea;
        }
      }
      // Ghost attack = i, i = 1, ghost attacks player
      ghost_attack = generator.nextInt(2) + 1;
      if(ghost.getLife() > 0 && ghost_attack == 1){
        player.setLife(player.getLife() - 1);
      }
      else{
        // ghost does not attack player
        System.out.println(player.getName() + " will not be attacked by this ghost at this time.");
      }
    }
  }
// if player defeated the ghost, the player's xp increases
  public void playerAddXp(int xp){
    player.addXp(xp);
    if(ghost.getLife() == 0){
      player.addXp(2);
    }
    if(player.getLife() <= 0){
      player.addGold(ghost.getGold());
      player.addXp(ghost.getXp());
    }
    // Levels up the player under a certain condition
    if(xp == 100){
      player.setLevel(player.getLevel() + 1);
    }
  }
}