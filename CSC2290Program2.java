package csc2290program2;
//Brandon Engel, 
//2/21/22, 
//brandonengel1006@gmail.com, 
//2290, 
//Program 2, 
//“I will practice academic and personal integrity and excellence of character and expect the same from others."

//this receives my scanner
import java.util.*;

public class CSC2290Program2 {

    ///REMINDER TO PUT COMMENTS INTO MY OWN WORDS
    public static String[] karts = {"Standard Kart", "Pipe Frame", "Mach 8", "Steel Driver", "Cat Cruiser", "Circuit Special", "Tri-Speeder", "Badwagon", "Prancer", "BiddyBuggy", "Landship", "Sneeker", "Sports Coupe", "Gold Standard"};
    public static String[] bikes = {"Standard Bike", "Comet", "Sports Bike", "The Duke", "Flame Rider", "Varmint", "Mr. Scooty", "Jet Bike", "Yoshi Bike"};
    public static String[] ATVs = {"Standard ATV", "Wild Wiggler", "Teddy Buggy"};
    public static String[] chars = {"Mario", "Luigi", "Peach", "Yoshi", "Bowser", "Donkey Kong", "Toad", "Koopa Troopa", "Daisy", "Shy Guy", "Wario", "Waluigi", "Baby Mario", "Baby Luigi", "Baby Peach", "Baby Daisy"};
    public static String[] tracks = {"Sunshine Airport", "Dolphin Shoals", "Electrodrome", "Mount Wario"};
    public static int[] recordTimes = {115, 117, 115, 100};
    public static boolean[] timeTrialPerformed = new boolean[4];
    public static int numPlayer = 0;

    public static void displayMenu() {
        //This shows the menu being displayed when user chooses input
        //no parameters

        System.out.println("---------------------------------------------------------------------\n"
                + "|                FSC eSports - Mario Kart Tournament                |\n"
                + "---------------------------------------------------------------------\n"
                + "| Please choose from the following menu:                            |\n"
                + "|     1. Register a new competitor                                  |\n"
                + "|     2. Search for a competitor by ID number                       |\n"
                + "|     3. Search for a competitor by name                            |\n"
                + "|     4. Perform Time Trial                                         |\n"
                + "|     5. Display Leaderboard                                        |\n"
                + "|     6. Display all competitors                                    |\n"
                + "|     7. Display statistics                                         |\n"
                + "|     8. Quit                                                       |\n"
                + "---------------------------------------------------------------------\n"
                + "Enter your choice: ");
    }

    public static void characterSelection() {
        //based on the option that they chose for displaymenu()
        //this will show the user what characters they can choose
        //no parameters
        System.out.println("---------------------------------------------------------------------\n"
                + "|                        Character Selection                        |\n"
                + "---------------------------------------------------------------------\n"
                + "| Please choose your character:                                     |\n"
                + "|     1.  Mario                                                     |\n"
                + "|     2.  Luigi                                                     |\n"
                + "|     3.  Peach                                                     |\n"
                + "|     4.  Yoshi                                                     |\n"
                + "|     5.  Bowser                                                    |\n"
                + "|     6.  Donkey Kong                                               |\n"
                + "|     7.  Toad                                                      |\n"
                + "|     8.  Koopa Troopa                                              |\n"
                + "|     9.  Daisy                                                     |\n"
                + "|     10. Shy Guy                                                   |\n"
                + "|     11. Wario                                                     |\n"
                + "|     12. Waluigi                                                   |\n"
                + "|     13. Baby Mario                                                |\n"
                + "|     14. Baby Luigi                                                |\n"
                + "|     15. Baby Peach                                                |\n"
                + "|     16. Baby Daisy                                                |\n"
                + "--------------------------------------------------------------------- "
                + "Enter your choice: ");
    }

    public static void vehicleCategory() {
        //based on the option that they chose for characterselection()
        //this will show the user what vehicles they can choose
        //no parameters
        System.out.print("---------------------------------------------------------------------\n"
                + "|                         Vehicle Category                          |\n"
                + "---------------------------------------------------------------------\n"
                + "| Please choose your category of vehicle:                           |\n"
                + "|     1. Kart                                                       |\n"
                + "|     2. Bike                                                       |\n"
                + "|     3. ATV                                                        |\n"
                + "--------------------------------------------------------------------- "
                + "Enter your choice: ");
    }

    public static void cartSelection() {
        //based on the option that they chose for vehiclecategory()
        //this will show the user what karts they can choose
        //no parameters
        System.out.println("---------------------------------------------------------------------\n"
                + "|                          Kart Selection                           |\n"
                + "---------------------------------------------------------------------\n"
                + "| Please choose your Kart:                                          |\n"
                + "|     1.  Standard Kart                                             |\n"
                + "|     2.  Pipe Frame                                                |\n"
                + "|     3.  Mach 8                                                    |\n"
                + "|     4.  Steel Driver                                              |\n"
                + "|     5.  Cat Cruiser                                               |\n"
                + "|     6.  Circuit Special                                           |\n"
                + "|     7.  Tri-Speeder                                               |\n"
                + "|     8.  Badwagon                                                  |\n"
                + "|     9.  Prancer                                                   |\n"
                + "|     10. BiddyBuggy                                                |\n"
                + "|     11. Landship                                                  |\n"
                + "|     12. Sneeker                                                   |\n"
                + "|     13. Sports Coupe                                              |\n"
                + "|     14. Gold Standard                                             |\n"
                + "--------------------------------------------------------------------- "
                + "Enter your choice: ");
    }

    public static void bikeSelection() {
        //based on the option that they chose for vehiclecategory()
        //this will show the user what bikes they can choose
        //no parameters
        System.out.print("---------------------------------------------------------------------\n"
                + "|                          Bike Selection                           |\n"
                + "---------------------------------------------------------------------\n"
                + "| Please choose your Bike:                                          |\n"
                + "|     1. Standard Bike                                              |\n"
                + "|     2. Comet                                                      |\n"
                + "|     3. Sports Bike                                                |\n"
                + "|     4. The Duke                                                   |\n"
                + "|     5. Flame Rider                                                |\n"
                + "|     6. Varmint                                                    |\n"
                + "|     7. Mr. Scooty                                                 |\n"
                + "|     8. Jet Bike                                                   |\n"
                + "|     9. Yoshi Bike                                                 |\n"
                + "--------------------------------------------------------------------- "
                + "Enter your choice:");
    }

    public static void atvSelection() {
        //based on the option that they chose for vehiclecategory()
        //this will show the user what bikes they can choose
        //no parameters
        System.out.println("---------------------------------------------------------------------\n"
                + "|                          ATV Selection                            |\n"
                + "---------------------------------------------------------------------\n"
                + "| Please choose your ATV:                                          |\n"
                + "|     1. Standard ATV                                               |\n"
                + "|     2. Wild Wiggler                                               |\n"
                + "|     3. Teddy Buggy                                                |\n"
                + "---------------------------------------------------------------------"
                + "Enter your choice: ");
    }

    public static int readAndVerifyChoice(Scanner in, int numChoices) {
        //this while loop is checking your choices to see if the user picks a number outside of 8
        // This method uses a loop to repeatedly scan the user’s choice as a String. 
        //and that it contains only digits. You only break out of the loop once a valid choice is entered. 
        //And once you have this valid choice, you then RETURN this choice, as an int value, back to where you called this method from.

        while (true) {
            String input = in.nextLine();
            if (containsOnlyDigits(input)) {
                int num = Integer.parseInt(input);
                if (num <= numChoices) {
                    return num;
                } else if (num > numChoices) {
                    System.out.println(String.format("Invalid selection. Your choice must be a number between 1 and %d.\n", numChoices)
                            + "Please try again.");
                }
            } else {
                System.out.println(String.format("Invalid selection. Your choice must be a number between 1 and %d.\n", numChoices)
                        + "Please try again.");
            }
        }
        // if the number is only 1 digit, it's now returning 
        // an integer after receiving a string
    }

    public static boolean containsOnlyDigits(String input) {
        //this checks to see how many inputs you make and checks to 
        //make sure each input is a digit
        //if their is a single letter or non digit, it will return false 
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int readAndVerifyID(Scanner in) {
        //validate the user-inputted value as being a valid ID 
        //number, which should be length 7 and contain only digits.

        System.out.println("Enter the ID of the competitors: ");
        String ID = in.nextLine();
        while (true) {
            if (ID.length() >= 7 && containsOnlyDigits(ID)) {
                return Integer.parseInt(ID);
                } else {
                    System.out.println("Invalid entry. Please try again.");
                    System.out.println("Enter the ID of the competitors: ");
                    ID = in.nextLine();
                }
            }
        }

    public static String readAndVerifyName(Scanner in) {
        // This code validates the user-inputted value as being a valid name, 
        //at least length 2 and contains ONLY letters, spaces, or dashes. 
        //Make sure the input contains only letters, spaces, 
        //or dashes. The user input is returned to the call as an String when it's verified.
        String name;
        while (true) {
            name = in.nextLine();
            boolean isValid = true;
            if (name.length() >= 2) {
                if (name.length() <= 20) {
                    for (int i = 0; i < name.length(); i++) {
                        if (name.charAt(i) == ' ') {
                            continue;
                        } else if (name.charAt(i) == '-') {
                            continue;
                        } else if (Character.isLetter(name.charAt(i)) == true) {
                            continue;
                        } else {
                            System.out.println("Invalid entry. Name must be between 2 and 20 characters and\n"
                                    + "may only contain letters, spaces, or dashes. Please try again. ");
                        }
                    }
                    if (isValid == true) {
                        return name;
                    }
                }
            } else {
                System.out.println("Invalid entry. Name must be between 2 and 20 characters and\n"
                        + "may only contain letters, spaces, or dashes. Please try again. ");
                continue;
            }
        }
    }

    public static void registerCompetitor(int[] id, String[] firstName, String[] lastName, String[] character, String[] vehicle, int[][] times, int count, Scanner in) {
        //This method scans the ID, first name, and last name from the user using 
        //the mentioned readAndVerify methods. this helps the user select character and vehile
        //Then method prints a message indicating successful registration.

        int categoryVehicle = 0;
        int vehicleSelect = 0;
        int characterSelect = 0;

        id[count] = readAndVerifyID(in);
        System.out.println("Enter a first name of the competitor");
        firstName[count] = readAndVerifyName(in);
        System.out.println("Enter a last name of the competitor");
        lastName[count] = readAndVerifyName(in);
        characterSelection();
        characterSelect = readAndVerifyChoice(in, 16);
        character[count] = chars[characterSelect - 1];
        vehicleCategory();
        categoryVehicle = readAndVerifyChoice(in, 3);

        if (categoryVehicle == 1) {
            cartSelection();
            vehicleSelect = readAndVerifyChoice(in, 14);
            vehicle[count] = karts[vehicleSelect - 1];
        } else if (categoryVehicle == 2) {
            bikeSelection();
            vehicleSelect = readAndVerifyChoice(in, 9);
            vehicle[count] = bikes[vehicleSelect - 1];
        } else if (categoryVehicle == 3) {
            atvSelection();
            vehicleSelect = readAndVerifyChoice(in, 3);
            vehicle[count] = ATVs[vehicleSelect - 1];
        }
        System.out.print("You have successfully registered the following competitor: \n");
        System.out.printf("%s %s (ID: %d)\n", firstName[count], lastName[count], id[count]);
        System.out.printf("Character: %s\n", character[count]);
        System.out.printf("Vehicle: %s\n", vehicle[count]);
        numPlayer++;
    }

    public static void searchByID(int[] id, String[] firstName, String[] lastName, String[] character, String[] vehicle, int[][] times, int numCompetitors, Scanner in) {
        //This method scans an ID to search for readAndVerifyID and then searches the
        //id[] array for a matching value. If found, the details about the competitor are shown. 
        //If not, an invalid statement is printed.
        int ID = readAndVerifyID(in);
        int index = -1;
        String first;
        String last;
        String chara;
        String veh;
        int time[] = new int[4];
        boolean found = false;
        System.out.println("Enter the ID of the competitor: ");
        // this finds out the index of the id that the user inputted
        //this loops over all of the ids
        for (int i = 0; i < id.length; i++) {
            // the variable ID is and the index of the id are equal, 
            // the competitor being found is a true statement.
            if (ID == id[i]) {
                found = true;
                index = i;
                // index is how the user's firstname is found.
                first = firstName[index];
                last = lastName[index];
                chara = character[index];
                veh = vehicle[index];
                time = times[index];
            }
        }
        if (found) {
            System.out.println("Competitor was successfully found! ");
            System.out.println(firstName[index]);
        } else {
            System.out.println("The competitor is not found!");
        }

    }

    public static void searchByName(int[] id, String[] firstName, String[] lastName, String[] character, String[] vehicle, int[][] times, int numCompetitors, Scanner in, int count) {
        //This scans first name and last name and then searches their arrays for a matching value. 
        //If found, the details about the competitor are shown. 
        //If not, an invalid statement is printed.
        String name = readAndVerifyName(in);
        String name1 = readAndVerifyName(in);
        boolean found = false;
        for (int i = 0; i < firstName.length; i++) {
            if (name.equals(firstName[i]) && name1.equals(lastName[i])) {
                System.out.printf("Competitor successfully found! \nName:%s  %s \nID:%s \nCharacter: %s \n", firstName[i], lastName[i], id[i], character[i], vehicle[i]);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("No competitor with that ID found.");
        }
    }

    public static void performTimeTrial(int[][] times, int numCompetitors, Scanner in, Random rng) {
        //This simulates the time trials for ALL registered competitors. 
        //The method asks the user to select a track.
        //The inputted choice is read via the readAndVerifyChoice(). 
        //Once a number from 1 to 4 is inputted, a loop assigns new times for each competitor. 
        //The newly assigned times are generated randomly by current world record track and then add 29 seconds to it 
        //The current world record times are in the started template code.
        //timer  

        System.out.println("---------------------------------------------------------------------\n"
                + "|                   Track Selection for Time Trial                  |\n"
                + "---------------------------------------------------------------------\n"
                + "| Please select the track for the time trial:                       |\n"
                + "|     1. Sunshine Airport                                           |\n"
                + "|     2. Dolphin Shoals                                             |\n"
                + "|     3. Electrodrome                                               |\n"
                + "|     4. Mount Wario                                                |\n"
                + "---------------------------------------------------------------------\n"
                + "Enter your choice: ");

        int Num = readAndVerifyChoice(in, 4);
        for (int i = 0; i < numPlayer; i++) {
            if (Num == 1) {

                int temp = recordTimes[0] + rng.nextInt(1, 29);
                if (times[i][0] == 0) {
                    times[i][0] = temp;
                } else if (times[i][0] > temp) {
                    times[i][0] = temp;
                }
            } else if (Num == 2) {

                int temp = recordTimes[1] + rng.nextInt(1, 29);
                if (times[i][1] == 0) {
                    times[i][1] = temp;
                } else if (times[i][1] > temp) {
                    times[i][1] = temp;
                }
            } else if (Num == 3) {

                int temp = recordTimes[2] + rng.nextInt(1, 29);
                if (times[i][2] == 0) {
                    times[i][2] = temp;
                } else if (times[i][2] > temp) {
                    times[i][2] = temp;
                }
            } else if (Num == 4) {

                int temp = recordTimes[3] + rng.nextInt(1, 29);
                if (times[i][3] == 0) {
                    times[i][3] = temp;
                } else if (times[i][3] > temp) {
                    times[i][3] = temp;
                }
            }
        }
        System.out.printf("All competitors have new times recorded for %s\n", tracks[Num - 1]);
    }

    public static void displayLeaderBoard(int[] id, String[] firstName, String[] lastName, String[] character, String[] vehicle, int[][] times, int numCompetitors) {
        //This determines the best recorded time in each track and who did it.
        //Their could be multiple winners on record. so they should all be printed.
        //If the track doesn't have a timed trial,there should be a print statement
        //explaining so.

        System.out.println("Leaderboard: ");

        int storesun = Integer.MAX_VALUE;
        int bestsun = -1;
        int storedolph = Integer.MAX_VALUE;
        int bestdolph = -1;
        int storeelect = Integer.MAX_VALUE;
        int bestelect = -1;
        int storewario = Integer.MAX_VALUE;
        int bestwario = -1;
        for (int i = 0; i < times.length; i++) {
            if (times[i][0] != 0 && storesun > times[i][0]) {
                storesun = times[i][0];
                bestsun = i;
            }
            if (times[i][1] != 0 && storedolph > times[i][1]) {
                storedolph = times[i][1];
                bestdolph = i;
            }
            if (times[i][2] != 0 && storeelect > times[i][2]) {
                storeelect = times[i][2];
                bestelect = i;
            }
            if (times[i][3] != 0 && storewario > times[i][3]) {
                storewario = times[i][3];
                bestwario = i;
            }
        }
        if (bestsun == -1) {
            System.out.println("\t\tno time trials recorded");
        } else {
            System.out.printf("Sunshine Airport\n"
                    + "      %s %s (ID: %s)\n"
                    + "      Character: %s\n"
                    + "      Vehicle:   %s\n"
                    + "      Time:      %s\n", firstName[bestsun], lastName[bestsun], id[bestsun], character[bestsun], vehicle[bestsun], storesun);
        }
        if (bestdolph == -1) {
            System.out.println("\t\tno time trials recorded");
        } else {
            System.out.printf("Dolphin Shoals\n"
                    + "      %s %s (ID: %s)\n"
                    + "      Character: %s\n"
                    + "      Vehicle:   %s\n"
                    + "      Time:      %s\n", firstName[bestdolph], lastName[bestdolph], id[bestdolph], character[bestdolph], vehicle[bestdolph], storedolph);
        }
        if (bestelect == -1) {
            System.out.println("\t\tno time trials recorded");
        } else {
            System.out.printf("Electro Dome\n"
                    + "      %s %s (ID: %s)\n"
                    + "      Character: %s\n"
                    + "      Vehicle:   %s\n"
                    + "      Time:      %s\n", firstName[bestelect], lastName[bestelect], id[bestelect], character[bestelect], vehicle[bestelect], storeelect);
        }
        if (bestwario == -1) {
            System.out.println("\t\tno time trials recorded");
        } else {
            System.out.printf("Mount Wario\n"
                    + "      %s %s (ID: %s)\n"
                    + "      Character: %s\n"
                    + "      Vehicle:   %s\n"
                    + "      Time:      %s\n", firstName[bestwario], lastName[bestwario], id[bestwario], character[bestwario], vehicle[bestwario], storewario);
        }
    }

    public static void displayAllCompetitors(int[] id, String[] firstName, String[] lastName, String[] character, String[] vehicle, int numCompetitors) {
        //This loops over the competitors and prints the information 
        //from the sample. 

        System.out.println("Competitors registered in the system: ");

        for (int i = 0; i < numPlayer; i++) {
            System.out.printf("%d. %s %s (id: %d)\n", i + 1, firstName[i], lastName[i], id[i]);
            System.out.printf("Character: %s\n", character[i]);
            System.out.printf("Vehicle: %s\n", vehicle[i]);
        }
    }

    public static void displayStatistics(int[][] times, int numCompetitors) {
        //This computes the average time trial for each track. If a
        //track had 23 competitors record a time trial, those 23 
        //competitors are added and then / by 23.0 and is displayed.
        //Also know when tracks don't have any timed trials..
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        for (int i = 0; i < times.length; i++) {
            sum1 += times[i][0];
            sum2 += times[i][1];
            sum3 += times[i][2];
            sum4 += times[i][3];
        }
            double avg1 = sum1 / numCompetitors;
            double avg2 = sum2 / numCompetitors;
            double avg3 = sum3 / numCompetitors;
            double avg4 = sum4 / numCompetitors;
 
            double variable = avg1 / 60;

            if (avg1 == 0 && avg2 == 0 && avg3 == 0 && avg4 == 0) {
                System.out.println("There are no statistics recorded, as there are no\n"
                        + "competitors currently registered in the system.\n");

                System.out.println("Statistics of Completed Time Trials - Average Time per Track\n"
                        + "      Sunshine Airport: no time trials recorded\n"
                        + "      Dolphin Shoals:   no time trials recorded\n"
                        + "      Electrodrome:     no time trials recorded\n"
                        + "      Mount Wario:      no time trials recorded\n");
            } 
            if (avg1 != 0) {
                System.out.printf("Statistics of Completed Time Trials - Average Time per Track\n"
                        + "      Sunshine Airport: %.2f\"\n"
                        + "      Dolphin Shoals:   \n"
                        + "      Electrodrome:     \n"
                        + "      Mount Wario:      \n", avg1, avg1 % 60);
            } 
            if (avg2 != 0) {
                System.out.printf("Statistics of Completed Time Trials - Average Time per Track\n"
                        + "      Sunshine Airport: \n"
                        + "      Dolphin Shoals:   %.2f\"\n"
                        + "      Electrodrome:     \n"
                        + "      Mount Wario:      \n", avg2, avg2% 60);
            } 
            if (avg3 != 0) {
                System.out.printf("Statistics of Completed Time Trials - Average Time per Track\n"
                        + "      Sunshine Airport: \n"
                        + "      Dolphin Shoals:   \n"
                        + "      Electrodrome:     %.2f\"\n"
                        + "      Mount Wario:      \n", avg3, avg3 % 60);

            } 
            if (avg4 != 0) {
                System.out.printf("Statistics of Completed Time Trials - Average Time per Track\n"
                        + "      Sunshine Airport: \n"
                        + "      Dolphin Shoals:   \n"
                        + "      Electrodrome:     \n"
                        + "      Mount Wario:      %.2f\"\n", avg4, avg4 % 60);
            }
        }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the seed for the random number generator.");
        Scanner in = new Scanner(System.in);
        int x = Integer.parseInt(in.nextLine());
        System.out.println("Enter the maximum number of competitors");
        int y = Integer.parseInt(in.nextLine());

        int[] id = new int[y];
        String[] firstName = new String[1];
        String[] lastName = new String[1];
        String[] character = new String[1];
        String[] vehicle = new String[1];
        int[][] times = new int[4][4];
        Random rng = new Random(555);

        while (true) {
            displayMenu();
            int numChoices = readAndVerifyChoice(in, 8);
            // perform appropriate action based on user's choice
            if (numChoices == 1) {
                registerCompetitor(id, firstName, lastName, character, vehicle, times, numPlayer, in);

            } else if (numChoices == 2) {
                readAndVerifyID(in);
                searchByID(id, firstName, lastName, character, vehicle, times, numChoices, in);

            } else if (numChoices == 3) {
                searchByName(id, firstName, lastName, character, vehicle, times, numChoices, in, numPlayer);

            } else if (numChoices == 4) {
                performTimeTrial(times, numChoices, in, rng);

            } else if (numChoices == 5) {
                displayLeaderBoard(id, firstName, lastName, character, vehicle, times, numPlayer);

            } else if (numChoices == 6) {
                displayAllCompetitors(id, firstName, lastName, character, vehicle, numChoices);

            } else if (numChoices == 7) {
                displayStatistics(times, numChoices);

            } else if (numChoices == 8) {
                System.out.print("Goodbye!");
                break;
            }
        }
    }
}
