package chungcu.managerment;

import java.util.List;

import chungcu.repository.HumanGenericRepository;

public class HumanManage<E> {
	private HumanGenericRepository<E> lstHumans;

	public HumanManage(HumanGenericRepository<E> e) {
		this.lstHumans = e;
	}

	// 1. Thêm người
	public void add(E e) {
		this.lstHumans.add(e);
	}

	// 2. Cập nhật người
	// 3. Xóa người
	// 4. Lấy thông tin All
	public List<E> getAll() {
		return this.lstHumans.getAll();
	}
}
