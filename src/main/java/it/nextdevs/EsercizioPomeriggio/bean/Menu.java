package it.nextdevs.EsercizioPomeriggio.bean;

import lombok.Data;

import java.util.List;

@Data
public class Menu {

    private List<Pizza> pizze;
    private List<Drink> bevande;
    private List<Topping> ingredienti;

}
