public class Doctor extends User {

	// Patient Node class defined within doctor.
	// Used to build a dynamic list of patients.
	public class PatientNode {
		public Patient patient;
		public Patient next;

		public Patient getNext() {
			return this.next;
		}
	}

	/************* End Class PatientNode ***************/

	private PatientNode patients;

	public Doctor() {
		this.patients = null; // This will have to read from the database when
								// the program loads?
	}

	public Patient getPatients() {
		return this.patients;
	}

	public Patient getPatientInfo(string email) {
		// This will need to look at the database and return the info of the
		// patient with the email searched.
	}

	public boolean addPatient(string email) {
		// 1. Check DB for a user with the email.
		// 2. If the user exists, add the patient to the doctors patient list.
		// 3. return true.
		// 4. Else return false.

	}

	public boolean removePatient(string email) {
		// 1. Check patient list for a user with the email entered.
		// 2. Remove the user from the list if it exists.
		// 3. Return true.
		// 4. otherwise return false.
	}

}
