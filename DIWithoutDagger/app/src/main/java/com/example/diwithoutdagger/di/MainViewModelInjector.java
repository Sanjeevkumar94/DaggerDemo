package com.example.diwithoutdagger.di;

import com.example.diwithoutdagger.basic.MainViewModel;

import dagger.Component;

@Component
public interface MainViewModelInjector {
    MainViewModel getMainViewModel();

}
