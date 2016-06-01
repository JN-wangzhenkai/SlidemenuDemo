package com.example.slidemenudemo;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingActivity;


public class MainActivity extends SlidingActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

  //   在Activity中通过SlidingMenu构造方法，直接设置侧滑菜单

//        SlidingMenu menu = new SlidingMenu(this);
//        menu.setMode(SlidingMenu.LEFT);
//        // 设置触摸屏幕的模式
//        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
//        menu.setShadowWidthRes(R.dimen.shadow_width);
//
//        menu.setShadowDrawable(R.mipmap.ic_launcher);
//
//        // 设置滑动菜单视图的宽度
//        menu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
//        // 设置渐入渐出效果的值
//        menu.setFadeDegree(0.35f);
//
//        menu.attachToActivity(this, SlidingMenu.SLIDING_WINDOW);
//        //为侧滑菜单设置布局
//        menu.setMenu(R.layout.leftmenu);

        //    2、通过把Activity继承SlidingActivity
//        a、继承SlidingActivity
//        b、然后在onCreate中setBehindContentView(R.layout.leftmenu); 设置侧滑菜单的布局
//        c、通过getSlidingMenu()得到SlidingMenu对象，然后设置样式

        setBehindContentView(R.layout.leftmenu);

         SlidingMenu menu = getSlidingMenu();
         menu.setMode(SlidingMenu.LEFT);
        // 设置触摸屏幕的模式
        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        menu.setShadowWidthRes(R.dimen.shadow_width);
        menu.setShadowDrawable(R.mipmap.ic_launcher);

        // 设置滑动菜单视图的宽度
        menu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        // 设置渐入渐出效果的值
        menu.setFadeDegree(0.35f);

    }
}
