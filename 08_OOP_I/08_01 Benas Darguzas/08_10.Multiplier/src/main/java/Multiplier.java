public class Multiplier {
    private int number;


    public Multiplier(int number){
        this.number = number;
    }

    public int multiply(int number){
        int result;
        result = this.number * number;
        return result;
    }
}
