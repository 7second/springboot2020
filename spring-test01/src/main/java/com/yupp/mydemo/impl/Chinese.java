package com.yupp.mydemo.impl;

import com.yupp.mydemo.Axe;
import com.yupp.mydemo.Person;

public class Chinese implements Person {

    private Axe axe;

    //设值注入
//    public void setAxe(Axe axe) {
//        this.axe = axe;
//    }

    //构造注入

    public Chinese(Axe axe) {
        this.axe = axe;
    }

    public void useAxe() {
        System.out.println(axe.chop());

    }
}
