import java.util.Scanner;

public class Test {
	int numberOfPlayers;
	boolean isTrue = true;
	
	Person newPerson = new Person();
	String Person[][];
	
	Question newQuestion = new Question();

	int newScore[];
	
	Scanner scanInt = new Scanner(System.in);
	Scanner scanLine = new Scanner(System.in);

public void newGame () {
	do {
		System.out.print("Enter the number of players (max. 5): ");
		numberOfPlayers = scanInt.nextInt();
		if (numberOfPlayers>=1 && numberOfPlayers<=5) {isTrue=false;}
	}	
	while (isTrue);
	
Person = new String [numberOfPlayers][3];
newScore = new int [numberOfPlayers];
	
	for (int i=0;i<numberOfPlayers;i++) {
		for (int j=0;j<3;j++) {
			
			if(j==0) {
				System.out.print("Enter the name of the "+(i+1)+" player: ");
				Person[i][j]=scanLine.nextLine();
				newPerson.name=Person[i][j];
				}
			else if (j==1) {
				System.out.print("Enter the age of the "+(i+1)+" player: ");
				Person[i][j]=scanLine.nextLine();
				newPerson.age=Person[i][j];
				}
			else {
				newQuestion.question1();
				newQuestion.question2();
				newQuestion.question3();
				newQuestion.question4();
				newQuestion.question5();
				
				newScore[i]=newQuestion.score;
				}
			
			newQuestion.scoreNull();
			}
		}
	System.out.println("\nGame results:\n");
	for (int i2=0;i2<numberOfPlayers;i2++) {
		for (int j2=0;j2<4;j2++) {
			switch(j2) {
				case 0:System.out.println((i2+1)+" players name: "+Person[i2][j2]); break;
				case 1:System.out.println(Person[i2][j2-1]+"'s age: "+Person[i2][j2]); break;
				case 2:System.out.println(Person[i2][j2-2]+"'s points: "+newScore[i2]+"\n");	
	}		
		}		
	}	
	}	
}