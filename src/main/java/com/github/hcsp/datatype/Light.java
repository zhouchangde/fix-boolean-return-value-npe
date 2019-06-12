package com.github.hcsp.datatype;

public class Light {
    // 一盏灯可能有三种状态：
    // 亮 -> true
    // 灭 -> off
    // 未知 -> null
    Boolean on;

    public Light(Boolean on) {
        if(on != null){
            this.on = on;
        } else {
            this.on = false;
        }

    }

    // 当灯亮时返回true，灭和未知状态返回false
    public boolean isOn() {
        return on;
    }
}
