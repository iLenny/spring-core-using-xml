package leibniz.springlearning.springcorexml;

public class TennisCoach implements Coach {

	private Fortune dailyFortune;
	
	public TennisCoach() {
		
	}
	public TennisCoach(Fortune dailyFortune) {
		this.dailyFortune = dailyFortune;
	}
	
	public void setDailyFortune(Fortune dailyFortune) {
		this.dailyFortune = dailyFortune;
	}

	public String getDailyWorkout() {
		return "Do 100 Backhand volley";
	}

	public String getDailyFortune() {
		return dailyFortune.getFortune();
	}

}
