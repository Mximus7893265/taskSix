package ru.task.six;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BasketImpl implements Basket {
	
	private Map<String, Integer> basketProd;

	public BasketImpl() {
		basketProd=new LinkedHashMap<>();
	}
	
	public BasketImpl(Map<String, Integer> basketProd) {
		this.basketProd=basketProd;
	}

	@Override
	public void addProduct(String product, int quantity) {
		basketProd.put(product, quantity);
	}

	@Override
	public void removeProduct(String product) {
		basketProd.remove(product);
	}

	@Override
	public void updateProductQuantity(String product, int quantity) {
		basketProd.replace(product, quantity);
	}

	@Override
	public void clear() {
		basketProd.clear();
	}

	@Override
	public List<String> getProducts() {
		return new ArrayList<String>(basketProd.keySet());
	}

	@Override
	public int getProductQuantity(String product) {
		return basketProd.getOrDefault(product, 0);
	}
	
	public Map<String, Integer> getBasketProd(){
        return basketProd;
    }

}
