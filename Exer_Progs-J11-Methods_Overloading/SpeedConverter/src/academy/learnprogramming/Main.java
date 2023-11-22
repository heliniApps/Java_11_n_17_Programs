package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(SpeedConverterOld.toMilesPerHour(10.25));
        System.out.println(SpeedConverterOld.toMilesPerHour(-5.6));

        SpeedConverterOld.printConversion(1.5);
        SpeedConverterOld.printConversion(10.25);
        SpeedConverterOld.printConversion(-5.6);
    }
}
