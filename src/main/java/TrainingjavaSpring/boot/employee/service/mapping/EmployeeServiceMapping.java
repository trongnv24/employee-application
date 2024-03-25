package TrainingjavaSpring.boot.employee.service.mapping;

import TrainingjavaSpring.boot.employee.dto.request.EmployeeRequest;
import TrainingjavaSpring.boot.employee.dto.response.EmployeeResponse;
import TrainingjavaSpring.boot.employee.entity.EmployeeEntity;

public class EmployeeServiceMapping {
    public static EmployeeEntity convertDtoToEntity(EmployeeRequest dto){
        EmployeeEntity entity = new EmployeeEntity();
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setDepartmentId(dto.getDepartmentId());
        return entity;
    }
    public static EmployeeResponse convertEntityToEmployeeResponse(EmployeeEntity entity){
        EmployeeResponse dto = new EmployeeResponse();
        dto.setId(entity.getId());
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setDepartmentId(entity.getDepartmentId());
        return dto;
    }
}
