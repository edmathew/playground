package move;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import core.model.WindowCommand;
import core.services.WindowService;

public class Activator implements BundleActivator {


	public void start(BundleContext context) throws Exception {
		context.registerService(WindowService.class, new MoveService(), null);
		context.registerService(WindowCommand.class, new UpCommand(), null);
	}

	public void stop(BundleContext bundleContext) throws Exception {

	}

}
