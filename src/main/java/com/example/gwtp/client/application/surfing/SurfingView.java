package com.example.gwtp.client.application.surfing;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.user.datepicker.client.DatePicker;
import com.gwtplatform.mvp.client.ViewImpl;

public class SurfingView extends ViewImpl implements SurfingPresenter.MyView {

	
    public interface Binder extends UiBinder<Widget, SurfingView> {
    }

    @Inject
    SurfingView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        
    }

	
}
