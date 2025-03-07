package groupFitnessLesson;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sub_Launcher {

    public void welcomePage() {
        System.out.println(" ***Welcome to Group Fitness Lesson. You can Book a new lesson, attend a lesson,***\n" +
                           "         ***Change  or cancel booked lesson and Check monthly report*** \n");
    }

    public void welcomePage1() {

        Scanner Launcher1 = new Scanner(System.in);

        // Object of the class launcher
        //Launcher lh = new Launcher();

        //Object of cancel and change
        Cancel_Change nCa = new Cancel_Change();

        //AlternateOptions chdt = new AlternateOptions();

        // Object of the class timetable / booking
        TimeTableviewer tb = new TimeTableviewer();

        // Object to attend lesson
        Lessionattending at = new Lessionattending();


        // Object of the rate/Review class
        Rate_Review rr = new Rate_Review();

        //Object of report class
        Lesson_Report LCR = new Lesson_Report();

        // Object for alternate option
        AlternateLessions alt = new AlternateLessions();



        System.out.println("Please select what you wish to do" +
                "\n PRESS 1: To Book a lesson " +
                "\n PRESS 2: To change or cancel a lesson " +
                "\n PRESS 3: To attend a lesson " +
                "\n PRESS 4: To rate or Review" +
                "\n PRESS 5: To check monthly report " +
                "\n PRESS 6: To EXIT");

        try {
            int menu = Launcher1.nextInt();
            switch (menu) {
                case 1:
                    // Calling this method for booking
                    tb.timeTableWelcome();
                    break;
                case 2:
                    // A method to call for Cancellation/ change will be called herr
                    nCa.changeBooking();
                    //chdt.zumba21st("Harry");
                    break;
                case 3:
                    // A method called to initiate review/rating
                    at.attendL();
                    break;
                case 4:
                    // A method called to initiate review/rating
                    rr.revRatWlc();
                    break;
                case 5:
                    //A method to call general report
                    LCR.reportLaunch();
                    break;
                case 6:
                    System.out.println("Thank you for your patronage, We Hope to see you next time...\n");

                    System.exit(0);
                default:
                    System.out.println("Invalid Entry");
                    alt.AltOpt1();
            }
        }
        catch (InputMismatchException e) {
            System.out.println("This an invalid input ::: You will be redirected for other options \n \n \n ");
            alt.AltOpt1();
        }
    }
}
