package chungcu.repository.impl;

import java.util.List;

import chungcu.entities.Citizen;
import chungcu.repository.HumanGenericRepository;
import chungcu.repository.LstAbsBaseRepo;

public class CitizenRepoImpl extends LstAbsBaseRepo<Citizen> implements HumanGenericRepository<Citizen> {

	public void add(Citizen e) {
		this.lstData.add(e);
	}

	public void delete(Citizen e) {
		this.lstData.remove(e);
	}

	public void update(Citizen e) {
		if (this.lstData.contains(e)) {
			int index = this.lstData.indexOf(e);
			this.lstData.set(index, e);
		}

	}

	public List<Citizen> getAll() {
		return this.lstData;
	}

}
