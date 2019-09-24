package com.vainglory.dynamicProxy;

/**
 * @author vaingloryss
 * @date 2019/9/24 0024 下午 7:44
 *
 * SellWine的具体实现类，卖酒
 */
public class MaoTaiWine implements SellWine {
    @Override
    public void sell() {
        System.out.println("我卖得是茅台酒。");
    }
}
