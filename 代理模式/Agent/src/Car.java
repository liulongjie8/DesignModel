import java.util.Random;

/**
 *
 */
public class Car implements MoveAble {

    public void move() {
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
