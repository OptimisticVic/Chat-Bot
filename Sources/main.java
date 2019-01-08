//General purpose chat bot by mxtt-mmxix

import java.util.Scanner;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class main {
    public static void main(String[] args) {
        System.out.println("\n");
        print("Welcome to Chat Bot Alpha v0.01");

        while (true) {
            processInput(getInput("string"));
        }
    }

    public static void print(String input) {
        String timeStamp = "[" + getTime() + "]";
        String output = timeStamp + " " + input;
        System.out.println(output);
    }

    public static String getInput(String type) {
        Scanner userInput = new Scanner(System.in);
        if (type == "string") {
            System.out.print("[" + getTime() + "]" + " [User] >> ");
            String input = userInput.nextLine();
            return input;
        } else {
            System.out.print("[" + getTime() + "]" + " [System] >> Syntax Error: main.getInput(input) Invalid argument passes into [input]");
            return "Error";
        }
    }
    
    public static void processInput(String input) {
        String processedInput = input.toLowerCase();
        
        switch (processedInput) {
            case "hello": general.helloResponse();
                break;
            case "hi": general.helloResponse();
                break;
            case "hey": general.helloResponse();
                break;
            case "hello!": general.helloResponse();
                break;
            case "hi!": general.helloResponse();
                break;
            case "hey!": general.helloResponse();
                break;
            case "bye": 
                general.dismissed();
                System.exit(0);
                break;
            case "goodbye": 
                general.dismissed();
                System.exit(0);
                break;
            case "bye!": 
                general.dismissed();
                System.exit(0);
                break;
            case "goodbye!": 
                general.dismissed();
                System.exit(0);
                break;
            default: 
                if (processedInput.startsWith("what is")) {
                    what.Exception(input, 1);
                } else if (processedInput.startsWith("what's")) {
                    what.Exception(input, 2);
                } else {
                    general.Exception(input);
                }
                break;
            }
        } 

    public static String getTime() {
        Locale local = Locale.US;
        TimeZone timeZone = TimeZone.getTimeZone("EST");
        Calendar date = Calendar.getInstance(timeZone, local);
        int hourAsInt = date.get(Calendar.HOUR);

        String hour = Integer.toString(hourAsInt);

        if (hourAsInt < 10) {
            hour = "0" + hour;
        }

        int minuteAsInt = date.get(Calendar.MINUTE);
        String minute = Integer.toString(minuteAsInt);

        if (minuteAsInt < 10) {
            minute = "0" + minute;
        }

        int secondAsInt = date.get(Calendar.SECOND);
        String second = Integer.toString(secondAsInt);

        if (secondAsInt < 10) {
            second = "0" + second;
        }

        String output = hour + ":" + minute + ":" + second;

        return output;
    }
}

class general { 
    public static void helloResponse() {
        System.out.println("[" + main.getTime()  + "] [BOT ] >> Hello, user.");
    }
    public static void whatsUpResponse() {
        System.out.println("[" + main.getTime()  + "] [BOT ] >> The sky is up.");
    }
    public static void dismissed() {
        System.out.println("[" + main.getTime()  + "] [BOT ] >> Goodbye!");
    }
    public static void Exception(String input) {
        System.out.println("[" + main.getTime()  + "] [BOT ] >> Sorry, I do not understand what you mean by '" + input + "'. Could you please rephrase that?");
    }
}

class what {
    public static void Exception(String input, int type) {
        if (type == 1) System.out.println("[" + main.getTime()  + "] [BOT ] >> Sorry, I do not know what '" + input.substring(8) + "' is. Could you please rephrase that?");
        if (type == 2) System.out.println("[" + main.getTime()  + "] [BOT ] >> Sorry, I do not know what '" + input.substring(7) + "' is. Could you please rephrase that?");
    } 
}