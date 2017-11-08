package com.example.hp1.audiomri;

/**
 * Created by Hp1 on 27/09/2017.
 */

public class Item {
    private String tv1;
    private int ig1;

    public Item(String tv1, int ig1) {
        this.tv1 = tv1;
        this.ig1 = ig1;
    }

    public String getTv1() {
        return tv1;
    }

    public int getIg1() {
        return ig1;
    }

    public void setTv1(String tv1) {
        this.tv1 = tv1;
    }

    public void setIg1(int ig1) {
        this.ig1 = ig1;
    }
}
