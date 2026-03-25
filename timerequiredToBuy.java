public class timerequiredToBuy {

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;

        while (tickets[k] > 0) {
            for (int i = 0; i < tickets.length; i++) {

                if (tickets[i] > 0) {
                    tickets[i]--;
                    time++;

                    if (i == k && tickets[i] == 0) {
                        return time;
                    }
                }
            }
        }

        return time;
    }

    public static void main(String[] args) {
        int[] tickets = {5, 1, 1, 1};
        int k = 0;

        int result = timeRequiredToBuy(tickets, k);
        System.out.println("Time required: " + result);
    }
}