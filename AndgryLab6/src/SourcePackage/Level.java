package SourcePackage;

public class Level extends LevelClassAbstract{

	public Level(int levelNumber,String nume,int Score){
		this.levelNumber=levelNumber;
		this.nume=nume;
		this.levelScore=Score;		
	}
	
	public void generateMap(String map){
		this.map=map;
	}

	
	
}
