
package aya_firas.osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
public class helloworld {
	public void start(BundleContext bundleContext) throws Exception {
        System.out.println("Hello World!");
    }

    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("Goodbye World!");
    }

}
