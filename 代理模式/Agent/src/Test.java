public class Test {

    public static void main(String[] args) {
        //使用继承实现代理
        MoveAble car = new Car2();
        car.move();
        System.out.println("******************************************");
        //使用聚合实现代理
        Car base = new Car();
        car = new Car3(base);
        car.move();

        System.out.println("******************************************");



        CarTimeProxy timeProxy = new CarTimeProxy(base);

        CarLogProxy logProxy = new CarLogProxy(timeProxy);

        logProxy.move();



    }
}
