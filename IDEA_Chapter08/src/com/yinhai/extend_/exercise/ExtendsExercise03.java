package com.yinhai.extend_.exercise;


public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("intel","16","500","IBN");
        NotePad notePad = new NotePad("intel","16","500","yellow");
        pc.infoPrint();
        notePad.infoPrint();
    }
}
class Computer{
    private String CPU;
    private String memory;
    private String disk;

    public Computer(String CPU, String memory, String disk) {
        this.CPU = CPU;
        this.memory = memory;
        this.disk = disk;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getDetails(){
        return CPU + " " + memory + " " + disk;
    }


}
class PC extends Computer{
    private String brand;

    public PC(String CPU, String memory, String disk, String brand) {
        super(CPU, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void infoPrint(){
        System.out.println(getDetails() + " " + getBrand());
    }
}
class NotePad extends Computer{
    String color;

    public NotePad(String CPU, String memory, String disk, String color) {
        super(CPU, memory, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void infoPrint(){
        System.out.println(getDetails() + " " + getColor());
    }
}
