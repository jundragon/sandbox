package effectiveJava.item2;

import static effectiveJava.item2.NyPizza.Size.SMALL;
import static effectiveJava.item2.Pizza.Topping.*;

public class PlayItem {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION)
                .build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM)
                .sauceInside()
                .build();
    }
}
