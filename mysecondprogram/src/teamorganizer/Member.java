/*Homework and Classwork Jun12(Mon)-Jun14(Wed)
 * Practice on object oriented programming concepts
 * Setter and Getter Methods etc. 
 * Jacob Zhi 2017
 * Team Sprocket
 * */
package teamorganizer;

//Member class
public class Member implements Spirited, HasWeight{
	//Variables
	private String name;
	private int gradeLevel;
	private String subteam;
	private boolean isReturningMember;
	private int weight;
	
	//SETTERS
	//Name Setter
	public void setName(String s){
		name = s;
	}
	//Grade Level Setter
	public void setGradeLevel(int i){
		gradeLevel = i;
	}
	//Subteam Setter
	public void setSubteam(String s){
		subteam = s;
	}
	//IsReturningMember Setter
	public void setIsReturningMember(boolean t){
		isReturningMember = t;
	}
	//Weight Setter
	public void setWeight(int i){
		weight = i;
	}
	
	//GETTERS
	//Name Getter
	public String getName(){
		return name;
	}
	//Grade Level Getter
	public int getGradeLevel(){
		return gradeLevel;
	}
	//Subteam Getter
	public String getSubteam(){
		return subteam;
	}
	//IsReturningMember Getter
	public boolean getIsReturningMember(){
		return isReturningMember;
	}
	//Weight getter
	public int getWeight(){
		return weight;
	}
	
	public void graduate(){
		gradeLevel++;
		isReturningMember = true;		
	}
	public boolean isComputerSlave(){
		if(subteam.equals("Programming") || subteam.equals("CAD")) {
			return true;
		}
		else{
			return false;
		}
	}
	public static char getFirstInitialOfName(String k){
		return k.charAt(0);
	}
	public String showTeamSpirit() {
		if(subteam.equals("Programming")){
			return "110110010001";
		}
		else{
			return "3473";
		}
	}
	//Constructor
	public Member(String dName, int dGradeLevel, String dSubteam, boolean dIsReturningMember){
		this.name = dName;
		this.gradeLevel = dGradeLevel;
		this.subteam = dSubteam;
		this.isReturningMember = dIsReturningMember;
	}

	
}