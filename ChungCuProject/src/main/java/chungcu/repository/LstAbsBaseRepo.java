package chungcu.repository;

import java.util.ArrayList;
import java.util.List;

public abstract class LstAbsBaseRepo<E> {
	protected List<E> lstData;

	public LstAbsBaseRepo() {
		this.lstData = new ArrayList<E>();
	}

	public LstAbsBaseRepo(List<E> lstData) {
		this.lstData = lstData;
	}

	public List<E> getLstData() {
		return lstData;
	}

	public void setLstData(List<E> lstData) {
		this.lstData = lstData;
	}

}
