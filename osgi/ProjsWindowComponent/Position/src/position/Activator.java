package position;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import core.services.WindowService;

public class Activator implements BundleActivator {

	private PositionService service;
	
	public void start(BundleContext context) throws Exception {
		service = new PositionService();
		context.registerService(WindowService.class, service, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		service.shutdown();
	}

}
