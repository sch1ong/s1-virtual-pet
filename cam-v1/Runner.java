import javax.swing.*;

public class Runner {
    private String answerString1;
    private String answerString;
    private boolean answerBoolean;
    public Runner() {
        VirtualPet p = new VirtualPet();
        int x = 1;
        getResponse("What's your name?");
        // while(x == 1) {
        //     p.exercise();
        //     takeABeat(5000);
        //     p.feed();
        //     p.message(answerString);
        //     takeABeat(5000);
        //     p.sleep();
        //     takeABeat(5000);
        // }
        p.exercise();
        takeABeat(1000);
        p.verysick();
        optionSelect("Please help me " + answerString1, "sure", "no lol");
        if(answerBoolean == false) {
            takeABeat(2000);
            p.die();
            takeABeat(3000);
            p.skeleton();
            takeABeat(3000);
            p.flower();
            takeABeat(3000);
            p.angel();
        }
        else {
            p.sleep();
            takeABeat(1500);
            p.joyful();
            takeABeat(1000);
            

        }
        
    }


    public void takeABeat (int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch(Exception e) {
        
        }
    }

    public String getResponse(String q) {
        int y = 1;
        String s = (String)JOptionPane.showInputDialog(
            new JFrame(), 
            q, 
            "Get a Response", 
            JOptionPane.PLAIN_MESSAGE);
        if(y == 1) {
            answerString1 = s;
        }
        y = y*0;
        answerString = s;
        return s;
    }

    public String optionSelect(String a, String b, String c) {
        Object[] options = {b,
                            c};
        int n = JOptionPane.showOptionDialog(
            new JFrame(),
            a,
            null,
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,     //do not use a custom Icon
            options,  //the titles of buttons
            options[0]); //default button title);
        if(JOptionPane.YES_OPTION == n) {
            answerBoolean = true;
            return "yes";
        }
        else {
            answerBoolean = false;
            return "no";
        }
    }

    public static void main(String[] args) {
        new Runner();
    }
}