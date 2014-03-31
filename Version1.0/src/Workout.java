
public class Workout {
	private String name;
	private Workout next;
	
	public Workout(String name){
		this.name = name;
		this.next = null;
	}
	
	public String getName(){return name;}
	public Workout getNext(){return next;}
	
	public boolean setNext(Workout node){
		if (next != null){
			next.next = node;
			return true;
		}else{
			next = node;
		}
		return false;
	}
}
