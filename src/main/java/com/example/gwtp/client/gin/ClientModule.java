package com.example.gwtp.client.gin;

import com.example.gwtp.client.application.ApplicationModule;
import com.example.gwtp.client.application.guitar.GuitarPresenter;
import com.example.gwtp.client.application.guitar.GuitarView;
import com.example.gwtp.client.application.surfing.SurfingPresenter;
import com.example.gwtp.client.application.surfing.SurfingView;
import com.example.gwtp.client.place.NameTokens;
import com.gwtplatform.mvp.client.annotations.DefaultPlace;
import com.gwtplatform.mvp.client.annotations.ErrorPlace;
import com.gwtplatform.mvp.client.annotations.UnauthorizedPlace;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

/**
 * See more on setting up the PlaceManager on <a
 * href="// See more on: https://github.com/ArcBees/GWTP/wiki/PlaceManager">DefaultModule's > DefaultPlaceManager</a>
 */
public class ClientModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new DefaultModule());
        install(new ApplicationModule());

        // DefaultPlaceManager Places
        bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.home);
        bindConstant().annotatedWith(ErrorPlace.class).to(NameTokens.home);
        bindConstant().annotatedWith(UnauthorizedPlace.class).to(NameTokens.home);

    }
}
