package com.github.hujiaweibujidao.iconfontapp;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.joanzapata.iconify.Iconify;

public class MainActivity extends AppCompatActivity {

    private TextView textViewFontello;
    private TextView textViewIcoMoon;
    private TextView textViewIconFont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Iconify.with(new FontelloModule());
        Iconify.with(new IcomoonModule());

        textViewFontello = (TextView) findViewById(R.id.textView_fontello);
        textViewFontello.setText("{fe-github} {fe-spin1 spin} {fe-spin2 spin} {fe-spin3 spin} {fe-spin4 spin} {fe-spin5 spin}");

        textViewIcoMoon = (TextView) findViewById(R.id.textView_icomoon);
        textViewIcoMoon.setText("{im-spa} {im-spinner spin} {im-spinner2 spin} {im-spinner3 spin} {im-spinner4 spin}");

        textViewIconFont = (TextView) findViewById(R.id.textView_iconfont);
        textViewIconFont.setTypeface(Typeface.createFromAsset(getAssets(), "iconfont.ttf"));
        //使用方式1：显示正确
        textViewIconFont.setText("\ue601 \ue602 \uE603 \uE606");
        //使用方式2：显示出错，没有显示出图标
        textViewIconFont.setText("&#xe601; &#xe602; &#xe603; &#xe606;");
        //使用方式3：显示正确
        textViewIconFont.setText(R.string.text_iconfont_utf8);
        //使用方式4：显示正确
        textViewIconFont.setText(R.string.text_iconfont_unicode);
    }
}
