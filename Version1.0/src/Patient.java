
public class Patient extends User {
	private double weight;
	private double height;
	private Address pAddress;
	
	public Patient (String email, String fName, String lName, String password,
			double w, double h, Address p){
		super(email,fName,lName,password);
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

	public void setAddress(String street, String city, String state, String zipCode){
		this.pAddress.street = street;
		this.pAddress.city = city;
		this.pAddress.state = state;
		this.pAddress.zipCode = zipCode;
	}

}
