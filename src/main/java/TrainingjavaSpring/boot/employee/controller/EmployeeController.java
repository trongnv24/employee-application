package TrainingjavaSpring.boot.employee.controller;

import TrainingjavaSpring.boot.employee.dto.request.EmployeeRequest;
import TrainingjavaSpring.boot.employee.dto.response.EmployeeResponse;
import TrainingjavaSpring.boot.employee.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/employees")
@Slf4j
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EmployeeResponse create(@RequestBody EmployeeRequest request){
        log.info(" === Start api create new employee === ");
        log.info(" === Request Body : {} === ", request);
        EmployeeResponse response = service.create(request);
        log.info(" === Finish api create new employee, Employee Id {} : ===", response.getId());
        return response;
    }
}
