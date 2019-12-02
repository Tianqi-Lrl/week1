package com.bawei.week1.view.fragment;

import android.view.View;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.view.menu.MenuAdapter;

import com.bawei.week1.R;
import com.bawei.week1.base.BaseFragment;
import com.bawei.week1.contract.IMyContract;
import com.bawei.week1.model.Bean;
import com.bawei.week1.persenter.MyPersenter;
import com.bawei.week1.view.adapter.MyAdapter;

import java.util.List;

/**
 * Time:2019/12/2
 * Author:天祈Aa
 * Description:
 */
public class MyFragment extends BaseFragment implements IMyContract.IView {

    private GridView gv;

    @Override
    protected void initView(View view) {
        gv = view.findViewById(R.id.gv);
    }

    @Override
    protected int layoutId() {
        return R.layout.fragment_my;
    }

    @Override
    protected void initData() {

        MyPersenter myPersenter = new MyPersenter();
        myPersenter.getMyData(this);

    }

    @Override
    public void onMySuccess(Bean bean) {
        Toast.makeText(getActivity(), "请求成功", Toast.LENGTH_SHORT).show();
        List<Bean.DataBean> data = bean.getData();
        gv.setAdapter(new MyAdapter(data));
    }

    @Override
    public void onMyFailure(Throwable throwable) {
        Toast.makeText(getActivity(), "请求失败", Toast.LENGTH_SHORT).show();
    }
}
