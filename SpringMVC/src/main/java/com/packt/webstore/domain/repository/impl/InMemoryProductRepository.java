package com.packt.webstore.domain.repository.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;

/**
 * @author life
 *
 */
@Repository
public class InMemoryProductRepository implements ProductRepository
{
	private List<Product> listOfProducts = new ArrayList<Product>();

	/**
	 * default items in product list 
	 */
	public InMemoryProductRepository() 
	{
	    Product iphone = new Product("P1234","iPhone 5s", new BigDecimal(500));
	    iphone.setDescription("Apple iPhone 5s smartphone with 4.00-inch 640x1136 display and 8-megapixel rear camera");
	    iphone.setCategory("Smart Phone");
	    iphone.setManufacturer("Apple");
	    iphone.setUnitsInStock(1000L);
	    
	    Product laptop_dell = new Product("P1235","Dell Inspiron", new BigDecimal(700));
	    laptop_dell.setDescription("Dell Inspiron 14-inch Laptop (Black) with 3rd Generation Intel Core processors");
	    laptop_dell.setCategory("Laptop");
	    laptop_dell.setManufacturer("Dell");
	    laptop_dell.setUnitsInStock(1000L);
	    
	    Product tablet_Nexus = new Product("P1236","Nexus 7", new BigDecimal(300));
	    tablet_Nexus.setDescription("Google Nexus 7 is the lightest 7 inch tablet With a quad-core Qualcomm Snapdragon™ S4 Pro processor");
	    tablet_Nexus.setCategory("Tablet");
	    tablet_Nexus.setManufacturer("Google");
	    tablet_Nexus.setUnitsInStock(1000L);
	    
	    this.listOfProducts.add(iphone);
	    this.listOfProducts.add(laptop_dell);
	    this.listOfProducts.add(tablet_Nexus);
	  }

	/* (non-Javadoc)
	 * @see com.packt.webstore.domain.repository.ProductRepository#getAllProducts()
	 */
	@Override
	public List<Product> getAllProducts()
	{
		return this.listOfProducts;
	}

	/* (non-Javadoc)
	 * @see com.packt.webstore.domain.repository.ProductRepository#getProductById(java.lang.String)
	 */
	@Override
	public Product getProductById(String argProductId)
	{
		Product productById = null;

		for (Product product : this.listOfProducts)
		{
			if (product != null && product.getProductId() != null && product.getProductId().equals(argProductId))
			{
				productById = product;
				break;
			}
		}
		
		if(productById == null)
		{
			throw new IllegalArgumentException("No products found with the product id: " + argProductId);
		}

		return productById;
	}

	/* (non-Javadoc)
	 * @see com.packt.webstore.domain.repository.ProductRepository#getProductsByCategory(java.lang.String)
	 */
	@Override
	public List<Product> getProductsByCategory(String argCategory)
	{
		List<Product> productsByCategory = new ArrayList<Product>();
		
		for (Product product : this.listOfProducts)
		{
			if(argCategory.equalsIgnoreCase(product.getCategory()))
			{
				productsByCategory.add(product);
			}
		}
		
		return productsByCategory;
	}

	/* (non-Javadoc)
	 * @see com.packt.webstore.domain.repository.ProductRepository#getProductsByFilter(java.util.Map)
	 */
	@Override
	public Set<Product> getProductsByFilter(Map<String, List<String>> argFilterParams)
	{
		Set<Product> productsByBrand = new HashSet<Product>();
		Set<Product> productsByCategory = new HashSet<Product>();

		Set<String> criterias = argFilterParams.keySet();

		if (criterias.contains("brand"))
		{
			for (String brandName : argFilterParams.get("brand"))
			{
				for (Product product : this.listOfProducts)
				{
					if (brandName.equalsIgnoreCase(product.getManufacturer()))
					{
						productsByBrand.add(product);
					}
				}
			}
		}

		if (criterias.contains("category"))
		{
			for (String category : argFilterParams.get("category"))
			{
				productsByCategory.addAll(this.getProductsByCategory(category));
			}
		}

		productsByCategory.retainAll(productsByBrand);

		return productsByCategory;
	}
}
