public class CarLogProxy implements  MoveAble {

    private MoveAble able;

    public void move() {
        System.out.println("开始记录日志");

        able.move();


        System.out.println("结束记录日志");
    }

    public CarLogProxy(MoveAble able) {
        this.able = able;
    }
}
