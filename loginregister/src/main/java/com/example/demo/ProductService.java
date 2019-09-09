package com.example.demo;
	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional;
	import com.example.demo.Product;
	import com.example.demo.ProductRepository;
	@Service
	@Transactional
	public class ProductService {
	
		@Autowired
		private ProductRepository repo;
		
		public List<Product> listAll() {
			return repo.findAll();
		}
		
		public List<Object[]> listData(String time) {
			return repo.findByTag00(time);
		}
		
		public List<Object[]> listTime(String time) {
			return repo.findByTime(time);
		}
		
		public void save(Product product) {
			repo.save(product);
		}
		
		public Product get(long id) {
			return repo.findById(id).get();
		}
		
		public void delete(long id) {
			repo.deleteById(id);
		}
	
	}
