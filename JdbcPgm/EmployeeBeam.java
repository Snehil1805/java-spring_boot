package JdbcPgm;
public class EmployeeBeam{
    private String name;
    private String department;
    private double salary;
    private String emailId;
    private long phonenum;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public long getPhonenum() {
        return phonenum;
    }
    public void setPhonenum(long phonenum) {
        this.phonenum = phonenum;
    }
}