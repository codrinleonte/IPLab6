package testingAngryBirds;

import org.junit.Test;

public class TestLevel {
  @Test
  public TestLevel(){
  Level l = new Level(3,"Level 3",155); //levelNumber,nume levelScore
  int levelNumber=3;
  String nume = "Level 3";
  int levelScore = 155;
  
  assertEquals(levelNumber,l.levelNumber);
  assertEquals(nume,l.nume);
  assertEquals(levelScore,l.levelScore);
  }
  @Test
  public void testGenerateMap(){
	  assertEquals(l.generateMap("geani"),"geani");
  }
  
}
