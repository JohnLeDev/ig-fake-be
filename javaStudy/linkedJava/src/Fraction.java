import java.io.Console;



public class Fraction {
        private int numberator ;
        private int denominator;
        static int a = 0 ;
        Fraction( int a , int b){
            this.numberator = a;
            this.denominator = b; 
        }
        public static void hello() {
            System.out.println("hello" + a ) ;
            a = a +1 ;
            System.out.println("hello" + a ) ;
        };
        public static void hello1(){
            System.out.println("hello" + a ) ;
        }
        public void setNumberator( int numberator ) {
            this.numberator= numberator;

        }
        public int getNumberator() {
            return  numberator;
        }

        public void setDemoninator(int demoninator ){
            this.denominator = demoninator ;
        }
        public int getDemoninator() {
            return denominator ;
        }


        private int gcdExe( int a , int b) {
            if( b == 0) {
                return a ;
            }
            return gcdExe( b, a%b ) ;
        }
        private int gcd(){
           
            return gcdExe(numberator,denominator);
        }
        // public int scm(){
        //     return  Math.abs(numberator * denominator) / gcd() ;
        // }
        public void simplifyFractions() {
            int gcd = gcd();
            this.setNumberator( numberator / gcd) ;
            this.setDemoninator( denominator / gcd ) ;
        }

        public void show() {
            System.out.println( numberator + " / "  + denominator );
        }
        public  long value() {
            return numberator/denominator;
        }
}
