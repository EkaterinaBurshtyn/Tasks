public class Simple {
    public static boolean simple_number(int n){
        for (int i=2;i<n;i++){
            if (n%i==0)
                return false;
        }
        return true;
    }
}
