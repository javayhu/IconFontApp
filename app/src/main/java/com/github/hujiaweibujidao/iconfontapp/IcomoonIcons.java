package com.github.hujiaweibujidao.iconfontapp;

import com.joanzapata.iconify.Icon;

public enum IcomoonIcons implements Icon {
    im_spinner('\ue97a'),
    im_spinner2('\ue97b'),
    im_spinner3('\ue97c'),
    im_spinner4('\ue97d'),
    im_spinner6('\ue97f'),
    im_spinner9('\ue982'),
    im_spinner10('\ue983'),
    im_spa('\ue900');

    char character;

    IcomoonIcons(char character) {
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