package teamorganizer;

//Lead class, based on member
public class Lead extends Member {
	//New variable : title
	private String title;
	//Getter for title
	public String getTitle(){
		return title;
	}
	//Is computer slave? override
	public boolean isComputerSlave(){
		return true;
	}
	//Constructor using super
	public Lead(String dName, int dGradeLevel, String dSubteam, boolean dIsReturningMember) {
		super(dName, dGradeLevel, dSubteam, dIsReturningMember);
		//Gives person appropriate title
		this.title = dSubteam + " Lead";
	}
	
}