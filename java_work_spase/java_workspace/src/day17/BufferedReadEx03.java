package day17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class BufferedReadEx03 {

	public static void main(String[] args) throws IOException {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		BufferedReader br = new BufferedReader(new FileReader("out2.txt"));

		while (true) {
			String a = br.readLine();
			if (a == null) {
				break;
			} else {
				String name = a.substring(0, a.indexOf(" "));
				Integer number = Integer.parseInt(a.substring(a.indexOf(" ") + 1));
				map.put(name, number);
			}
		}
		int hu = map.size();
		int sum = 0;
		for (String i : map.keySet()) {
			sum = sum + map.get(i);
		}

		System.out.println(sum / hu);

		br.close();
	}

}
