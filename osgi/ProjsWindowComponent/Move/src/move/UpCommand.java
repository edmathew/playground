package move;

import core.model.WindowCommand;
import core.model.WindowModel;

public class UpCommand implements WindowCommand {

	@Override
	public String name() {
		return "Up";
	}

	@Override
	public void run(WindowModel model) {
	
		model.setPosition(model.getX(), model.getY()-20);
	}

}
