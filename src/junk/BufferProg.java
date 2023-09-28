package junk;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferProg {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		System.out.println(a+" "+b+" "+c+" "+s);
		
		// Space-separated array integer
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] sArr = br.readLine().split(" ");
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(sArr[i]);
		}
		
	}
}
