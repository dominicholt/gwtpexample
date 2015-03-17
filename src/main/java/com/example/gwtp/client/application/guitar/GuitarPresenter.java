package com.example.gwtp.client.application.guitar;

import javax.inject.Inject;

import com.example.gwtp.client.application.ApplicationPresenter;
import com.example.gwtp.client.place.NameTokens;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;

public class GuitarPresenter extends Presenter<GuitarPresenter.MyView, GuitarPresenter.MyProxy> {
  	
	public interface MyView extends View {
    }

    @ProxyStandard
    @NameToken(NameTokens.guitar)
    public interface MyProxy extends ProxyPlace<GuitarPresenter> {
    }

    @Inject
    GuitarPresenter(EventBus eventBus,
                      MyView view,
                      MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_SetMainContent);
    }
    

}
