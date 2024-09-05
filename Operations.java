public class Operations {

	public static String onesComplement(int value, int bitLength) {
		int mask = (1 << bitLength) - 1;
		return Integer.toBinaryString(~value & mask);
	}

	public static String twosComplement(int value, int bitLength) {
		int mask = (1 << bitLength) - 1;
		return Integer.toBinaryString((~value + 1) & mask);
	}

	// Implement other operations similarly
}
