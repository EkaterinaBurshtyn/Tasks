 class Dog {
    private String name;
    private String says;
   public Dog(String aname,String asays){
       name = aname;
       says=asays;
   }
    public String getName(){
        return name;
    }
    public String getSays(){
       return says;
    }
}
class Main{
    public static void main(String [] args){
        Dog [] dog= new Dog[2];
        dog[0]=new Dog("Spot","Ruff!");
        dog[1]= new Dog("Scruffy","Word!");

        for (Dog d: dog){
            System.out.println("name= "+ d.getName()+ ", says= "+ d.getSays());
        }
    }
}