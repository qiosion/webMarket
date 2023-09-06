package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {
	
	// 멤버 변수와 기본 생성자
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	
	public ProductRepository() {
		Product phone = new Product("P1234", "iPhone 13", 1600000);
		phone.setDescription("어쩌고 저쩌고 디스플레이, 뭐 어쩌고 카메라");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
		
		Product laptop = new Product("P1235", "LG PC 그램", 1500000);
		laptop.setDescription("13.3인치, LED 디스플레이, 인텔 코어 프로세서");
		laptop.setCategory("Lap Top");
		laptop.setManufacturer("LG");
		laptop.setUnitsInStock(1000);
		laptop.setCondition("Refurbished");
		
		Product tablet = new Product("P1236", "Galaxy Tab S", 800000);
		tablet.setDescription("212.8*125.6*6.6mm, AMOLED 디스플레이, 옥타 코어 프로세서");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Samsung");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("Old");
		
		listOfProducts.add(phone);
		listOfProducts.add(laptop);
		listOfProducts.add(tablet);
	}

	// 상품 목록을 가져오는 메소드
	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}
	
	// 상품 상세 정보를 가져오는 메소드
	public Product getProductById(String productId) {
		Product productById = null;
		
		for (int i = 0; i < listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			
			if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		
		return productById;
	}
	
	// 신규 상품 데이터를 저장
	private static ProductRepository instance = new ProductRepository();
	
	public static ProductRepository getInstance() {
		return instance;
	}
	
	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
}
