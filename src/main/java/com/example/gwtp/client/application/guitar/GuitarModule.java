package com.example.gwtp.client.application.guitar;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class GuitarModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(GuitarPresenter.class, GuitarPresenter.MyView.class, GuitarView.class,
                GuitarPresenter.MyProxy.class);
    }
}
