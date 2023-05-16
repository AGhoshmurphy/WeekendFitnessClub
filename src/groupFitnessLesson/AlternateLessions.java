package groupFitnessLesson;

import java.util.Scanner;


public class AlternateLessions {

    // Method for main menu
    Sub_Launcher sbl = new Sub_Launcher();


    Scanner altOpt = new Scanner(System.in);

    public void AltOpt1(){
        // This method contains main menu and Exit
        System.out.println("What would you want to do next?: \n" +
                "PRESS 1 for the main menu \n\n" +
                "PRESS 1 for the Exit\n");

        int OptionIn = altOpt.nextInt();
        if (OptionIn == 1){
            sbl.welcomePage();
            sbl.welcomePage1();
        }
        else if (OptionIn == 2) {
            System.out.println("Thank you for your contribution. We look forward to seeing you again soon.\n...\n");
            System.exit(0);
        }
        else{
            System.out.println("Invalid Input, returning you to the home page\n...\n");
            sbl.welcomePage1();
        }
    }

    public void AltOpt2(){

        // Method for time table
        TimeTableviewer ttb = new TimeTableviewer();

        // This method contains timetable, main menu and Exit
        System.out.println("Key in for other options: \n" +
                "PRESS 1 for NAVIGATION To schedule a new session\n \n" +
                "PRESS 2 to get to the main menu.\n \n" +
                "Please press 3 to get to the exit. \n\n");

        int OptionIn = altOpt.nextInt();
        if (OptionIn == 1){
            ttb.timeTableWelcome();
        }
        else if (OptionIn == 2) {
            sbl.welcomePage();
            sbl.welcomePage1();
        }
        else if (OptionIn == 3) {
            System.out.println("Thank you for your contribution. We look forward to seeing you again soon..\n");
            System.exit(0);
        }
        else{
            System.out.println("Invalid Input, returning you to the home page..\n");
            sbl.welcomePage1();

        }

    }

}
