package com.algebra.test.design.context;

import com.algebra.test.design.Strategy;
import com.algebra.test.design.strategy.NormalSpringStrategy;
import com.algebra.test.design.strategy.NormalStategy;
import com.algebra.test.design.strategy.VipSpringStrategy;
import com.algebra.test.design.strategy.VipStrategy;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author al
 * @date 2019/11/7 15:26
 * @description
 */
public class OperateContext {
    public static Map<String,Strategy> map = new HashMap<>();

    static {
        init();
    }

    private static void init(){
        map.put("vip",new VipStrategy());
        map.put("vip-spring",new VipSpringStrategy());
        map.put("normal",new NormalStategy());
        map.put("normal-spring",new NormalSpringStrategy());
        // ... ...
    }

    public static Strategy getStrategy(String key) throws Exception {
        key = key.toLowerCase();
        if (map.containsKey(key)) {
            return map.get(key);
        } else {
            throw new Exception("not find strategy named as " + key);
        }
    }

    public static void main(String[] args) {

        // 总是需要有一个key标志，来取用这个策略，可以实现新旧代码的分离，但是如果要添加新需求，还是比较麻烦

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您是否为会员：（vip-是，normal-否）");
        String member = sc.next();
        System.out.println("请输入购买金额：");
        BigDecimal money = sc.nextBigDecimal();

        String season = "spring";
        try {
            Strategy strategy = OperateContext.getStrategy(member+"-"+season);
            BigDecimal payPrice = strategy.calculatePayPrice(money);
            System.out.println("尊敬的顾客，您好，您实际的应付金额为:"+payPrice);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
