package in.bushansirgur.springbootcrud.springbootcrudapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.bushansirgur.springbootcrud.springbootcrudapi.model.Employee;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer>{
	
	
}
