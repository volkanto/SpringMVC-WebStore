package com.packt.webstore.domain;

import java.math.BigDecimal;

/**
 * @author life
 *
 */
public class Product
{
	private String productId 		= null;
	private String name 			= null;
	private BigDecimal unitPrice 	= null;
	private String description		= null;
	private String manufacturer	 	= null;
	private String category			= null;
	private Long unitsInStock		= null;
	private Long unitsInOrder		= null;
	private Boolean discontinued	= Boolean.FALSE;
	private String condition		= null;
	
	public Product()
	{
		super();
	}

	public Product(String argProductId, String arName, BigDecimal arUnitPrice)
	{
		this.productId = argProductId;
		this.name = arName;
		this.unitPrice = arUnitPrice;
	}
	
	public String getProductId()
	{
		return this.productId;
	}
	public void setProductId(String argProductId)
	{
		this.productId = argProductId;
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String argName)
	{
		this.name = argName;
	}
	public BigDecimal getUnitPrice()
	{
		return this.unitPrice;
	}
	public void setUnitPrice(BigDecimal argUnitPrice)
	{
		this.unitPrice = argUnitPrice;
	}
	public String getDescription()
	{
		return this.description;
	}
	public void setDescription(String argDescription)
	{
		this.description = argDescription;
	}
	public String getManufacturer()
	{
		return this.manufacturer;
	}
	public void setManufacturer(String argManufacturer)
	{
		this.manufacturer = argManufacturer;
	}
	public String getCategory()
	{
		return this.category;
	}
	public void setCategory(String argCategory)
	{
		this.category = argCategory;
	}
	public Long getUnitsInStock()
	{
		return this.unitsInStock;
	}
	public void setUnitsInStock(Long argUnitsInStock)
	{
		this.unitsInStock = argUnitsInStock;
	}
	public Long getUnitsInOrder()
	{
		return this.unitsInOrder;
	}
	public void setUnitsInOrder(Long argUnitsInOrder)
	{
		this.unitsInOrder = argUnitsInOrder;
	}
	public Boolean getDiscontinued()
	{
		return this.discontinued;
	}
	public void setDiscontinued(Boolean argDiscontinued)
	{
		this.discontinued = argDiscontinued;
	}
	public String getCondition()
	{
		return this.condition;
	}
	public void setCondition(String argCondition)
	{
		this.condition = argCondition;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Product other = (Product) obj;
		if (productId == null)
		{
			if (other.productId != null) return false;
		}
		else if (!productId.equals(other.productId)) return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		return result;
	}
	
	@Override
	public String toString()
	{
		return "Product [productId=" + productId + ", name=" + name + "]";
	}
}
