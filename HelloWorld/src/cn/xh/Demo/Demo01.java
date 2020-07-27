package cn.xh.Demo;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println("hello world! ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        System.out.println(num);
//        String str=input.next();
//        System.out.println(num+str);
        int[] array={1,2,3,4};

        array[0]=8;
        System.out.println(array[0]);
    }
}
