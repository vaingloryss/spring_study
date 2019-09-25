import com.vainglory.jdkDynamicProxy.*;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author vaingloryss
 * @date 2019/9/24 0024 下午 7:53
 *
 * 动态代理测试类
 */
public class TestDynamicProxy {
    /**
     * 测试卖一种酒
     */
    @Test
    public void test01(){
        MaoTaiWine maoTaiWine = new MaoTaiWine();
        InvocationHandler sellMaoTaiProxy = new Counter_a(maoTaiWine);
        SellWine dynamicProxyMaoTai = (SellWine) Proxy.newProxyInstance(MaoTaiWine.class.getClassLoader(), MaoTaiWine.class.getInterfaces(), sellMaoTaiProxy);
        dynamicProxyMaoTai.sell();
    }

    /**
     * 测试卖两种酒
     */
    @Test
    public void test02(){
        //被代理的对象
        MaoTaiWine maoTaiWine = new MaoTaiWine();
        WuLiangYe wuLiangYe = new WuLiangYe();

        //创建每个被代理对象的调用处理器
        InvocationHandler sellMaoTaiProxy = new Counter_a(maoTaiWine);
        InvocationHandler sellWuLiangYeProxy = new Counter_a(wuLiangYe);

        //动态的创建代理对象（Counter_a），增强被代理对象的功能
        SellWine dynamicProxyMaoTai = (SellWine) Proxy.newProxyInstance(MaoTaiWine.class.getClassLoader(), MaoTaiWine.class.getInterfaces(), sellMaoTaiProxy);
        SellWine dynamicProxyWuLiangYe = (SellWine) Proxy.newProxyInstance(WuLiangYe.class.getClassLoader(), WuLiangYe.class.getInterfaces(), sellWuLiangYeProxy);

        //使用动态创建出来的代理对象
        dynamicProxyMaoTai.sell();
        dynamicProxyWuLiangYe.sell();
    }

    /**
     * 测试卖酒还卖烟
     */
    @Test
    public void test03(){
        //被代理的对象
        MaoTaiWine maoTaiWine = new MaoTaiWine();
        WuLiangYe wuLiangYe = new WuLiangYe();
        FuRongWang fuRongWang = new FuRongWang();

        //创建每个被代理对象的调用处理器
        InvocationHandler sellMaoTaiProxy = new Counter_a(maoTaiWine);
        InvocationHandler sellWuLiangYeProxy = new Counter_a(wuLiangYe);
        InvocationHandler sellFuRongWang = new Counter_a(fuRongWang);

        //动态的创建代理对象（Counter_a），增强被代理对象的功能
        SellWine dynamicProxyMaoTai = (SellWine) Proxy.newProxyInstance(MaoTaiWine.class.getClassLoader(), MaoTaiWine.class.getInterfaces(), sellMaoTaiProxy);
        SellWine dynamicProxyWuLiangYe = (SellWine) Proxy.newProxyInstance(WuLiangYe.class.getClassLoader(), WuLiangYe.class.getInterfaces(), sellWuLiangYeProxy);
        SellCigarette dynamicProxyFuRongWang = (SellCigarette) Proxy.newProxyInstance(FuRongWang.class.getClassLoader(), FuRongWang.class.getInterfaces(), sellFuRongWang);

        //使用动态创建出来的代理对象
        dynamicProxyMaoTai.sell();
        dynamicProxyWuLiangYe.sell();
        dynamicProxyFuRongWang.sell();

        //输出动态代理产生的代理类的名称
        System.out.println("dynamicProxyMaoTai的名称 = " + dynamicProxyMaoTai.getClass().getName());
        System.out.println("dynamicProxyWuLiangYe的名称 = " + dynamicProxyWuLiangYe.getClass().getName());
        System.out.println("dynamicProxyFuRongWang的名称 = " + dynamicProxyFuRongWang.getClass().getName());
    }

}
