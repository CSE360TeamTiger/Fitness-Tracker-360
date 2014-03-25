
public class Patient extends User {
	private double weight;
	private double height;
	private Address pAddress;
	
	public Patient (double w, double h, Address p){
		this.weight = w;
		this.height = h;
		this.pAddress = p;
	}
	
	public Patient (){
		this.weight = 0;
		this.height = 0;		
	}
	
	public double getWeight(){return weight;}
	public double getHeight(){return height;}
	public Address getAddress(){return pAddress;}
	
	public void setWeight(double w){ this.weight = w;}
	public void setHeight(double h){ this.height = h;}

}
