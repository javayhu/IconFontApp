package com.github.hujiaweibujidao.iconfontapp;

import com.joanzapata.iconify.Icon;
import com.joanzapata.iconify.IconFontDescriptor;

public class IcomoonModule implements IconFontDescriptor {

    @Override
    public String ttfFileName() {
        return "icomoon.ttf";
    }

    @Override
    public Icon[] characters() {
        return IcomoonIcons.values();
    }
}