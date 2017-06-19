package teamorganizer;

public class FRCGame extends Game{
	private FRCTeam red1;
	private FRCTeam red2;
	private FRCTeam red3;
	private FRCTeam blue1;
	private FRCTeam blue2;
	private FRCTeam blue3;
	
	public FRCTeam getRed1(){
		return red1;
	}
	public FRCTeam getRed2(){
		return red2;
	}
	public FRCTeam getRed3(){
		return red3;
	}
	public FRCTeam getBlue1(){
		return blue1;
	}
	public FRCTeam getBlue2(){
		return blue2;
	}
	public FRCTeam getBlue3(){
		return blue3;
	}
	public void setRed1(FRCTeam ft){
		red1 = ft;
	}
	public void setRed2(FRCTeam ft){
		red2 = ft;
	}
	public void setRed3(FRCTeam ft){
		red3 = ft;
	}
	public void setBlue1(FRCTeam ft){
		blue1 = ft;
	}
	public void setBlue2(FRCTeam ft){
		blue2 = ft;
	}
	public void setBlue3(FRCTeam ft){
		blue3 = ft;
	}
	public boolean isBlueAlliance(FRCTeam tf){
		if (tf == blue1 || tf == blue2 || tf == blue3){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isRedAlliance(FRCTeam tf){
		if (tf == red1 || tf == red2 || tf == red3){
			return true;
		}
		else{
			return false;
		}
	}
	public int getAllianceScore(FRCTeam ft){
		if(isBlueAlliance(ft)){
			int a = getBlueAllianceScore();
			return a;
		}
		if(isRedAlliance(ft)){
			int b = getRedAllianceScore();
			return b;
		}
		else{
			return -1;
		}
	}

	public FRCGame(FRCTeam dRed1, FRCTeam dRed2, FRCTeam dRed3, FRCTeam dBlue1, FRCTeam dBlue2, FRCTeam dBlue3, int dBlueAllianceScore, int dRedAllianceScore){
		super(dBlueAllianceScore, dRedAllianceScore);
		this.red1 = dRed1;
		this.red2 = dRed2;
		this.red3 = dRed3;
		this.blue1 = dBlue1;
		this.blue2 = dBlue2;
		this.blue3 = dBlue3;
		
	}
}
