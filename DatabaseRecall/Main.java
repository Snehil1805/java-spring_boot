package DatabaseRecall;

public class Main {
    public static void main(String[] args) {
        PatientDAO patientDAO = new PatientDAO();

        // Create a new patient record
        Patient patient1 = new Patient();
        patient1.setPatientName("John Doe");
        patient1.setMedicalHistory("High Sugar");
        patientDAO.createPatient(patient1);

        try {
            Patient retrivedPatient = PatientDAO.getPatientByID(patient1.getPatientID());
            System.out.println("Retrived Patient " + retrivedPatient.getPatientName());
            System.out.println("Medical History " + retrivedPatient.getMedicalHistory());

            
        } catch (RecordNotFoundException e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }
        patientDAO.close();

    }    
}
