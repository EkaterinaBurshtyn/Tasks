public class Simple {
     int n;

    Simple(int n){
        this.n=n;
    }
    public static boolean simple_number(int n){
        for (int i=2;i<n;i++){
            if (n%i==0)
                return false;
        }
        return true;
    }
}
