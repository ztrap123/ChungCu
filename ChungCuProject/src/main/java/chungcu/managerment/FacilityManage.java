package chungcu.managerment;

import chungcu.repository.FacilityGenericRepository;

public class FacilityManage<E> {
	private FacilityGenericRepository<E> lstFacis;

	public FacilityManage(FacilityGenericRepository<E> e) {
		this.lstFacis = e;
	}
	// 1. Thêm
	// 2. Sửa
	// 3. Xóa
	// 4. Lấy thông tin
}
