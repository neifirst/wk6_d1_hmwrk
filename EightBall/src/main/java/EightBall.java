import java.util.ArrayList;
import java.util.Collections;

public class EightBall {

    private ArrayList<String> answers;

    public EightBall(ArrayList<String> answers){
        this.answers = answers;
    }



    public String getRandomAnswer(){
        Collections.shuffle(answers);
        return this.answers.get(0);
    }

    public int getAnswerCount(){
        return this.answers.size();
    }

    public String getAnswerAtIndex(int index){
        return this.answers.get(index);
    }

    public ArrayList<String>getAnswers(){
        return new ArrayList<>(this.answers);
    }

    public void add(String answer){
        this.answers.add(answer);
    }

    public void remove(String answer){
        answers.remove(answer);
    }

}
