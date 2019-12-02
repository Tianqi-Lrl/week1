package com.bawei.week1.contract;

import com.bawei.week1.model.Bean;

/**
 * Time:2019/12/2
 * Author:天祈Aa
 * Description:
 */
public interface IMyContract {

    interface IModelCallBack{
        void onMySuccess(Bean bean);
        void onMyFailure(Throwable throwable);
    }

    interface IView{
        void onMySuccess(Bean bean);
        void onMyFailure(Throwable throwable);
    }
}
