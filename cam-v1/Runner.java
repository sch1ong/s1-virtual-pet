import javax.swing.*;

public class Runner {
    private String answerString1;
    private String answerString;
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
        getResponse("Please help me " + answerString1);
        if(answerString.equals("no")) {
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

    public String optionSelect(String a) {
        int n = JOptionPane.showConfirmDialog(
            new JFrame(),
            a,
            "Decisons, Decisons",
            JOptionPane.YES_NO_OPTION);
        if(JOptionPane.YES_OPTION == n) {
            return "yes";
        }
        else {
            return "no";
        }
    }

    public static void main(String[] args) {
        new Runner();
    }
}