import java.util.Scanner;
import java.util.Random;
/*
import java.util.Locale; 
import javax.speech.Central; 
import javax.speech.synthesis.Synthesizer; 
import javax.speech.synthesis.SynthesizerModeDesc;*/

public class Chat {
	static Scanner scanner = new Scanner(System.in);

	public static void output(String param, int i) { //Allows for easier implementation of TTS.
		if (i == 0) {
			System.out.println(param);
		} else if (i == 1) {
			System.out.print(param);
		} else {
			//speak(param);
		}
	}
	 
	public static void getAcademicInfo() {
	 	String[] computerResponses = {
	 		"What is your academic interest?",
	 		"Great choice! I also happen to love that subject!",
	 		"As a freshman, here are the course(s) you can take: ",
	 		"As a sophomore, here are the course(s) you can take: ",
	 		"As a junior, here are the course(s) you can take: ",
	 		"As a senior, here are the course(s) you can take: ",
	 		"Do you have another academic interest?",
	 	};
	 	
	 	String[][] coursesInfoFreshman = {
	 		{"Algebra 1, ", "Algebra 1 Honors, ", "Geomerty, ", "Geometry Honors. "},
	 		{"English 1, ", "Media, ", "Journalism, ", "Yearbook, ", "Graphic Design."},
	 		{"Living Environment, ", "Chemistry, ", "Biology Research, ", "Physical Science Research. ", ""},
	 		{"Global History, ", "Political Science, ", "Media and Ethics, ", "Eplorer Program. ", ""},
	 		{"Chinese I, ", "French I, ", "Spanish I, ", "German I", ""}
	 	};
	 	
	 	String[][] coursesInfoSophomore = {
	 		{"Algebra 1, ", "Algebra 1 Honors, ", "Geomerty, ", "Geometry Honors, ", "Algebra 2, ", "Trignometry, ", "Algebra 2 Honors, ", "Trignometry Honors."},
	 		{"English 3, ", "Media, ", "Journalism, ", "Yearbook, ", "English 3 Honors.", "History of Media Studies.", "Journalism Production,", "Advanced Media."},
	 		{"Chemistry, ", "Earth Science, ", "Biology Research, ", "Physical Science Research. ", " ", " ", " ", " "},
	 		{"Global History, ", "AP Global History, ", "AP European History, ", "Criminology, ", "Homeland Security and Emergency Management, ", "Politics and Public Opinion, ", "Explorer Program. ", " "},
	 		{"Chinese II, ", "French II, ", "Spanish II, ", "German II. ", " ", "", " ", " "}
	 	};
	 	
	 	String[][] coursesInfoJunior = {
	 		{"Pre-Calculus, ", "Pre-Calculus Honors, ", "AP Statistics, ", "Trigonometry, ", "Trigonometry Honors, ", "Algebra 2, ", "Algebra 2 Honors. ", " ", " "},
	 		{"English 5, ", "Media, ", "Journalism, ", "Yearbook, ", "English 5 Honors,", "English 5 AP,", "Public Speaking", "Play Production.", " ", " "},
	 		{"Physics, ", "Earth Science, ", "Astromony, ", "Anatomy and Physiology, ", "Environmental Science,", "AP Biology, ", "AP Chemistry, ", "AP Physics, ", "AP Psycology, ", "AP Environment Science."},
	 		{"US History/Government, ", "AP American History, ", "Criminology, ", "Criminal Justice, ", "Civil Law, ", "Explorer Program, ", "Sociology. ", " ", " ", ""},
	 		{"Chinese III, ", "French III, ", "Spanish III, ", "German III, ", "AP Spanish, ", ", ", " ", " ", " ", ""}
	 	};
	 	
	 	String[][] coursesInfoSenior = {
	 		{"Pre-Calculus, ", "Pre-Calculus Honors, ", "AP Statistics, ", "Trigonometry, ", "Trigonometry Honors, ", "Calculus Honors, ", "AP Caluculus AB, ", "AP Calculus BC. ", " "},
	 		{"English 7, ", "Media, ", "Journalism, ", "Yearbook, ", "English 7 Honors,", "Public Speaking,", "Play Production.", " ", " ", " "},
	 		{"Physics, ", "Earth Science, ", "Astromony, ", "Anatomy and Physicology, ", "Environmental Science,", "AP Biology, ", "AP Chemistry, ", "AP Physics, ", "AP Psycology, ", "AP Environment Science."},
	 		{"Chinese IV, ", "French IV, ", "Spanish IV, ", "German IV, ", "AP Spanish, ", " ", "Criminology. ", " ", " ", " "}
	 	};
	 	
	 	String rawInput = scanner.nextLine();
		String input = "";
	 	
	 	int subject = 0;
	 	
	 	for (int i = 0; i < 7; i++) {
			output(computerResponses[i], 0);
			int looped = 0;
			
			switch (i) {
				
				case 0: 
				
					rawInput = scanner.nextLine();
					input = rawInput.toLowerCase();
				
					if (input.indexOf("math") >= 0 || input.indexOf("algebra") >= 0 || input.indexOf("trigonometry") >= 0 || input.indexOf("geometry") >= 0) {
	 					subject = 0;
				 	} else if (input.indexOf("english") >= 0 || input.indexOf("language") >= 0 || input.indexOf("ela") >= 0 || input.indexOf("english language arts") >= 0) {
						subject = 1;
				 	} else if (input.indexOf("science") >= 0 || input.indexOf("chem") >= 0 || input.indexOf("physics") >= 0 || input.indexOf("biology") >= 0) {
						subject = 2;
				 	} else if (input.indexOf("global") >= 0 || input.indexOf("history") >= 0 || input.indexOf("social studies") >= 0) {
						subject = 3;
				 	} else if (input.indexOf("spanish") >= 0 || input.indexOf("foreign language") >= 0) {
						subject = 4;
				 	}
				 break;
				 
				 case 2:
				 	for (int j = 0; j < 4; j++) { 
						output(coursesInfoFreshman[subject][j], 1);
	 				}
	 				output("", 0);
	 			 break;
	 			 
	 			 case 3:
				 	for (int j = 0; j < 8; j++) { 
						output(coursesInfoSophomore[subject][j], 1);
	 				}
	 				output("", 0);
	 			 break;
	 			 
	 			 case 4:
				 	for (int j = 0; j < 9; j++) { 
						output(coursesInfoJunior[subject][j], 1);
	 				}
	 				output("", 0);
	 			 break;
	 			 
	 			 case 5:
				 	for (int j = 0; j < 8; j++) { 
						output(coursesInfoSenior[subject][j], 1);
	 				}
	 				output("", 0);
	 			 break;
	 			 
	 			 case 6:
	 			 	input = scanner.nextLine();
	 			 
				 	if (input.indexOf("math") >= 0 || input.indexOf("algebra") >= 0 || input.indexOf("trigonometry") >= 0 || input.indexOf("geometry") >= 0) {
	 					looped++;
	 					i=0;
	 					subject = 0;
				 	} else if (input.indexOf("english") >= 0 || input.indexOf("language") >= 0 || input.indexOf("ela") >= 0 || input.indexOf("english language arts") >= 0) {
						looped++;
	 					i=0;
						subject = 1;
				 	} else if (input.indexOf("science") >= 0 || input.indexOf("chem") >= 0 || input.indexOf("physics") >= 0 || input.indexOf("biology") >= 0) {
						looped++;
	 					i=0;
						subject = 2;
				 	} else if (input.indexOf("global") >= 0 || input.indexOf("history") >= 0 || input.indexOf("social studies") >= 0) {
						looped++;
	 					i=0;
						subject = 3;
				 	} else if (input.indexOf("foreign language") >= 0 || input.indexOf("spanish") >= 0 || input.indexOf("french") >= 0) {
						looped++;
	 					i=0;
						subject = 4;
				 	}
	 			 break;
	 		}
	 		
	 		if (i < 6  && i != 0 && looped == 0) {
	 			 input = scanner.nextLine();
	 		}
	 		
	 		if (input.indexOf("repeat") >= 0) {
				output("Sure thing!", 0);
				i--;
			}
			
			if (input.indexOf("freshmen") >= 0 || input.indexOf("freshman") >= 0) {
				output("No problem!", 0);
				i = 1;
			} else if (input.indexOf("sophomores") >= 0) {
				output("No problem!", 0);
				i = 2;
			}  else if (input.indexOf("juniors") >= 0) {
				output("No problem!", 0);
				i = 3;
			}  else if (input.indexOf("seniors") >= 0) {
				output("No problem!", 0);
				i = 4;
			}
			
			if (i > 2) {
				if (input.indexOf("math") >= 0 || input.indexOf("algebra") >= 0 || input.indexOf("trigonometry") >= 0 || input.indexOf("geometry") >= 0) {
	 				subject = 0;
				} else if (input.indexOf("english") >= 0 || input.indexOf("language") >= 0 || input.indexOf("ela") >= 0 || input.indexOf("english language arts") >= 0) {
					subject = 1;
				} else if (input.indexOf("science") >= 0 || input.indexOf("chem") >= 0 || input.indexOf("physics") >= 0 || input.indexOf("biology") >= 0) {
					subject = 2;
				} else if (input.indexOf("global") >= 0 || input.indexOf("history") >= 0 || input.indexOf("social studies") >= 0) {
					subject = 3;
				} else if (input.indexOf("foreign language") >= 0 || input.indexOf("spanish") >= 0 || input.indexOf("french") >= 0) {
					subject = 4;
				}
			}		
		}
	}
	
	public static void askSports() {
   		System.out.println("What do you want know about Cardozo SPORTS?");   
		//System.out.println("How about Soccer? \n or Baseball even though I'm not great doing it \n or perhaps Basketball? \n or would you care about Bowling? \n or maybe Cross Country? \n hmm actually I heard that you're good at fencing, so do you want to know more about our Fencing team? \n or one of my favorite sports, American Football? \n or Golf? which I don't really have the patience for \n or Gymnastics? although I am not flexible enough to do it \n or Handball? \n or Track? which by the way, my motherboard says that I have the fastest hardware \n or Lacrosse? \n or Soft Ball? which is part of my software \n or Swimming? which I do on a regular basis \n or Table Tennis? \n or actual Tennis? \n or Volleyball? which I usually search up the net ");
		//String response = scanner.nextLine(); //For the above question, I must make it sound more alive
   		//return response;
	}

	//Re-evaluate use for below function as this is more non-specific therefore this AI would sound more like a robot than a normal person

	public static void continueTalking() { 
		String askOne = "Now a question for you, Do you still wish to talk about Cardozo?";
		String askTwo = "Do want to continue talking about Cardozo?";
		String askThree = "You still want to talk?";
		String askFour = "Sooo would you still care to talk more?";
		String askFive = "But do you still wish to continue talking with me? Cause I'll be lonely if you won't";
		Random randomNum = new Random();
		int r = randomNum.nextInt(5);
		String[] listOfAsks = {askOne, askTwo, askThree, askFour, askFive};
		System.out.println(listOfAsks[r]);//Randomly choose a question to have seemingly different ways of speaking like a human being
		String response = scanner.nextLine();
        //return response;
	}

	public static void getAthleticInfo() {
		//askSports();
		System.out.println("What do you want know about Cardozo SPORTS?");
		String response = scanner.nextLine();
		//Soccer (1)

		if (response.indexOf("soccer") >=0) {
			System.out.println("Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");
			System.out.println("So do you want to know more about our awesome Coaches? or hear about some team statistics?  \n Personally I think we have some great coaches"); //Ask what they want to know about
			response = scanner.nextLine();
			//Limited Answer Choices

			if (response.indexOf("coach") >= 0) { 
				System.out.println("The coaches of Cardozo's Soccer Team are: Coach Richard Parascos Of The Boys Soccer Varsity Team and Coach Alyssa Rocco Of The Girls Soccer Varsity Team. They're both really great coaches o don't underestimate our soccer team!");
				//Loop Back Feature Needed, using a loop obviously with a decrement perhaps...hmmmm
				continueTalking();
			} else if (response.indexOf("Statistics") >= 0) {
				System.out.println("Okay, do you want to know about the boys soccer team or the girls soccer team?");
				response = scanner.nextLine();

				if (response.indexOf("boy") >= 0){
					System.out.println("So far our boys soccer team is 3 and 7, but our boys soccer team isn't down at all as they'll be able to even better in their next few games!!");
				} else if (response.indexOf("girl") >= 0){
					System.out.println("So far our girls soccer team is 4 and 6, but our girls soccer team are doing their best to make a comeback and they're going to have fun doing it!");
				} else {
					//Loop-Back Feature Needed
					System.out.println("Sorry I didn't think I heard you correctly, do you mind repeating what you said?");
					response = scanner.nextLine();

					if (response.indexOf("yes") >= 0) {

					} else if (response.indexOf("no") >= 0) {
						//continueTalking();					
					}
				}
			} else {
				System.out.println("Okay so I would like to say Sorry! cause I didn't really understand what you just said");
				continueTalking();
			}

		} else if (response.indexOf("baseball") >=0) {
			/*Baseball (2)*/

			System.out.println("Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");
			System.out.println(); //Ask what they want to know about
			//Limited Answer Choices
			System.out.println("The coaches of Cardozo's Baseball Team are: Coach Martin Finklelstein Of The Boys Baseball Junior Varsity Team and Coach Ronald Gorecki Of The Boys Baseball Varsity Team");
			System.out.println("0 and 0"); //Stats
		} else if (response.indexOf("basketball") >=0) {
			/*Basketball (3)*/

			System.out.println("Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");
			System.out.println(); //Ask what they want to know about
			//Limited Answer Choices
			System.out.println("The coaches of Cardozo's Basketball Team are: Coach Kyriakos Peponakis Of The Boys Basketball Junior Varsity Team and Coach Ron Naclerio Of The Boys Basketball Varsity Team and Coach Vincent O'Donoghue of The Girls Basketball Varsity Team");
			System.out.println("12 and 0 jr varsity, 15 and 1 varsity");
		} else if (response.indexOf("bowling") >=0) {
			/*Bowling (4)*/

			System.out.println("Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");
			System.out.println(); //Ask what they want to know about
			//Limited Answer Choices
			System.out.println("The coach of Cardozo's Bowling Team is: Coach John Tsolekas Of The Boys Bowling Varsity Team");
			System.out.println("10 and 0");
		} else if (response.indexOf("cross country") >=0) {
			/*Cross Country (5)*/

			System.out.println("Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");
			System.out.println(); //Ask what they want to know about
			//Limited Answer Choices
			System.out.println("The coaches of Cardozo's Cross Country Team are: Coach Anthony West Of The Boys Cross Country Varsity Team and Coach Gail Emmanuel Of The Girls Cross Country Varsity Team");
			System.out.println("0 and 0");
		} else if (response.indexOf("fencing") >=0) {
			/*Fencing (6)*/

			System.out.println("Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");
			System.out.println(); //Ask what they want to know about
			//Limited Answer Choices
			System.out.println("The coach of Cardozo's Fencing Team is: Coach Seth Skolnick Of The Boys Fencing Varsity Team and Of The Girls Fencing Team");
			System.out.println("9 and 1 boys, 0 and 0 girls");
		} else if (response.indexOf("football") >=0) {
			//American Football (7)

			System.out.println("Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");
			System.out.println(); //Ask what they want to know about
			//Limited Answer Choices
			System.out.println("The coaches of Cardozo's Football Team are: Head Coach Joseph Kaso & Assisstant Coaches: Lou Decicco, and John Savage Of The Boys Football Junior Varsity Team and Coach Joseph Kaso again with Coach Louis Decicco Of The Boys Football Varsity Team");
			System.out.println("0 and 0 jr varsity, 7 and 2 varsity");
		}	else if (response.indexOf("golf") >=0) {
			//Golf (8)

			System.out.println("Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");
			System.out.println(); //Ask what they want to know about
			//Limited Answer Choices
			System.out.println("The coaches of Cardozo's Golf Team are: Coach Matthew Handell Of The Golf Coed Varsity Team and Coach Pamela Goldberg Of The Girls Golf Varsity Team");
			System.out.println("0 and 0 coed, 9 and 0 girls");
		} else if (response.indexOf("gymnastics") >=0) {
			//Gymnastics (9)

			System.out.println("Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");
			System.out.println(); //Ask what they want to know about
			//Limited Answer Choices
			System.out.println("The coach of Cardozo's Girls Gymnastics Varsity Team is Coach Richard Parascos");
			System.out.println();
		} else if (response.indexOf("handball") >=0) {
			//Handball (10)

			System.out.println("Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");
			System.out.println(); //Ask what they want to know about
			//Limited Answer Choices
			System.out.println("The coaches of Cardozo's Handball Team are: Coach John Tsolekas Of The Boys Handball Varsity Team and Coach David Green Of The Girls Handball Varsity Team");
			System.out.println();
		} else if (response.indexOf("track") >=0) {
			//Track Team (11)

			System.out.println("Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");
			System.out.println(); //Ask what they want to know about
			//Limited Answer Choices
			System.out.println("The coaches of Cardozo's Track Team are: Coach Anthony West Of The Boys Indoor and Outdoor Track Varsity Team and Coaches Gail Emmanuel and Colin Mc Nally Of The Girls Indoor and Outdoor Track Varsity Team");
			System.out.println();
		} else if (response.indexOf("lacrosse") >=0) {
			//Lacrosse team (12)
			System.out.println("Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");
			System.out.println(); //Ask what they want to know about
			//Limited Answer Choices
			System.out.println("The coaches of Cardozo's Lacrosse Team are: Coach John Savage Of The Boys Lacrosse Varsity Team and Coach Larissa Demelo Of The Girls Lacrosse Varsity Team");
			System.out.println();
		} else if (response.indexOf("softball") >=0) {
			//Softball (13)
			System.out.println("Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");
			System.out.println(); //Ask what they want to know about
			//Limited Answer Choices
			System.out.println("The coach of Cardozo's Girls Softball Varsity Team is Coach Richard Parascos");
			System.out.println();
		} else if (response.indexOf("swimming") >=0) {
			//Swimming Team (14)

			System.out.println("Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");
			System.out.println(); //Ask what they want to know about
			//Limited Answer Choices
			System.out.println("The coach of Cardozo's Girls Swimming Varsity Team is Coach Richard Amira");
			System.out.println();
			//Stats about swim team (Our girls team won the Queens championship the past two years
		} else if (response.indexOf("") >=0) {
			//Table Tennis (15)

			System.out.println("Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");
			System.out.println(); //Ask what they want to know about
			//Limited Answer Choices
			System.out.println("The coaches of Cardozo's Bowling Team are: Coach Joshua Glasel Of The Boys Table Tennis Varsity Team and Coach Richard Amira Of The Girls Table Tennis Varsity Team");
			System.out.println();
		} else if (response.indexOf("") >=0) {
			//Tennis (16)

			System.out.println("Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");
			System.out.println(); //Ask what they want to know about
			//Limited Answer Choices
			System.out.println("The coaches of Cardozo's Tennis Team are: Coach Jeffery Loh Of The Boys Tennis Varsity Team and Coach Neal Baskin Of The Girls Varsity Team");
			System.out.println();
		} else if (response.indexOf("") >=0) {
			//Volleyball (17)

			System.out.println("Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");
			System.out.println(); //Ask what they want to know about
			//Limited Answer Choices
			System.out.println("The coach of Cardozo's Volleyball Team is: Coach Daniel Scarola Of The Boys VolleyBall Varsity Team and Of The Girls Volleyball Varsity Team and Coach Vincent O'Donoghue Of The Girls Volleyball Junior Varsity Team");
			System.out.println();
		} else if (response.indexOf("") >=0) {
			//Wrestling (18)

			System.out.println("Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");
			System.out.println(); //Ask what they want to know about
			//Limited Answer Choices
			System.out.println("The coach of Cardozo's Wrestling Team is Coach Christopher Milani Of Both The Boys Wrestling Varsity Team and The Girls Wrestling Varsity Team");
			System.out.println();
		}

		/*http://www.psal.org/profiles/school-profile.aspx#26505

		else {
			//Loop Back Feature Needed\\
			System.out.println("Sorry I don't any " response "sports");
			//i might make a function to ask whether to or not to continue talking
			System.out.println("Do you still want to talk about Cardozo?");
			response = input.nextLine();
			if (response == "yes"){
			//I need a way to loop back to start\\
		} else if (response == "no") {
			System.out.println("Oh okay then, good bye, it was nice talking to you?"); //Could I implement mulitiple ways of saying good bye to simulate more of a live AI?
        	//Utilize continueTalking; Function
		} else {
			//Loop Back Feature Needed
			System.out.println("Sorry I couldn't understand that, could you say your response again, please?");
			//I need a way to loop back
		}
	*/
}
/*
	public static void speak(String param) {
		try { 
            // set property as Kevin Dictionary 
            System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");  
                  
            // Register Engine 
            Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral"); 
  
            // Create a Synthesizer 
            Synthesizer synthesizer = Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));      
      
            // Allocate synthesizer 
            synthesizer.allocate();         
              
            // Resume Synthesizer 
            synthesizer.resume();     
              
            // speaks the given text until queue is empty. 
            synthesizer.speakPlainText(param, null);          
            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY); 
              
            // Deallocate the Synthesizer. 
            synthesizer.deallocate();                                  
        }  
  
        catch (Exception e)  
        { 
            e.printStackTrace(); 
        } 
	}*/

	public static void main (String[] args) {
		output("Welcome to the Cardozo chat bot! We hope to answer all you questions about the school.", 0);
		getAcademicInfo();
		getAthleticInfo();
		continueTalking();
	}  
}