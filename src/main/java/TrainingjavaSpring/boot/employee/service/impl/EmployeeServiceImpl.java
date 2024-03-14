package TrainingjavaSpring.boot.employee.service.impl;

import TrainingjavaSpring.boot.employee.dto.request.EmployeeRequest;
import TrainingjavaSpring.boot.employee.dto.response.EmployeeResponse;
import TrainingjavaSpring.boot.employee.entity.EmployeeEntity;
import TrainingjavaSpring.boot.employee.repository.EmployeeRepository;
import TrainingjavaSpring.boot.employee.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static TrainingjavaSpring.boot.employee.service.mapping.EmployeeServiceMapping.convertDtoToEntity;
import static TrainingjavaSpring.boot.employee.service.mapping.EmployeeServiceMapping.convertEntityToEmployeeResponse;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeResponse create(EmployeeRequest request) {
        log.info(" === Start api create new employee === ");
        log.info(" === Request Body : {} === ", request);
        EmployeeEntity entity = convertDtoToEntity(request);
        entity = employeeRepository.save(entity);
        EmployeeResponse response = convertEntityToEmployeeResponse(entity);
        log.info(" === Finish api create new employee, Employee Id : {} === ", response.getId());
        return response;
    }
}
