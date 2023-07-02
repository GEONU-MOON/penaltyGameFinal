package penaltyGame;

public class AwayKicker {
	
	private String Awayteam;	// 원정팀 이름
	private String order;	// 순번
	private String name;	// 키커 이름 
	
	public AwayKicker(String awayteam, String order, String name) {
		super();
		Awayteam = awayteam;
		this.order = order;
		this.name = name;
	}
	public String getAwayteam() {
		return Awayteam;
	}
	public void setAwayteam(String awayteam) {
		Awayteam = awayteam;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override	
	public String toString() {
		return Awayteam + "["+order+ " " + name + "]";
	}
	
}
