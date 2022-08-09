package Application12;

import Framework.BankFactory;
import Framework.CurrentAcc;
import Framework.SavingAcc;

public class MMBankFactory extends BankFactory{


	@Override
	public SavingAcc getNewSavingAccount(int AccNo, String accNm, float accBal, boolean isSalary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		return null;
	}

}
