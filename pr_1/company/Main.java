package pr_1.company;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        String [] arr = new String[2];
        System.out.print("Расстояние(км): ");
        arr[0]=in.nextLine();
        System.out.print("Время(ч): ");
        arr[1]=in.nextLine();
        Ex xx= new Ex(arr);
        xx.VS();
    }
}
class Ex{
    String arr[];
    Ex(String [] arr){
        this.arr=arr;
    }
    public void VS(){ float [] mas=new float[2];
        for (int i=0;i<arr.length;i++){
            mas[i]=Float.parseFloat(arr[i]);
        }
        float vlst=mas[0]/mas[1];
        System.out.print("Скорость(км/ч): "+ vlst);
    }
}
