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
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public EmployeeResponse getById(@PathVariable ("id") String id){
        log.info(" === Start api getById employee === ");
        log.info(" === String id : {} === ", id);
        EmployeeResponse response = service.getById(id);
        log.info(" === Finish api getById employee, Employee Id : {} === ", response.getId());
        return response;
    }
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public EmployeeResponse update(@RequestBody EmployeeRequest request, @PathVariable ("id") String id){
        log.info(" === Start api update employee === ");
        log.info(" === Request Body : {}, String id : {} === ", request,id);
        EmployeeResponse response = service.update(request, id);
        log.info(" === Finish api update, Employee Id : {} === ", response.getId());
        return response;
    }
}
