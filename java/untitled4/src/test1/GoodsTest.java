package test1;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[10];

        Goods g1 =new Goods("0","apple",5999,100);
        Goods g2 =new Goods("1","apple",6999,100);
        Goods g3 =new Goods("2","apple",7999,100);

        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;

        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId()+","+goods.getName()+","+goods.getPrice()+","+goods.getCount());

        }
    }
}
