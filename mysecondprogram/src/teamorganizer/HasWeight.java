package teamorganizer;

public interface HasWeight {
	public int getWeight();
	public default boolean isHeavy(){
		int z = getWeight();
		
		if(z > 100) return true;
		
		else return false;
	}
}
