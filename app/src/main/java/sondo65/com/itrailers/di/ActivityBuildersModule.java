package sondo65.com.itrailers.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import sondo65.com.itrailers.MainActivity;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();
}
