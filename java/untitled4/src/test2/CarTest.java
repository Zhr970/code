package test2;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {

        Car[] cars =new Car[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cars.length; i++) {
            Car car = new Car();

            System.out.println("请输入品牌");
            String brand = sc.next();
            car.setBrand(brand);

            System.out.println("请输入价格");
            float price = sc.nextFloat();
            car.setPrice(price);

            System.out.println("请输入颜色");
            String color = sc.next();
            car.setColor(color);

            cars[i] = car;
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getBrand()+","+cars[i].getPrice()+","+cars[i].getColor());
        }
    }

}
