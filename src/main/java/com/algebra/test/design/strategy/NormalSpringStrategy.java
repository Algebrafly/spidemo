package com.algebra.test.design.strategy;

import com.algebra.test.design.Strategy;

import java.math.BigDecimal;

/**
 * @author al
 * @date 2019/11/7 15:42
 * @description
 */
public class NormalSpringStrategy implements Strategy {
    @Override
    public BigDecimal calculatePayPrice(BigDecimal originalPrice) {
        BigDecimal discountPrice = null;
        if(originalPrice.compareTo(new BigDecimal(200)) >= 0){
            // 计算结果四舍五入
            discountPrice = originalPrice.multiply(new BigDecimal(0.75)).setScale(2,BigDecimal.ROUND_HALF_UP);
        } else if(originalPrice.compareTo(new BigDecimal(100)) >= 0){
            discountPrice = originalPrice.multiply(new BigDecimal(0.85)).setScale(2,BigDecimal.ROUND_HALF_UP);
        } else {
            discountPrice = originalPrice.setScale(2,BigDecimal.ROUND_HALF_UP);
        }
        return discountPrice;
    }
}
