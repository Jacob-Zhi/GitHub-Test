package teamorganizer;

import java.util.ArrayList;

//Team class (represent a FIRST robotics team)
public abstract class Team {
	//Variables
	private String name;
	private int teamNumber;
	private ArrayList<Member> members;
	private final int rookieYear;
	public static final int NUMBER_OF_FRC_TEAMS_IN_2017 = 3357;
	public static final String EXPANSION_OF_FIRST = "For Inspiration and Recognition of Science and Technology";
	//Name Setter
	public void setName(String s){
		name = s;
	}
	//Team # Setter
	public void setTeamNumber(int i) {
		teamNumber = i;
	}
	//Name Getter
	public String getName(){
		return name;
	}
	//Team # Getter
	public int getTeamNumber(){
		return teamNumber;
	}
	//Rookie Year Getter
	public int getRookieYear(){
		return rookieYear;
	}
	//Method that adds one team member to a team
	public void addMember(Member m) {
		members.add(m);
	}
	//Method that gets a subteam's members
	public ArrayList<Member> getAllSubteamMembers(String j) {
		ArrayList<Member> subteamMembers = new ArrayList<>();
		for(int i=0; i<members.size(); i++){
			if(members.get(i).getSubteam().equals(j)) {
				subteamMembers.add(members.get(i));
			}
		}
		return subteamMembers;
		
	}
	public abstract String get2017Game();
	
	//Constructor, also makes a new empty ArrayList for members
	public Team(String dName, int dTeamNumber, int dRookieYear) {
		this.name = dName;
		this.teamNumber = dTeamNumber;
		this.members = new ArrayList<>();
		this.rookieYear = dRookieYear;
	}

}