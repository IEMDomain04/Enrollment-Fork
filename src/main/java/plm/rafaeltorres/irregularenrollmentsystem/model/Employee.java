package plm.rafaeltorres.irregularenrollmentsystem.model;

import java.sql.Blob;
import java.sql.Date;
import java.sql.ResultSet;

public class Employee extends User {
    private String employee_id;
    private String lastname;
    private String firstname;
    private String email;
    private String gender;
    private String cp_num;
    private String address;
    private Date bday;
    private long age;
    private Blob image;
    public Employee(ResultSet rs) {
        super(rs);
    }

    public String getAddress() {
        return address;
    }

    public String getLastName() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getEmail() {
        return email;
    }

    public String getEmployeeID() {
        return employee_id;
    }

    public Date getBirthday() {
        return bday;
    }

    public String getCellphoneNumber() {
        return cp_num;
    }

    public long getAge() {
        return age;
    }

    public Blob getImage() {
        return image;
    }
}

