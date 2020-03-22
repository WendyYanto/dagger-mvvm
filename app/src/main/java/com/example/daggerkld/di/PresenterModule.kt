package com.example.daggerkld.di

import com.example.daggerkld.presenter.MainPresenter
import com.example.daggerkld.presenter.MainPresenterImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PresenterModule {
    @Provides
    @Singleton
    fun provideMainPresenter(): MainPresenter = MainPresenterImpl()
}