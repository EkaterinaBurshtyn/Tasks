import java.util.Random;

public class Coin {
    static void flipping(){
        Random random= new Random();
        int a=random.nextInt(2);
        System.out.println(a);
        if (a==0)
            System.out.print("Решка");
        else
            System.out.print("Орел");
    }
}
