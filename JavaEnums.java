public class JavaEnums {

    public static void main(String[] args) {
        enum Days {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
       }

       System.out.println(Days.SATURDAY);

        for(int i = 0; i <= Days.values().length - 1; i++){
            System.out.println(Days.values()[i]);
        }

    }
}
