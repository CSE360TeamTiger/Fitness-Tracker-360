
public class Patient extends User {
	private int age;
	private String birthDate;
	private double weight;
	private double height;
	private int bmi;
	private Address pAddress;
	
	public Patient (String email, String fName, String lName, String password,
			int a, String bD, double w, double h, int bmi, Address p){
		super(email,fName,lName,password);
		this.age = a;
		this.birthDate = bD;
		this.weight = w;
		this.height = h;
		this.bmi = bmi;
		this.pAddress = p;
	}
	
	public Patient (){
		this.age = 0;
		this.birthDate = "";
		this.weight = 0;
		this.height = 0;
		this.bmi = 0;
		this.pAddress = null;		
	}
	
	public int getAge(){return age;}
	public String getBirthday(){return birthDate;}
	public double getWeight(){return weight;}
	public double getHeight(){return height;}
	public int getBMI(){return bmi;}
	public Address getAddress(){return pAddress;}
	
	public void setAge(int a){this.age = a;}
	public void setBirthDate(String bD){this.birthDate = bD;}
	public void setWeight(double w){ this.weight = w;}
	public void setHeight(double h){ this.height = h;}
	public void setBMI(int bmi){this.bmi = bmi;}
	public void setAddress(String street, String city, String state, String zipCode){
		this.pAddress.street = street;
		this.pAddress.city = city;
		this.pAddress.state = state;
		this.pAddress.zipCode = zipCode;
	}

}
