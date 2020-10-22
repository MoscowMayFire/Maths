import java.util.Scanner;

public class Question {
	
	int questionRight = 0;
	
	int score = 0;
	
	Scanner scanAnswer = new Scanner(System.in);
	
	String right = "(правильный ответ)\n";
	String wrong = "(неправильный ответ)\n";
	
	int answer;
	
	public void question1 () {
		
		System.out.println("================================\n"
				+ "Задание №1\n"
				+ "Посчитай:\n"
				+ "90 - ( 5 + 3 ∙ 10 ) : 5 + 2 =\n"
				+ "Варианты ответа:\n"
				+ "1) 76\n2) 85\n3) 13\n4) 4\n"
				+ "================================\n"
				+ "Введите номер ответа: \n");
				
		questionRight = 2;
		answer();
	}
	
	public void question2 () {
		
		System.out.println("================================\n"
				+ "Задание №2\n"
				+ "Подставь правильное число:\n"
				+ "10 - ( 5 ∙ |    | + 5 ) : 5 = 1\n"
				+ "Варианты ответа:\n"
				+ "1) 0\n2) 1\n3) 8\n4) другое\n"
				+ "================================\n"
				+ "Введите номер ответа: \n");
				
		questionRight = 3;
		answer();
	}
	
	public void question3 () {
		
		System.out.println("================================\n"
				+ "Задание №3\n"
				+ "Пустой стакан весит 180 гр. Стакан, наполненный на 1/3 водой весит 320 гр.:\n"
				+ "Сколько будет весить вода в стакане, если его заполнить на 1/2?\n"
				+ "Варианты ответа:\n"
				+ "1) 500 гр.\n2) 210 гр.\n3) 460 гр.\n4) 140 гр.\n"
				+ "================================\n"
				+ "Введите номер ответа: \n");
				
		questionRight = 2;
		answer();
	}
	
	public void question4 () {
		
		System.out.println("================================\n"
				+ "Задание №4\n"
				+ "С января по апрель авиакомпания продала 147 билетов.\n"
				+ "В самый лучший месяц, который не был апрелем она продала 4/7 всех билетов."
				+ "В январе и в ещё какой-то месяц она продала 1/3 билетов лучшего месяца."
				+ "Март был наихудшим по продажам."
				+ "Сколько билетов продала авиакомпания с января по март?\n"
				+ "Варианты ответа:\n"
				+ "1) от 90 - 103\n2) от 104 - 114\n3) от 115 - 120\n4) 121 - 140\n"
				+ "================================\n"
				+ "Введите номер ответа: \n");
				
		questionRight = 3;
		answer();
	}
	
	public void question5 () {
		
		System.out.println("================================\n"
				+ "Задание №5\n"
				+ "Напишите следующее число в последовательности:\n"
				+ "3 2 6 8 4"
				+ "Варианты ответа:\n"
				+ "1) от 1 - 5\n2) от 6 - 10\n3) от 11 - 15\n4) от 16 - 20\n"
				+ "================================\n"
				+ "Введите номер ответа: \n");
				
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
