   public class Player
   {
   
      public Player()
      {
         level = 0;
         health = 0;
         name = "";
         gun = gun;
         money = 0;
      }
   
      public Player(int olevel, int ohealth, String oname, Gun ogun, int omoney)
      {
         level = olevel;
         health = ohealth;
         name = oname;
         gun = ogun;
         money = omoney;
      }
   
      public int getLevel()
      {
         return level;
      }
   
      public int getHealth()
      {
         return health;
      }
   
      public String getName()
      {
         return name;
      }
   
      public String getGun()
      {
         return gun.getName();
      }
   	
      public int getMoney()
      {
         return money;
      }
   	
      public void changeHealth(int gfgd)
      {
         health = gfgd;
      }
   
      public void changeLevel(int ilevel)
      {
         level = ilevel;
      }
   
      public void addHealth(int ihealth)
      {
         health+= 20;
      }
   
      public void minusHealth(int phealth)
      {
         health-= 20;
      }
   
      public void changeGun(Gun igun)
      {
         gun = igun;
      }
   	
      public void addMoney(int imoney)
      {
         money+= imoney;
      }
   	
      public void minusMoney(int pmoney)
      {
         money-= pmoney;
      }
   	
      public void gotHit(int pol)
      {
         health-= pol;
      }
   	
      public void buyGun(String oaa, Player fd)
      {
         if (oaa.compareTo("1") == 0)
         {
            if (fd.getMoney() >=200)
            {
               System.out.println("You bought an ACR! Lets continue");
               fd.changeGun(acr);
               fd.minusMoney(200);
            }
            else
               System.out.println("You do not have enough money");
         }
         else if (oaa.compareTo("2") == 0)
         {
            if (fd.getMoney() >=300)
            {
               System.out.println("You bought an M4A1! Lets continue");
               fd.changeGun(m4a1);
               fd.minusMoney(300);
            }
            else
               System.out.println("You do not have enough money");
         }
         else if (oaa.compareTo("3") == 0)
         {
            if (fd.getMoney() >=400)
            {
               System.out.println("You bought an AK-47! Lets continue");
               fd.changeGun(ak);
               fd.minusMoney(400);
            }
            else
               System.out.println("You do not have enough money");
         }
         else if (oaa.compareTo("4") == 0)
         {
            if (fd.getMoney() >=500)
            {
               System.out.println("You bought an RPG! Lets continue");
               fd.changeGun(rpg);
               fd.minusMoney(500);
            }
            else
               System.out.println("You do not have enough money");
         }
         else if (oaa.compareTo("5") == 0)
         {
            if (fd.getMoney() >=1000)
            {
               System.out.println("You bought a nuke! Lets continue");
               fd.changeGun(nuke);
               fd.minusMoney(1000);
            }
            else 
               System.out.println("You do not have enough money");
         }  
         else if (oaa.compareTo("1") != 0 && oaa.compareTo("2") != 0 && oaa.compareTo("3") != 0 && oaa.compareTo("4") != 0 && oaa.compareTo("5") != 0)
         {  
            System.out.println("Okay then, lets move on!");
         }
      }
   	
      public void hitEnemy(Enemy ww, Player wq)
      {
         ww.gotHit(gun.getHit());
         System.out.println(wq.getName() + " hit " + ww.getName() + " for damage: " + gun.getHit());
      	
         if (ww.getStrength() < 0)
         {
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("------------------------------------------------------------------------------------");
            System.out.println(ww.getWin());
            
         }
      }
   
      public void refillHealth(Player qq)
      {
         if (qq.getLevel() == 1)
         {
            qq.changeHealth(100);
         } 
         if (qq.getLevel() == 2)
         {
            qq.changeHealth(114);
         } 
         if (qq.getLevel() == 3)
         {
            qq.changeHealth(128);
         } 
         if (qq.getLevel() == 4)
         {
            qq.changeHealth(142);
         } 
         if (qq.getLevel() == 5)
         {
            qq.changeHealth(156);
         } 
         if (qq.getLevel() == 6)
         {
            qq.changeHealth(170);
         } 
         if (qq.getLevel() == 7)
         {
            qq.changeHealth(184);
         } 
         if (qq.getLevel() == 8)
         {
            qq.changeHealth(198);
         } 
         if (qq.getLevel() == 9)
         {
            qq.changeHealth(212);
         } 
         if (qq.getLevel() == 10)
         {
            qq.changeHealth(226);
         } 
         if (qq.getLevel() == 11)
         {
            qq.changeHealth(240);
         } 
         if (qq.getLevel() == 12)
         {
            qq.changeHealth(254);
         } 
         if (qq.getLevel() == 13)
         {
            qq.changeHealth(268);
         } 
         if (qq.getLevel() == 14)
         {
            qq.changeHealth(282);
         } 
         if (qq.getLevel() == 15)
         {
            qq.changeHealth(296);
         } 
         if (qq.getLevel() == 16)
         {
            qq.changeHealth(310);
         } 
         if (qq.getLevel() == 17)
         {
            qq.changeHealth(324);
         } 
         if (qq.getLevel() == 18)
         {
            qq.changeHealth(338);
         } 
         if (qq.getLevel() == 19)
         {
            qq.changeHealth(352);
         } 
         if (qq.getLevel() == 20)
         {
            qq.changeHealth(366);
         } 
         if (qq.getLevel() == 21)
         {
            qq.changeHealth(400);
         } 
         if (qq.getLevel() == 22)
         {
            qq.changeHealth(420);
         } 
         if (qq.getLevel() == 23)
         {
            qq.changeHealth(430);
         } 
         if (qq.getLevel() == 24)
         {
            qq.changeHealth(450);
         } 
         if (qq.getLevel() == 25)
         {
            qq.changeHealth(470);
         } 
      }
   
      Gun pistol = new Gun(10, 100, "Pistol");
      Gun acr = new Gun(25, 200, "ACR");
      Gun m4a1 = new Gun(35, 300, "M4A1");
      Gun ak = new Gun(45, 400, "AK-47");
      Gun rpg = new Gun(55, 500, "RPG");
      Gun nuke = new Gun(100, 1000, "Nuclear Bomb");
      private int level;
      private int health;
      private String name;
      private Gun gun = new Gun(); 
      private int money;
   
   }