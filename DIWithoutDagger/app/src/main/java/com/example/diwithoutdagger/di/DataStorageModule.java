package com.example.diwithoutdagger.di;

import android.util.Log;

import com.example.diwithoutdagger.utils.DataStorageHelper;
import com.example.diwithoutdagger.utils.Transaction;

import dagger.Module;
import dagger.Provides;

@Module
public class DataStorageModule {

    @Provides
    public static Transaction provideTransaction() {
        Log.d("DataStorageModule","Hello" );
        return new Transaction(System.currentTimeMillis());
    }

    @Provides
    public static DataStorageHelper provideDataStorageHelper(Transaction transaction) {
        DataStorageHelper helper = new DataStorageHelper(transaction);
        helper.setStoragePermission(true);
        return helper;
    }
}