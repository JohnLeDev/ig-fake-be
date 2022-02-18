import java.util.List;
public class JavaThread1 implements Runnable{
    List<Person> persons ;
    JavaThread1(List<Person> persons ){
        this.persons= persons;
    };


    @Override
    public void run() {
        
        for(int i =0 ;  i  < 4 ; i++) {
            persons.add(new Person(i+4));
            int k = i+4;
            System.out.println( "Thread add " + k) ;
        }

    }
}
