
public class Main {
    public static int main(int[] array) {
        
        int smallestValue = array[0];
        int[] values = {6, 5, 8, 7, 11};
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestValue) {
                smallestValue = array[i];
            }
        }
        return smallestValue;
    }
    

}
