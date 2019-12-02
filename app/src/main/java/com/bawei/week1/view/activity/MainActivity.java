package com.bawei.week1.view.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.bawei.week1.R;
import com.bawei.week1.base.BaseActivity;
import com.bawei.week1.view.fragment.HomeFragment;
import com.bawei.week1.view.fragment.MyFragment;
import com.bawei.week1.view.fragment.NewsFragment;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {


    private ViewPager vp;
    private RadioGroup rg;
    ArrayList<Fragment> list=new ArrayList<>();

    @Override
    protected void initData() {
        list.add(new HomeFragment());
        list.add(new NewsFragment());
        list.add(new MyFragment());

        vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });
    }

    @Override
    protected void initView() {
        vp = findViewById(R.id.vp);
        rg = findViewById(R.id.rg);

        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                rg.check(rg.getChildAt(position).getId());
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rb1:

                        vp.setCurrentItem(0);

                        break;
                    case R.id.rb2:

                        vp.setCurrentItem(1);

                        break;
                    case R.id.rb3:

                        vp.setCurrentItem(2);

                        break;
                }
            }
        });
    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }
    public void ToMyPage(){
        vp.setCurrentItem(2);
    }
}
