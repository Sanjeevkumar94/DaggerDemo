package com.example.diwithoutdagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.diwithoutdagger.basic.MainViewModel;
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
//        DaggerMainViewModelInjector.create().injectFields(this);
    }

    @Inject
    void callingInMain(){
        Toast.makeText(this,mainViewModel.fetchData(),Toast.LENGTH_SHORT).show();
    }

    //main Activity mein callingInMain() ko  dagger tabhi call krega if yaha Field injection h rahi hai . agar FieldInjection ni ho rahi  hai toh yeh apne app call ni hoga.
}

