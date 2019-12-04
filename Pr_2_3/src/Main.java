public class Main {
    public static void main(String[] args){
        StringBuilder stringBuilder= new StringBuilder("0123456789");
        stringBuilder.append("7");
        stringBuilder.insert(5,"2");
        stringBuilder.replace(6,6,"4");
        stringBuilder.delete(0,4);
        stringBuilder.delete(3,8);
        stringBuilder.toString();
        System.out.println(stringBuilder);

    }
}
