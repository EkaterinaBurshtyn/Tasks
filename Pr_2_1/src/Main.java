public class Main {
    public static void main(String[] args){
        Integer x=7;
        System.out.println(x.byteValue()+"   **      "+ x.doubleValue()+"    **    "+ x.longValue());
        System.out.println(Integer.parseInt("34")+"       **        "+ Double.parseDouble("34"));
        System.out.println(Integer.valueOf("55")+"  **       "+ Double.valueOf("55"));
    }
}
