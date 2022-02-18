import java.io.Console;

public class App {


    public static String timeConversion(String s) {
        // Write your code here
            StringBuilder result = new StringBuilder();
            String[] splitData = s.split(":");
            StringBuilder typeOfTime = new StringBuilder(splitData[splitData.length-1].substring(2));
            System.out.println(typeOfTime);
           
                if ( typeOfTime.toString().equals("AM")){
                    StringBuilder hour = new StringBuilder( Integer.toString( Integer.parseInt( splitData[0])  ));
                    StringBuilder minutes = new StringBuilder(splitData[1]) ;
                    StringBuilder seconds= new StringBuilder(splitData[2].substring(0, 2));
                    System.out.println( hour.toString() + " " + minutes.toString() + " " + seconds.toString());
                    if ( splitData[0].equals("12")){
                        result.append("00").append(":").append(minutes).append(":").append(seconds);
                    }else {
                        result.append("0").append(hour).append(":").append(minutes).append(":").append(seconds);

                    }
                }

                if ( typeOfTime.toString().equals("PM")) {
                    StringBuilder hour = new StringBuilder( Integer.toString( Integer.parseInt( splitData[0]) + 12 ));
                    StringBuilder minutes = new StringBuilder(splitData[1]) ;
                    StringBuilder seconds= new StringBuilder(splitData[2].substring(0, 2));
                    System.out.println( hour.toString() + " " + minutes.toString() + " " + seconds.toString());
                    if ( splitData[0].equals("12")){
                        result.append("12").append(":").append(minutes).append(":").append(seconds);
                    }else {
                        result.append(hour).append(":").append(minutes).append(":").append(seconds);

                    }
                    
                }
                System.out.println(result.toString());
            
            return result.toString();
    
        }
    public static long repeatedString(String s, long n) {
        // Write your code here
            long counter =  0; 
            char firstString = 'a';
            for( int i  = 0 ; i < s.length() ; i ++){
                if ( s.charAt(i) == firstString){
                    counter ++ ;
                }
            }
            long replaceCounter = (long) (n / s.length());
            counter = counter * replaceCounter;
            long residual = n % s.length();
            for ( int i = 0 ; i < residual ; i ++ ){
                if ( s.charAt(i) == firstString){
                    counter ++ ;
                }
            }
            return counter;
        }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
       System.out.println( timeConversion("12:45:54PM"));
    }
}
