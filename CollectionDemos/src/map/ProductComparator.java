package map;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {

		String str1 = p1.toString();
		String str2 = p2.toString();
		
		
		return str1.compareTo(str2);
	}

}
