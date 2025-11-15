import java.util.Scanner;

public class NokiaMenu {

    public static void main(String... ODILI) {

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
                    case "1": System.out.println("Search"); break;
                    case "2": System.out.println("Service Nos"); break;
                    case "3": System.out.println("Add name"); break;
                    case "4": System.out.println("Erase"); break;
                    case "5": System.out.println("Edit"); break;
                    case "6": System.out.println("Assign tone"); break;
                    case "7": System.out.println("Send b'card"); break;
                    case "8":
                        System.out.println("Options");
                        String option = """
                                1. Type of view
                                2. Memory status
                                """;
                        System.out.println(option);
                        break;
                    case "9": System.out.println("Speed dials"); break;
                    case "10": System.out.println("Voice tags"); break;
                    default: System.out.println("Wrong input, please select the correct option");
                }
                break;


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
                    case "1": System.out.println("Write messages"); break;
                    case "2": System.out.println("Inbox"); break;
                    case "3": System.out.println("Outbox"); break;
                    case "4": System.out.println("Picture messages"); break;
                    case "5": System.out.println("Templates"); break;
                    case "6": System.out.println("Smileys"); break;

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
                                    case "1": System.out.println("Message centre number"); break;
                                    case "2": System.out.println("Messages sent as"); break;
                                    case "3": System.out.println("Messages validity"); break;
                                    default: System.out.println("Wrong input");
                                }
                                break;

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
                                    case "1": System.out.println("Delivery reports"); break;
                                    case "2": System.out.println("Reply via same centre"); break;
                                    case "3": System.out.println("Character support"); break;
                                    default: System.out.println("Wrong input");
                                }
                                break;

                            default:
                                System.out.println("Wrong input");
                        }
                        break;

                    case "8": System.out.println("Info service"); break;
                    case "9": System.out.println("Voice mailbox number"); break;
                    case "10": System.out.println("Service command editor"); break;
                    default: System.out.println("Wrong input");
                }
                break;


            case "3": System.out.println("Chat"); break;
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
                               case "1": System.out.println("Missed calls"); break;
                               case "2": System.out.println("Received calls"); break;
                               case "3": System.out.println("Dialled numbers"); break;
                               case "4": System.out.println("Erase recent calls lists"); break;
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
                                                    case "1": System.out.println("Last call duration"); break;
                                                    case "2": System.out.println("All calls's duration"); break;
                                                    case "3": System.out.println("Received call's duration"); break;
                                                    case "4": System.out.println("Dialled call's duration"); break;
                                                    case "5": System.out.println("Clear timers"); break;
                                                    default: System.out.println("Wrong input");
                                                    }
                                                     break;

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
                                                case "1": System.out.println("Last call cost"); break;
                                                case "2": System.out.println("All calls' cost"); break;
                                                case "3": System.out.println("Clear counters"); break;
                                                 default: System.out.println("Wrong input");

                                                }
                                                break;

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
                                                    case "1": System.out.println("Cost cost limit"); break;
                                                    case "2": System.out.println("Show costs in"); break;
                                                     default: System.out.println("Wrong input");
                                                     }
                                                     break;
                                    case "8": System.out.println("Prepaid credit"); break;

             case "5" :
                System.out.println("Tones"); break;
            case "6" :
                System.out.println("Settings"); break;
            case "7" :
                System.out.println("Call divert"); break;
            case "8" :
                System.out.println("Games"); break;
             case "9":
                System.out.println("Calculator"); break;
            case "10" :
                System.out.println("Reminders"); break;
            case "11" :
                System.out.println("Clock"); break;
            case "12" :
                System.out.println("Profiles"); break;
            case "13" :
                System.out.println("SIM services"); break;

                default: System.out.println("Wrong input, please select the correct option");
        

//                            
//                    case "5": System.out.println("Tones"); break;
//                    case "6": System.out.println("Settings"); break;
//                    case "7": System.out.println("Call divert"); break;
//                    case "8": System.out.println("Games"); break;
//                    case "9": System.out.println("Calculator"); break;
//                    case "10": System.out.println("Reminders"); break;
//                    case "11": System.out.println("Clock"); break;
//                    case "12": System.out.println("Profiles"); break;
//                    case "13": System.out.println("SIM services"); break;
//                          
                    }}}}
                
//}
//        }       
           
//      }  
                               



