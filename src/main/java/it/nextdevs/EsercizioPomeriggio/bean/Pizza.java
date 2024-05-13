package it.nextdevs.EsercizioPomeriggio.bean;

import lombok.Data;

import java.util.List;

@Data
public class Pizza extends CaloriePrezzo{

    private String nome;
    private List<Topping> ingredienti;

}
