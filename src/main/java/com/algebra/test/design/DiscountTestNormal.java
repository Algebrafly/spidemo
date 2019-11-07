package com.algebra.test.design;

import java.util.Scanner;

/**
 * @author al
 * @date 2019/11/7 15:13
 * @description 折扣需求测试: if-else + switch-case
 */
public class DiscountTestNormal {
    public static void main(String[] args) {
        // 键盘录入信息，并获取所录的信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您是否为会员：（y-是，n-否）");
        char member = sc.next().charAt(0);
        System.out.println("请输入购买金额：");
        double money = sc.nextDouble();
        //利用switch语句和if-else语句进行判断
        switch(member){
            case'y':
                if (money >= 200) {
                    System.out.println("尊敬的顾客，您好，您实际的应付金额为:"+money*0.7);
                } else if(money >= 100) {
                    System.out.println("尊敬的顾客，您好，您实际的应付金额为:"+money*0.8);
                } else {
                    System.out.println("尊敬的顾客，您好，您实际的应付金额为:"+money);
                }
                break;
            case 'n':
                if (money >= 200) {
                    System.out.println("尊敬的顾客，您好，您实际的应付金额为:"+money*0.8);
                } else if(money >= 100) {
                    System.out.println("尊敬的顾客，您好，您实际的应付金额为:"+money*0.9);
                } else {
                    System.out.println("尊敬的顾客，您好，您实际的应付金额为:"+money);
                }
                break;
            default:
                System.out.println("请按照提示输入正确信息！");
        }
    }
}
