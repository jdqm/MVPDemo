package com.jdqm.mvpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * 向Presenter外提供显示展示数据的接口
 */
public class MainActivity extends AppCompatActivity implements MainContract.View {
    private static final String TAG = "MainActivity";

    private MainContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);

        findViewById(R.id.btnGetMsg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.getMessage();
            }
        });

    }

    @Override
    public void showMessage(String msg) {
        Log.d(TAG, "showMessage: ");
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
