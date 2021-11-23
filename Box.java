package com.company;

import java.util.ArrayList;

public class Box {
    private ArrayList<Fruit> arrayList = new ArrayList<>();
    private Float weight=0.0f;

    public Float getWeight() {
        return weight;
    }

    public ArrayList<Fruit> getArrayList() {
        return arrayList;
    }

    public  <T extends Fruit> void putFruit(T fruit){
        if (arrayList.size()==0||arrayList.get(0).getName().equals(fruit.getName())) {
            arrayList.add(fruit);
            float a = fruit.getWeight();
            weight+=a;
            System.out.println("Вы положили в корзину: "+ fruit.getName());
        } else {
            System.out.println("Нельзя положить в корзину разные фрукты");
        }
    }

    public  boolean  compareTo(Box o) {
        if (this.weight<o.getWeight()||this.weight>o.getWeight()){
            return false;
        }
        return true;
    }


    public void boxToBox(Box otherBox){
        if (arrayList.get(0).getName().equals(otherBox.arrayList.get(0).getName())){
            for (int i = 0; i < arrayList.size(); i++) {
                otherBox.putFruit(arrayList.get(i));
            }
            this.arrayList=new ArrayList<>();
            this.weight=0.0f;
        } else {
            System.out.println("Нельзя положить в корзину разные фрукты");
        }
    }
}
