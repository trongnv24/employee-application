package TrainingjavaSpring.boot.employee.service;

import TrainingjavaSpring.boot.employee.dto.request.EmployeeRequest;
import TrainingjavaSpring.boot.employee.dto.response.EmployeeResponse;

public interface EmployeeService {
    EmployeeResponse create(EmployeeRequest request);
    EmployeeResponse getById(String id);
    EmployeeResponse update(EmployeeRequest request , String id);
}
