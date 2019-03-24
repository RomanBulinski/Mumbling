public class Main {



    public static String accum(String s) {
        String result ="";
        char[] letters = s.toCharArray();
        for( int i=0; i<s.length(); i++  ){
            result = result + Character.toUpperCase(letters[i]);
            for ( int j=0; j<i; j++ ){
                result = result + Character.toLowerCase(letters[i]);
            }
            result = result + "-";
        }
        result = result.substring(0,result.length()-1);
        return result;
    }


}
