package com.vainglory.staticProxy;

/**
 * @author vaingloryss
 * @date 2019/9/24 0024 下午 7:22
 *
 * Movie的具体实现类，真正具有播放电影功能
 */
public class RealMovie implements Movie {
    @Override
    public void play() {
        System.out.println("您正在观看电影《肖申克的救赎》");
    }
}
