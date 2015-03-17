package com.example.gwtp.client.application;

import com.example.gwtp.client.application.guitar.GuitarModule;
import com.example.gwtp.client.application.header.HeaderModule;
import com.example.gwtp.client.application.home.HomeModule;
import com.example.gwtp.client.application.surfing.SurfingModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new SurfingModule());
        install(new HeaderModule());
        install(new GuitarModule());
        install(new HomeModule());

        
        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);
    }
}
