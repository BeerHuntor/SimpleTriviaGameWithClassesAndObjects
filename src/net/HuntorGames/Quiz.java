package net.HuntorGames;

import java.util.ArrayList;
import java.util.List;

public class Quiz {

    private List<Question> quizList = new ArrayList<>();
    public Quiz()
    {
        this.quizList = PopulateQuiz();
    }

    private List<Question> PopulateQuiz () {
        quizList.add(new Question("What year was the Premier League founded?", "1991"));
        quizList.add(new Question("Who were the first winners of the Premier League?", "Blackburn Rovers"));
        quizList.add(new Question("What score was Wigan Athletics first Premier League game against Bolton?", "2-1"));
        quizList.add(new Question("Who scored the winner for Manchester United in the 1999 Champions League Final to complete the trebble?", "Ole Gunner Solskjaer"));
        quizList.add(new Question("Who claimed the assist for the winning goal in the Champions League final?", "Teddy Sherringham"));
        quizList.add(new Question("Who has scored the most goals in the Premier League era?", "Alan Shearer"));

        return quizList;
    }

    public String GetQuestion(int index){
        return quizList.get(index).QuestionText;
    }

    public String GetAnswer (int index){
        return quizList.get(index).AnswerText;
    }

    public int GetQuizSize (){
        return quizList.size();
    }
}
