package com.adorsys.datasafe.android.component;

import android.app.Application;

import com.adorsys.datasafe.android.App;
import com.adorsys.datasafe.android.module.ActivityBindingModule;
import com.adorsys.datasafe.android.module.AppModule;
import com.adorsys.datasafe.android.module.SharedModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {AppModule.class,
        ActivityBindingModule.class,
        SharedModule.class,
        AndroidSupportInjectionModule.class})
public interface AppComponent extends AndroidInjector<App> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();
    }
}
