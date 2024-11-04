public class CoinFlip {
    
    public String flip() {
        String result = "";
        double x = Math.random();
        if (x>=0.5) {
            result = "heads";
        } else {
            result = "tails";
        }
        return result;
    }

    public double Simulate(int flips) {
        double percentage;
        int heads = 0;
        int tails = 0;
        int count = 0;
        while (count<flips) {
            if (flip().equals("heads")) {
                heads++;
            } else {
                tails++;
            }
            count++;
        }
        percentage = (double) heads / flips;
        return percentage;
    }

}
