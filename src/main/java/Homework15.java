public class Homework15 {

    public static boolean checkLuck(int[] arrayLucky) {
        int sumFirst = arrayLucky[0] + arrayLucky[1] + arrayLucky[2];
        int sumSecond = arrayLucky[3] + arrayLucky[4] + arrayLucky[5];
        return (sumFirst == sumSecond);
    }

    public static boolean checkTicket(int[] arrayLucky) {
        boolean isTicketExist = true;
        int zeroCounter = 0;
        for (int i = 0; i < 5; i++) {
            if (arrayLucky[i] < 0)
                isTicketExist = false;
            if (arrayLucky[i] == 0)
                zeroCounter++;
        }
        if (zeroCounter == 5)
            isTicketExist = false;
        return isTicketExist;

    }

    public static void main(String[] args) {
        int[] arrayLucky1 = {-1, 2, 3, 3, 2,6};
        int[] arrayLucky2 = {1, -2, 3, 3, 2, 1};
        int[] arrayLucky3 = {0, 0, 0, 0, 0, 0};
        System.out.println(Homework15.checkTicket(arrayLucky1));
        //System.out.println(Homework15.checkTicket(arrayLucky2));
        //System.out.println(Homework15.checkTicket(arrayLucky3));
    }
}

