package DatabaseRecall;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientDAO {
    public static Connection connection;

    public PatientDAO() {
        try {
            connection = DatabaseConnection.getconnection();
            
        } catch (Exception e) {
            e.getStackTrace();
            // TODO: handle exception
        }
    }

    public void createPatient(Patient patient) {
        String sql = "INSERT INTO patients (patientName,MedicalHistory) VALUES (?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS );
            statement.setString(1, patient.getPatientName());
            statement.setString(2, patient.getMedicalHistory());
            statement.executeUpdate();

            ResultSet generatedKeys = statement.getGeneratedKeys();
            if(generatedKeys.next()){
                patient.setPatientID(generatedKeys.getInt(1));
            }
             
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }

    }
    public static Patient getPatientByID(int patientID) throws RecordNotFoundException{
        String sql = "SELECT * FROM patients WHERE patientID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1,patientID);
            ResultSet resultSet = statement.executeQuery();

            if(resultSet.next()){
                Patient patient = new Patient();
                patient.setPatientID(resultSet.getInt("patientID"));
                patient.setPatientName(resultSet.getString("patientName"));
                patient.setMedicalHistory(resultSet.getString("medicalHistory"));
                return patient;

            }else{
                throw new RecordNotFoundException("Patient with ID" + patientID);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            //return null;
            // TODO: handle exception
        }
        return null; 
        
    }
    public void close(){
        try{
            if (connection != null){
                connection.close();

            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

 

}

    

