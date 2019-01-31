//General purpose chat bot by mxtt-mmxix

import java.util.Scanner;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import java.beans.PropertyVetoException;

import javax.speech.AudioException;
import javax.speech.Central;
import javax.speech.EngineException;
import javax.speech.EngineStateError;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;
import javax.speech.synthesis.Voice;

public class chatBot {
    public static void main(String[] args) {

        SpeechUtils su = new SpeechUtils();
        System.out.println("\n");

        print("Welcome to Chat Bot Alpha v0.01");

        while (true) {
            su.doSpeak(getInput("string"));
            su.terminate();
        }
    }
  
   //Functionality for TTS begins here. HAS NOT BEEN TESTED!
   
  SynthesizerModeDesc desc;
  Synthesizer synthesizer;
  Voice voice;
  

  public void init(String voiceName) 
    throws EngineException, AudioException, EngineStateError, 
           PropertyVetoException 
  {
    if (desc == null) {
      
      System.setProperty("freetts.voices", 
        "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
      
      desc = new SynthesizerModeDesc(Locale.US);
      Central.registerEngineCentral
        ("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
      synthesizer = Central.createSynthesizer(desc);
      synthesizer.allocate();
      synthesizer.resume();
      SynthesizerModeDesc smd = 
        (SynthesizerModeDesc)synthesizer.getEngineModeDesc();
      Voice[] voices = smd.getVoices();
      Voice voice = null;
      for(int i = 0; i < voices.length; i++) {
        if(voices[i].getName().equals(voiceName)) {
          voice = voices[i];
          break;
        }
      }
      synthesizer.getSynthesizerProperties().setVoice(voice);
    }
    
  }

  public void terminate() throws EngineException, EngineStateError {
    synthesizer.deallocate();
  }
  
  public void doSpeak(String speakText) 
    throws EngineException, AudioException, IllegalArgumentException, 
           InterruptedException 
  {
      synthesizer.speakPlainText(speakText, null);
      synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);

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
                } else if (processedInput.startsWith("whats")) {
                    what.Exception(input, 3);
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
        if (type == 3) System.out.println("[" + main.getTime()  + "] [BOT ] >> Sorry, I do not know what '" + input.substring(6) + "' is. Could you please rephrase that?");
    } 
}
