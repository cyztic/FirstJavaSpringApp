package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		GolfCoach golfCoach = context.getBean("myCoach", GolfCoach.class);
		CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods on the bean through constructor injection
		System.out.println("Track Team:");
		System.out.println(golfCoach.getDailyWorkout());
		System.out.println(golfCoach.getDailyFortune());
		
		//call methods on the bean through setter injection
		System.out.println("Cricket Team:");
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.print("Cricket Coach info: ");
		System.out.print(cricketCoach.getEmailAddress() + ", ");
		System.out.println(cricketCoach.getTeam());
		
		//close the context
		context.close();

	}

}
