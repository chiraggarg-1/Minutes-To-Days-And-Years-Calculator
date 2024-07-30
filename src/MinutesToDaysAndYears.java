public class MinutesToDaysAndYears {
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }else{
          long a = minutes / 525600;
        long b = minutes % 525600;
       long c = (b/60)/24;
            System.out.println(minutes+" min "+"= "+a+" y and "+c+" d");

        }
    }
    public static void main(String[] args){
        printYearsAndDays(2000000);
    }

}