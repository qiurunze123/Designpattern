package com.geek.designpattern.structural.facade.subsystem;

import com.geek.designpattern.structural.facade.subsystem.CPU;
import com.geek.designpattern.structural.facade.subsystem.Disk;

public class Computer {
    private CPU cpu ;
    private Disk disk;
    public Computer(){
        this.cpu = new CPU();
        this.disk = new Disk();
    }

    public void open(){
        this.cpu.open();
        this.disk.open();
    }
    public void close(){
        this.cpu.close();
        this.disk.close();
    }

}
