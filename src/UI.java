import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Scanner;


public class UI {


    public void run() {


        Scanner input = new Scanner(System.in);
        Controller controller = new Controller();
        ArrayList<Covid19Data> senesteData = controller.fh.læsData();


        System.out.println("Hi, what would you like to do?");
        String userChoice = "";



        while (!userChoice.equals("END")) {
            System.out.println("----------------------");
            System.out.println("Display: Shows info.");
            System.out.println("Sort: Sorts data");
            System.out.println("End: exit.");
            System.out.println("----------------------");
            userChoice = input.nextLine().toLowerCase();


            switch (userChoice) {

                case "display" -> System.out.println("");
                case "sort" -> {
                    String searchingBy1st = "";
                    String searchingBy2nd = "";
                    System.out.println("How would you like to sort it?");
                    userChoice = input.nextLine().toLowerCase();
                    while (!userChoice.equals("region") && !userChoice.equals("alder")) {
                        System.out.println("That's not an option. Please enter YES or NO:");
                        userChoice = input.nextLine().toUpperCase();
                    }


                    if (userChoice.equals("region")) {
                        searchingBy1st = "region";
                    }
                    if (userChoice.equals("alder")) {
                        searchingBy1st = "alder";
                    }

                    System.out.println("Do you wish to add a secondary search criteria?");
                    String yesNo = input.nextLine().toLowerCase();

                    while (!yesNo.equals("yes") && !yesNo.equals("no")) {
                        System.out.println("That's not an option. Please enter 'YES' or 'NO':");
                        yesNo = input.nextLine().toLowerCase();
                    }

                    ///you were adding a secondary criterion here bby
                    switch (yesNo) {
                        case "yes" -> {
                            System.out.println("What is the secondary search criteria?");
                            userChoice = input.nextLine().toLowerCase();
                            while (!userChoice.equals("region") && !userChoice.equals("alder")) {
                                System.out.println("That's not an option. Please enter 'region' or 'alder':");
                                userChoice = input.nextLine().toLowerCase();
                            }
                            if (userChoice.equals("region")) {
                                searchingBy1st = "region";
                            }
                            if (userChoice.equals("alder")) {
                                searchingBy1st = "alder";
                            }
                        }
                        case "no" -> searchingBy2nd = "";

                        default -> System.out.println("upsie something went wrong");
                    }


                    controller.sortData(senesteData, searchingBy1st, searchingBy2nd);
                }
                case "end" -> System.out.println("Thanks for using the system!");
                default -> System.out.println("Seems like that's not an option!");
            }


            for (Covid19Data c19data : senesteData) {
                System.out.println(c19data);
            }





        }
    }
}
