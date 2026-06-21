public class Forecast {


    // Recursive method to calculate future value

    public static double calculateFutureValue(
            double currentValue,
            double growthRate,
            int years){


        if(years == 0){

            return currentValue;

        }


        return calculateFutureValue(
                currentValue + (currentValue * growthRate),
                growthRate,
                years - 1
        );


    }


}