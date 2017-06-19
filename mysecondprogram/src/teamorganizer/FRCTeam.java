package teamorganizer;

import java.util.ArrayList;

public class FRCTeam extends Team{
	private final FRCRobot robot;
	private ArrayList<FRCGame> games;
	public FRCRobot getRobot(){
		return robot;
	}
	public String get2017Game(){
		return"FIRST Stronghold";
	}
	public ArrayList<FRCGame> getGames(){
		return games;
	}
	public void setGames(ArrayList<FRCGame> fga){
		games = fga;
	}
	public int getAverageScore(){
		double average = 0;
		for(int i=0; i<games.size(); i++){
			average = average + games.get(i).getAllianceScore(this);
		}
		average = average / games.size();
		int integeraverage = (int) Math.round(average);
		return integeraverage;
	}
	public FRCTeam(String dName, int dTeamNumber, int dRookieYear, FRCRobot dRobot) {
		super(dName, dTeamNumber, dRookieYear);
		this.robot = dRobot;
		
	}

}
