package penaltyGame;

public class HomeGoalkeeper{

	private String Hometeam;	// 홈팀 이름
	private String Goalkeeper;	// 골키퍼 이름
	
	public HomeGoalkeeper(String hometeam, String goalkeeper) {
		super();
		Hometeam = hometeam;
		Goalkeeper = goalkeeper;
	}
	public String getHometeam() {
		return Hometeam;
	}
	public void setHometeam(String hometeam) {
		Hometeam = hometeam;
	}
	public String getGoalkeeper() {
		return Goalkeeper;
	}
	public void setGoalkeeper(String goalkeeper) {
		Goalkeeper = goalkeeper;
	}
	@Override
	public String toString() {
		return	Hometeam + " [골키퍼 " + Goalkeeper + "]";
	}
	
}
