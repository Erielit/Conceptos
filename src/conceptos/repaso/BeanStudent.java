package conceptos.repaso;

public class BeanStudent extends BeanPerson {
    private String studentKey;
    private String email;

    public BeanStudent() {
    }

    public BeanStudent(String studentKey, String email) {
        this.studentKey = studentKey;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudentKey() {
        return studentKey;
    }

    public void setStudentKey(String studentKey) {
        this.studentKey = studentKey;
    }
    
    
}
