

public class Whistle {
    // Add the private variable sound to the class
    private String sound;

    // Create the constructor public Whistle (String whistleSound)
    public Whistle(String whistleSound) {
        this.sound = whistleSound;
    }

    // Create the method public void sound()
    public void sound() {
        System.out.println(this.sound);
    }

    public static void main(String[] args) {

        Whistle duckwhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");


        duckwhistle.sound();
        roosterWhistle.sound();
        duckwhistle.sound();
    }
}