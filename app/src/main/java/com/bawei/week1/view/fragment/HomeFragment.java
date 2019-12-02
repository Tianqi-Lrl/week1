package com.bawei.week1.view.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.week1.R;
import com.bawei.week1.base.BaseFragment;
import com.bawei.week1.util.NetUtil;

/**
 * Time:2019/12/2
 * Author:天祈Aa
 * Description:
 */
public class HomeFragment extends BaseFragment {

    private TextView tv;
    private ImageView iv;

    @Override
    protected void initView(View view) {
        tv = view.findViewById(R.id.tv);
        iv = view.findViewById(R.id.iv);
    }

    @Override
    protected int layoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initData() {

        if (NetUtil.getInstance().HasNet(getContext())){
            tv.setVisibility(View.VISIBLE);
            iv.setVisibility(View.GONE);
        }else {
            tv.setVisibility(View.GONE);
            iv.setVisibility(View.VISIBLE);
        }

    }
}
