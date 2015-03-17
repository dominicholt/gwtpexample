package com.example.gwtp.client.application.header;

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
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;

public class HeaderPresenter extends Presenter<HeaderPresenter.MyView, HeaderPresenter.MyProxy> {
  	
	private final PlaceManager placeManager;

	
	public interface MyView extends View {
    }

    @ProxyStandard
    @NameToken(NameTokens.home)
    public interface MyProxy extends ProxyPlace<HeaderPresenter> {
    }

    @Inject
    HeaderPresenter(EventBus eventBus,
                      MyView view,
                      MyProxy proxy,
                      PlaceManager placeManager) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_SetTopContent);
        
        this.placeManager = placeManager;
    }
    
    @Override
    protected void onBind() {
    	super.onBind();

    	// register Handler's
    	PlaceRequest myRequest = new PlaceRequest(NameTokens.home);
    	placeManager.revealPlace(myRequest);

    }

    @Override
    protected void onReveal() {
    	super.onReveal();

    } 


    @Override
    protected void revealInParent() {
    	RevealRootContentEvent.fire(this, this);
    }
    

}
