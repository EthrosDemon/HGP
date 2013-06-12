import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Parse {

	public static void main(String[] args) throws InterruptedException,
			IOException {

		int lines = 30;
		int i = 0;
		String str = "";
		
		BufferedReader read = new BufferedReader(new InputStreamReader(
				new FileInputStream("chr22.fa"), "UTF-8"));
		PrintWriter out = new PrintWriter("out.txt");
		while (i < lines +1) {
			// while ((inp = read.readLine()) != null) {
			str = (str + (read.readLine()));
			if (i == 0) {
				System.out.println(str);
				str = "";
			}
			out.append(str);
			i++;
		}
		out.print(str);
		out.close();

		// String sep = System.getProperty("file.separator");
		// System.out.println("foo" + sep + "works");
		// while (true) {
		// BufferedReader read2 = new BufferedReader(
		// new InputStreamReader(new FileInputStream("chr22.fa"), "UTF-8"));
		// System.out.println(read2);
		// PrintWriter out = new PrintWriter("out.txt");
		// str = (str + (space * n + space) + ", ");
		// n++;
		// Thread.sleep(0);
		// if (n % 20 == 0) {
		// str = (str + "\n");
		// }
		// if (n % (end) == 0) {
		// System.out.println(str);
		// out.print(str);
		// out.close();
		// break;
		// }
		// }

	}

}
