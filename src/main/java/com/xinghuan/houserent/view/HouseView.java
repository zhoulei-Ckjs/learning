package com.xinghuan.houserent.view;

import com.xinghuan.houserent.utils.Utility;

public class HouseView {
    private boolean loop = true;    //控制显示菜单
    private char key = ' ';         //接收用户选择
    public void mainMenu(){
        do {
            System.out.println("====================房屋出租系统===================");
            System.out.println("\t\t\t1 新增房源");
            System.out.println("\t\t\t1 查找房源");
            System.out.println("\t\t\t3 删除房屋信息");
            System.out.println("\t\t\t4 修改房屋信息");
            System.out.println("\t\t\t5 房屋列表");
            System.out.println("\t\t\t6 退出");
            System.out.print("\t\t\t请输入你的选择（1-6）:");
            key = Utility.readChar();
            switch (key){
                case '1':
                    System.out.println("新增");break;
                case '2':
                    System.out.println("查找");break;
                case '3':
                    System.out.println("删除");break;
                case '4':
                    System.out.println("修改");break;
                case '5':
                    System.out.println("房屋列表");break;
                case '6':
                    System.out.println("退出");
                    loop = false;
                    break;
            }
        }while (loop);
    }

}
