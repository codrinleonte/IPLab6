package testingAngryBirds;

public class testInamic {
	@Test
   public void testInamic(){
	   InamicPurcel p = new InamicPurcel(100,4,5,true)  //hp 
	   int Hp = 100;
	   int locationX = 4;
	   int locationY = 5;
	   boolean hit = true;
	   
	   assertEquals(Hp,p.Hp);
	   assertEquals(locationX,p.locationX);
	   assertEquals(locationY,p.locationY);
	   assertEquals(hit,p.hit);
   }
}
