import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String RDIMove = "";
            System.out.println("What is your party affiliation? Enter R for Republican, D for Democrat, or I for Independent");
            RDIMove = in.next();
                if (RDIMove.equals("R")) {
                    System.out.println("You get a Republican Elephant!");
                } else if (RDIMove.equals("D")) {
                    System.out.println("You get a Democratic Donkey!");
                } else if (RDIMove.equals("I")) {
                    System.out.println("You get a Independent Man!");
                } else System.out.println("You get a Other!");
    }
}