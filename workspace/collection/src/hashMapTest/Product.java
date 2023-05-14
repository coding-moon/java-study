package hashMapTest;

public class Product {
//	상품 번호, 상품이름, 상품 가격, 상품 재고
	private int number;
	private String name;
	private int price;
	private int account;
	//private int discount;
	
	public Product() {;}


	public Product(int number, String name, int price, int account) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
		this.account = account;
	}

	
	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getAccount() {
		return account;
	}


	public void setAccount(int account) {
		this.account = account;
	}


	@Override
	public String toString() {
		return "Product [number=" + number + ", name=" + name + ", price=" + price + ", account=" + account + "]";
	}
 













}
