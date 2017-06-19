package teamorganizer;

public class FTCGame extends Game{

	private FRCTeam red1;
	private FRCTeam red2;
	private FRCTeam blue1;
	private FRCTeam blue2;
	public FTCGame(int dBlueAllianceScore, int dRedAllianceScore, FRCTeam dRed1, FRCTeam dRed2, FRCTeam dBlue1, FRCTeam dBlue2) {
		super(dBlueAllianceScore, dRedAllianceScore);
		this.red1 = dRed1;
		this.red2 = dRed2;
		this.blue1 = dBlue1;
		this.blue2 = dBlue2;
	}
}
