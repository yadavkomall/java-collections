import java.util.*;
public class QueueReversal {
    public static void reverse(Queue<Integer> q){
        Stack <Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());
        }

        while(!s.empty()){
            q.add(s.pop());
        }
    }
    public static void main(String args[]){
Queue <Integer> q = new LinkedList<>();
q.add(1);
q.add(2);
q.add(3);
q.add(4);
reverse(q);
while(!q.isEmpty()){
    System.out.print(q.peek()+" ");
    q.remove();
}System.out.println();
    }
}