package conceptos.repaso;

public class BeanEmployee extends BeanPerson {

    private String charge;
    private String employeeKey;
    private String email;

    public BeanEmployee() {
    }

    public BeanEmployee(String charge, String employeeKey, String email) {
        this.charge = charge;
        this.employeeKey = employeeKey;
        this.email = email;
    }

    public BeanEmployee(String charge, String employeeKey, String email, String name, String surname, String curp) {
        super(name, surname, curp);
        this.charge = charge;
        this.employeeKey = employeeKey;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getEmployeeKey() {
        return employeeKey;
    }

    public void setEmployeeKey(String employeeKey) {
        this.employeeKey = employeeKey;
    }

}
