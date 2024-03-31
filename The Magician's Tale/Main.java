import java.io.*; //unfinished
public class Main{
  public static void main(String [] args)throws IOException{
    
    String name;
    System.out.println("Welcome future magician. Come toward the portal. Step right through.");
    System.out.println("Your adventure through realms and time have just begun. Please tell me your name.");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    name = br.readLine();
    System.out.println("Ah, welcome old friend. We have been in some through some hard times at Geraminage. Please help us. We need a new source of power.");
    System.out.println("Our power source is failing. We have run low on coal. Help us.");
    System.out.println("Thank you for volunteering brave soul to help us on our adventure to the future.");
    
    MagiciansPower weakFlame = new MagiciansPower(2, 1, 5.80);
    MagiciansPower strongFlame = new MagiciansPower(4, 4, 15.20);
    MagiciansPower fieryFlame = new MagiciansPower(6, 7, 30.50);
    MagiciansPower flickeringFlame = new MagiciansPower(8, 10, 50.00); // Highest level possible
    
    Magician fakeMagician = new Magician(name, "Imposter Type", weakFlame, 10, 2, 10);
    Magician badMagician = new Magician(name, "Card Type", strongFlame, 20, 4, 20);
    Magician cheatMagician = new Magician(name, "Cheat Type", fieryFlame, 40, 3, 30);
    Magician allPowerfulMagician = new Magician(name, "Grand Type", flickeringFlame, 100, 10, 50);
    
    Enemies simpleWizard = new Enemies("Tom", "Small Balls of Fire", 3, 10, 4, 2.00, 1, 5);
    Enemies simpleWitch = new Enemies("Ariana", "Plummenting Meteors", 5, 5, 7, 1.50, 2, 10);
    Enemies bossWizard = new Enemies("James", "Slow Time Down", 10, 50, 30, 40.80, 7, 20);
    Enemies bossWitch = new Enemies("Charlotte", "Teleport Anything", 8, 60, 20, 60.00, 9, 30);
    
    Store basicStore = new Store(50, 4, fakeMagician);
    Store enemyStore = new Store(100, 8, badMagician);
    Store hardCoreStore = new Store(200, 30, cheatMagician);
    Store magicStore = new Store(1000000, 1000, allPowerfulMagician);
    
    Areas starterArea = new Areas("Spawn", basicStore, simpleWizard);
    Areas inTheClouds = new Areas("CloudLand", enemyStore, simpleWitch);
    Areas saturn = new Areas("Alien Spaceship", hardCoreStore, bossWizard);
    Areas blackHole = new Areas("Blackholes", magicStore, bossWitch);
    
  }
}