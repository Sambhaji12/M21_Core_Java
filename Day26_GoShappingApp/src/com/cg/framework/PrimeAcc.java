package com.cg.framework;

public abstract class PrimeAcc extends ShopAcc 
{
	private boolean isPrime;
	 @SuppressWarnings("unused")
	private static final float deliveryCharges = 0; 
	 
	public PrimeAcc(int accNo, String accNm, float charges ,boolean isPrime)
	{
		super(accNo, accNm, charges);
		this.isPrime=isPrime;
		// TODO Auto-generated constructor stub
	}
	public void  bookProduct(float charges)
	{
		System.out.println("Account Number is:"+ this.getAccNo()+"  "+"Account Name Is: "+" "+this.getAccNm()
		+"Charges Is: "+ " " +charges);
		
	}

	@Override
	public String toString() {
		return String.format("PrimeAcc [isPrime=%s]", isPrime);
	}
	

}
