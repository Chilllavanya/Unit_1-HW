public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "sai";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;
        String landingLocation = "The Hill";

        meals = meals - (shipPopulation * .75);
        meals = meals - (shipPopulation * .75);
        System.out.println("meals still left are " + meals);
        meals += meals * 0.5;
        shipPopulation = shipPopulation + 5;

        if (landingLocation == "The Plain") {
            System.out.println("Bbzz landing on the plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }

        landing = landingCheck(100);

        new GuessingGame();
        new MarsExpedition();
        new FindingsList();
    }

    public static boolean landingCheck (int minutesLeft) throws InterruptedException {
        for (int minutes = 0; minutes < minutesLeft; minutes++) {
            if (minutes % 2 == 0) {
                System.out.println("Right");
            } else if (minutes % 3 == 0) {
                    System.out.println("Left");
            } else if (minutes % 2 == 0 && minutes % 3 == 0) {
                    System.out.println("Center");
            } else {
                System.out.println("Calculating....");
            }

            Thread.sleep(250);
        }

        System.out.println("Landed");
        return false;
    }
}