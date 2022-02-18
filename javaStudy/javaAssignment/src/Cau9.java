import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class Cau9 { 
    private int number;
    public Cau9(int number){
        this.number = number;
    }
    
    
   
    public String usingStack() {
        Stack<Character> stacks = new Stack<>();
        char[] chars = ("" + number).toCharArray();
        System.out.println(chars);
        for(Character x : chars){
            stacks.push(x);
        }
        String a ="" ;
        while(!stacks.isEmpty()){
            a = a + stacks.pop();
        }
        
        
        return a ;
    }
    public String usingQueue() {
        Queue<Character> queues = new LinkedList<>();
        char[] chars = ("" + number).toCharArray();
        System.out.println(chars);
        for(Character x : chars){
            queues.add(x);
        }
        String a ="" ;
        while(!queues.isEmpty()){
            a = queues.remove() + a;
        }
        
        
        return a ;
    }
}