package com.packt.webstore.domain;

/**
 * @author life
 *
 */
public class Customer
{
	private Integer customerId 		= null;
	private String name				= null;
	private String address			= null;
	private Integer noOfOrdersMade 	= null;
	
	public Integer getCustomerId()
	{
		return this.customerId;
	}
	public void setCustomerId(Integer argCustomerId)
	{
		this.customerId = argCustomerId;
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String argName)
	{
		this.name = argName;
	}
	public String getAddress()
	{
		return this.address;
	}
	public void setAddress(String argAddress)
	{
		this.address = argAddress;
	}
	public Integer getNoOfOrdersMade()
	{
		return this.noOfOrdersMade;
	}
	public void setNoOfOrdersMade(Integer argNoOfOrdersMade)
	{
		this.noOfOrdersMade = argNoOfOrdersMade;
	}
}
