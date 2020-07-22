package sondo65.com.itrailers.di;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import sondo65.com.itrailers.BaseApplication;

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        ActivityBuildersModule.class,
        AppModule.class
})
public interface AppComponent extends AndroidInjector<BaseApplication> {
    @Component.Builder
    interface  Builder{
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
