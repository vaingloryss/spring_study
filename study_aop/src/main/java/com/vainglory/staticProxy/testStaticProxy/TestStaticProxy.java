package com.vainglory.staticProxy.testStaticProxy;

import com.vainglory.staticProxy.Cinema;
import com.vainglory.staticProxy.Movie;
import com.vainglory.staticProxy.RealMovie;
import org.junit.Test;

/**
 * @author vaingloryss
 * @date 2019/9/24 0024 下午 7:31
 *
 *静态代理测试类
 */
public class TestStaticProxy {
    @Test
    public void test01(){
        RealMovie realMovie = new RealMovie();
        Movie movie = new Cinema(realMovie);
        movie.play();
    }
}
