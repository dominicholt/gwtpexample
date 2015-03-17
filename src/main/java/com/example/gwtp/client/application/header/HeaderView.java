package com.example.gwtp.client.application.header;

import javax.inject.Inject;

import com.example.gwtp.client.application.ApplicationPresenter;
import com.example.gwtp.client.application.guitar.GuitarPresenter;
import com.example.gwtp.client.application.home.HomePagePresenter;
import com.example.gwtp.client.application.surfing.SurfingPresenter;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.user.datepicker.client.DatePicker;
import com.gwtplatform.mvp.client.ViewImpl;

public class HeaderView extends ViewImpl implements HeaderPresenter.MyView {
	
	ApplicationPresenter ap;
	
	@Inject
	SurfingPresenter sp;
	
	@Inject
	GuitarPresenter gp;
	
	@Inject 
	HomePagePresenter hpp;
	
    public interface Binder extends UiBinder<Widget, HeaderView> {
    }

    @Inject
    HeaderView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        
    }

	
}
