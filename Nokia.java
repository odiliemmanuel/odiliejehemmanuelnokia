import java.util.Scanner;

public class Nokia{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

        String menu = """
            WELCOME TO NOKIA
            select an option:
            1. Phone Book
            2. Messages
            3. Chat
            4. Call Register
            5. Tones
            6. Settings
            7. Call Divert
            8. Games
            9. Calculator

        """;

        String phoneBook = """
            1. Search
            2. Service Nos
            3. Add Name
            4. Erase
            5. Edit
            6. Assign Tone
            7. Send b'card
            8. Options
            9. Speed Dials
            10. Voice Tags
        """;

        String options = """
            1. Type of View
            2. Memory status
        """;

        int flag = -1;

        System.out.println(menu);
        System.out.println("Select an option");
        int menuOption = input.nextInt();

        System.out.println("Enter (-1) to end or any number to continue: ");
        int flagValue = input.nextInt();

        while(flag != flagValue){

            switch(menuOption){

                case 1: 
                    System.out.println(phoneBook);
                    System.out.println("Enter phoneBook value: ");
                    int phoneBookValue = input.nextInt();
                    
                    switch(phoneBookValue){
                        case 1: 
                            System.out.println("Search");
                            break;
                        case 2: 
                            System.out.println("Service Nos");
                            break;
                        case 3:
                            System.out.println("Add Name");
                            break;
                        case 4: 
                            System.out.println("Erase");
                            break;
                        case 5: 
                            System.out.println("Edit");
                            break;
                        case 6: 
                            System.out.println("Assign Tone");
                            break;
                        case 7: 
                            System.out.println("Send b'card");
                            break;
                        case 8: 
                            System.out.println("Options");
                            break;
                        case 9: 
                            System.out.println("Speed Dials");
                            break;
                        case 10: 
                            System.out.println("Voice Tags");
                            break;
                    }




              System.out.println(phonebookValue);
    System.out.print("Click an option: ");
    int optionsOption = input.nextInt();

    System.out.println("Enter -1 to end or any number to continue ");
    flagValue = input.nextInt();
int flag1 = -1;

            switch(optionsOption) {
                
                case 1:                
                    System.out.println(Options);
                    System.out.println("Select a value");
                    int optionOption = input.nextInt();

                switch(optionOption) {
                case 1:
                    System.out.println("Type of view");
                    break;
                case 2:
                    System.out.println("Memory status");
                    break;
                 }
                    break;
                    
                  
       
    

