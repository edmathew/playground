package core.model;


public interface WindowCommand {

	String name();
	
	void run(WindowModel model);
}
