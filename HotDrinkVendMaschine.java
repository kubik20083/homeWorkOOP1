import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendMaschine implements Vendingmachine {

    List<HotDrink> list = new ArrayList<>();

    public HotDrinkVendMaschine() {

    }

    public void addDrink(HotDrink drink) {
        list.add(drink);
    }

    @Override
    public void getProduct(HotDrink drink) {
       for(Object drinks:list) {
        if(drink.equals(drink)){
            System.out.println(drink.toString());
        }

       }
    }
    
    
}
