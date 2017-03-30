package SourcePackage;

public abstract class LevelClassAbstract implements LevelInterface{

	int levelNumber;
	String nume;
	int levelScore;
	String map;
	
	public int getLevel(){
		return levelNumber;
	}
	public String getLevelName(){
		return nume;
	}
	
	
}
