package employee.demo;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee,Long>{
}

