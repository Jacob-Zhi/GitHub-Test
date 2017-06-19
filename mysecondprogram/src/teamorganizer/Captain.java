package teamorganizer;

//Captain class, based on member
public class Captain extends Member {
	//New variable : title
	private String title;
	//Getter for title
	public String getTitle(){
		return title;
	}
	//Is computer slave? override
	public boolean isComputerSlave(){
			return false;
		}
	//Constructor using "super"
	public Captain(String dName, int dGradeLevel, String dSubteam, boolean dIsReturningMember) {
		super(dName, dGradeLevel, dSubteam, dIsReturningMember);
		//Gives person appropriate title
		if (dSubteam.equals("Operations") || dSubteam.equals("PR") || dSubteam.equals("Design")){
			this.title = "Business Captain";
		}
		else if (dSubteam.equals("Mechanical") || dSubteam.equals("Electrical") || dSubteam.equals("CAD") || dSubteam.equals("Programming")){
			this.title = "Engineering Captain";
		}
	}

}