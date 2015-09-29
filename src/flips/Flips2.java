package flips;

public class Flips2 {

	public static void main(String[] args) {
		int headsAfterHeads = 0;
		int tailsAfterHeads = 0;

		boolean[][] sequences = { { true, true, true, true },
				{ false, true, true, true }, { true, false, true, true },
				{ true, true, false, true }, { true, true, true, false },
				{ false, false, true, true }, { false, true, false, true },
				{ false, true, true, false }, { true, false, false, true },
				{ true, true, false, false }, { true, false, true, false },
				{ true, false, false, false }, };

		for (boolean[] b : sequences) {
			for (int i = 0; i < b.length - 1; i++) {
				if (b[i]) {
					if (b[i + 1]) {
						++headsAfterHeads;
					} else {
						++tailsAfterHeads;
					}
				}
			}
		}
		System.out.println(String.format("%d %d", headsAfterHeads,
				tailsAfterHeads));

	}

}
