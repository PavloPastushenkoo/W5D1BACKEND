package it.nextdevs.EsercizioPomeriggio.appConfig;

import it.nextdevs.EsercizioPomeriggio.bean.Drink;
import it.nextdevs.EsercizioPomeriggio.bean.Menu;
import it.nextdevs.EsercizioPomeriggio.bean.Pizza;
import it.nextdevs.EsercizioPomeriggio.bean.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig {
@Bean
    public Pizza getPizza(){

        Pizza pizza = new Pizza();
        pizza.setNome("Margherita");
        pizza.setCalorie(1104);
        pizza.setPrezzo(4.99);
        pizza.setIngredienti(List.of(
                new Topping(50, 0.49, "Tomato"),
                new Topping(100, 0.59, "Cheese")
        ));
        return pizza;
    }
    @Bean
    public Pizza getPizza2(){
        Pizza pizza = new Pizza();
        pizza.setNome("Hawaiian Pizza");
        pizza.setCalorie(1024);
        pizza.setPrezzo(6.49);
        pizza.setIngredienti(List.of(
                new Topping(50, 0.49, "Tomato"),
                new Topping(100, 0.59, "Cheese"),
                new Topping(140, 0.69, "Ham" )
        ));
        return pizza;
    }
    @Bean
    public Pizza getPizza3(){
    Pizza pizza = new Pizza();
    pizza.setNome("Salami Pizza");
    pizza.setCalorie(1160);
    pizza.setPrezzo(5.99);
    pizza.setIngredienti(List.of(
            new Topping(50, 0.49, "Tomato"),
            new Topping(100, 0.59, "Cheese"),
            new Topping(200, 0.69, "Salami")
    ));
        return pizza;
    }
@Bean
    public Topping getTopping(){
        Topping topping = new Topping();
        topping.setNome("Cheese");
        topping.setCalorie(92);
        topping.setPrezzo(0.69);
        return topping;
    }
@Bean
    public Topping getTopping2(){
    Topping topping = new Topping();
    topping.setNome("Ham");
    topping.setCalorie(35);
    topping.setPrezzo(0.99);
    return topping;
}
@Bean
    public Topping getTopping3(){
    Topping topping = new Topping();
    topping.setNome("Onions");
    topping.setCalorie(22);
    topping.setPrezzo(0.69);
    return topping;
    }
@Bean
    public Topping getTopping4(){
    Topping topping = new Topping();
    topping.setNome("Pineapple");
    topping.setCalorie(24);
    topping.setPrezzo(0.79);
    return topping;
    }
@Bean
    public Topping getTopping5(){
    Topping topping = new Topping();
    topping.setNome("Salami");
    topping.setCalorie(86);
    topping.setPrezzo(0.99);
    return topping;
    }
@Bean
    public Drink getDrink(){
        Drink drink = new Drink();
        drink.setNome("Lemonade");
        drink.setCalorie(128);
        drink.setPrezzo(1.29);
        return drink;
    }
    @Bean
    public Drink getDrink2(){
        Drink drink = new Drink();
        drink.setNome("Water");
        drink.setCalorie(0);
        drink.setPrezzo(1.29);
        return drink;
    }
    @Bean
    public Drink getDrink3(){
    Drink drink = new Drink();
    drink.setNome("Wine");
    drink.setCalorie(607);
    drink.setPrezzo(7.49);
    drink.setAlcol("13%");
    return drink;
    }

@Bean
    public Menu getMenu(){
    Menu menu = new Menu();
    menu.setPizze(List.of(getPizza(),getPizza2(),getPizza3()));
    menu.setIngredienti(List.of(getTopping(),getTopping2(),getTopping3(),getTopping4(),getTopping5()));
    menu.setBevande(List.of(getDrink(),getDrink2(),getDrink3()));
    return menu;
    }
}
