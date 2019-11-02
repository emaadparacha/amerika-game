   public class Gun
   {
		
		public Gun()
		{
		hit = 0;
		price = 0;
		name = "No gun";
		}
		
		public Gun(int ohit, int oprice, String oname)
		{
		hit = ohit;
		price = oprice;
		name = oname;
		}
   	
      public String getName()
      {
         return name;
      }
   	
      public int getPrice()
      {
         return price;
      }
   	
      public int getHit()
      {
         return hit;
      }
   	
   	
      private int hit;
      private int price;
      private String name;
   }