public class Weeks_And_Days {
        public static void main(String[] args) {

            int weeks = 4;
            int days = 7;

            // outer loop prints weeks
            for (int i = 1; i <= weeks; ++i) {
                System.out.println("Week " + i);

                // inner loop prints days
                for (int j = 1; j <= days; ++j) {
                    System.out.println("       Day " + j);
                }
            }
        }
    }
