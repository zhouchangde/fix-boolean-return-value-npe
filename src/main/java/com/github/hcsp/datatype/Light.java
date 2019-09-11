package com.github.hcsp.datatype;

public class Light {
    // 一盏灯可能有三种状态：
    // 亮 -> true
    // 灭 -> off
    // 未知 -> null
    Boolean on;//这里声明了一个变量on

    public Light(Boolean on) {//这里自己还创造了一个构造器，并传进来一个布尔值
        this.on = on;//将布尔变量赋值为传进来的b布尔值
    }

    // 当灯亮时返回true，灭和未知状态返回false
    public boolean isOn() {
        return  (on==null||on==false)?false:true;//三元运算符表达式后面是不能使用return。
    }
}
