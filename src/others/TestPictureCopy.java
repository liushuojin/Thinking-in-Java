package others;

import java.io.*;

public class TestPictureCopy {
	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("G:/入酷/临床路径扫描图片/1-200/1.jpg");
		FileOutputStream fos = new FileOutputStream("D:/1.jpg");

		byte[] b = new byte[1024];
		int num = 0;
		while ((num = fis.read(b, 10, 1000)) != -1) {
			fos.write(b, 10, num);
		}
		fis.close();
		fos.close();
	}
}