package com.adorsys.datasafe.android.module;

import com.adorsys.datasafe.android.MainActivity;
import com.adorsys.datasafe.android.scopes.ActivityScoped;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector
    abstract MainActivity mainActivity();
}