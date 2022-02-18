import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class Cau3 {
    private String data;
    public Cau3(String  data){
        this.data =data;
    }

    public Queue<String> checkduplicate () {

        char[] charArray = data.toCharArray();
        Stack<Character> stack = new Stack<>() ;
        String tmp = "";
        Queue<String> queues = new LinkedList<>(); 
        int position = 0;
        // ((a+b)+((x)))
        for ( char x : charArray) {
            stack.push(x);
            
            if ( x == ')' ) {
                stack.pop() ;
               
                int counter = 0;
                
                while ( stack.peek() != '('){
                    tmp = stack.pop() + tmp ;
                   
                    counter++;
                  
                }
                stack.pop();
                if ( counter < 1){
                    queues.add(tmp);
                    
                }
              
                
                
            }else {
                tmp="";
            } 
        }
        return queues;
    }

}
