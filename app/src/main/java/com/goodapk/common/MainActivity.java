package com.goodapk.common;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.common.toast.Toasty;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void putong(View view)
    {
        Toasty.normal(this, "普通").show();
    }

    public void zhengchang(View view)
    {
        Toasty.success(this, "正常").show();
    }

    public void yichang(View view)
    {
        Toasty.error(this, "异常").show();
    }

    public void xiaoxi(View view)
    {
        Toasty.info(this, "消息").show();
    }

    public void tishi(View view)
    {
        Toasty.warning(this, "提示").show();
    }
}
