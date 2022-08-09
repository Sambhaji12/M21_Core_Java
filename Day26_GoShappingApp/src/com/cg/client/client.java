package com.cg.client;

import com.cg.application.GSPrimeAcc;
import com.cg.application.GSSShopFactory;
import com.cg.application.GsNormalAcc;
import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class client {

	public static void main(String[] args)
	{
		ShopFactory s= new GSSShopFactory();
		PrimeAcc p=new GSPrimeAcc(3234,"Sambhaji",500,true);
		System.out.println("prime Account:");
		p.bookProduct(p.getCharges());
		NormalAcc c=new GsNormalAcc(3245,"ajay",500,56);
		System.out.println("Normal Account:");
		c.bookProduct(c.getCharges());
		
		System.out.println(p);
		System.out.println(c);
	}

}
