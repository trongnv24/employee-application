package TrainingjavaSpring.boot.employee.dto.response;

import TrainingjavaSpring.boot.employee.dto.request.EmployeeRequest;

public class EmployeeResponse extends EmployeeRequest {
    private String id;

    public EmployeeResponse() {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "EmployeeResponse{" +
                "id='" + id + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", departmentId=" + getDepartmentId() +
                '}';
    }
}

