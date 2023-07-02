package penaltyGame;

public class AwayGoalkeeper{

	private String Awayteam;	// 원정팀 이름
	private String Goalkeeper;	// 골키퍼 이름
	
	public AwayGoalkeeper(String awayteam, String goalkeeper) {
		super();
		Awayteam = awayteam;
		Goalkeeper = goalkeeper;
	}
	public String getAwayteam() {
		return Awayteam;
	}
	public void setAwayteam(String awayteam) {
		Awayteam = awayteam;
	}
	public String getGoalkeeper() {
		return Goalkeeper;
	}
	public void setGoalkeeper(String goalkeeper) {
		Goalkeeper = goalkeeper;
	}
	@Override
	public String toString() {
		return   Awayteam + " [골키퍼 " + Goalkeeper + "]";
	}
	
}
