package com.example.diwithoutdagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.diwithoutdagger.basic.MainViewModel;
import com.example.diwithoutdagger.network.NetworkClient;
import com.example.diwithoutdagger.network.NetworkConnection;

public class MainActivity extends AppCompatActivity {

    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NetworkConnection networkConnection = new NetworkConnection();
        NetworkClient networkClient = new NetworkClient(networkConnection);

        mainViewModel = new MainViewModel(networkClient);

        Toast.makeText(this,mainViewModel.fetchData(),Toast.LENGTH_SHORT).show();
    }
}