
package com.niit.dao;



import java.util.List;

import com.niit.model.Category;
import com.niit.model.Product;

public interface ProductDao {


	void saveProduct(Product product);
    public List<Product> getAllProducts();
   public Product getProductById(int id);
    void editProduct(Product product);
    void deleteProduct(Product product);	
    
	List<Category> getAllCategories();
	List <Product> getProductByCategory(int cid);
}
