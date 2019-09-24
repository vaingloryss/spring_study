package com.vainglory.dynamicProxy;

/**
 * @author vaingloryss
 * @date 2019/9/24 0024 下午 8:26
 */
public class WuLiangYe implements SellWine {
    @Override
    public void sell() {
        System.out.println("我卖的是五粮液。");
    }
}
