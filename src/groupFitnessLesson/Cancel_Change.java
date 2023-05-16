package groupFitnessLesson;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cancel_Change {

    Scanner changeIn = new Scanner(System.in);

    // Creating an object for the sub launcher to call my functions
    //SubLauncher sbl1 = new SubLauncher();


    // Creating Object for Time table Launcher
    TimeTableviewer tb1 = new TimeTableviewer();

    // Method for alternate options
    AlternateLessions alt = new AlternateLessions();

    // Instance of the class
    Fitness_Lesson ft =  Fitness_Lesson.getInstance();


    public void changeBooking() {

        System.out.println("Would you like to cancel or change your session" +
                "\n PRESS 1: To Change " +
                "\n PRESS 2: To Cancel ");

        int changeOp = changeIn.nextInt();
        if ( changeOp == 1) {

            // Creating an input stream to select customer particular booking to change

            System.out.println(
                            "\n              7th Aug          14 Aug          21 Aug          28 Aug       " +
                            "\n Morning:     1.Yoga           2.Yoga          3.Yoga          4.Yoga       " +
                            "\n Price          £ 21             £ 21            £ 21            £ 21       " +
                            "\n Evening:     5.Spin           6.Spin          7.Spin          8.Spin       " +
                            "\n Price          £ 25             £ 25            £ 25            £ 25     \n" +


                            "                8th Aug          15 Aug          22 Aug          29 Aug       " +
                            "\n Morning:     9.Aquacise       10.Aquacise     11.Aquacise     12.Aquacise  " +
                            "\n Price          £ 33             £ 33            £ 33            £ 33       " +
                            "\n Evening:     13.Zumba         14.Zumba        15.Zumba        16.Zumba     " +
                            "\n Price          £ 35             £ 35            £ 35            £ 35     \n" +

                            "\n              4 sept            11 sept          18 Aug          25 sept       " +
                            "\n Morning:     17.Yoga          18.Yoga         19.Yoga         20.Yoga      " +
                            "\n Price          £ 21             £ 21            £ 21            £ 21       " +
                            "\n Evening:     21.Spin          22.Spin         23.Spin         24.Spin    \n" +
                            "\n Price          £ 25             £ 25            £ 25            £ 25       " +

                            "\n              5 sept            12 sept          19 Aug          26 sept       " +
                            "\n Morning:     25.Aquacise      26.Aquacise     27.Aquacise     28.Aquacise  " +
                            "\n Price          £ 33             £ 33            £ 33            £ 33       " +
                            "\n Evening:     29.Zumba         30.Zumba        31.Zumba        32.Zumba   \n" +
                            "\n Price          £ 35             £ 35            £ 35            £ 35     \n");

            System.out.print("Please select the date and session you booked for::: \n");

            try {
                int cusToChange = changeIn.nextInt();
                switch (cusToChange) {
                    case 1:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc1 = new Scanner(System.in);
                        String BookingID1 = changeInc1.nextLine();
                        ft.changeYoga7thJ(BookingID1 , "Yoga Morning Session on the 7th of August");
                        alt.AltOpt2();
                        break;
                    case 2:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc2 = new Scanner(System.in);
                        String BookingID2 = changeInc2.nextLine();
                        ft.changeYoga14thJ(BookingID2 , "Yoga Morning Session on the 14th of August");
                        alt.AltOpt2();
                        break;
                    case 3:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc3 = new Scanner(System.in);
                        String BookingID3 = changeInc3.nextLine();
                        ft.changeYoga21J(BookingID3 , "Yoga Morning Session on the 21th of August");
                        alt.AltOpt2();
                        break;
                    case 4:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc4 = new Scanner(System.in);
                        String BookingID4 = changeInc4.nextLine();
                        ft.changeYoga28J(BookingID4 , "Yoga Morning Session on the 28th of August");
                        alt.AltOpt2();
                        break;
                    case 5:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc5 = new Scanner(System.in);
                        String BookingID5 = changeInc5.nextLine();
                        ft.changeSpin7J(BookingID5 , "Spin Evening Session on the 7th of August");
                        alt.AltOpt2();
                        break;
                    case 6:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc6 = new Scanner(System.in);
                        String BookingID6 = changeInc6.nextLine();
                        ft.changeSpin14J(BookingID6 , "Spin Evening Session on the 14th of August");
                        alt.AltOpt2();
                        break;
                    case 7:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc7 = new Scanner(System.in);
                        String BookingID7 = changeInc7.nextLine();
                        ft.changeSpin21J(BookingID7 , "Spin Evening Session on the 21th of August");
                        alt.AltOpt2();
                        break;
                    case 8:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc8 = new Scanner(System.in);
                        String BookingID8 = changeInc8.nextLine();
                        ft.changeSpin28J(BookingID8 , "Spin Evening Session on the 28th of August");
                        alt.AltOpt2();
                        break;
                    case 9:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc9 = new Scanner(System.in);
                        String BookingID9 = changeInc9.nextLine();
                        ft.changeAquacise8J(BookingID9 , "Aquacise Morning Session on the 8th of August");
                        alt.AltOpt2();
                        break;
                    case 10:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc10 = new Scanner(System.in);
                        String BookingID10 = changeInc10.nextLine();
                        ft.changeAquacise15J(BookingID10 , "Aquacise Morning Session on the 15th of August");
                        alt.AltOpt2();
                        break;
                    case 11:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc11 = new Scanner(System.in);
                        String BookingID11 = changeInc11.nextLine();
                        ft.changeAquacise22J(BookingID11 , "Aquacise Morning Session on the 22nd of August");
                        alt.AltOpt2();
                        break;
                    case 12:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc12 = new Scanner(System.in);
                        String BookingID12 = changeInc12.nextLine();
                        ft.changeAquacise29J(BookingID12 , "Aquacise Morning Session on the 29th of August");
                        alt.AltOpt2();
                        break;
                    case 13:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc13 = new Scanner(System.in);
                        String BookingID13 = changeInc13.nextLine();
                        ft.changeZumba8J(BookingID13 , "Zumba Evening Session on the 8th of August");
                        alt.AltOpt2();
                        break;
                    case 14:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc14 = new Scanner(System.in);
                        String BookingID14 = changeInc14.nextLine();
                        ft.changeZumba15J(BookingID14 , "Zumba Evening Session on the 15th of August");
                        alt.AltOpt2();
                        break;
                    case 15:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc15 = new Scanner(System.in);
                        String BookingID15 = changeInc15.nextLine();
                        ft.changeZumba22J(BookingID15 , "Zumba Evening Session on the 22nd of August");
                        alt.AltOpt2();
                        break;
                    case 16:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc16 = new Scanner(System.in);
                        String BookingID16 = changeInc16.nextLine();
                        ft.changeZumba29J(BookingID16 , "Zumba Evening Session on the 29th of August");
                        alt.AltOpt2();
                        break;
                    case 17:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc17 = new Scanner(System.in);
                        String BookingID17 = changeInc17.nextLine();
                        ft.changeYoga4F(BookingID17 , "Yoga Morning Session on the 4th of september");
                        alt.AltOpt2();
                        break;
                    case 18:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc18 = new Scanner(System.in);
                        String BookingID18 = changeInc18.nextLine();
                        ft.changeYoga4F(BookingID18 , "Yoga Morning Session on the 11th of september");
                        alt.AltOpt2();
                        break;
                    case 19:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc19 = new Scanner(System.in);
                        String BookingID19 = changeInc19.nextLine();
                        ft.changeYoga18F(BookingID19 , "Yoga Morning Session on the 18th of september");
                        alt.AltOpt2();
                        break;
                    case 20:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc20 = new Scanner(System.in);
                        String BookingID20 = changeInc20.nextLine();
                        ft.changeYoga25F(BookingID20 , "Yoga Morning Session on the 25th of september");
                        alt.AltOpt2();
                        break;
                    case 21:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc21 = new Scanner(System.in);
                        String BookingID21 = changeInc21.nextLine();
                        ft.changeSpin4F(BookingID21 , "Spin Evening Session on the 4th of september");
                        alt.AltOpt2();
                        break;
                    case 22:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc22 = new Scanner(System.in);
                        String BookingID22 = changeInc22.nextLine();
                        ft.changeSpin11F(BookingID22 , "Spin Evening Session on the 11th of september");
                        alt.AltOpt2();
                        break;
                    case 23:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc23 = new Scanner(System.in);
                        String BookingID23 = changeInc23.nextLine();
                        ft.changeSpin18F(BookingID23 , "Spin Evening Session on the 18th of september");
                        alt.AltOpt2();
                        break;
                    case 24:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc24 = new Scanner(System.in);
                        String BookingID24 = changeInc24.nextLine();
                        ft.changeSpin25F(BookingID24 , "Spin Evening Session on the 25th of september");
                        alt.AltOpt2();
                        break;
                    case 25:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc25 = new Scanner(System.in);
                        String BookingID25 = changeInc25.nextLine();
                        ft.changeAquacise5F(BookingID25 , "Aquacise Morning Session on the 5th of september");
                        alt.AltOpt2();
                        break;
                    case 26:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc26 = new Scanner(System.in);
                        String BookingID26 = changeInc26.nextLine();
                        ft.changeAquacise12F(BookingID26 , "Aquacise Morning Session on the 12th of september");
                        alt.AltOpt2();
                        break;
                    case 27:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc27 = new Scanner(System.in);
                        String BookingID27 = changeInc27.nextLine();
                        ft.changeAquacise19F(BookingID27 , "Aquacise Morning Session on the 19th of september");
                        alt.AltOpt2();
                        break;
                    case 28:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc28 = new Scanner(System.in);
                        String BookingID28 = changeInc28.nextLine();
                        ft.changeAquacise26F(BookingID28 , "Aquacise Morning Session on the 26th of september");
                        alt.AltOpt2();
                        break;
                    case 29:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc29 = new Scanner(System.in);
                        String BookingID29 = changeInc29.nextLine();
                        ft.changeZumba5F(BookingID29 , "Zumba Evening Session on the 5th of september");
                        alt.AltOpt2();
                        break;
                    case 30:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc30 = new Scanner(System.in);
                        String BookingID30 = changeInc30.nextLine();
                        ft.changeZumba12F(BookingID30 , "Zumba Evening Session on the 12th of september");
                        alt.AltOpt2();
                        break;
                    case 31:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc31 = new Scanner(System.in);
                        String BookingID31 = changeInc31.nextLine();
                        ft.changeZumba19F(BookingID31 , "Zumba Evening Session on the 19th of september");
                        alt.AltOpt2();
                        break;
                    case 32:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc32 = new Scanner(System.in);
                        String BookingID32 = changeInc32.nextLine();
                        ft.changeZumba26F(BookingID32 , "Zumba Evening Session on the 26th of september");
                        alt.AltOpt2();
                        break;
                    default:
                        System.out.println("No booked session for the selected period \n");
                        alt.AltOpt1();
                }
            }
            catch (InputMismatchException e) {
                    System.out.println("This an invalid input ::: You will be redirected for other options \n \n \n ");
                    alt.AltOpt1();
            }

        }
        else if (changeOp == 2) {

            System.out.println(
                            "\n              7th Aug          14 Aug          21 Aug          28 Aug       " +
                            "\n Morning:     1.Yoga           2.Yoga          3.Yoga          4.Yoga       " +
                            "\n Price          £ 21             £ 21            £ 21            £ 21       " +
                            "\n Evening:     5.Spin           6.Spin          7.Spin          8.Spin       " +
                            "\n Price          £ 25             £ 25            £ 25            £ 25     \n" +


                            "                8th Aug          15 Aug          22 Aug          29 Aug       " +
                            "\n Morning:     9.Aquacise       10.Aquacise     11.Aquacise     12.Aquacise  " +
                            "\n Price          £ 33             £ 33            £ 33            £ 33       " +
                            "\n Evening:     13.Zumba         14.Zumba        15.Zumba        16.Zumba     " +
                            "\n Price          £ 35             £ 35            £ 35            £ 35     \n" +

                            "\n              4 sept            11 sept          18 Aug          25 sept       " +
                            "\n Morning:     17.Yoga          18.Yoga         19.Yoga         20.Yoga      " +
                            "\n Price          £ 21             £ 21            £ 21            £ 21       " +
                            "\n Evening:     21.Spin          22.Spin         23.Spin         24.Spin    \n" +
                            "\n Price          £ 25             £ 25            £ 25            £ 25       " +

                            "\n              5 sept            12 sept          19 Aug          26 sept       " +
                            "\n Morning:     25.Aquacise      26.Aquacise     27.Aquacise     28.Aquacise  " +
                            "\n Price          £ 33             £ 33            £ 33            £ 33       " +
                            "\n Evening:     29.Zumba         30.Zumba        31.Zumba        32.Zumba   \n" +
                            "\n Price          £ 35             £ 35            £ 35            £ 35     \n");

            System.out.print("Please select the number of date and session you booked for: \n");

            try {
                int cusToCancle = changeIn.nextInt();
                switch (cusToCancle) {
                    case 1:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc1 = new Scanner(System.in);
                        String BookingID1 = changeInc1.nextLine();
                        ft.cancelYoga7thJ(BookingID1 , "Yoga Morning Session on the 7th of August");
                        alt.AltOpt1();
                        break;
                    case 2:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc2 = new Scanner(System.in);
                        String BookingID2 = changeInc2.nextLine();
                        ft.cancelYoga14thJ(BookingID2 , "Yoga Morning Session on the 14th of August");
                        alt.AltOpt1();
                        break;
                    case 3:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc3 = new Scanner(System.in);
                        String BookingID3 = changeInc3.nextLine();
                        ft.cancelYoga21J(BookingID3 , "Yoga Morning Session on the 21th of August");
                        alt.AltOpt1();
                        break;
                    case 4:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc4 = new Scanner(System.in);
                        String BookingID4 = changeInc4.nextLine();
                        ft.cancelYoga28J(BookingID4 , "Yoga Morning Session on the 28th of August");
                        alt.AltOpt1();
                        break;
                    case 5:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc5 = new Scanner(System.in);
                        String BookingID5 = changeInc5.nextLine();
                        ft.cancelSpin7J(BookingID5 , "Sping Evening Session on the 7th of August");
                        alt.AltOpt1();
                        break;
                    case 6:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc6 = new Scanner(System.in);
                        String BookingID6 = changeInc6.nextLine();
                        ft.cancelSpin14J(BookingID6 , "Sping Evening Session on the 14th of August");
                        alt.AltOpt1();
                        break;
                    case 7:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc7 = new Scanner(System.in);
                        String BookingID7 = changeInc7.nextLine();
                        ft.cancelSpin21J(BookingID7 , "Sping Evening Session on the 21th of August");
                        alt.AltOpt1();
                        break;
                    case 8:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc8 = new Scanner(System.in);
                        String BookingID8 = changeInc8.nextLine();
                        ft.cancelSpin28J(BookingID8 , "Sping Evening Session on the 28th of August");
                        alt.AltOpt1();
                        break;
                    case 9:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc9 = new Scanner(System.in);
                        String BookingID9 = changeInc9.nextLine();
                        ft.cancelAquacise8J(BookingID9 , "Aquacise Morning Session on the 8th of August");
                        alt.AltOpt1();
                        break;
                    case 10:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc10 = new Scanner(System.in);
                        String BookingID10 = changeInc10.nextLine();
                        ft.cancelAquacise15J(BookingID10 , "Aquacise Morning Session on the 15th of August");
                        alt.AltOpt1();
                        break;
                    case 11:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc11 = new Scanner(System.in);
                        String BookingID11 = changeInc11.nextLine();
                        ft.cancelAquacise22J(BookingID11 , "Aquacise Morning Session on the 22nd of August");
                        alt.AltOpt1();
                        break;
                    case 12:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc12 = new Scanner(System.in);
                        String BookingID12 = changeInc12.nextLine();
                        ft.cancelAquacise29J(BookingID12 , "Aquacise Morning Session on the 29th of August");
                        alt.AltOpt1();
                        break;
                    case 13:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc13 = new Scanner(System.in);
                        String BookingID13 = changeInc13.nextLine();
                        ft.cancelZumba8J(BookingID13 , "Zumba Evening Session on the 8th of August");
                        alt.AltOpt1();
                        break;
                    case 14:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc14 = new Scanner(System.in);
                        String BookingID14 = changeInc14.nextLine();
                        ft.cancelZumba15J(BookingID14 , "Zumba Evening Session on the 15th of August");
                        alt.AltOpt1();
                        break;
                    case 15:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc15 = new Scanner(System.in);
                        String BookingID15 = changeInc15.nextLine();
                        ft.cancelZumba22J(BookingID15 , "Zumba Evening Session on the 22th of August");
                        alt.AltOpt1();
                        break;
                    case 16:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc16 = new Scanner(System.in);
                        String BookingID16 = changeInc16.nextLine();
                        ft.cancelZumba29J(BookingID16 , "Zumba Evening Session on the 29th of August");
                        alt.AltOpt1();
                        break;
                    case 17:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc17 = new Scanner(System.in);
                        String BookingID17 = changeInc17.nextLine();
                        ft.cancelYoga4F(BookingID17 , "Yoga Morning Session on the 4th of September");
                        alt.AltOpt1();
                        break;
                    case 18:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc18 = new Scanner(System.in);
                        String BookingID18 = changeInc18.nextLine();
                        ft.cancelYoga11F(BookingID18 , "Yoga Morning Session on the 11th of September");
                        alt.AltOpt1();
                        break;
                    case 19:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc19 = new Scanner(System.in);
                        String BookingID19 = changeInc19.nextLine();
                        ft.cancelYoga18F( BookingID19 , "Yoga Morning Session on the 18th of September");
                        alt.AltOpt1();
                        break;
                    case 20:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc20 = new Scanner(System.in);
                        String BookingID20 = changeInc20.nextLine();
                        ft.cancelYoga25F(BookingID20 , "Yoga Morning Session on the 25th of September");
                        alt.AltOpt1();
                        break;
                    case 21:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc21 = new Scanner(System.in);
                        String BookingID21 = changeInc21.nextLine();
                        ft.cancelSpin4F(BookingID21 , "Spin Evening Session on the 4th of September");
                        alt.AltOpt1();
                        break;
                    case 22:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc22 = new Scanner(System.in);
                        String BookingID22 = changeInc22.nextLine();
                        ft.cancelSpin11F(BookingID22 , "Spin Evening Session on the 11th of September");
                        alt.AltOpt1();
                        break;
                    case 23:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc23 = new Scanner(System.in);
                        String BookingID23 = changeInc23.nextLine();
                        ft.cancelYoga18F(BookingID23 , "Spin Evening Session on the 18th of September");
                        alt.AltOpt1();
                        break;
                    case 24:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc24 = new Scanner(System.in);
                        String BookingID24 = changeInc24.nextLine();
                        ft.cancelSpin25F(BookingID24 , "Spin Evening Session on the 25th of September");
                        alt.AltOpt1();
                        break;
                    case 25:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc25 = new Scanner(System.in);
                        String BookingID25 = changeInc25.nextLine();
                        ft.cancelAquacise5F(BookingID25 , "Aquacise Morning Session on the 5th of September");
                        alt.AltOpt1();
                        break;
                    case 26:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc26 = new Scanner(System.in);
                        String BookingID26 = changeInc26.nextLine();
                        ft.cancelAquacise12F(BookingID26 , "Aquacise Morning Session on the 12th of September");
                        alt.AltOpt1();
                        break;
                    case 27:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc27 = new Scanner(System.in);
                        String BookingID27 = changeInc27.nextLine();
                        ft.cancelAquacise19F(BookingID27 , "Aquacise Morning Session on the 19th of September");
                        alt.AltOpt1();
                        break;
                    case 28:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc28 = new Scanner(System.in);
                        String BookingID28 = changeInc28.nextLine();
                        ft.cancelAquacise26F(BookingID28 , "Aquacise Morning Session on the 26th of September");
                        alt.AltOpt1();
                        break;
                    case 29:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc29 = new Scanner(System.in);
                        String BookingID29 = changeInc29.nextLine();
                        ft.cancelZumba5F(BookingID29 , "Zumba Evening Session on the 5th of September");
                        alt.AltOpt1();
                        break;
                    case 30:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc30 = new Scanner(System.in);
                        String BookingID30 = changeInc30.nextLine();
                        ft.cancelZumba12F(BookingID30 , "Zumba Evening Session on the 12th of September");
                        alt.AltOpt1();
                        break;
                    case 31:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc31 = new Scanner(System.in);
                        String BookingID31 = changeInc31.nextLine();
                        ft.cancelZumba19F(BookingID31 , "Zumba Evening Session on the 19th of September");
                        alt.AltOpt1();
                        break;
                    case 32:
                        System.out.println("Enter your Booking ID here. \n");
                        Scanner changeInc32 = new Scanner(System.in);
                        String BookingID32 = changeInc32.nextLine();
                        ft.cancelZumba26F(BookingID32 , "Zumba Evening Session on the 26th of September");
                        alt.AltOpt1();
                        break;
                    default:
                        System.out.println("No booked session for the selected period \n");
                        alt.AltOpt1();
                }
            }
            catch (InputMismatchException e) {
                System.out.println("This an invalid input ::: You will be redirected for other options \n \n \n ");
                alt.AltOpt1();
            }

        }
        else {
            System.out.println(" Invalid Selection, You will be redirected for other options ");
            alt.AltOpt1();
        }

    }

}
