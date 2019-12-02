package com.bawei.week1.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.week1.R;
import com.bawei.week1.model.Bean;
import com.bawei.week1.util.NetUtil;

import java.util.List;

/**
 * Time:2019/12/2
 * Author:天祈Aa
 * Description:
 */
public class MyAdapter extends BaseAdapter {
    List<Bean.DataBean> list;

    public MyAdapter(List<Bean.DataBean> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder=null;
        if (view==null){
            view=View.inflate(viewGroup.getContext(), R.layout.show,null);
            viewHolder=new ViewHolder();
            viewHolder.imageView=view.findViewById(R.id.iv);
            viewHolder.textView=view.findViewById(R.id.tv);
            view.setTag(viewHolder);
        }else {
            viewHolder= (ViewHolder) view.getTag();
        }
        Bean.DataBean dataBean = list.get(i);
        viewHolder.textView.setText(dataBean.getGoods_name());
        NetUtil.getInstance().getPhoto(dataBean.getGoods_thumb(),viewHolder.imageView);


        return view;
    }
    class ViewHolder{
        ImageView imageView;
        TextView textView;
    }
}
