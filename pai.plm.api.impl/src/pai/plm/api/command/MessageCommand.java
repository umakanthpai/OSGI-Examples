package pai.plm.api.command;

import org.apache.felix.service.command.CommandProcessor;
import pai.plm.api.*;
import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Reference;

@Component(properties =	{
		/* Felix GoGo Shell Commands */
		CommandProcessor.COMMAND_SCOPE + ":String=example",
		CommandProcessor.COMMAND_FUNCTION + ":String=msg"
	},
	provide = Object.class
)
public class MessageCommand {
	private MessageProviderInterface msg;
	
	@Reference
	void setMessageService(MessageProviderInterface msg){
		this.msg = msg;
	}
	
	public void msg(){
		System.out.println(msg.getMessage());
	}
}
