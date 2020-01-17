public class ConnectionManager {
    private static Connection connection=new Connection().getInstance();

    public static void main(String [] args)
    {
        Connection[] c = connection.add( new String[] { "A", "B" } );
        if (c != null)
            System.out.println(c);
        else
            System.out.println();
    }

}
