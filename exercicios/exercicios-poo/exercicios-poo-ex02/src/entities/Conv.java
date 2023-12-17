package entities;

public class Conv {

        public static double IOF = 0.06;

        public static double convert(double dollarPrice, double dollars) {
            double amountWithoutIOF = dollarPrice * dollars;
            return amountWithoutIOF + (amountWithoutIOF * IOF);
        }
}