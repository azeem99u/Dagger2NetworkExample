package com.example.diexample.di;


import com.example.diexample.basic.MainViewModel;
import com.example.diexample.ui.MainActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;


@Component(modules = {DataStorageModule.class, RealConnectionModule.class})
public interface MainViewModelInjector {

    MainViewModel getMainViewModel();

    void injectFields(MainActivity mainActivity);


    @Component.Builder
    interface Builder{
        MainViewModelInjector build();

        @BindsInstance
        Builder setEndPoint(@Named ("endPoint") String endPoint);

        @BindsInstance
        Builder setUsername(@Named ("username") String username);

        @BindsInstance
        Builder setPassword(@Named ("password") String password);
    }

}
