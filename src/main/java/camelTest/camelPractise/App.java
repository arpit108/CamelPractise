package camelTest.camelPractise;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello World!");

		CamelContext context = new DefaultCamelContext();

		context.addRoutes(new RouteBuilder() {
			public void configure() {
				from("file:data/inbox?noop=true").to("file:data/outbox");
			}
		});

	}
}
