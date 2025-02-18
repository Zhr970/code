package test4;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] girlFriend = new GirlFriend[3];

        GirlFriend girlFriend1 = new GirlFriend("mimimi",20,"reading");
        GirlFriend girlFriend2 = new GirlFriend("mimi",22,"Swing");
        GirlFriend girlFriend3 = new GirlFriend("mi",21,"skying");

        girlFriend[0] = girlFriend1;
        girlFriend[1] = girlFriend2;
        girlFriend[2] = girlFriend3;

        int sum = 0;
        int count = 0;
        for (int i = 0; i < girlFriend.length; i++) {
            GirlFriend gf = girlFriend[i];
            sum += gf.getAge();
        }
        int average = sum / girlFriend.length;

        for (int i = 0; i < girlFriend.length; i++) {
            GirlFriend gf = girlFriend[i];
            if(gf.getAge() > average){
                count++;
            }
        }
        System.out.println(average);
        System.out.println(count);

    }
}
