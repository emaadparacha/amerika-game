import java.util.Scanner;

public class Amerika
{
   public static void main(String[] args)
   {
   
      Scanner in = new Scanner(System.in);
   
      Gun pistol = new Gun(10, 100, "Pistol");
      Gun acr = new Gun(25, 200, "ACR");
      Gun m4a1 = new Gun(35, 300, "M4A1");
      Gun ak = new Gun(45, 400, "AK-47");
      Gun rpg = new Gun(55, 500, "RPG");
      Gun nuke = new Gun(100, 1000, "Nuclear Bomb");
   	
      Enemy hawaii = new Enemy(5,15,20,"Hawaii","You conquered Hawaii!");
      Enemy rhode = new Enemy(5,15,20,"Rhode Island","You conquered Rhode Island!, you are level 2!");
      Enemy delaware = new Enemy(10,20,25,"Delaware","You conquered Delaware!");
      Enemy connect = new Enemy(10,20,25,"Connecticut","You conquered Connecticut! You are level 3!");
      Enemy jersey = new Enemy(15,25,30,"New Jersey","You conquered New Jersey!");
      Enemy hampshire = new Enemy(15,25,30,"New Hampshire","You conquered New Hampshire! You are level 4!");
      Enemy mass = new Enemy(20,30,35,"Massachusetts","You conquered Massachusetts!");
      Enemy vermont = new Enemy(20,30,35,"Vermont","You conquered Vermont! You are level 5!");
      Enemy westv = new Enemy(25,35,40,"West Virginia","You conquered West Virginia!");
      Enemy maryland = new Enemy(25,35,40,"Maryland","You conquered Maryland! You are level 6!");
      Enemy southc = new Enemy(30,40,45,"South Carolina","You conquered South Carolina!");
      Enemy maine = new Enemy(30,40,45,"Maine","You conquered Maine! You are level 7!");
      Enemy india = new Enemy(35,45,50,"Indiana","You conquered Indiana!");
      Enemy kentucky = new Enemy(35,45,50,"Kentucky","You conquered Kentucky! You are level 8!");
      Enemy tenn = new Enemy(40,50,55,"Tennessee","You conquered Tennessee!");
      Enemy virginia = new Enemy(40,50,55,"Virginia","You conquered Virginia! You are level 9!");
      Enemy penn = new Enemy(45,55,60,"Pennsylvania","You conquered Pennsylvania!");
      Enemy ohio = new Enemy(45,55,60,"Ohio","You conquered Ohio! You are level 10!");
      Enemy miss = new Enemy(50,60,65,"Mississippi","You conquered Mississippi!");
      Enemy louis = new Enemy(50,60,65,"Louisiana","You conquered Louisiana! You are level 11!");
      Enemy alab = new Enemy(55,65,70,"Alabama","You conquered Alabama!");
      Enemy ark = new Enemy(55,65,70,"Arkansas","You conquered Arkansas! You are level 12!");
      Enemy northc = new Enemy(60,70,75,"North Carolina","You conquered North Carolina!");
      Enemy newy = new Enemy(60,70,75,"New York","You conquered New York! You are level 13!");
      Enemy illi = new Enemy(65,75,80,"Illinois","You conquered Illinois!");
      Enemy iowa = new Enemy(65,75,80,"Iowa","You conquered Iowa! You are level 14!");
      Enemy wisc = new Enemy(70,80,85,"Wisconsin","You conquered Wisconsin!");
      Enemy geo = new Enemy(70,80,85,"Georgia","You conquered Gerogia! You are level 15!");
      Enemy miso = new Enemy(75,85,90,"Missouri","You conquered Missouri!");
      Enemy flor = new Enemy(75,85,90,"Florida","You conquered Florida! You are level 16!");
      Enemy northd = new Enemy(80,90,95,"North Dakota","You conquered North Dakota!");
      Enemy okla = new Enemy(80,90,95,"Oklahoma","You conquered Oklahoma! You are level 17!");
      Enemy southd = new Enemy(85,95,100,"South Dakota","You conquered South Dakota!");
      Enemy wash = new Enemy(85,95,100,"Washington","You conquered Washington! You are level 18!");
      Enemy nebr = new Enemy(90,100,105,"Nebraska","You conquered Nebraska!");
      Enemy kans = new Enemy(90,100,105,"Kansas","You conquered Kansas! You are level 19!");
      Enemy ida = new Enemy(95,105,110,"Idaho","You conquered Idaho!");
      Enemy uta = new Enemy(95,105,110,"Utah","You conquered Utah! You are level 20!");
      Enemy minn = new Enemy(100,110,110,"Minnesota","You conquered Minnesota!");
      Enemy wyo = new Enemy(100,110,110,"Wyoming","You conquered Wyoming! You are level 21!");
      Enemy mich = new Enemy(110,120,110,"Michigan","You conquered Michigan!");
      Enemy oreg = new Enemy(110,120,110,"Oregon","You conquered Oregon! You are level 22!");
      Enemy colo = new Enemy(110,120,110,"Colorado","You conquered Colorado!");
      Enemy nev = new Enemy(110,120,110,"Nevada","You conquered Nevada! You are level 23!");
      Enemy newm = new Enemy(115,125,110,"New Mexico","You conquered New Mexico!");
      Enemy ariz = new Enemy(115,125,110,"Arizona","You conquered Arizona! You are level 24!");
      Enemy mont = new Enemy(120,130,110,"Montana","You conquered Montana!");
      Enemy alas = new Enemy(120,130,110,"Alaska","You conquered Alaska! You are level 25 - The highest!");
      Enemy calif = new Enemy(130,140,110,"California","You conquered California!");
      Enemy tex = new Enemy(140,150,110,"Texas","You conquered Texas! Now onto the Cookie Monster!");
      Enemy cuc = new Enemy(150,200,100000,"Cookie Monster","You have defeated the Cookie Monster! You have won!");
   	
   	
   
      System.out.println("     _____             _ _         _ ");
      System.out.println("    |  |  |___ _ _ ___|_| |_ ___ _| | ");
      System.out.println("    |  |  |   | | |   | |  _| -_| . | ");
      System.out.println("    |_____|_|_|___|_|_|_|_| |___|___| ");
      System.out.println("                                      ");
      System.out.println("                                        ");
      System.out.println("     _____ _       _                  ___   ");
      System.out.println("    |   __| |_ ___| |_ ___ ___    ___|  _|");
      System.out.println("    |__   |  _| .'|  _| -_|_ -|  | . |  _|");
      System.out.println("    |_____|_| |__,|_| |___|___|  |___|_| ");
      System.out.println("                                         ");
      System.out.println("                                        ");
      System.out.println("     _____               _ _           ");
      System.out.println("    |  _  |_____ ___ ___|_| |_ ___   ");
      System.out.println("    |     |     | -_|  _| | '_| .'| ");
      System.out.println("    |__|__|_|_|_|___|_| |_|_,_|__,|");
      System.out.println("                                      ");
   	
      System.out.println("What is your name, future (hopefully) conqueror?");
      String a = in.next();
      Player p = new Player(1, 100, a, pistol, 50);
   	
      System.out.println("    +---------------------------------------------------------------------+");
      System.out.println("    |                           Background                                |");
      System.out.println("    +---------------------------------------------------------------------+");
      System.out.println("    |Welcome to Amerika, " + a + "...  ***********************");
      System.out.println("    |The Ununited States of Amerika formed after Al-Qaeda was successful  |");
      System.out.println("    |in trying to create a civil war by turning the people of the former  |");
      System.out.println("    |United States of America against the government. What resulted was   |");
      System.out.println("    |every single one of the 50 states, still (falsely) together, but     |");
      System.out.println("    |without a federal government. These states govern themselves, have   |");
      System.out.println("    |their own economies, their own armies, and their own laws. No central|");
      System.out.println("    |government is the reason why the whole world calls them 'Ununited'.  |");
      System.out.println("    |'Amerika', instead of 'America', was coined as the name because of   |");
      System.out.println("    |the large population of illiterate people who always spelled America |");
      System.out.println("    |'Amerika'. Now here is where you come in this game. You are a very   |");
      System.out.println("    |ambitious person. You see that there are many weak states, and you   |");
      System.out.println("    |realize that you can conquer every one of these states and form your |");
      System.out.println("    |kingdom, with you ruling over EVERYONE. You must battle across 50    |");
      System.out.println("    |states, from the weakest, Hawaii, to the strongest, Texas (they have |");
      System.out.println("    |A LOT OF GUNS, trust me). When you capture Texas, you will be very   |");
      System.out.println("    |happy, thinking that you have won, but no, you will not have won. You|");
      System.out.println("    |see, there is this warlord, he goes by the name of Florin Cuc, let's |");
      System.out.println("    |call him Cookie Monster for short. He will be waiting for you once   |");
      System.out.println("    |you capture Texas. He is stronger than anything the Texan army will  |");
      System.out.println("    |throw upon you. After you beat him, you will truly be the strongest  |");
      System.out.println("    |in all of Amerikan lands, and will be able to organize your own      |");
      System.out.println("    |government/kingdom/playground/whatever-you-want, and live your dreams|");
      System.out.println("    +---------------------------------------------------------------------+");
   	
      System.out.println("                                          ");
      System.out.println("                                          ");
      System.out.println("                                          ");
      System.out.println("                                          ");
      System.out.println("                                          ");
      System.out.println("Once you have read this, enter anything to start the game!");
      String rr = in.next();
   	
   	
      System.out.println("Welcome Commander " + a +"!");
      System.out.println("Let me show you your stats");
      System.out.println("Your level is: " + p.getLevel() + " - this will increase as you win");
      System.out.println("Your health is: " + p.getHealth() + " - this will increase as you level up, and refill as you win");
      System.out.println("Your gun is: " + p.getGun());
      System.out.println("Money you have: " + p.getMoney() + " - you will get more as you win");
      System.out.println("-----------------------------------------------------------------------");
      System.out.println("Between fights you can press 'b' to buy other weapons");
      System.out.println("If you want to quit, simply exit");
      System.out.println("Shall we begin? (Enter anything to continue)");
      String kgirejoierj = in.next();
   	
      System.out.println("Your first enemy is " + hawaii.getName());
      System.out.println("It has " + hawaii.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      String eefjuoerghouer = in.next();
      while (hawaii.getStrength() > 0)
      {
         hawaii.hitPlayer(p, hawaii);
         p.hitEnemy(hawaii, p);
      }
   	
      p.refillHealth(p);
      p.addMoney(hawaii.getPrize());
   
      System.out.println("Good job. Enter anything to continue");
      String efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      String uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      String enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + rhode.getName());
      System.out.println("It has " + rhode.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (rhode.getStrength() > 0)
      {
         rhode.hitPlayer(p, rhode);
         p.hitEnemy(rhode, p);
      }
      p.changeLevel(2);
      p.refillHealth(p);
      p.addMoney(rhode.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + delaware.getName());
      System.out.println("It has " + delaware.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (delaware.getStrength() > 0)
      {
         delaware.hitPlayer(p, delaware);
         p.hitEnemy(delaware, p);
      }
      p.refillHealth(p);
      p.addMoney(delaware.getPrize());
   	
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + connect.getName());
      System.out.println("It has " + connect.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (connect.getStrength() > 0)
      {
         connect.hitPlayer(p, connect);
         p.hitEnemy(connect, p);
      }
      p.changeLevel(3);
      p.refillHealth(p);
      p.addMoney(connect.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + jersey.getName());
      System.out.println("It has " + jersey.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (jersey.getStrength() > 0)
      {
         jersey.hitPlayer(p, jersey);
         p.hitEnemy(jersey, p);
      }
      p.refillHealth(p);
      p.addMoney(jersey.getPrize());
   	
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   			
      System.out.println("Your next enemy is " + hampshire.getName());
      System.out.println("It has " + hampshire.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (hampshire.getStrength() > 0)
      {
         hampshire.hitPlayer(p, hampshire);
         p.hitEnemy(hampshire, p);
      }
      p.changeLevel(4);
      p.refillHealth(p);
      p.addMoney(hampshire.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + mass.getName());
      System.out.println("It has " + mass.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (mass.getStrength() > 0)
      {
         mass.hitPlayer(p, mass);
         p.hitEnemy(mass, p);
      }
      p.refillHealth(p);
      p.addMoney(mass.getPrize());
   	
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + vermont.getName());
      System.out.println("It has " + vermont.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (vermont.getStrength() > 0)
      {
         vermont.hitPlayer(p, vermont);
         p.hitEnemy(vermont, p);
      }
      p.changeLevel(5);
      p.refillHealth(p);
      p.addMoney(vermont.getPrize());
   	
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + westv.getName());
      System.out.println("It has " + westv.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (westv.getStrength() > 0)
      {
         westv.hitPlayer(p, westv);
         p.hitEnemy(westv, p);
      }
      p.refillHealth(p);
      p.addMoney(westv.getPrize());
   	
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + maryland.getName());
      System.out.println("It has " + maryland.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (maryland.getStrength() > 0)
      {
         maryland.hitPlayer(p, maryland);
         p.hitEnemy(maryland, p);
      }
      p.changeLevel(6);
      p.refillHealth(p);
      p.addMoney(maryland.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + southc.getName());
      System.out.println("It has " + southc.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (southc.getStrength() > 0)
      {
         southc.hitPlayer(p, southc);
         p.hitEnemy(southc, p);
      }
     
      p.refillHealth(p);
      p.addMoney(southc.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + maine.getName());
      System.out.println("It has " + maine.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (maine.getStrength() > 0)
      {
         maine.hitPlayer(p, maine);
         p.hitEnemy(maine, p);
      }
      p.changeLevel(7);
      p.refillHealth(p);
      p.addMoney(maine.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + india.getName());
      System.out.println("It has " + india.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (india.getStrength() > 0)
      {
         india.hitPlayer(p, india);
         p.hitEnemy(india, p);
      }
     
      p.refillHealth(p);
      p.addMoney(india.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + kentucky.getName());
      System.out.println("It has " + kentucky.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (kentucky.getStrength() > 0)
      {
         kentucky.hitPlayer(p, kentucky);
         p.hitEnemy(kentucky, p);
      }
      p.changeLevel(8);
      p.refillHealth(p);
      p.addMoney(kentucky.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + tenn.getName());
      System.out.println("It has " + tenn.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (tenn.getStrength() > 0)
      {
         tenn.hitPlayer(p, tenn);
         p.hitEnemy(tenn, p);
      }
     
      p.refillHealth(p);
      p.addMoney(tenn.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + virginia.getName());
      System.out.println("It has " + virginia.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (virginia.getStrength() > 0)
      {
         virginia.hitPlayer(p, virginia);
         p.hitEnemy(virginia, p);
      }
      p.changeLevel(9);
      p.refillHealth(p);
      p.addMoney(virginia.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + penn.getName());
      System.out.println("It has " + penn.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (penn.getStrength() > 0)
      {
         penn.hitPlayer(p, penn);
         p.hitEnemy(penn, p);
      }
      
      p.refillHealth(p);
      p.addMoney(penn.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + ohio.getName());
      System.out.println("It has " + ohio.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (ohio.getStrength() > 0)
      {
         ohio.hitPlayer(p, ohio);
         p.hitEnemy(ohio, p);
      }
      p.changeLevel(10);
      p.refillHealth(p);
      p.addMoney(ohio.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + miss.getName());
      System.out.println("It has " + miss.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (miss.getStrength() > 0)
      {
         miss.hitPlayer(p, miss);
         p.hitEnemy(miss, p);
      }
      
      p.refillHealth(p);
      p.addMoney(miss.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + louis.getName());
      System.out.println("It has " + louis.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (louis.getStrength() > 0)
      {
         louis.hitPlayer(p, louis);
         p.hitEnemy(louis, p);
      }
      p.changeLevel(11);
      p.refillHealth(p);
      p.addMoney(louis.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + alab.getName());
      System.out.println("It has " + alab.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (alab.getStrength() > 0)
      {
         alab.hitPlayer(p, alab);
         p.hitEnemy(alab, p);
      }
      
      p.refillHealth(p);
      p.addMoney(alab.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + ark.getName());
      System.out.println("It has " + ark.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (ark.getStrength() > 0)
      {
         ark.hitPlayer(p, ark);
         p.hitEnemy(ark, p);
      }
      p.changeLevel(12);
      p.refillHealth(p);
      p.addMoney(ark.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + northc.getName());
      System.out.println("It has " + northc.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (northc.getStrength() > 0)
      {
         northc.hitPlayer(p, northc);
         p.hitEnemy(northc, p);
      }
      
      p.refillHealth(p);
      p.addMoney(northc.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + newy.getName());
      System.out.println("It has " + newy.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (newy.getStrength() > 0)
      {
         newy.hitPlayer(p, newy);
         p.hitEnemy(newy, p);
      }
      p.changeLevel(13);
      p.refillHealth(p);
      p.addMoney(newy.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + illi.getName());
      System.out.println("It has " + illi.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (illi.getStrength() > 0)
      {
         illi.hitPlayer(p, illi);
         p.hitEnemy(illi, p);
      }
      
      p.refillHealth(p);
      p.addMoney(illi.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + iowa.getName());
      System.out.println("It has " + iowa.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (iowa.getStrength() > 0)
      {
         iowa.hitPlayer(p, iowa);
         p.hitEnemy(iowa, p);
      }
      p.changeLevel(14);
      p.refillHealth(p);
      p.addMoney(iowa.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + wisc.getName());
      System.out.println("It has " + wisc.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (wisc.getStrength() > 0)
      {
         wisc.hitPlayer(p, wisc);
         p.hitEnemy(wisc, p);
      }
      
      p.refillHealth(p);
      p.addMoney(wisc.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + geo.getName());
      System.out.println("It has " + geo.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (geo.getStrength() > 0)
      {
         geo.hitPlayer(p, geo);
         p.hitEnemy(geo, p);
      }
      p.changeLevel(15);
      p.refillHealth(p);
      p.addMoney(geo.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + miso.getName());
      System.out.println("It has " + miso.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (miso.getStrength() > 0)
      {
         miso.hitPlayer(p, miso);
         p.hitEnemy(miso, p);
      }
      
      p.refillHealth(p);
      p.addMoney(miso.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + flor.getName());
      System.out.println("It has " + flor.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (flor.getStrength() > 0)
      {
         flor.hitPlayer(p, flor);
         p.hitEnemy(flor, p);
      }
      p.changeLevel(16);
      p.refillHealth(p);
      p.addMoney(flor.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + northd.getName());
      System.out.println("It has " + northd.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (northd.getStrength() > 0)
      {
         northd.hitPlayer(p, northd);
         p.hitEnemy(northd, p);
      }
      
      p.refillHealth(p);
      p.addMoney(northd.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + okla.getName());
      System.out.println("It has " + okla.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (okla.getStrength() > 0)
      {
         okla.hitPlayer(p, okla);
         p.hitEnemy(okla, p);
      }
      p.changeLevel(17);
      p.refillHealth(p);
      p.addMoney(okla.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + southd.getName());
      System.out.println("It has " + southd.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (southd.getStrength() > 0)
      {
         southd.hitPlayer(p, southd);
         p.hitEnemy(southd, p);
      }
      
      p.refillHealth(p);
      p.addMoney(southd.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + wash.getName());
      System.out.println("It has " + wash.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (wash.getStrength() > 0)
      {
         wash.hitPlayer(p, wash);
         p.hitEnemy(wash, p);
      }
      p.changeLevel(18);
      p.refillHealth(p);
      p.addMoney(wash.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + nebr.getName());
      System.out.println("It has " + nebr.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (nebr.getStrength() > 0)
      {
         nebr.hitPlayer(p, nebr);
         p.hitEnemy(nebr, p);
      }
      
      p.refillHealth(p);
      p.addMoney(nebr.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + kans.getName());
      System.out.println("It has " + kans.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (kans.getStrength() > 0)
      {
         kans.hitPlayer(p, kans);
         p.hitEnemy(kans, p);
      }
      p.changeLevel(19);
      p.refillHealth(p);
      p.addMoney(kans.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + ida.getName());
      System.out.println("It has " + ida.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (ida.getStrength() > 0)
      {
         ida.hitPlayer(p, ida);
         p.hitEnemy(ida, p);
      }
      
      p.refillHealth(p);
      p.addMoney(ida.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + uta.getName());
      System.out.println("It has " + uta.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (uta.getStrength() > 0)
      {
         uta.hitPlayer(p, uta);
         p.hitEnemy(uta, p);
      }
      p.changeLevel(20);
      p.refillHealth(p);
      p.addMoney(uta.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + minn.getName());
      System.out.println("It has " + minn.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (minn.getStrength() > 0)
      {
         minn.hitPlayer(p, minn);
         p.hitEnemy(minn, p);
      }
      
      p.refillHealth(p);
      p.addMoney(minn.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + wyo.getName());
      System.out.println("It has " + wyo.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (wyo.getStrength() > 0)
      {
         wyo.hitPlayer(p, wyo);
         p.hitEnemy(wyo, p);
      }
      p.changeLevel(21);
      p.refillHealth(p);
      p.addMoney(wyo.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + mich.getName());
      System.out.println("It has " + mich.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (mich.getStrength() > 0)
      {
         mich.hitPlayer(p, mich);
         p.hitEnemy(mich, p);
      }
      
      p.refillHealth(p);
      p.addMoney(mich.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + oreg.getName());
      System.out.println("It has " + oreg.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (oreg.getStrength() > 0)
      {
         oreg.hitPlayer(p, oreg);
         p.hitEnemy(oreg, p);
      }
      p.changeLevel(22);
      p.refillHealth(p);
      p.addMoney(oreg.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + colo.getName());
      System.out.println("It has " + colo.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (colo.getStrength() > 0)
      {
         colo.hitPlayer(p, colo);
         p.hitEnemy(colo, p);
      }
      
      p.refillHealth(p);
      p.addMoney(colo.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + nev.getName());
      System.out.println("It has " + nev.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (nev.getStrength() > 0)
      {
         nev.hitPlayer(p, nev);
         p.hitEnemy(nev, p);
      }
      p.changeLevel(23);
      p.refillHealth(p);
      p.addMoney(nev.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + newm.getName());
      System.out.println("It has " + newm.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (newm.getStrength() > 0)
      {
         newm.hitPlayer(p, newm);
         p.hitEnemy(newm, p);
      }
      
      p.refillHealth(p);
      p.addMoney(newm.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + ariz.getName());
      System.out.println("It has " + ariz.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (ariz.getStrength() > 0)
      {
         ariz.hitPlayer(p, ariz);
         p.hitEnemy(ariz, p);
      }
      p.changeLevel(24);
      p.refillHealth(p);
      p.addMoney(ariz.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + mont.getName());
      System.out.println("It has " + mont.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (mont.getStrength() > 0)
      {
         mont.hitPlayer(p, mont);
         p.hitEnemy(mont, p);
      }
      
      p.refillHealth(p);
      p.addMoney(mont.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + alas.getName());
      System.out.println("It has " + alas.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (alas.getStrength() > 0)
      {
         alas.hitPlayer(p, alas);
         p.hitEnemy(alas, p);
      }
      p.changeLevel(25);
      p.refillHealth(p);
      p.addMoney(alas.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + calif.getName());
      System.out.println("It has " + calif.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (calif.getStrength() > 0)
      {
         calif.hitPlayer(p, calif);
         p.hitEnemy(calif, p);
      }
      
      p.refillHealth(p);
      p.addMoney(calif.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("Your next enemy is " + tex.getName());
      System.out.println("It has " + tex.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (tex.getStrength() > 0)
      {
         tex.hitPlayer(p, tex);
         p.hitEnemy(tex, p);
      }
      
      p.refillHealth(p);
      p.addMoney(tex.getPrize());
      System.out.println("Good job. Enter anything to continue");
      efiiwfjiwe = in.next();
   	
      System.out.println("Your level is: " + p.getLevel());
      System.out.println("Your health is: " + p.getHealth());
      System.out.println("Money you have: " + p.getMoney());
   	
      System.out.println("Entering marketplace. Enter anything to continue");
      uhirhwirughiwr = in.next();
   	
      System.out.println("Enter 1 to buy ACR for 200 - damage is 25");
      System.out.println("Enter 2 to buy M4A1 for 300 - damage is 35");
      System.out.println("Enter 3 to buy AK-47 for 400 - damage is 45");
      System.out.println("Enter 4 to buy RPG for 500 - damage is 55");
      System.out.println("Enter 5 to buy nuke for 1000 - damage is 100");
      System.out.println("Or anything else to continue");
      System.out.println("KEEP IN MIND YOU HAVE ONLY ONE TRY");
      enter = in.next();
   	
      p.buyGun(enter, p);
   	
      System.out.println("You will now be facing the Cookie Monster. Get ready!");
   	
      System.out.println("He has " + cuc.getStrength() + " strength");
      System.out.println("LETS FIGHT! (enter anything to continue)");
      eefjuoerghouer = in.next();
      while (cuc.getStrength() > 0)
      {
         cuc.hitPlayer(p, cuc);
         p.hitEnemy(cuc, p);
      }
      p.refillHealth(p);
      p.addMoney(cuc.getPrize());
   	
      System.out.println("------------------------------------------------------------------------------------");
      System.out.println("------------------------------------------------------------------------------------");
      System.out.println("Those were some really intense months of battle");
      System.out.println("But " + a + " was able to defeat all 50 states and Florin Cuc");
      System.out.println("He now has the title of Supreme Leader, and now rules over all of Amerikan lands");
      System.out.println("Thats it for now then. Join us sometime later");
   	
      System.out.println("Credits:");
      System.out.println("Everything: The Communist Panda");
   
      System.out.println("Goodbye");
      System.exit(0);
   
   }
}