package testingAngryBirds;

import org.junit.Test;


public class PasareRosieTest {
	@Test
	public void testPasareRosie(){
	PasareRosie p = new PasareRosie("red",12,3,4);
	String culoare = "red";
	int arie = 12;
	int locatieX=3;
	int locatieY=4;
	assertEquals(culoare,p.culoare);
	assertEquals(locatieX,p.locatieX);
	assertEquals(locatieY,p.locatieY);
	}
	
	
}
