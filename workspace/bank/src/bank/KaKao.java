package bank;

import java.util.Random;

public class KaKao extends Bank implements Runnable{
	int stockMoney;
	
	
	@Override
	public int showBalance() {
		setMoney(getMoney() / 2);
		return super.showBalance();
	}


// 주가
	public void stock() {
		Random random = new Random();
		int rating = random.nextInt(31);
		final boolean isDecrease = random.nextInt(2) == 1;
		
		if(isDecrease) {
			rating *= -1;
		}
	
		stockMoney *= (100 + rating) * 0.01;
	
	
	
	}
// 매도
	public void sell() {
		setMoney(stockMoney);
		stockMoney = 0;
		
	}


	@Override
	public void run() {
		while(true) {
			System.out.println(stockMoney + "원\t\t");
		}
	}


// 매수



}
