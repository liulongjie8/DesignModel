/**
 * 采用聚合的方式来实现代理
 */
public class Car3 implements  MoveAble {

    private Car car;


    public void move() {
        System.out.println("汽车开始行驶");

        long startTime = System.currentTimeMillis();
        car.move();
        long endTime = System.currentTimeMillis();

        System.out.println("汽车行驶 "+ (endTime-startTime)+" 毫秒");
    }


    public Car3(Car car) {
        this.car = car;
    }
}
