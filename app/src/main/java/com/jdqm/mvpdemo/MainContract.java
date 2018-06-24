package com.jdqm.mvpdemo;

/**
 * 契约类，定义View和Presenter的接口协议
 *
 * Created by jdqm on 2018-6-24.
 */

public class MainContract {
    interface View extends BaseView<MainContract.Presenter> {
        void showMessage(String msg);
    }

    interface Presenter extends BasePresenter {
        String getMessage();
    }
}
