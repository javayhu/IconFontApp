package com.github.hujiaweibujidao.iconfontapp;

import com.joanzapata.iconify.Icon;
import com.joanzapata.iconify.IconFontDescriptor;

public class FontelloModule implements IconFontDescriptor {

    @Override
    public String ttfFileName() {
        return "fontello.ttf";
    }

    @Override
    public Icon[] characters() {
        return FontelloIcons.values();
    }
}