package ca.vanier;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ProductObjectManager {

    List<Product> list;

    public ProductObjectManager() {
        list = new ArrayList<Product>();
    }

    public void CreateProduct(String[] temp) {
        String name = temp[0];
        String title = temp[1];
        int id = Integer.valueOf(temp[2]);
        Double price = Double.valueOf(temp[3]);
        list.add(new Product(name, title, id, price));
    }

    public void List() {
        Iterator<Product> iter = list.iterator();
        System.out.println("\nThe iterator values"
                + " of list are: ");
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }

}
