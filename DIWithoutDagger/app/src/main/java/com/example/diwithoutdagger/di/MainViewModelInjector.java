package com.example.diwithoutdagger.di;

import com.example.diwithoutdagger.MainActivity;
import com.example.diwithoutdagger.basic.MainViewModel;

import dagger.Component;

@Component(modules = {DataStorageModule.class})
public interface MainViewModelInjector {

    MainViewModel getMainViewModel();
    void injectFields(MainActivity mainActivity);
}
