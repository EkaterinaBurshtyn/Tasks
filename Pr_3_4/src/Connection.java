public class Connection {
    private static Connection instance;
    private String name;

    public static Connection getInstance(){
        if (instance == null)
            instance = new Connection();
        return instance;
    }

    public Connection(){}

    public Connection(String name){
        this.name=name;
    }

    public static Connection[] add (String[] names)
    {
        Connection[] connections = new Connection[names.length];
        for (int i = 0; i < names.length; i++)
            connections[i] = new Connection(names[i]);

        return connections;
    }

    @Override
    public String toString() {
        return name;
    }


}
