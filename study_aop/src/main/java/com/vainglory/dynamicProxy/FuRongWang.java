package com.vainglory.dynamicProxy;

/**
 * @author vaingloryss
 * @date 2019/9/24 0024 下午 8:42
 */
public class FuRongWang implements SellCigarette {
    @Override
    public void sell() {
        System.out.println("正宗芙蓉王，可扫码验证。");
    }
}
