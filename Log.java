public class Log {
	protected String date;
	protected String time;
	protected Log parent, leftChild, rightChild;
	protected double duration;

	public Log(String date, String t, double d) {
		this.date = date;
		this.time = t;
		this.duration = d;
		this.parent = null;
		this.leftChild = null;
		this.rightChild = null;
	}

	public Log() {
		this.date = "";
		this.time = "";
		this.duration = 0;
		this.parent = null;
		this.leftChild = null;
		this.rightChild = null;
	}

	public Log(String date2, String time2, double duration2, Log parent2,
			Log leftChild2, Log rightChild2) {
		this.date = "";
		this.time = "";
		this.duration = 0;
		this.parent = parent2;
		this.leftChild = leftChild2;
		this.rightChild = rightChild2;
	}

	public String getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}

	public Log getParent() {
		return parent;
	}

	public Log getLeftChild() {
		return leftChild;
	}

	public Log getRightChild() {
		return rightChild;
	}

	public double getDuration() {
		return duration;
	}
}
