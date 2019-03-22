import java.util.Scanner;

public class Chat {	 
	 
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
	 		{"Physics, ", "Earth Science, ", "Astromony, ", "Anatomy adn Physiology, ", "Environmental Science,", "AP Biology, ", "AP Chemistry, ", "AP Physics, ", "AP Psycology, ", "AP Environment Science."},
	 		{"Chinese IV, ", "French IV, ", "Spanish IV, ", "German IV, ", "AP Spanish, ", " ", "Criminology. ", " ", " ", " "}
	 	};
	 	
	 	Scanner scanner = new Scanner(System.in);
		String input = "";
	 	
	 	int subject = 0;
	 	
	 	for (int i = 0; i < 7; i++) {
			System.out.println(computerResponses[i]);
			int looped = 0;
			
			switch (i) {
				
				case 0: 
				
					input = scanner.nextLine();
				
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
	 					System.out.print(coursesInfoFreshman[subject][j]);
	 				}
	 				System.out.println("");
	 			 break;
	 			 
	 			 case 3:
				 	for (int j = 0; j < 8; j++) { 
	 					System.out.print(coursesInfoSophomore[subject][j]);
	 				}
	 				System.out.println("");
	 			 break;
	 			 
	 			 case 4:
				 	for (int j = 0; j < 9; j++) { 
	 					System.out.print(coursesInfoJunior[subject][j]);
	 				}
	 				System.out.println("");
	 			 break;
	 			 
	 			 case 5:
				 	for (int j = 0; j < 8; j++) { 
	 					System.out.print(coursesInfoSenior[subject][j]);
	 				}
	 				System.out.println("");
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
	 		
	 		if (i < 5 && i != 0 && looped == 0) {
	 			 input = scanner.nextLine();
	 		}
	 		
	 		if (input.indexOf("repeat") >= 0) {
	 			System.out.println("Sure thing!");
	 			i--;
			}
			
			if (input.indexOf("freshmen") >= 0) {
				System.out.println("No problem!");
				i = 1;
			} else if (input.indexOf("sophomores") >= 0) {
				System.out.println("No problem!");
				i = 2;
			}  else if (input.indexOf("juniors") >= 0) {
				System.out.println("No problem!");
				i = 3;
			}  else if (input.indexOf("seniors") >= 0) {
				System.out.println("No problem!");
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
			
			input = "";
		}

		scanner.close();

	}
	 	 
	public static void main (String[] args) {
	 	System.out.println("Welcome to the Cardozo ChatBot! I hope to answer all of your questions related to our school!");
		getAcademicInfo();
		//getSportsInfo();
	} 
	 
}