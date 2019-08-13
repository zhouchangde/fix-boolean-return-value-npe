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

    // 当灯亮时返回true，灭和未知状态返回false
    public boolean isOn() {
        if (this.on == null || this.on == false){
            return false;
        }else
            return true;
    }

    public boolean isOn1(){
        // 这里会报空指针异常；这是因为this.on 会去找这个值，找不到这个值，就会报异常；
        // 同样得逻辑，isOn()就不会出错
        if (this.on == true){
          return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Light light = new Light(null);
        System.out.println(light.isOn());

        // 这里会报空指针异常
        System.out.println(light.isOn1());
    }
}
