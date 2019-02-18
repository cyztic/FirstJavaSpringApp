package springdemo;

public class SoccerCoach implements Coach{

	//define private field for the dependency
	private FortuneService fortuneService;
	
	//define constructor for dependency injection
	public SoccerCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "take 100 pks";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
