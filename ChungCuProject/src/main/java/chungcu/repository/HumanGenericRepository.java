package chungcu.repository;

import java.util.List;

public interface HumanGenericRepository<E> {
	// 1. Thêm khách/Nhân viên
	void add(E e);

	// 2. Đuổi
	void delete(E e);

	// 3. Sửa
	void update(E e);

	// 4. Display
	List<E> getAll();
}
