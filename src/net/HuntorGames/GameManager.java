package net.HuntorGames;

import java.util.Scanner;

public class GameManager {

    public int correctQuestionsAnswered = 0;
    private Quiz currentQuiz;

    public GameManager(){
        this.currentQuiz = GenerateQuiz();
    }
    private Quiz GenerateQuiz(){
        return new Quiz();
    }

    private String GetCurrentQuestion(int index){
        return currentQuiz.GetQuestion(index);
    }

    private String GetCurrentAnswer (int index) {
        return currentQuiz.GetAnswer(index);
    }

    public void GameLoop(){
        Scanner userInput = new Scanner(System.in);
        for (int i = 0; i < currentQuiz.GetQuizSize(); i++)
        {
            System.out.println(GetCurrentQuestion(i));
            if (userInput.nextLine().equalsIgnoreCase(GetCurrentAnswer(i)))
            {
                correctQuestionsAnswered ++;
            }
            else {
                System.out.println("Sorry the correct answer was: " + GetCurrentAnswer(i));
            }
        }
        System.out.println("That was the end of the quiz, you answered " + correctQuestionsAnswered + " questions correctly.");
    }


}
