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
            String input = userInput.next();
            return input;
        } else {
            System.out.print("[" + getTime() + "]" + " [System] >> Syntax Error: main.getInput(input) Invalid argument passes into [input]");
            return "Error";
        }
    }
    
    public static void processInput(String input) {
        general general = new general();

        String processedInput = input.toLowerCase();

        if (processedInput.equals("hello")) {
            general.helloResponse();
        } else if (processedInput.equals("bye")) {
            general.dismissed();
            System.exit(0);
        } else {
            general.Exception(processedInput);
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
    public static void dismissed() {
        System.out.println("[" + main.getTime()  + "] [BOT ] >> Goodbye!");
    }
    public static void Exception(String input) {
        System.out.println("[" + main.getTime()  + "] [BOT ] >> Sorry, I do not understand what you mean by '" + input + "'.");
    }
}