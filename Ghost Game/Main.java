import java.io.*;

// This program will allow the game to run

public class Main{
  
  public static void main(String[] args)throws IOException {
    
    String name;
    System.out.println("Welcome player, Please state your name \n");
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String decide;
    decide = br.readLine();
    
    name = decide;
    
    Player player = new Player(name, "fire", 4);
    
    Ghosts simpleGhost = new Ghosts("red", "freeze", 30, 20, name);
    Ghosts bossGhost = new Ghosts("blue", "intense flames", 50, 40, name);
    Ghosts magicGhost = new Ghosts("rainbow", "fire and ice balls", 100, 60, name);
    Ghosts dinosaurGhost = new Ghosts("green", "bite", 300, 1000, name);
    
    PlayerWeapon basicSword = new PlayerWeapon("Eco-Friendly Sword", 0, 3);
    PlayerWeapon cheapSword = new PlayerWeapon("Broken Sword", 10, 5);
    PlayerWeapon badSword = new PlayerWeapon("Wrecked Sword", 20, 9);
    PlayerWeapon jurassicSword = new PlayerWeapon("Jurassic Sword", 1000000, 100);
    
    PacmanStore store1 = new PacmanStore(5, basicSword, player);
    PacmanStore store2 = new PacmanStore(10, cheapSword, player);
    PacmanStore store3 = new PacmanStore(20, badSword, player);
    PacmanStore store4 = new PacmanStore(1000000, jurassicSword, player);
    
    Map superEasyArea = new Map("easiest area", store1, simpleGhost);
    Map easyArea = new Map("easy area", store2, bossGhost);
    Map hardArea = new Map("hard area", store3, magicGhost);
    Map superHardArea = new Map("final area", store4, dinosaurGhost);
    
    Game game = new Game(player, simpleGhost, bossGhost, superEasyArea, superHardArea);
    game.actualGameLoop();
  }
}