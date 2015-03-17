package com.example.gwtp.client.application.home;

import javax.inject.Inject;

import com.example.gwtp.client.application.ApplicationPresenter;
import com.example.gwtp.client.application.header.HeaderPresenter;
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

public class HomePagePresenter extends Presenter<HomePagePresenter.MyView, HomePagePresenter.MyProxy> {
 
	private final PlaceManager placeManager;
	
	@ContentSlot
	public static final Type<RevealContentHandler<?>> TYPE_SetMainContent = new Type<RevealContentHandler<?>>();
  	
	
	public interface MyView extends View {
    }

    @ProxyStandard
    @NameToken(NameTokens.home)
    public interface MyProxy extends ProxyPlace<HomePagePresenter> {
    }

    @Inject
    HomePagePresenter(EventBus eventBus,
                      MyView view,
                      MyProxy proxy,
                      PlaceManager placeManager) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_SetMainContent);
        
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
