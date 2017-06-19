package teamorganizer;

import java.util.ArrayList;

public class Tester {

	//Just a little tester
	public static void main(String[] args){
		
		//6 peoples
		Member jacob = new Member("Jacob", 9, "Programming", true);
		Lead nathan = new Lead("Nathan", 12, "Programming", true); 
		Lead qinhong = new Lead("Qinhong", 12, "Programming", true);
		Member bob = new Member("Bob", 11, "CAD", false);
		Member billy = new Member("Billy", 10, "PR", false);
		Member sally = new Member("Sally", 11, "PR", true);
		
		//Graduate billy
		billy.graduate();
		
		//Little bit about them
		System.out.println(jacob.getSubteam());
		System.out.println(nathan.getTitle());
		System.out.println(qinhong.isComputerSlave());
		System.out.println(bob.getIsReturningMember());
		System.out.println(billy.getGradeLevel());
		System.out.println(billy.getIsReturningMember());
		
		//Form a team
		FRCRobot coolRobot = new FRCRobot("Team Sprocket Robot", 110);
		Team sprocket = new FRCTeam("Team Sprocket", 3473, 2011, coolRobot);
		sprocket.addMember(jacob);
		sprocket.addMember(nathan);
		sprocket.addMember(qinhong);
		sprocket.addMember(bob);
		sprocket.addMember(billy);
		sprocket.addMember(sally);
		
		//About this team:
		System.out.println(sprocket.getName());
		System.out.println(sprocket.getTeamNumber());
		System.out.println(sprocket.getRookieYear());
		
		ArrayList<Member> teamroster1 = new ArrayList<>();
		//Who's doing programming?
		teamroster1 = sprocket.getAllSubteamMembers("Programming");
		for(int i=0; i < teamroster1.size(); i++){
			System.out.println(teamroster1.get(i).getName());
		}
		
		ArrayList<Member> teamroster2 = new ArrayList<>();
		//Who's doing PR?
		teamroster2 = sprocket.getAllSubteamMembers("PR");
		for(int i=0; i < teamroster2.size(); i++){
			System.out.println(teamroster2.get(i).getName());
		}
		
		//Initial test
		System.out.println(Member.getFirstInitialOfName("Qwerty"));
		
		//Constants test
		System.out.println(Team.NUMBER_OF_FRC_TEAMS_IN_2017);
		System.out.println(Team.EXPANSION_OF_FIRST);
	}
}