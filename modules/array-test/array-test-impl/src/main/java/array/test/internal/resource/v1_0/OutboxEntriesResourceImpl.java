package array.test.internal.resource.v1_0;

import array.test.resource.v1_0.OutboxEntriesResource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;

/**
 * @author javierdearcos
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/outbox-entries.properties",
	scope = ServiceScope.PROTOTYPE, service = OutboxEntriesResource.class
)
public class OutboxEntriesResourceImpl extends BaseOutboxEntriesResourceImpl {

	@Override
	public void getOutboxEntries() throws Exception {
		super.getOutboxEntries();
	}

	@Context
	private ServletConfig _servletConfig;
}