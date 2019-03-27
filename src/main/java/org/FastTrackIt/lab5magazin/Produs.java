package org.FastTrackIt.lab5magazin;

import java.util.List;

public class Produs {

    private String name;
    private int price;
    private int stock;
    private int gramaj;
    private String descriere;

    private List<CategorieProdus> categorii;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getGramaj() {
        return gramaj;
    }

    public void setGramaj(int gramaj) {
        this.gramaj = gramaj;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public List<CategorieProdus> getCategorii() {
        return categorii;
    }

    public void setCategorii(List<CategorieProdus> categorii) {
        this.categorii = categorii;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Produs){
            if (this.getName() == null){
                return false;
            }
           return this.getName().equals(((Produs)obj).getName());

        }else{
            return false;
        }
    }
}
