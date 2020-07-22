package sondo65.com.itrailers;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import sondo65.com.itrailers.di.DaggerAppComponent;

public class BaseApplication extends DaggerApplication {
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }
}
