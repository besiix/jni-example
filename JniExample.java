public class JniExample {

	// Define native functions that are usable through JNI
	public native int exampleFunction(int n);	

	public static void main(String[] args) {
		// Load in the library file, no extension
		System.loadLibrary("JniExample");

		JniExample example = new JniExample();
		int returnedInt = example.exampleFunction(2);
		System.out.println("Native response: " + returnedInt);
	}
}
