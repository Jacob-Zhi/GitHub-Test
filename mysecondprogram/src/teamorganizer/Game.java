package teamorganizer;

public abstract class Game {
	private int redAllianceScore;
	private int blueAllianceScore;
	
	public int getRedAllianceScore(){
		return redAllianceScore;
	}
	
	public int getBlueAllianceScore(){
		return blueAllianceScore;
	}
	public void setRedAllianceScore(int i){
		redAllianceScore = i;
	}
	public void setBlueAllianceScore(int i){
		blueAllianceScore = i;
	}

	
	public Game(int dBlueAllianceScore, int dRedAllianceScore){
		this.redAllianceScore = dRedAllianceScore;
		this.blueAllianceScore = dBlueAllianceScore;
	}
}
