import java.util.HashMap;
import java.util.Map;

public class SingletonExample {
	private static SingletonExample instaceOfClass = null;

	public SingletonExample getInstanceOfSingletonExample() {
		if (instaceOfClass != null) {
			return new SingletonExample();
		} else {
			return SingletonExample.instaceOfClass;
		}
	}

	public void loadUserDetails() {
		Map<String, String> empDetails = new HashMap<>();
		empDetails.put("Amar", "Marlabs");
	}
}
