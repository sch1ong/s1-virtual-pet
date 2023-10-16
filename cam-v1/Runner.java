import javax.swing.*;

public class Runner {
    private String answerString1;
    private String answerString;
    private boolean answerBoolean;
    public Runner() {
        VirtualPet p = new VirtualPet();
        int x = 0;
        getResponse("What's your name?");
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
            takeABeat(1500);
            p.message(answerString1 + ", I'm hungry.");
            p.kindaHungry();
            optionSelect("Feed me please", "yeah, sure", "no I'm broke");
            if(answerBoolean == false) {
                takeABeat(1500);
                p.starving();
                p.message("PLEASE give me food!");
                optionSelect(answerString1 + " I'm starving!!!", "I guess I can", "Hi starving, I'm Dad");
                if(answerBoolean == false) {
                    x += 1;
                    takeABeat(500);
                    p.message("please...");
                    takeABeat(1000);
                    p.die();
                    takeABeat(3000);
                    p.skeleton();
                    takeABeat(3000);
                    p.flower();
                    takeABeat(3000);
                    p.angel();
                }
                else if (x == 0) {
                    p.happy();
                    takeABeat(500);
                    p.message("Thanks " + answerString1);
                }}
            else if( x == 0 ) {
                p.happy();
                takeABeat(500);
                p.message("Thanks " + answerString1);
            }
            takeABeat(1000);
            optionSelect("Give Him a gift?", "yes", "yes");
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