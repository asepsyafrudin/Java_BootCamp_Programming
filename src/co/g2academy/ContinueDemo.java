package co.g2academy;

public class ContinueDemo {
    public static void main(String[] args) {
        String searchMe = "peter piper picked a pack if pickled peppers";
        int numPs = 0;

        for (int i = 0 ;  i < searchMe.length() ; i++) {
            if(searchMe.charAt(i) != 'p') {
                continue;
            }

            numPs ++;
        }
        System.out.println("Found " + numPs + " p's in the String ");
    }
}
