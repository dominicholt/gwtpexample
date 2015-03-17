package com.example.gwtp.client.application;

import javax.inject.Inject;

import com.example.gwtp.client.application.header.HeaderPresenter;
import com.example.gwtp.client.application.home.HomePagePresenter;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.DefaultPlace;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;

public class ApplicationPresenter extends Presenter<ApplicationPresenter.MyView, ApplicationPresenter.MyProxy> {
	
	public interface MyView extends View {
    }

	
    @ContentSlot
    public static final Type<RevealContentHandler<?>> SLOT_SetMainContent = new Type<>();
    
    @ContentSlot
	public static final Type<RevealContentHandler<?>> SLOT_SetTopContent = new Type<>();
    
    @Inject
	HeaderPresenter topMenuPresenter;
    
    @Inject
	HomePagePresenter mainContentPresenter;

    @ProxyStandard
    public interface MyProxy extends Proxy<ApplicationPresenter> {
    }

    @Inject
    ApplicationPresenter(EventBus eventBus,
                         MyView view,
                         MyProxy proxy) {
        super(eventBus, view, proxy, RevealType.Root);
        
    }
    
   	
   	@Override
	protected void onReveal()
	{
		super.onReveal();
		 
		// Load Content
		setInSlot(SLOT_SetTopContent, topMenuPresenter);
		setInSlot(SLOT_SetMainContent, mainContentPresenter);

	}
 
	@Override
	protected void revealInParent()
	{
		RevealRootContentEvent.fire(this, this);
	}
}
