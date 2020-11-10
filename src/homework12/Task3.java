package homework12;

import java.util.ArrayDeque;

public class Task3 {
    public static void main(String[] args) {
        ArrayDeque<HeavyBox> deque = new ArrayDeque<>();
        deque.offer(new HeavyBox(20));
        deque.offer(new HeavyBox(25));
        deque.offer(new HeavyBox(27));
        System.out.println(deque);
        deque.offer(new HeavyBox(5));
        System.out.println(deque);
        for(int i = deque.size();i>=0;i--) {
            deque.poll();
        }
        System.out.println(deque);
    }
}
