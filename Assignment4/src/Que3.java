
public class Que3 {
	public int maxArea(int[] height) {
		int i = 0;
		int j = height.length - 1;
		int res = 0;
		int max = 0;
		while (i != j) {
			int width = j - i;
			if (height[i] > height[j]) {
				res = height[j] * width;
				j--;
			} else {
				res = height[i] * width;
				i++;
			}
			if (res > max) {
				max = res;
			}
		}
		return max;
	}
}
