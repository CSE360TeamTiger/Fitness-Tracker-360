
public class UserController {
	UserControllerNode root;

	public UserController() {
		root = null;
	}

	boolean isEmpty() {
		if (root == null)
			return true;
		else
			return false;
	}

	protected UserControllerNode search(String email, String pWord) {
		UserControllerNode node = root;
		if (isEmpty()) {
			return null;
		} else {
			if (email.compareTo(node.patientData.getEmail()) == 0) {
				if (pWord.compareTo(node.patientData.getPassword()) == 0) {
					node.patientData.setAuthenticate(true);
					return node;
				} else
					return null;
			} else if (email.compareTo(node.patientData.getEmail()) < 0) {
				node = node.leftNode;
				return search(node.patientData.getEmail(),
						node.patientData.getPassword());
			} else {
				node = node.rightNode;
				return search(node.patientData.getEmail(),
						node.patientData.getPassword());
			}
		}
	}

	protected boolean insert(Patient patientData) {
		UserControllerNode newNode = new UserControllerNode(patientData);
		UserControllerNode node = root;
		boolean lChild = false;
		int stringCompare;

		while (newNode != null) {
			stringCompare = patientData.getEmail().compareTo(
					node.patientData.getEmail());
			if (patientData == node.patientData) {
				return false;
			} else if (patientData.getEmail() < node.patientData.getEmail()) {
				lChild = true;

			}
		}
		return false;
	}

	public void createPatient(Patient newPatient) {
		newPatient = new Patient();
	}
}

class UserControllerNode {
	public UserControllerNode leftNode, rightNode, parentNode;
	public Patient patientData;

	public UserControllerNode(Patient patientData) {
		this.patientData = patientData;
		this.leftNode = null;
		this.rightNode = null;
		this.parentNode = null;
	}

	public void display() {
		// Where patientData
	}
}