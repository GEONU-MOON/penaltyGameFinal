package penaltyGame;

public class HomeKicker {
	
	private String Hometeam;	// 홈팀 이름
	private String order;	// 순번
	private String name;	// 키커 이름 
	
	public HomeKicker(String hometeam, String order, String name) {
		super();
		Hometeam = hometeam;
		this.order = order;
		this.name = name;
	}
	public String getHometeam() {
		return Hometeam;
	}
	public void setHometeam(String hometeam) {
		Hometeam = hometeam;
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
		return Hometeam + "["+order+ " " + name + "]";
	}
	
}
