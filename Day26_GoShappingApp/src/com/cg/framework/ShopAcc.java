package com.cg.framework;

public abstract class ShopAcc {
	private int accNo ;
	private String accNm;
	private float charges;
	
	//construtor 
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	//  method bookproduct 
	
	abstract public void bookProduct(float charges);
	public void items(float charges)
	{
		System.out.println(charges);
	}
	
	
	//getter and setter
	
	
	public int getAccNo() 
	{
		return accNo;
	}
	
	

	public void setAccNo(int accNo) 
	{
		this.accNo = accNo;
	}
	
	
	public String getAccNm()
	{
		return accNm;
	}
	
	public void setAccNm(String accNm) 
	{
		this.accNm = accNm;
	}
	
	public float getCharges() 
	{
		return charges;
	}
	
	public void setCharges(float charges)
	{
		this.charges = charges;
	}
	 // toString methods 

	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}

		
	

}
