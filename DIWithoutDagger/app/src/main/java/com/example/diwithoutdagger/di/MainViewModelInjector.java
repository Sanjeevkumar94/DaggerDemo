package com.example.diwithoutdagger.di;

import com.example.diwithoutdagger.MainActivity;
import com.example.diwithoutdagger.basic.MainViewModel;

import dagger.Component;

@Component
public interface MainViewModelInjector {
    void injectFields(MainActivity mainActivity);
    void injectFields(MainViewModel mainViewModel);
}
