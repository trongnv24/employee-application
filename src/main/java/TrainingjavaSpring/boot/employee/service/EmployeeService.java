package TrainingjavaSpring.boot.employee.service;

import TrainingjavaSpring.boot.employee.dto.request.EmployeeRequest;
import TrainingjavaSpring.boot.employee.dto.response.EmployeeResponse;

public interface EmployeeService {
    EmployeeResponse create(EmployeeRequest request);
}