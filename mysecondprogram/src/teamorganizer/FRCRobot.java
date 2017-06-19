package teamorganizer;

public class FRCRobot implements HasWeight{
	private String name;
	private int weight;
	public static final int MAX_WEIGHT = 120;
	
	public void setName(String s) {
		name = s;
	}
	
	public void setWeight(int i) {
		weight = i;
	}
	
	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public FRCRobot(String dName, int dWeight){
		this.name = dName;
		this.weight = dWeight;
	}
	
	
}
