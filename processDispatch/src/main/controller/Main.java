package main.controller;

import java.util.Scanner;

/**
 * @Date: 2018/11/18 10:17
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        Memory memory = null;
        Scanner in = new Scanner(System.in);
        System.out.print("请初始化内存大小:");
        int size = in.nextInt();
        memory = new Memory(size);
        memory.showZones();
        while (true){
            System.out.println("1.申请空间  2.回收空间  3.显示分区状况");
            System.out.print("请选择指令:");
            size = in.nextInt();
            switch (size) {
                case 1:
                    System.out.print("请输入需要申请的空间大小:");
                    size = in.nextInt();
                    memory.allocation(size);
                    break;
                case 2:
                    System.out.print("请输入需要回收的分区号:");
                    size = in.nextInt();
                    memory.collection(size);
                    break;
                case 3:
                    memory.showZones();
                    break;
                default:
                    System.out.println("请重新选择!");
            }
        }
    }

}