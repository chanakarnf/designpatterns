package compositesPattern;

import java.util.ArrayList;
import java.util.Iterator;


public class Flock implements Quackable{
    ArrayList quackers = new ArrayList();
    int count =0;
    public void add(Quackable quacker) {
        quackers.add(quacker);
        if (count ==0 ){
            count=1;
        }
    }
    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable)iterator.next();
            quacker.quack();
            if (count ==1){
                quacker.quack();
                quacker.quack();
                count++;
            }
        }

    }
}
