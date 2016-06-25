package com.github.hujiaweibujidao.iconfontapp;

import com.joanzapata.iconify.Icon;

public enum FontelloIcons implements Icon {
    fe_spin1('\uE800'),
    fe_spin2('\uE801'),
    fe_spin3('\uE802'),
    fe_spin4('\uE803'),
    fe_spin5('\uE804'),
    fe_github('\uE816');

    char character;

    FontelloIcons(char character) {
        this.character = character;
    }

    @Override
    public String key() {
        return name().replace('_', '-');
    }

    @Override
    public char character() {
        return character;
    }
}