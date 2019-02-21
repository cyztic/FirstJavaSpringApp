package springdemo;

public class TrackCoach implements Coach {

	//define private field for the dependency
	private FortuneService fortuneService;
	
	//define constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Track: " + fortuneService.getFortune();
		
	}
	
	// add an init method
	public void doMyStartUpStuff() {
		System.out.println("start up");
	}
	
	// add a destroy method
	public void doMyCleanUpStuff() {
		System.out.println("cleanup");
	}
}
