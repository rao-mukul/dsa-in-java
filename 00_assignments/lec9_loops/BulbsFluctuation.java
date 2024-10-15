/*
 * Q10- You are given n number of bulbs. They are all switched off. A weird fluctuation in voltage hits the
circuit n times. In the 1st fluctuation all bulbs are toggled, in the 2nd fluctuation every 2nd bulb is toggled,
in the 3rd fluctuation every 3rd bulb is toggled and so on. You've to find which bulbs will be switched on
after n fluctuations.
Take as input a number n, representing the number of bulbs.
Print all the bulbs that will be on after the nth fluctuation in voltage.
 */

public class BulbsFluctuation {
    public static void main(String[] args) {
        int n = 25;
        boolean[] bulbs = new boolean[n + 1];

        // for (int i = 1; i <= n; i++) {
        // bulbs[i] = false;
        // }
        // The default value of boolean is false so we can directly use it.

        // loop through each fluctuation
        for (int i = 1; i <= n; i++) {
            // loop through each bulb
            for (int j = 1; j <= n; j++) {
                // if the bulb number is divisible by the fluctuation number
                // then toggle the bulb
                if (j % i == 0) {
                    bulbs[j] = !bulbs[j];
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if (bulbs[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public void alternative() {
        int n = 25;
        for (int i = 1; i * i <= n; i++) {
            System.out.print(i * i + " "); // only those bulbs will remain on which are perfect squares as perfect
                                           // squares have odd number of divisors due to their square root being the
                                           // extra one, whereas rest have even number of divisors
        }
    }
}
