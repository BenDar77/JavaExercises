package lt.techin.praktinis;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int thousands = number / 1000;         // Skaitmuo tūkstantis
        int hundreds = (number / 100) % 10;     // Skaitmuo šimtas
        int tens = (number / 10) % 10;          // Skaitmuo dešimtis
        int ones = number % 10;                 // Vienetų skaitmuo

        int sum = thousands + hundreds + tens + ones;

        System.out.println(sum);
    }

    }


