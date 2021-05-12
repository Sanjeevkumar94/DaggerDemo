package com.example.diwithoutdagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.diwithoutdagger.basic.MainViewModel;
import com.example.diwithoutdagger.di.DaggerMainViewModelInjector;
import com.example.diwithoutdagger.network.NetworkClient;
import com.example.diwithoutdagger.network.NetworkConnection;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
     MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainViewModelInjector.create().injectFields(this);
        Toast.makeText(this,mainViewModel.fetchData(),Toast.LENGTH_SHORT).show();
    }
}



/*
1 Field injection mein Variable Private ni hona chahiye.
2 agar apke pass constructor avialble ho toh constructor injection kre.
3 Field injection tabhi krna chahiye jub hum uska constuctor create ni kr skate like Main activity, Retrofit and other Android Framework;*/
/*4 agar constructor injection humare class mein ho ri hogi toh field injection and method injection apne app
    perform ho jayegi.*/
