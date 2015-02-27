package name.abhijitsarkar.webservices.jaxrs.subresource.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import name.abhijitsarkar.webservices.jaxrs.subresource.CarResource;

@ApplicationPath(value = "/")
public class CarApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>(super.getClasses());
		classes.add(CarResource.class);

		return classes;
	}

	@Override
	public Set<Object> getSingletons() {
		return super.getSingletons();
	}
}
