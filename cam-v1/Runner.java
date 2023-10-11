public class Runner {
    public Runner() {
        VirtualPet p = new VirtualPet();
        int x = 1;
        while(x == 1) {
            p.exercise();
            takeABeat(5000);
            p.feed();
            takeABeat(5000);
            p.sleep();
            takeABeat(5000);
        }
    }

    public void takeABeat (int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch(Exception e) {
        
        }
    }
    public static void main(String[] args) {
        new Runner();
    }
}