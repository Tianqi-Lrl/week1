package com.bawei.week1.persenter;

import com.bawei.week1.contract.IMyContract;
import com.bawei.week1.model.Bean;
import com.bawei.week1.model.MyModel;

/**
 * Time:2019/12/2
 * Author:天祈Aa
 * Description:
 */
public class MyPersenter {
    public void getMyData(final IMyContract.IView iView){

        MyModel myModel = new MyModel();
        myModel.getMyData(new IMyContract.IModelCallBack() {
            @Override
            public void onMySuccess(Bean bean) {
                iView.onMySuccess(bean);
            }

            @Override
            public void onMyFailure(Throwable throwable) {
                iView.onMyFailure(throwable);
            }
        });

    }
}
