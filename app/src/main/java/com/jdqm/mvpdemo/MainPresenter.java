package com.jdqm.mvpdemo;

/**
 * 处理所里放在此类中，处理完成后，通过view的显示接口显示数据
 * Created by Jdqm on 2018-6-24.
 */

public class MainPresenter implements MainContract.Presenter {
    private MainContract.View view;
    private MainData data;

    public MainPresenter(MainContract.View view) {
        this.view = view;
    }

    @Override
    public String getMessage() {
        view.showMessage("Hello view.");
        return "Hello, I am Presenter.";
    }

    @Override
    public void start() {
        view.showMessage("Hello, I am Presenter.");
    }
}
