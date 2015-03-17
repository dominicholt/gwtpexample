package com.example.gwtp.client.application;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

public class ApplicationView extends ViewImpl implements ApplicationPresenter.MyView {
	
	@UiField HorizontalPanel mainContentPanel;
	@UiField HorizontalPanel topContentPanel;
	
    public interface Binder extends UiBinder<Widget, ApplicationView> {
    }

    @Inject
    ApplicationView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
    
    @Override
    public void setInSlot(Object slot, IsWidget content) {
    	if (slot == ApplicationPresenter.SLOT_SetMainContent)
		{		
			setMainContent(content);
		}
		else if (slot == ApplicationPresenter.SLOT_SetTopContent)
		{
			setTopContent(content);
		}
 
		else
		{
			super.setInSlot(slot, content);
		}
    }
    
    private void setMainContent(IsWidget content) 
   	{
   	    mainContentPanel.clear();
   	    if (content != null) 
   	    {
   	      mainContentPanel.add(content);
   	    }
   	}
    
    
   	private void setTopContent(IsWidget content)
   	{
   		topContentPanel.clear();
   		if (content != null)
   		{
   			topContentPanel.add(content);
   		}		
   	}
}
