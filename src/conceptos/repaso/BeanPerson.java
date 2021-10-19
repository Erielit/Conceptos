package conceptos.repaso;

public class BeanPerson {

    private String name;
    private String surname;
    private String curp;

    public BeanPerson() {
    }

    public BeanPerson(String name, String surname, String curp) {
        this.name = name;
        this.surname = surname;
        this.curp = curp;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
