import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EightBallTest {
    private EightBall eightBall;

    @Before
    public void before(){
        ArrayList<String> Myanswers = new ArrayList<>();
        Myanswers.add("Not sure");
        Myanswers.add("Definitely");
        Myanswers.add("Chances are slim");
        eightBall = new EightBall(Myanswers);
    }


    @Test
    public void canGetRandomAnswer(){
        ArrayList results = eightBall.getAnswers();
        String randomAnswer = eightBall.getRandomAnswer();
        assertTrue(results.contains(randomAnswer));
    }

    @Test
    public void canAddItem(){
        eightBall.add("Cheese");
        assertEquals(4, eightBall.getAnswerCount());
    }

    @Test
    public void canRemoveItem(){
        eightBall.remove("Definitely");
        assertEquals(2, eightBall.getAnswerCount());
    }

}
