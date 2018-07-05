package com.example.a4z;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.example.a4z.frag.AnimationFragment;
import com.example.a4z.frag.CustomViewFragment;
import com.example.a4z.frag.OtherFragment;
import com.example.a4z.frag.TitleFragment;

import java.util.ArrayList;
import java.util.List;
/**
 * TabLayout和Fragment 联动的过程
 * 1.导包  选择project structure--->选择当前module--》选择dependencies-->选择+
 *          --->选择 library denpendency--->找到 compile 'com.android.support:design:'
 *         该后面的版本号为你的v7包的版本号，然后点击导入
 * 2.画布局，上面TabLayout，下面是ViewPager
 * 3.写代码
 *      1.查找控件
 *      2.创建Fragment（ViewPager当中有几种fragment，就创建几个）
 *      3.写数据源，两个集合  一个集合的泛型是Fragment，另一个表示标题是String
 *      4.像数据源当中添加数据
 *      5.创建ViewPager的适配器对象，构造方法传入FragmentManager，两个集合对象  getPageTitle
 *      6.设置适配器
 *      7.设置TabLayout和ViewPager的关联    setupWithViewPager
 * */
public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewpager;
    private List<Fragment>fragmentList;
    private List<String>titleList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout =   findViewById(R.id.tablayout);
        viewpager =   findViewById(R.id.viewpager);
        initPager();
    }
    private void initPager() {
        fragmentList = new ArrayList<>();
        titleList = new ArrayList<>();
        Fragment animFg = new AnimationFragment();
        Fragment viewFg = new CustomViewFragment();
        Fragment titleFg = new TitleFragment();
        Fragment otherFg = new OtherFragment();

        fragmentList.add(animFg);
        fragmentList.add(viewFg);
        fragmentList.add(titleFg);
        fragmentList.add(otherFg);
        titleList.add("动画");
        titleList.add("自定义View");
        titleList.add("组合View");
        titleList.add("其他");

        MyPagerAdaper pagerAdaper = new MyPagerAdaper(getSupportFragmentManager(), fragmentList,titleList);
        viewpager.setAdapter(pagerAdaper);
        tabLayout.setupWithViewPager(viewpager);
    }
}