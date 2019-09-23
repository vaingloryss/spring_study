package com.vainglory.config;

import com.vainglory.domain.SpellChecker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpellCheckerConfig {

    @Bean(name = "spellChecker")
    public SpellChecker spellChecker(){
        SpellChecker spellChecker = new SpellChecker();
        return spellChecker;
    }
}
