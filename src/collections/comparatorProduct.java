package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatorProduct implements Comparator<product> {

    @Override
    public int compare(product o1, product o2) {
        return o1.price - o2.price;
    }

    public static void main(String[] args) {
        List<product> products = new ArrayList<>();

        products.add(new product("Phone",23432));
        products.add(new product("Watch",4332));
        products.add(new product("Camera",38292));
        products.add(new product("Buds",1002));

        Collections.sort(products, new comparatorProduct());

        for (product pro : products){
            System.out.println(pro);
        }
    }
}
 
