package com.bawei.week1.model;

import com.bawei.week1.contract.IMyContract;
import com.bawei.week1.util.NetUtil;
import com.google.gson.Gson;

/**
 * Time:2019/12/2
 * Author:天祈Aa
 * Description:
 */
public class MyModel {
    public void getMyData(final IMyContract.IModelCallBack iModelCallBack){
        NetUtil.getInstance().getJson("http://blog.zhaoliang5156.cn/api/shop/shop1.json", new NetUtil.MyCallBack() {
            @Override
            public void getjson(String json) {
                Bean bean = new Gson().fromJson(json, Bean.class);
                iModelCallBack.onMySuccess(bean);
            }

            @Override
            public void error(Throwable throwable) {
                iModelCallBack.onMyFailure(throwable);
            }
        });
    }
}
