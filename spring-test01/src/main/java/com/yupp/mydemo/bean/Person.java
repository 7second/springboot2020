package com.yupp.mydemo.bean;

public class Person {

    private Axe axe;
    //设置注入所需要的setter方法
    public void setAxe(Axe axe){
        this.axe=axe;
    }

    public void useAxe(){
        System.out.println("我打算去砍柴");
        System.out.println(axe.chop());
    }
}
