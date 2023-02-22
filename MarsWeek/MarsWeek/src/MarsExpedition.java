import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition(){
        Scanner input = new Scanner(System.in);
        System.out.println("Booting up ....");
        System.out.println(".....");
        System.out.println("Ready");

        System.out.println("Give your name : ");
        String name = input.next();
        System.out.println("Hi" + name +" — Welcome to the Expedition prep program. \nAre you ready to head out into the new world? Type Y or N");
        String choice = input.next();
        if (choice.equals("Y")) {
            System.out.println(" knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("Too bad you are team leader. You have to go.");
        }

        System.out.println("How many people you want on your team?");
        int teamMembers = input.nextInt();

        if (teamMembers > 2) {
            System.out.println("That’s way to many people. We can only send 2 more members.");
        } else if (teamMembers < 2){
            System.out.println("That’s way to less people. We can only send 2 members.");
        } else {
            System.out.println("The team size always needs to be exactly 2");
        }

        System.out.println("You are allowed to bring one snack with you. \nWhat do you want to bring?");
        String snack =input.nextLine();

        System.out.println("Nice choice, you will be bringing a " + snack + " with you.");

        System.out.println("You have the choice of 3 vehicles" +
        "\nA: A Mars Rover" +
        "\nB: A Chevy Silverado" +
        "\nC: A Honda Civic");

        String vehicleChoice = input.nextLine();

        if (vehicleChoice.equals("A")){
            System.out.println("A Mars Rover");
            System.out.println("A Chevy Silverado");
            System.out.println("A Honda Civic");

            System.out.println("The user’s name is : " + name + "\nThe size of the team is : " + teamMembers + "\nThe snack you’re bringing is : " + snack + "\nThe vehicle you’ll be using is : " + vehicleChoice + "\nHave fun with this!");
        }
        input.close();
    }
}
