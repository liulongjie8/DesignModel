package com.lls.pattern.template;

public class Test {

    public static void main(String[] args) {
        System.out.println("我们在制作咖啡：-----> start");

        Coffee coffee = new Coffee();

        coffee.prepareBeverageTemplate();

        System.out.println("咖啡制作完毕------> end ");

        System.out.println("--------------------------------------------");


        System.out.println("我们在制作茶：-----> start");

        Tea tea = new Tea();

        tea.prepareBeverageTemplate();

        System.out.println("茶制作完毕------> end ");
    }
}
