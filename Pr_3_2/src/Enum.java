public class Enum {
    Day day;

    public Enum(Day day){
        this.day=day;
    }

    public void eDay(){
        switch (day){
            case MONDAY:
                System.out.println("Monday"); break;
            case SUNDAY:
                System.out.println("Sunday"); break;
            case TUESDAY:
                System.out.println("Tuesday"); break;
            case WEDNASDAY:
                System.out.println("Wednasday"); break;
        }
    }
}


