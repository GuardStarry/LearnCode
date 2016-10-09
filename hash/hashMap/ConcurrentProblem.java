package hash.hashMap;

import java.util.HashMap;

/**
 * Created by Misaka on 16/8/21.
 */
public class ConcurrentProblem {

    private HashMap map = new HashMap();

    public ConcurrentProblem(){

        Thread threadOne = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    map.put(new Integer(i), i);
                }
                System.out.println("One Over");
            }
        };

        Thread threadTwo = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    map.put(new Integer(i), i);
                }
                System.out.println("Two Over");
            }
        };

        Thread threadThree = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    map.put(new Integer(i), i);
                }
                System.out.println("Three Over");
            }
        };

        Thread threadFour = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    map.put(new Integer(i), i);
                }
                System.out.println("Four Over");
            }
        };

        Thread threadFive = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    map.put(new Integer(i), i);
                }
                System.out.println("Five Over");
            }
        };

        Thread threadSix = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    map.get(new Integer(i));
                }
                System.out.println("Five Over");
            }
        };
    }

}
