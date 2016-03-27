package pai.plm.api.impl;

import org.osgi.service.component.annotations.Component;

import pai.plm.api.MessageProviderInterface;

@Component
public class MessageProvider implements MessageProviderInterface{

	@Override
	public String getMessage() {
		return "OSGI Blog by Pai";
	}


}
