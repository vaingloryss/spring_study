package com.vainglory.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TextEditor {
    //用在属性上，省略setter方法
    @Autowired()

    //通过@Qualifier("textEditor1"),来指定为xml中的哪个bean进行自动装配
    //@Qualifier("textEditor1")
    private SpellChecker spellChecker;

    public TextEditor() {}

    //在构造函数上使用，也可以省略setter方法
    //@Autowired
    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    //用在setter方法上
    //@Autowired
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
