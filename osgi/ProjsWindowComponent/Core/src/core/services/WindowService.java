package core.services;

import java.awt.Component;

import core.model.WindowModel;

public interface WindowService {

	String getName();
	
	Component createContent(WindowModel window);
}
