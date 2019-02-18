package springdemo;

public class CricketCoach implements Coach {

	//private instance variables
	private FortuneService  fortuneService;
	private String emailAddress;
	private String team;
	
	//Constructor
	public CricketCoach() {}

	//Setters
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	//Getters
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Cricket Coach: " + fortuneService.getFortune();
	}

}
