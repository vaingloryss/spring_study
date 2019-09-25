package com.vainglory.staticProxy;

/**
 * @author vaingloryss
 * @date 2019/9/24 0024 下午 7:24
 *
 * RealMovie的代理类，增强RealMovie的功能，RealMovie 和 Cinema都实现了Movie接口
 */
public class Cinema implements Movie {
    RealMovie realMovie;
    public Cinema(RealMovie realMovie){
        super();
        this.realMovie = realMovie;
    }

    @Override
    public void play() {
        advertisement(true);
        realMovie.play();
        advertisement(false);
    }


    //增强的功能，电影播放前后播放广告
    public void advertisement(boolean isStart){
        if ( isStart ) {
            System.out.println("电影马上开始了，爆米花、可乐、口香糖9.8折，快来买啊！");
        } else {
            System.out.println("电影马上结束了，爆米花、可乐、口香糖9.8折，买回家吃吧！");
        }
    }
}
