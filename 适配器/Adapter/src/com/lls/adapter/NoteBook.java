package com.lls.adapter;

public class NoteBook {

    private ThreePlugIF plug;

    public NoteBook(ThreePlugIF plug) {
        this.plug = plug;
    }

    //使用插座充电
    public void charge() {
        this.plug.powerWithThree();
    }

    public static void main(String[] args) {

        GBTwoPlug twoPlug = new GBTwoPlug();

        ThreePlugIF threePlug = new TwoPlugAdapter(twoPlug);

        NoteBook book = new NoteBook(threePlug);

        book.charge();


        NoteBook book1 = new NoteBook(new TwoAdapterExtends());
        book1.charge();

    }
}
