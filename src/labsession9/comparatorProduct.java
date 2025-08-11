package labsession9;

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
        List<product> prod = new ArrayList<>();

        prod.add(new product("Phone",23432));
        prod.add(new product("Watch",4332));
        prod.add(new product("Camera",38292));
        prod.add(new product("Buds",1002));

        Collections.sort(prod, new comparatorProduct());

        for (product pro : prod){
            System.out.println(pro);
        }
    }
}
 
