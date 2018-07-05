package com.example.a4z;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;
public class MyPagerAdaper extends FragmentPagerAdapter{
    private List<Fragment>mDatas;
    private List<String>titleList;
    public MyPagerAdaper(FragmentManager fm,List<Fragment>mDatas,List<String>titleList) {
        super(fm);
        this.mDatas = mDatas;
        this.titleList = titleList;
    }
    @Override
    public Fragment getItem(int position) {
        return mDatas.get(position);
    }
    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }
}
