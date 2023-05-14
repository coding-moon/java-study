package classTest;

public class Client {
	String name;
	String phoneNum;
	int bankAmount;
	double saleRate;

	
	
	public Client(String name, String phoneNum, int bankAmount, double saleRate) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.bankAmount = bankAmount;
		this.saleRate = saleRate;
	
	}

	int disCount(Store store, Client client) {
		 store.price = store.price - store.price * client.saleRate; 
		 
		 return store.price;
	}// 할인율 적용
	
	
}
