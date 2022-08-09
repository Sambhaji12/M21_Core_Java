package Client;

import Application12.MMBankFactory;
import Application12.MMCurrentAcc;
import Application12.MMSavingAcc;
import Framework.BankFactory;
import Framework.CurrentAcc;
import Framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		BankFactory b = new MMBankFactory();
		SavingAcc s = new MMSavingAcc(727,"Riya",67160,true);
		CurrentAcc c = new MMCurrentAcc(156,"piya",5577,25000);
		s.withdraw(3400);
		c.withdraw(5000);
		System.out.println(s);
		System.out.println(c);
	}

}
