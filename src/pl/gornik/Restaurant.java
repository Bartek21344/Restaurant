package pl.gornik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Dish> dishList = new ArrayList<>();
        List<Dish> koszyk = new ArrayList<>();
        Dish meatDish1 = new MeatDish("Tpo", 30, "schabowy, pyry, suruwka", "schab");
        Dish meatDish2 = new MeatDish("kebab1", 14, "kurczak, tortilla, surówki", "kurczak");
        Dish meatDish3 = new MeatDish("kebab2", 16, "wołowina, lawasz, surówki", "wołowina");
        Dish vegetarianDish = new VegetarianDish("sałatka", 3, "cieciezyca, liście, bazylia, orzechy");
        dishList.add(meatDish1);
        dishList.add(meatDish2);
        dishList.add(meatDish3);
        dishList.add(vegetarianDish);

        System.out.println("Menu");
        for(Dish dish : dishList){
            dish.displayInformation();
        }


        System.out.println("podaj nazwę dania");
        String name = scanner.next();
        for(Dish dish : dishList){
            if(dish.getName().equalsIgnoreCase(name.toLowerCase())){
                koszyk.add(dish);
            }
        }
        for(Dish wypiszKoszyk: koszyk){
            wypiszKoszyk.displayInformation();
        }
    }
}
