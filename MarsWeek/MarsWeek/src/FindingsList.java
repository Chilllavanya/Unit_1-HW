import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class FindingsList {
    public FindingsList() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Welcome Back ");
        ArrayList<String> rockList = new ArrayList<String>(4);
        rockList.add("rock");
        rockList.add("Smooth rock");
        rockList.add("weird rock");
        rockList.add("not rock");

        System.out.println("Everything downloaded and print the list of rocks");
        System.out.println(rockList);
        System.out.println("The last one is not a rock. We need to remove it.");
        rockList.remove("not rock");
        System.out.println(rockList);

        Thread.sleep(1000);
        HashMap<String, String> fossilDirectory = new HashMap<>();
        fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("Which of the fossils would you like to learn more about? (Bird, fish, or tooth)?");
        Scanner input = new Scanner(System.in);
        String fossilChoice = input.nextLine();
        
        if (fossilChoice.equals("Bird")) {
            System.out.println("fossile: " + fossilChoice + "\nDescription : " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equals("Fish")) {
            System.out.println("fossile: " + fossilChoice + "\nDescription : " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equals("Tooth")) {
            System.out.println("fossile: " + fossilChoice + "\nDescription : " + fossilDirectory.get(fossilChoice));
        }

        Thread.sleep(700);
        HashSet<String> supplies = new HashSet<>();
        supplies.add("Teleport");
        supplies.add("stun bun");
        supplies.add("Medicine");

        supplies.remove("stun bun");

        Iterator itr = supplies.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        input.close();
    }
}
