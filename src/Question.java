import java.util.Scanner;

public class Question {
	
	int questionRight = 0;
	
	int score = 0;
	
	Scanner scanAnswer = new Scanner(System.in);
	
	String right = "(right answer)\n";
	String wrong = "(wrong answer)\n";
	
	int answer;
	
	public void question1 () {
		
		System.out.println("================================\n"
				+ "Exercise №1\n"
				+ "Count:\n"
				+ "90 - ( 5 + 3 ∙ 10 ) : 5 + 2 =\n"
				+ "Answer options:\n"
				+ "1) 76\n2) 85\n3) 13\n4) 4\n"
				+ "================================\n"
				+ "Type your answer number: \n");
				
		questionRight = 2;
		answer();
	}
	
	public void question2 () {
		
		System.out.println("================================\n"
				+ "Exercise №2\n"
				+ "Replace |    | by the correct number:\n"
				+ "10 - ( 5 ∙ |    | + 5 ) : 5 = 1\n"
				+ "Answer options:\n"
				+ "1) 0\n2) 1\n3) 8\n4) other\n"
				+ "================================\n"
				+ "Type your answer number: \n");
				
		questionRight = 3;
		answer();
	}
	
	public void question3 () {
		
		System.out.println("================================\n"
				+ "Exercise №3\n"
				+ "An empty glass weights 180 g. A glass, filled 1/3 with water weights 320 g.:\n"
				+ "What is the weight of the water, when the glass is 1/2 full?\n"
				+ "Answer options:\n"
				+ "1) 500 g.\n2) 210 g.\n3) 460 g.\n4) 140 g.\n"
				+ "================================\n"
				+ "Type your answer number: \n");
				
		questionRight = 2;
		answer();
	}
	
	public void question4 () {
		
		System.out.println("================================\n"
				+ "Exercise №4\n"
				+ "From January to April, the airline sold 147 tickets.\n"
				+ "In the best month (was not April), it sold 4/7 of all tickets."
				+ "In January and in one other month, it sold 1/3 of the best month tickets."
				+ "March was the worst in sales."
				+ "How many tickets have the airline sold from January to March?\n"
				+ "Answer options:\n"
				+ "1) from 90 to 103\n2) from 104 to 114\n3) from 115 to 120\n4) from 121 to 140\n"
				+ "================================\n"
				+ "Type your answer number: \n");
				
		questionRight = 3;
		answer();
	}
	
	public void question5 () {
		
		System.out.println("================================\n"
				+ "Exercise №5\n"
				+ "Find the next number in the sequence:\n"
				+ "3 2 6 8 4"
				+ "Answer options:\n"
				+ "1) from  1 to 5\n2) from 6 to 10\n3) from 11 to 15\n4) from 16 to 20\n"
				+ "================================\n"
				+ "Type your answer number: \n");
				
		questionRight = 4;
		answer();
	}
	
	public void answer() {
		do {answer = scanAnswer.nextInt();}
		while(answer > 4 || answer <= 0);
		
		switch(questionRight) {
			case 1: 
				if (answer == 1) {
					System.out.println(right); scorePlus();
					}
				else System.out.println(wrong);
				break;
			case 2: 				
				if (answer == 2) {
					System.out.println(right); scorePlus();
				}
				else System.out.println(wrong);
				break;
			case 3: 
				if (answer == 3) {
					System.out.println(right); scorePlus();
				}
				else System.out.println(wrong);
				break;
			case 4: 
				if (answer == 4) {
					System.out.println(right) ;scorePlus();
				}
				else System.out.println(wrong);
				break;
		}
	}
	
	public void scorePlus() {
		score += 1;
	}

	public void scoreNull() {
		score = 0;
	}	
}
