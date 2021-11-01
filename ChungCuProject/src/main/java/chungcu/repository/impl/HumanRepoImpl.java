package chungcu.repository.impl;

import java.util.List;

import chungcu.repository.HumanGenericRepository;
import chungcu.repository.LstAbsBaseRepo;

public class HumanRepoImpl<E> extends LstAbsBaseRepo<E> implements HumanGenericRepository<E> {

	public void add(E e) {
		this.lstData.add(e);

	}

	public void delete(E e) {
		this.lstData.remove(e);

	}

	public void update(E e) {
		if (this.lstData.contains(e)) {
			int index = this.lstData.indexOf(e);
			this.lstData.set(index, e);
		}

	}

	public List<E> getAll() {
		return this.lstData;
	}

}
