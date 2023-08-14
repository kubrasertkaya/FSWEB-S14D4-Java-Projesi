package com.workintech.abstraction.model;

public class Bread extends ProductForSale{

    private String flourType;
    public Bread(String type, double price, String description,String flourType) {
        super(type, price, description);
        this.flourType=flourType;
    }

    public String getFlourType() {
        return flourType;
    }

    @Override
    public void showDetails() {
        String result=super.toString();
        StringBuilder builder=new StringBuilder();
        builder.append("Flourtype:"+ flourType+"\n");
        builder.append("****************************\n");
        System.out.println(result + builder.toString());

    }
}
