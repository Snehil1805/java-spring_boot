package database_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import DatabaseRecall.RecordNotFoundException;

public class PatientDAO {
    private static Connection connection;

    public PatientDAO(){
        try {
            connection = DatabaseConnection.getConnection();
            
        } catch (SQLException e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }

   

    //create a patient record
    public static void createPatient(Patient patient) {
        String sql = "Insert into patients (patientId,medicalHistory) values (?,?)";
        try(PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, patient.getPatientName());
            statement.setString(2, patient.getMedicalHistory());
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();
            if(rs.next()){
                patient.setPatientID(rs.getInt(1));
            }

        
            
        } catch (SQLException e) {
            e.printStackTrace();
            // TODO: handle exception
        }
        
    }
    public List<Patient> getAllPatients(){
        
        List<Patient> pList = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        try {
            rs = statement.executeQuery(null);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        while(((ResultSet) rs).next()){
            Patient patient = new Patient();
            patient.setPatientID(rs.getInt("patientId"));
            patient.setPatientName(rs.getString("patientName"));
            patient.setMedicalHistory(rs.getString("medicalHistory"));
            pList.add(patient);
                
        }
        return pList;
            
       

        
        
    }
    
    
    public Patient getPatientByID(int patientID) throws ResourceNotFound {
        String sql = "SELECT * FROM patients WHERE patientID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1, patientID);

            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                Patient patient = new Patient();
                patient.setPatientID(rs.getInt("patientID"));
                patient.setPatientName(rs.getString("patientName"));
                patient.setMedicalHistory(rs.getString("medicalHistory"));
                return patient;
                
            } else {
                throw ner ResourceNotFound(message)
                
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
            // TODO: handle exception
        }
        
       
            
    }
    public Patient updatePatient(Patient patient){
        String sql = "UPDATE patients SET patientName = ? , medicalHistory = ? WHERE patientID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)){
            
            statement.setString(1, patient.getPatientName());
            statement.setString(2, patient.getMedicalHistory());
            statement.setInt(3, patient.getPatientID());
            int rowUpdated = statement.executeUpdate();
            
            if(rowUpdated > 0){
                return patient;
            }

            
        } catch (SQLException e) {
            e.printStackTrace();
            // TODO: handle exception
        }
        return patient;
    
        
       
     
     
     
    }   
    public void deletePatient(int patientID){
        String sql = "Delete patients WHERE patientID = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, patientID);
            int rowDeleted = statement.executeUpdate();

            if(rowDeleted == 0){
                throw new RecordNotFoundException("message")
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            // TODO: handle exception
        }
           
     
        
       
    
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
