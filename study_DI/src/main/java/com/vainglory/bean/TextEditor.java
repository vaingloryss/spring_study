package com.vainglory.bean;

public class TextEditor {
    private SpellChecker spellChecker;


    /*
    //创建类对象形式，常规
    public TextEditor() {
        spellChecker = new SpellChecker();
    }
    */

    /*
    依赖注入的两种方式：
    构造器依赖注入（Constructor-based dependency injection）：当容器调用带有多个参数的构造函数类时，实现基于构造函数的 DI，每个代表在其他类中的一个依赖关系。
    setter方法依赖注入（Setter-based dependency injection）：基于 setter 方法的 DI 是通过在调用无参数的构造函数或无参数的静态工厂方法实例化 bean 之后容器调用 beans 的 setter 方法来实现的。
     */

    /*
    通过类的构造函数将依赖（SpellChecker）注入进来，
    整个过程由Spring框架管理，控制流就通过依赖注入得到了“反转”
     */
   /* public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }*/

    //通过setter方法赖注入实现控制反转
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
