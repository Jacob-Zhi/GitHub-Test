package teamorganizer;

public interface Spirited {
	public String showTeamSpirit();
	
	public default void chant(int n) {
		for(int i=0; i<n; i++){
			System.out.println(showTeamSpirit());
		}
		
	}
}
