/**
 * 采用集成实现代理
 */

public class Car2 extends  Car {


    public void move() {
        System.out.println("汽车开始行驶");

        long startTime = System.currentTimeMillis();
        super.move();
        long endTime = System.currentTimeMillis();

        System.out.println("汽车行驶 "+ (endTime-startTime)+" 毫秒");
    }
}
