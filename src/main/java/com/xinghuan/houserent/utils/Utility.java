package com.xinghuan.houserent.utils;

import java.util.Scanner;

public class Utility {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * 读取键盘输入的一个菜单选项，值1-5范围
     * @return 1--5
     */
    public static char readMenuSelection(){
        char c;
        for(;;){
            String str = readKeyBoard(1, false);
            c = str.charAt(0);  //将字符串转换成char类型
            if(c != '1' && c != '2' && c != '3' && c != '4' && c != 5){
                System.out.println("选择错误，请重新输入：");
            }else break;
        }
        return c;
    }

    /**
     * 读取键盘输入的一个字符
     * @return 一个字符
     */
    public static char readChar(){
        String str = readKeyBoard(1, false);
        return str.charAt(0);
    }

    /**
     * 读取键盘输入一个字符，如果直接按回车，则返回指定默认值
     * @param defaultValue
     * @return 默认值或输入字符
     */
    public static char readChar(char defaultValue){
        String str = readKeyBoard(1, true);
        return (str.length() == 0 ? defaultValue : str.charAt(0));
    }

    /**
     * 读取键盘输入的整数，长度小于2字符
     * @return
     */
    public static int readInt(){
        int n;
        for(;;){
            String str = readKeyBoard(2, false);
            try{
                n = Integer.parseInt(str);
                break;
            }catch (NumberFormatException e){
                System.out.println("数字输入错误，请重新输入：");
            }
        }
        return n;
    }

    /**
     * 带默认参数的读取Int
     * @param defaultValue
     * @return
     */
    public static int readInt(int defaultValue){
        int n;
        for(;;){
            String str = readKeyBoard(10, true);
            if(str.equals("")){
                return defaultValue;
            }
            try{
                n = Integer.parseInt(str);
                break;
            }catch (NumberFormatException e){
                System.out.println("数字输入错误，请重新输入：");
            }
        }
        return n;
    }

    /**
     * 读取键盘输入指定长度的字符串，
     * @param limit 限制的长度
     * @return 指定长度的字符串
     */
    public static String readString(int limit){
        return readKeyBoard(limit, false);
    }

    /**
     * 读取键盘输入指定长度的字符串
     * @param limit 限制的长度
     * @param defaultValue 默认没有输入返回的字符串
     * @return 指定长度的字符串
     */
    public static String readString(int limit, String defaultValue){
        String str = readKeyBoard(limit, false);
        return str.equals("") ? defaultValue : str;
    }

    /**
     * 功能：读取键盘输入的确认选项，Y或N
     * @return Y 或 N
     */
    public static char readConfirmSelection(){
        System.out.println("请输入你的选择（Y/N）");
        char c;
        for(;;){
            String str = readKeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if(c == 'Y' || c == 'N'){
                break;
            } else{
                System.out.println("选择错误，请重新输入");
            }
        }
        return c;
    }
    private static String readKeyBoard(int limit, boolean blankReturn){
        String line = "";
        while(scanner.hasNextLine()){
            line = scanner.nextLine();
            if(line.length() == 0){
                if(blankReturn) return line;
                else continue;
            }
            if(line.length() < 1 || line.length() > limit){
                System.out.println("输入长度（不能大于" + limit + "），错误，请重新输入");
                continue;
            }
            break;
        }
        return line;
    }
}
