import java.util.List;

public class JavaThread implements Runnable {

    List<Person> persons ;
    JavaThread(List<Person> persons ){
        this.persons= persons;
    };


    @Override
    public void run() {
        for(int i =0 ;  i  < 4 ; i++)  {
            persons.remove(i);
            System.out.println( "Thread remove "+ i)  ;
        }

    }
    
}
