public class CarTimeProxy implements MoveAble {

    private MoveAble moveAble;

    public void move() {
        System.out.println("汽车开始行驶");

        long startTime = System.currentTimeMillis();
        moveAble.move();
        long endTime = System.currentTimeMillis();

        System.out.println("汽车行驶结束 -------> 汽车行驶 "+ (endTime-startTime)+" 毫秒");
    }


    public CarTimeProxy(MoveAble moveAble) {
        this.moveAble = moveAble;
    }
}
