import com.vainglory.staticProxy.Cinema;
import com.vainglory.staticProxy.Movie;
import com.vainglory.staticProxy.RealMovie;
import org.junit.Test;

/**
 * @author vaingloryss
 * @date 2019/9/25 0025 上午 8:11
 *
 * 静态代理测试类
 */
public class TestStaticProxy {
    @Test
    public void test01(){
        RealMovie realMovie = new RealMovie();
        Movie movie = new Cinema(realMovie);
        movie.play();
    }
}
