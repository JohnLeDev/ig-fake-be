import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
       Set<String> list = new HashSet<>();
       
       list.add("A");
       list.add("B");
       list.add("C");
       list.add("D");

       
    //    for(String x : list){
    //         // list.remove("D");
    //        System.out.println(x);
    //    }

       Iterator<String> itr = list.iterator();
       while(itr.hasNext()){
            itr.next();
            itr.remove();
        //    if(s.equals("A")){
                // itr.remove();;
        //    }
           System.out.println(list);
       }

        // System.out.println("Hello, World!");
        // Person p1 = new Person(1);
        // Person p2 = new Person(2);
        // Person p3 = new Person(3);
        // Person p4 = new Person(4);

        // List<Person> listPerson = new Vector<Person>();
        // listPerson.add(p1);
        // listPerson.add(p2);
        // listPerson.add(p3);
        // listPerson.add(p4);


        // Person p = listPerson.get(3);
        // System.out.println(p.getId());
        // JavaThread thread = new JavaThread(listPerson);
        // Thread a = new Thread(thread);
        // a.start();
        // JavaThread1 thread1 = new JavaThread1(listPerson);
        // Thread a1 = new Thread(thread1);
        // a1.start();
        // LinkedList<Fraction> fractions = new LinkedList<>();
        // fractions.add(new Fraction(2,3));
        // fractions.add(new Fraction(30,40));
        // fractions.add(new Fraction(50,40));
        // Fraction.hello();
        // Fraction.hello1();

        //1
        // simplifyFractions(fractions);
        //2
        // totalFractions(fractions);
        //3
        // fractionGreatOne(fractions);
        //4
        // sortFractions(fractions);
    }
    private static void simplifyFractions(LinkedList<Fraction> fractions ){
        for(Fraction x : fractions) {
            x.simplifyFractions();
            x.show();
        }
    }

    private static void totalFractions ( LinkedList<Fraction> fractions ) {
        simplifyFractions(fractions);
        int demo = 1 ;
        int number= 0;
        for (Fraction x : fractions ) {
            
            demo = demo*x.getDemoninator();
        }
        for(Fraction x : fractions) {
            int tmp = demo / x.getDemoninator() ;
            number = number + tmp*x.getNumberator() ;
        }
        Fraction tmpFraction = new Fraction(number, demo) ;
        tmpFraction.simplifyFractions(); 
        System.out.println(  tmpFraction.getNumberator() +  "/" + tmpFraction.getDemoninator());
    }

    private static void fractionGreatOne(LinkedList<Fraction> fractions ){
        boolean isHaveGreatOne = false ;
        for (Fraction x : fractions ) {
            if ( x.getNumberator() > x.getDemoninator()){
                x.show();
                isHaveGreatOne= true;
            }
        }
        if(!isHaveGreatOne){
            System.out.println("null");
        }
    }
    private static void sortFractions(LinkedList<Fraction> fractions) {
        for ( int x = 0 ; x < fractions.size() ; x++ ){
            for(int i = 0 ; i < fractions.size() ; i++ ) {
                if ( fractions.get(x).value() > fractions.get(i).value()){
                    Fraction tmp = fractions.get(x);
                    fractions.set(x, fractions.get(i)) ;
                    fractions.set(i , tmp) ;
                }
            }
        }
        simplifyFractions(fractions);
    }
}
