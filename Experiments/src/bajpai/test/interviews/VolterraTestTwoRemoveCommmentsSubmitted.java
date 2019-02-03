package bajpai.test.interviews;

import java.io.*;
import java.util.*;

class VolterraTestTwoRemoveCommmentsSubmitted {

	private static final String FILENAME = "C:\\eclipse-workspace\\testdata\\comments.cpp";

	public static void main(String[] args) throws java.lang.Exception {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			removeCommentsFromCPPFile(br);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}

	static void removeCommentsFromCPPFile(BufferedReader br) throws IOException {
		Boolean isMultiLineComment = false;
		StringBuilder result = new StringBuilder("");
		int i = 0;
		String input = new String();
		List<String> res = new ArrayList();
		while ((input = br.readLine()) != null) {
			// System.out.println(input+"####");
			while (i < input.length()) {
				// System.out.print(i);

				if (!isMultiLineComment && i + 1 < input.length() && input.charAt(i) == '/'
						&& input.charAt(i + 1) == '*') {
					isMultiLineComment = true;
					i++;
				} else if (isMultiLineComment && i + 1 < input.length() && input.charAt(i) == '*'
						&& input.charAt(i + 1) == '/') {
					isMultiLineComment = false;
					i++;
				} else {
					if (input.charAt(i) == '/' && i + 1 < input.length() && input.charAt(i + 1) == '/') {
						break;
					} else {
						if (!isMultiLineComment) {
							result.append(input.charAt(i));
						}
					}
				}

				i++;
			}
			if (!isMultiLineComment && result.length() > 0)
				res.add(new String(result));
		}
		System.out.print(res.toString());
	}
}
