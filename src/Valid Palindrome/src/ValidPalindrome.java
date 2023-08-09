public class ValidPalindrome {


    public boolean isPalindrome(String s) {

        String newStr = "";

        for ( int i = 0; i < s.length(); i++ ) {
            if ( Character.isAlphabetic(s.charAt(i)) || Character.isDigit( s.charAt(i)) ) {
                newStr += Character.toString( Character.toLowerCase( s.charAt(i)) );
            }
        }

        String revString = "";

        for ( int i = 0; i < newStr.length(); i++ ) {
            revString += Character.toString( newStr.charAt( newStr.length() - 1 - i) );
        }

        if ( newStr.equals( revString )) {
            return true;
        }

        return false;
    }


    public static void main( String[] args ) {

        ValidPalindrome v = new ValidPalindrome();

        System.out.println( v.isPalindrome("0P") );

    }
}
