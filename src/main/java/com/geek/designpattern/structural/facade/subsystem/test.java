package com.geek.designpattern.structural.facade.subsystem;


import com.geek.designpattern.structural.facade.subsystem.Computer;

/**
 * 本质封装调用 方便操作 jdbc 就是外观模式 门面模式
 */
public class test {

    public static void main(String[] args) {
//        CPU cpu = new CPU();
//        Disk disk =new Disk();
//        cpu.open();
//        disk.open();
        Computer computer = new Computer();
        computer.open();
        System.out.println("玩一会电脑!!");
        computer.close();
    }
}
