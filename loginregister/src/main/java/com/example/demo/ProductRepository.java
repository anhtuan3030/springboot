package com.example.demo;
	import java.util.List;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.data.jpa.repository.Query;
	import org.springframework.stereotype.Repository;
	import com.example.demo.Product;
	@Repository
	public interface ProductRepository extends JpaRepository<Product, Long> {
		@Query(value="SELECT tag00 FROM Product WHERE time LIKE ?1%",nativeQuery =true)
		public List<Object[]> findByTag00(String time);	
		@Query(value="SELECT time  FROM Product WHERE time LIKE ?1%",nativeQuery =true)
		public List<Object[]> findByTime(String time);
	}	