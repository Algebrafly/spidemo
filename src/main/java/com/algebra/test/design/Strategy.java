package com.algebra.test.design;

import java.math.BigDecimal;

/**
 * @author al
 * @date 2019/11/7 15:26
 * @description
 */
public interface Strategy {

    /**
     * 计算最终付款价格
     * @param originalPrice 商品原价
     * @return 折扣后价格
     */
    BigDecimal calculatePayPrice(BigDecimal originalPrice);

}
