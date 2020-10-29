package co.g2academy;

public class ContinueWithLabelDemo {
    public static void main(String[] args) {
        String searchMe = "Look for a substring in me" ;
        String substring = "sub";
        boolean found = false;

        int max = searchMe.length() - substring.length();

        test:
            for (int i = 0 ; i<max ;  i++) {
                int n = substring.length();
                int j = i ;
                int k = 0 ;
                while(n-- != 0) {
                    if(searchMe.charAt(j++) != substring.charAt(k++)) {
                        continue test;
                    }
                }
                found = true;
                break test;
            }
        System.out.println(found ? "Found it " : "Didn't found it");

        int index = searchMe.indexOf(substring);
        System.out.println(" I Found " + substring + " on the index number " + index + " of "+ searchMe);

    }
}
