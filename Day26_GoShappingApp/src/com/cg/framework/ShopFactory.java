package com.cg.framework;

public abstract class ShopFactory 
{
	abstract public PrimeAcc getNewPrimeAcc(int AccNo ,String accNum ,float charges ,boolean isPrime);
	abstract public NormalAcc getNewNormalAcc(int AccNo ,String accNum ,float charges ,boolean deliveryCharges);
	public NormalAcc getNewNormalAcc(int accNo, String accNum, float charges, float deliveryCharges) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
