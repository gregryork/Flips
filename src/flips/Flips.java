package flips;

public class Flips {

	public static void main(String[] args) {
		int streakLength = 4;
		int headWithinFirst = 3;

		int countTailFollowsHeads = 0;
		int countHeadFollowsHeads = 0;
		int trials = 1000000;

		for (int trial = 0; trial < trials; ++trial) {
			boolean[] isHeads = new boolean[streakLength];

			for (int i = 0; i < isHeads.length; ++i) {
				isHeads[i] = Math.random() < 0.5;
			}

			boolean headFound = false;
			for (int i = 0; i < headWithinFirst; ++i) {
				if (isHeads[i]) {
					headFound = true;
					break;
				}
			}
			if (!headFound) {
				continue;
			}

			for (int i = 0; i < isHeads.length - 1; ++i) {
				if (isHeads[i]) {
					if (isHeads[i + 1]) {
						countHeadFollowsHeads++;
					} else {
						countTailFollowsHeads++;
					}
				}
			}
		}
		System.out.println(String.format(
				"Tails after heads: %d\nHeads after heads: %d",
				countTailFollowsHeads, countHeadFollowsHeads));

	}

}
