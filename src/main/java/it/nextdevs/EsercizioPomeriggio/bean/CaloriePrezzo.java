package it.nextdevs.EsercizioPomeriggio.bean;

import lombok.Data;

@Data
public class CaloriePrezzo {
    private int calorie;
    private double prezzo;

    public CaloriePrezzo(int calorie, double prezzo) {
        this.calorie = calorie;
        this.prezzo = prezzo;
    }
    public CaloriePrezzo(){
    }
}
