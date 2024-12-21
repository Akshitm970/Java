package personal;
import java.util.*;

public class LearningWithClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String initialTime = sc.nextLine();
        String[] timeParts = initialTime.split(":");
        int hour = Integer.parseInt(timeParts[0]) % 12;
        int minute = Integer.parseInt(timeParts[1]);

        int n = sc.nextInt();

        int A = sc.nextInt();
        int B = sc.nextInt();

        int P = sc.nextInt();
        int Q = sc.nextInt();

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int[] angles = new int[n];
        for (int i = 0; i < n; i++) {
            angles[i] = sc.nextInt();
        }

        int totalCost = 0;
        for (int query = 0; query < n; query++) {
            int targetAngle = angles[query];

            int currentHourAngle = hour * 30;
            int currentMinuteAngle = (minute * 6) % 360;
            int currentAngle = Math.abs(currentHourAngle - currentMinuteAngle);
            currentAngle = Math.min(currentAngle, 360 - currentAngle);
            if (currentAngle == targetAngle) {
                continue;
            }

            int minCost = Integer.MAX_VALUE;

            for (int hourDelta = -12; hourDelta <= 12; hourDelta++) { // Move hour hand +/- 12 hours
                for (int minuteDelta = -360; minuteDelta <= 360; minuteDelta++) { // Move minute hand +/- 360 degrees
                    int newHour = (hour + hourDelta + 12) % 12; // Wrap around 12-hour format
                    int newMinute = (minute + minuteDelta + 360) % 360; // Wrap around 360 degrees

                    int newHourAngle = newHour * 30; // New hour hand position
                    int newMinuteAngle = newMinute * 6; // New minute hand position

                    int formedAngle = Math.abs(newHourAngle - newMinuteAngle);
                    formedAngle = Math.min(formedAngle, 360 - formedAngle);

                    // Check if the formed angle matches the target
                    if (formedAngle == targetAngle) {
                        // Calculate the cost of this movement
                        int hourMovement = Math.abs(hourDelta * 30);
                        int minuteMovement = Math.abs(minuteDelta);

                        int hourCost = (hourMovement <= 90) ? hourMovement * P : (90 * P + (hourMovement - 90) * Q);
                        int minuteCost = (minuteMovement <= 90) ? minuteMovement * X : (90 * X + (minuteMovement - 90) * Y);

                        // Clockwise or counterclockwise cost
                        int totalMovementCost = (hourDelta >= 0 ? A : B) * hourMovement +
                                (minuteDelta >= 0 ? A : B) * minuteMovement;

                        int totalCostForThisMove = hourCost + minuteCost + totalMovementCost;

                        // Update the minimum cost
                        minCost = Math.min(minCost, totalCostForThisMove);
                    }
                }
            }


            totalCost += minCost;


            hour = (hour + 12) % 12;
            minute = (minute + 360) % 360;
        }

        System.out.println(totalCost);

        sc.close();
    }
}
