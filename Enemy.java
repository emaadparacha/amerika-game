public class Enemy
{
   
   public Enemy(int ohit, int ostrength, int oprize, String oname, String owin)
   {
      hit = ohit;
      strength = ostrength;
      prize = oprize;
      name = oname;
      win = owin;
   }
   
   public int getHit()
   {
      return hit;
   }
   
   public int getStrength()
   {
      return strength;
   }
   
   public int getPrize()
   {
      return prize;
   }
   
   public String getName()
   {
      return name;
   }
   
   public String getWin()
   {
      return win;
   }
   
   public void minusStrength(int truck)
   {
      strength-= truck;
   }
   
   public void hitPlayer(Player ip, Enemy ie)
   {
      ip.gotHit(ie.getHit());
      System.out.println(ie.getName() + " hit " + ip.getName() + " for damage: " + ie.getHit());
   		
      if(ip.getHealth() < 0)
      {
      	
         System.out.println("------------------------------------------------------------------------------------");
         System.out.println("------------------------------------------------------------------------------------");
         System.out.println("You lost :(");
         System.out.println("------------------------------------------------------------------------------------");
         System.out.println("------------------------------------------------------------------------------------");
         System.out.println(ie.getName() + " still had " + ie.getStrength() + " strength left");
         System.out.println("------------------------------------------------------------------------------------");
         System.out.println("------------------------------------------------------------------------------------");
         System.out.println("Credits:");
         System.out.println("Everything: The Communist Panda");
         System.out.println("------------------------------------------------------------------------------------");
         System.out.println("------------------------------------------------------------------------------------");
         System.out.println("Now terminating the program to erase all memory of this humiliating loss");
         System.exit(0);
      }
   }
		
   public void gotHit(int rre)
   {
      strength-= rre;
   }
   
   private int hit;
   private int strength;
   private int prize;
   private String name;
   private String win;
}