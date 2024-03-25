package TrainingjavaSpring.boot.employee.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private int DepartmentId;
    @PrePersist
    public void init() {
        this.id = Objects.isNull(this.id) ? UUID.randomUUID().toString() : this.id;
    }

    public EmployeeEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(int departmentId) {
        DepartmentId = departmentId;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", DepartmentId=" + DepartmentId +
                ", departmentId=" + getDepartmentId() +
                '}';
    }
}
