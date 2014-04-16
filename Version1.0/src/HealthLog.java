
public class HealthLog extends Log{
	private int caloriesBrunt;
	private double sysBloodPressure;
	private double diaBloodPressure;
	
	//construtor 
	public HealthLog(String date, String t, double d,
			int cals, double sbp, double dbp){
		super(date,t,d);
		this.caloriesBrunt = cals;
		this.diaBloodPressure = dbp;
		this.sysBloodPressure = sbp;
	}
	
	public int getCals(){return caloriesBrunt;}
	public double getSBP(){return sysBloodPressure; }
	public double getDBP(){return diaBloodPressure;}
}
