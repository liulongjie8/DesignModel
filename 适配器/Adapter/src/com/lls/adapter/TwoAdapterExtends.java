package com.lls.adapter;

public class TwoAdapterExtends extends  GBTwoPlug implements  ThreePlugIF {

    @Override
    public void powerWithThree() {
        System.out.println("通过转换");
        this.powerWithTwo();
    }
}
