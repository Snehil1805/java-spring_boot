package database_DAO;

public class mainPgm {
    public static void main (String[] args) {
        PatientDAO patientDAO = new PatientDAO();
        
        //create a new patient record
        Patient patient1 = new Patient();
        patient1.setPatientName("Jhon Doe");
        patient1.setMedicalHistory("High Sugar");
        PatientDAO.createPatient(patient1);

        //Retrive a patient's medical record
        try{
            Patient retrivedPatient = patientDAO.getPatientByID(patient1.getPatientID());
            System.out.println("Retrieve record " + retrivedPatient.getPatientName());
            System.out.println("Medical history " + retrivedPatient.getMedicalHistory());
        }catch(ResourceNotFound e){
            System.out.println(e.getMessage());
        }
        patientDAO.close();
        
    }
    
}
