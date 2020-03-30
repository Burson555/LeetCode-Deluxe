import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
	// *********************** read inputs
		Scanner cin = new Scanner(System.in);
		String[] strings = cin.nextLine().split(" ");
		int n = Integer.parseInt(strings[0]);
		int m = Integer.parseInt(strings[1]);
		UIObject arr[] = new UIObject[n];
		for (int i = 0; i < n; i++) arr[i] = new UIObject(cin.nextLine());
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < m; i++) {
			strings = cin.nextLine().split(" ");
			hm.put(strings[0].hashCode(), Integer.parseInt(strings[1]));
		}
		hm.put("none".hashCode(), Integer.parseInt(cin.nextLine()));
	// *********************** calculate depth
		for (int i = 0; i < n; i++) {
			int depth = 1;
			for (int j = i-1; j >= 0; j--) {
				int temp = arr[i].calculateDepth(arr[j]);
				depth = Integer.max(temp, depth);
			}
			arr[i].depth = depth;
		}
	// *********************** sort
		Arrays.sort(arr, (a,b) -> hm.get(a.texture)-hm.get(b.texture));
		Arrays.sort(arr, (a,b) -> a.depth-b.depth);
		// for (int i = 0; i < n; i++) {
		// 	System.out.println(arr[i].x);
		// }
	// *********************** calculte result
		int res = 0;
		for (int i = 0; i < n; i++) {
			if (i != 0 && arr[i].texture == arr[i-1].texture)
				continue;
			res += 1;
		}
		System.out.println(res);
	}
}

class UIObject {

	int x, y, w, h;
	int texture;
	int depth;

	public UIObject(String s) {
		String[] strings = s.split(" ");
		if (strings.length == 6) {
			this.texture = strings[5].hashCode();
		} else {
			this.texture = "none".hashCode();
		}
		this.x = Integer.parseInt(strings[1]);
		this.y = Integer.parseInt(strings[2]);
		this.w = Integer.parseInt(strings[3]);
		this.h = Integer.parseInt(strings[4]);
	}

	public int calculateDepth(UIObject other) {
		if (this.x+this.w/2 <= other.x-other.w/2) return 1;
		if (this.x-this.w/2 >= other.x+other.w/2) return 1;
		if (this.y+this.h/2 <= other.y-other.h/2) return 1;
		if (this.y-this.h/2 >= other.y+other.w/2) return 1;
		if (this.texture == other.texture)
			return other.depth;
		else return other.depth+1;
	}
}