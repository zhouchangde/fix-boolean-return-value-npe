package com.github.hcsp.datatype;

public class Light {
    // 一盏灯可能有三种状态：
    // 亮 -> true
    // 灭 -> off
    // 未知 -> null
    Boolean on;

    public Light(Boolean on) {
        this.on = on;
    }

    public Boolean isOn() {
        if(on == null) {
            return false;
        }else {
            return on;
        }
    }
}
