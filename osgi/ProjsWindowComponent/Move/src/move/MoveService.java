package move;

import java.awt.Button;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import core.model.WindowCommand;
import core.model.WindowModel;
import core.services.WindowService;

public class MoveService implements WindowService {


	@Override
	public String getName() {
		return "Move";
	}

	
	@Override
	public Component createContent(final WindowModel model) {
		Button buttonLeft = new Button("left");
		buttonLeft.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				WindowCommand cmd = new WindowCommand() {
					@Override
					public String name() {
						return "left";
					}
					@Override
					public void run(WindowModel model) {
						model.setPosition(model.getX()-20, model.getY());
					}
				};
				model.runCommand(cmd);
			}
		});
		Button buttonRight = new Button("right");
		buttonRight.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				WindowCommand cmd = new WindowCommand() {
					@Override
					public String name() {
						return "right";
					}
					@Override
					public void run(WindowModel model) {
						model.setPosition(model.getX()+20, model.getY());
					}
				};
				model.runCommand(cmd);
			}
		});	
		JPanel panel = new JPanel();
		panel.add(buttonLeft);
		panel.add(buttonRight);
		return panel;
	}

	

}
