package Test;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<PersianCat> list1 = new ArrayList<>();
        ArrayList<LiHuaCat> list2 = new ArrayList<>();
        ArrayList<TeddyDog> list3 = new ArrayList<>();
        ArrayList<HuskyDog> list4 = new ArrayList<>();

        keepPet1(list1);
        keepPet1(list2);
        keepPet2(list3);
        keepPet2(list4);

    }

    public static void keepPet1(ArrayList<? extends Cat> list){

    }
    public static void keepPet2(ArrayList<? extends Dog> list){

    }

    public static void keepPet3(ArrayList<? extends Animal> list){

    }
}
