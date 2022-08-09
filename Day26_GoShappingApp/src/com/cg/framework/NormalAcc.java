package com.cg.framework;

public abstract class NormalAcc extends ShopAcc
{
	private final float deliveryCharge;
	
	public NormalAcc(int accNo, String accNm, float charges ,float deliveryCharge)
	{
		super(accNo, accNm, charges);
		this.deliveryCharge=deliveryCharge;
		
	}
	
	public void  bookProduct(float charges)
	{
		System.out.println("Account Number Is: "+this.getAccNo()+"Account Name Is: "+this.getAccNm()
		+"charges is"+(charges+deliveryCharge));
		
	}
	@Override
	public String toString() {
		return String.format("NormalAcc [deliveryCharge=%s]", deliveryCharge);
	}
	
}
