package com.example.gwtp.client.application.surfing;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class SurfingModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(SurfingPresenter.class, SurfingPresenter.MyView.class, SurfingView.class,
                SurfingPresenter.MyProxy.class);
    }
}
