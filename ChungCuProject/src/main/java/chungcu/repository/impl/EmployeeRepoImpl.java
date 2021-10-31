package chungcu.repository.impl;

import java.util.List;

import chungcu.entities.Employee;
import chungcu.repository.HumanGenericRepository;
import chungcu.repository.LstAbsBaseRepo;

public class EmployeeRepoImpl extends LstAbsBaseRepo<Employee> implements HumanGenericRepository<Employee> {

	public void add(Employee e) {
		this.lstData.add(e);
	}

	public void delete(Employee e) {
		this.lstData.remove(e);
	}

	public void update(Employee e) {
		if (this.lstData.contains(e)) {
			int index = this.lstData.indexOf(e);
			this.lstData.set(index, e);
		}
	}

	public List<Employee> getAll() {
		return this.lstData;
	}

}
