package Services;

import Entities.Departament;
import Entities.Employee;
import Repositories.EmployeeRepository;

import java.util.Date;
import java.util.List;

public class EmployeeService {

    EmployeeRepository employeeRepository = new EmployeeRepository();

    private List<Employee> getEmployeesByDepartament(Departament departament){
        return employeeRepository.getEmployeesByDepartament(departament);
    }

    private List<Employee> getEmployeesBySupervisior(Employee supervisior) {
        return employeeRepository.getEmployeesBySupervisior(supervisior);
    }

    private List<Employee> getEmployeesByNumberOfOrdersDeliveredInDate(Integer minOrdersDelivered, Integer maxOrdersDelivered, Date fromTime, Date toTime) {
        return employeeRepository.getEmployeesByNumberOfOrdersDeliveredInDate(minOrdersDelivered, maxOrdersDelivered, fromTime, toTime);
    }

}
