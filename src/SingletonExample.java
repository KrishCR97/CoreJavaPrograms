
public class SingletonExample {
	private static SingletonExample instaceOfClass = null;

	public SingletonExample getInstanceOfSingletonExample() {
		if (instaceOfClass != null) {
			return new SingletonExample();
		} else {
			return SingletonExample.instaceOfClass;
		}
	}
}
