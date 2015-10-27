package position;

import java.awt.Component;
import java.awt.Label;

import core.model.WindowModel;
import core.model.WindowModel.WindowListener;
import core.services.WindowService;

public class PositionService implements WindowService {
	private Label label;
	private WindowModel model;
	@Override
	public String getName() {
		return "Position";
	}

	private WindowListener listener = new WindowListener() {
		@Override
		public void positionChanged(int x, int y) {
			update(x, y);
		}
	};
	
	@Override
	public Component createContent(final WindowModel model) {
		this.model = model;
		label = new Label();
		model.addListener(listener);
		label.setText(model.getX() + ", " + model.getY());
		return label;
	}

	private void update(int x, int y) {
		label.setText(x + ", " + y);
		label.getParent().validate();
	}

	public void shutdown() {
		model.removeListener(listener);
	}
}
