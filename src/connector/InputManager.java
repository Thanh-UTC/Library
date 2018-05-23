package connector;

public class InputManager {
	private static InputManager instance;
	private InputManager() {}
	
	public static InputManager getInstance() {
		if(instance == null) {
			instance = new InputManager();
		}
		return instance;
	}
	
	
}
