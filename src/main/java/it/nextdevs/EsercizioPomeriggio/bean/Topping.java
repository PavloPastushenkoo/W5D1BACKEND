package it.nextdevs.EsercizioPomeriggio.bean;

import lombok.Data;

@Data
public class Topping extends  CaloriePrezzo {

    private String nome;

    public Topping(int calorie, double prezzo, String nome) {
        super(calorie, prezzo);
        this.nome = nome;
    }
    public Topping(){
        super();

    }

}
