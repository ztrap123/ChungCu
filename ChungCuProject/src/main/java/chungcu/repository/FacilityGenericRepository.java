package chungcu.repository;

import java.util.List;

public interface FacilityGenericRepository<E> {

	// 1. Sửa đồ
	void update(E e);

	// 2. Kiểm tra đồ
	E getStatus();

	// 3. Display
	List<E> getAll();
}
