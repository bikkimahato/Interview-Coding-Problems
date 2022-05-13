package stack;

public class RainWaterTrapping {
	public static void main(String[] args) {
		int heights[] = { 10, 4, 5, 90, 120, 80 };
		int n = heights.length;

		System.out.print(trappingWater(heights, n));
	}

	static int trappingWater(int arr[], int n) {

		int maxL[] = new int[n];
		int maxR[] = new int[n];
		maxL[0] = arr[0];
		for (int i = 1; i < n; i++) {
			maxL[i] = Math.max(maxL[i - 1], arr[i]);
		}
		maxR[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			maxR[i] = Math.max(maxR[i + 1], arr[i]);
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += Math.min(maxL[i], maxR[i]) - arr[i];
		}
		return sum;
	}
}
