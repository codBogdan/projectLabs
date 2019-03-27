package org.FastTrackIt.lab5magazin;

public class MagazinApp {

    public static void main (String[] args){

        CatalogDeProduse catalog = new CatalogDeProduse();
        Produs productOne = new Produs();
        productOne.setName("Lapte");
        Produs lapte2 = new Produs();
        lapte2.setName("Lapte");

        CatalogDeProduse catalog2 = new CatalogDeProduse();
        Produs productTwo = new Produs();
        productOne.setName("Paine");


        catalog.addProduct(productOne);
        catalog2.addProduct(productTwo);
        catalog2.addProduct(lapte2);

        System.out.println("Magazinul are acest numar de produse : " + catalog2.getNumberOfProducts());
    }

}
