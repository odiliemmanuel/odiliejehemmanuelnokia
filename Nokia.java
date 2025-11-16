import java.util.Scanner;

public class Nokia {

    public static void main(String... ODILI) {

        menu();
    }

    
    public static void menu(){

        Scanner input = new Scanner(System.in);

        String menu = """
                WELCOME TO NOKIA TS259
                Kindly, select an option:
                1. Phonebook
                2. Messages
                3. Chat
                4. Call Register
                5. Tones
                6. Settings
                7. Call divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM services
                """;

        System.out.println(menu);
        System.out.print("Enter any number from 1 - 13: ");
        String menuOptions = input.next();

        switch (menuOptions) {

            case "1":
                System.out.println("Phonebook");
                String phoneBookMenu = """
                        PHONE BOOK
                        1. Search
                        2. Service Nos
                        3. Add name
                        4. Erase
                        5. Edit
                        6. Assign tone
                        7. Send b'card
                        8. Options
                        9. Speed dials
                        10. Voice tags
                        """;
                System.out.println(phoneBookMenu);
                System.out.print("Enter any number from 1 - 10: ");
                String phonebookOptions = input.next();

                switch (phonebookOptions) {
                    case "1": System.out.println("Search"); menu();
                    case "2": System.out.println("Service Nos"); menu();
                    case "3": System.out.println("Add name"); menu();
                    case "4": System.out.println("Erase"); menu();
                    case "5": System.out.println("Edit"); menu();
                    case "6": System.out.println("Assign tone"); menu();
                    case "7": System.out.println("Send b'card"); menu();
                    case "8":
                        System.out.println("Options");
                        String option = """
                                1. Type of view
                                2. Memory status
                                """;
                        System.out.println(option);
                        menu();
                    case "9": System.out.println("Speed dials"); menu();
                    case "10": System.out.println("Voice tags"); menu();
                    default: System.out.println("Wrong input, please select the correct option");
                }
                menu();


            case "2":
                System.out.println("Messages");
                String messagingMenu = """
                        MESSAGES
                        1. Write messages
                        2. Inbox
                        3. Outbox
                        4. Picture messages
                        5. Templates
                        6. Smileys
                        7. Messages settings
                        8. Info service
                        9. Voice mailbox number
                        10. Service command editor
                        """;
                System.out.println(messagingMenu);
                System.out.print("Enter any number from 1 - 10: ");
                String messagingOptions = input.next();

                switch (messagingOptions) {
                    case "1": System.out.println("Write messages"); menu();
                    case "2": System.out.println("Inbox"); menu();
                    case "3": System.out.println("Outbox"); menu();
                    case "4": System.out.println("Picture messages"); menu();
                    case "5": System.out.println("Templates"); menu();
                    case "6": System.out.println("Smileys"); menu();

                    case "7":  
                        System.out.println("Message settings");
                        String messageMenu = """
                                MESSAGING SETTINGS
                                1. Set One
                                2. Common Three
                                """;
                        System.out.println(messageMenu);
                        System.out.print("Enter number 1 - 2: ");
                        String messageOptions = input.next();

                        switch (messageOptions) {

                            case "1":
                                System.out.println("Set One");
                                String setMenu = """
                                        MESSAGE CENTER
                                        1. Message centre number
                                        2. Messages sent as
                                        3. Messages validity
                                        """;
                                System.out.println(setMenu);
                                System.out.print("Enter any number from 1 - 3: ");
                                String setOptions = input.next();

                                switch (setOptions) {
                                    case "1": System.out.println("Message centre number"); menu();
                                    case "2": System.out.println("Messages sent as"); menu();
                                    case "3": System.out.println("Messages validity"); menu();
                                    default: System.out.println("Wrong input");
                                }
                                menu();

                            case "2":
                                System.out.println("Common Three");
                                String commonMenu = """
                                        FEEDBACK CENTRE
                                        1. Delivery reports
                                        2. Reply via same centre
                                        3. Character support
                                        """;
                                System.out.println(commonMenu);
                                System.out.print("Enter any number from 1 - 3: ");
                                String commonOptions = input.next();

                                switch (commonOptions) {
                                    case "1": System.out.println("Delivery reports"); menu();
                                    case "2": System.out.println("Reply via same centre"); menu();
                                    case "3": System.out.println("Character support"); menu();
                                    default: System.out.println("Wrong input");
                                }
                                menu();

                            default:
                                System.out.println("Wrong input");
                        }
                        menu();

                    case "8": System.out.println("Info service"); menu();
                    case "9": System.out.println("Voice mailbox number"); menu();
                    case "10": System.out.println("Service command editor"); menu();
                    default: System.out.println("Wrong input");
                }
                menu();


            case "3": System.out.println("Chat"); menu();
            case "4":
                     System.out.println("Call Register"); 
                      String callMenu = """
                        CALL REGISTER
                        1. Missed calls
                        2. Received calls
                        3. Dialled numbers
                        4. Erase recent calls lists
                        5. Show call duration
                        6. Show call costs
                        7. Call cost settings
                        8. Prepaid credit
                       """;
        
                          System.out.println(callMenu);
                          System.out.println("Enter any numbers from 1 - 8"); 
                          String callOptions = input.next();


                            switch(callOptions) {
                               case "1": System.out.println("Missed calls"); menu();
                               case "2": System.out.println("Received calls"); menu();
                               case "3": System.out.println("Dialled numbers"); menu();
                               case "4": System.out.println("Erase recent calls lists"); menu();
                               case "5": 
                                        System.out.println("Show call durations");
                                            String durationMenu = """
                                            DURATION 
                                            1. Last call duration
                                            2. All calls' duration
                                            3. Received calls' duration
                                            4. Dialled calls' duration
                                            5. Clear timers
                                            """;
            
                                            System.out.println(durationMenu);
                                            System.out.println("Enter any number between 1 - 5");
                                            String durationOptions = input.next();

                                                switch(durationOptions) {
                                                    case "1": System.out.println("Last call duration"); menu();
                                                    case "2": System.out.println("All calls's duration"); menu();
                                                    case "3": System.out.println("Received call's duration"); menu();
                                                    case "4": System.out.println("Dialled call's duration"); menu();
                                                    case "5": System.out.println("Clear timers"); menu();
                                                    default: System.out.println("Wrong input");
                                                    }
                                   menu();

                                case "6": 
                                        System.out.println("Show call costs");
                                        String callCostMenu = """
                                        CALL COST
                                        1. Last call cost
                                        2. All calls' cost
                                        3. Clear counters
                                        """;
                    
                                        System.out.println(callCostMenu);
                                        System.out.println("Enter any number between 1 - 3");
                                        String callCostOptions = input.next();

                                            switch(callCostOptions) {
                                                case "1": System.out.println("Last call cost"); menu();
                                                case "2": System.out.println("All calls' cost"); menu();
                                                case "3": System.out.println("Clear counters"); menu();
                                                 default: System.out.println("Wrong input");

                                                }
                                       menu();

                                case "7": 
                                          System.out.println("Call cost settings");
                                           String costSettings = """
                                            COST SETTINGS
                                             1. Cost cost limit
                                             2. Show costs in
                                            """;

                                            System.out.println(costSettings);
                                            System.out.println("Enter any number between 1 - 2");
                                            String costSettingOptions = input.next();

                                                switch(costSettingOptions) {
                                                    case "1": System.out.println("Cost cost limit"); menu();
                                                    case "2": System.out.println("Show costs in"); menu();
                                                     default: System.out.println("Wrong input");
                                                     }
                                                     menu();
                                    case "8": System.out.println("Prepaid credit"); menu();
                            }


                       
                            case "5" :
                                System.out.println("Tones");
                                String ringingTones = """
                                 PHONE TONES
                                1. Ringing tones
                                2. Ringing volume
                                3. Incoming call alert
                                4. Composer
                                5. Message alert tones
                                6. Keypad tones
                                7. Warming and game tones
                                8. Vibrating alert
                                9. Screen saver
                                """;

                            System.out.println(ringingTones);
                            System.out.println("Enter any number from 1 - 9");
                            String tonesOptions = input.next();

                                switch(tonesOptions) {
                                    case "1": System.out.println("Ringing tones"); menu();
                                    case "2": System.out.println("Ringing volume"); menu();
                                    case "3": System.out.println("Incoming call alert"); menu();
                                    case "4": System.out.println("Composer"); menu();
                                    case "5": System.out.println("Message alert tones"); menu();
                                    case "6": System.out.println("Keypad tones"); menu();
                                    case "7": System.out.println("Warming and game tones"); menu();
                                    case "8": System.out.println("Vibrating alert"); menu();
                                    case "9": System.out.println("Screen saver"); menu();
                             }
                             menu();

                case "6" :
                    System.out.println("Settings"); 
                    String phoneControls = """
                    SETTINGS
                    1. Call settings
                    2. Phone settings
                    3. Security settings
                    4. Restore factory settings
                    """;

                        System.out.println(phoneControls);
                        System.out.println("Enter any number from 1 - 4");
                        String controlOptions = input.next();

                            switch(controlOptions) {
                                case "1": 
                                        System.out.println("Call settings"); 
                                        String lineSettings = """
                                        LINE SETTINGS
                                        1. Automatic redial
                                        2. Speed dialling
                                        3. Call waiting options
                                        4. Own number sending
                                        5. Phone line in use
                                        6. Automatic answer
                                        """;
                                        
                                            System.out.println(lineSettings);
                                            System.out.println("Enter any number from 1 - 6");
                                            String lineOptions = input.next();

                                                switch(lineOptions) {
                                                    case "1": System.out.println("Automatic redial"); menu();
                                                    case "2": System.out.println("Speed dialling"); menu();
                                                    case "3": System.out.println("Call waiting options"); menu();
                                                    case "4": System.out.println("Own number sending"); menu();
                                                    case "5": System.out.println("Phone line in use"); menu();
                                                    case "6": System.out.println("Automatic answer"); menu();
                                                }                                 
                                               menu();

                                case "2": 
                                System.out.println("Phone settings");
                                String phoneSettings = """
                                PHONE SETTINGS
                                1. Language
                                2. Cell info display
                                3. Welcome note
                                4. Network selection
                                5. Lights
                                6. Confirm SIM service actions
                                """;
            
                                    System.out.print(phoneSettings);
                                    System.out.print("Enter any number from 1 6");
                                    String phoneSettingOptions = input.next();

                                        switch(phoneSettingOptions) {
                                            case "1": System.out.println("Language"); menu();
                                            case "2": System.out.println("Cell info display"); menu();
                                            case "3": System.out.println("Welcome note"); menu();
                                            case "4": System.out.println("Network selection"); menu();
                                            case "5": System.out.println("Lights"); menu();
                                            case "6": System.out.println("Confirm SIM service actions"); menu();
                                            }
                                             menu();
                                case "3":
                                         System.out.println("Security settings"); 
                                         String securitySettings = """
                                         SECURITY SETTINGS
                                         1. PIN code request
                                         2. Call barring service
                                         3. Fixed dialling
                                         4. Closed user group
                                         5. Phone security
                                         6. Change access codes
                                         """;

                                            System.out.println(securitySettings);
                                            System.out.println("Enter any number from 1 - 6");
                                            String securitySettingsOptions = input.next();

                                                switch(securitySettingsOptions) {
                                                    case "1": System.out.println("PIN code request"); menu();
                                                    case "2": System.out.println("Call barring service"); menu();
                                                    case "3": System.out.println("Fixed dialling"); menu();
                                                    case "4": System.out.println("Closed user group"); menu();
                                                    case "5": System.out.println("Phone security"); menu();
                                                    case "6": System.out.println("Change access codes"); menu();
                                               }
                                               menu();
                                case "4": System.out.println("Restore factory settings"); menu();             
                           }
                           menu();



                case "7" :
                    System.out.println("Call divert"); menu();
                case "8" :
                    System.out.println("Games"); menu();
                 case "9":
                    System.out.println("Calculator"); menu();
                case "10" :
                    System.out.println("Reminders"); menu();


                case "11" :
                           System.out.println("Clock");
                           String clockSettings = """
                            CLOCK
                            1. Alarm clock
                            2. Clock settings
                            3. Date setting
                            4. Stopwatch
                            5. Countdown timer
                            6. Auto update of date and time
                            """;

                                System.out.println(clockSettings);
                                System.out.println("Enter any number from 1 - 6");
                                String clockSettingsOptions = input.next();

                                    switch(clockSettingsOptions) {
                                        case "1": System.out.println("Alarm clock"); menu();
                                        case "2": System.out.println("Clock settings"); menu();
                                        case "3": System.out.println("Date setting"); menu();
                                        case "4": System.out.println("Stopwatch"); menu();
                                        case "5": System.out.println("Countdown timer"); menu();
                                        case "6": System.out.println("Auto update of date and time"); menu();
                                    }
                                    menu();
                case "12" :
                    System.out.println("Profiles"); menu();
                case "13" :
                    System.out.println("SIM services"); menu();
                              
                    
          }
      }
}
                

             
                   
                               



