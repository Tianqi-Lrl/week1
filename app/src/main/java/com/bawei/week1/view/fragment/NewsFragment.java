package com.bawei.week1.view.fragment;

import android.view.View;
import android.widget.Button;

import androidx.fragment.app.FragmentActivity;

import com.bawei.week1.R;
import com.bawei.week1.base.BaseFragment;
import com.bawei.week1.view.activity.MainActivity;

/**
 * Time:2019/12/2
 * Author:天祈Aa
 * Description:
 */
public class NewsFragment extends BaseFragment {

    private Button b;

    @Override
    protected void initView(View view) {
        b = view.findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity activity = (MainActivity) getActivity();
                activity.ToMyPage();
            }
        });
    }

    @Override
    protected int layoutId() {
        return R.layout.fragment_news;
    }

    @Override
    protected void initData() {

    }
}
