package com.lls.adapter;

public class TwoPlugAdapter implements ThreePlugIF {


    private  GBTwoPlug plug;

    public TwoPlugAdapter(GBTwoPlug twoPlug) {
          this.plug = twoPlug;
    }

    public void powerWithThree() {
        System.out.println("通过转换");
        this.plug.powerWithTwo();
    }
}
