package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	public static void main(String[] args) {
		try {
			//파일로 출력
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt"));
			dos.writeUTF("홍길동");
			dos.writeInt(25);
			dos.writeDouble(182.5);
			
			dos.close();
			
			//파일로 부터 입력
			DataInputStream dis = new DataInputStream(new FileInputStream("result.txt"));
			
			String name = dis.readUTF();
			int age = dis.readInt();
			double height = dis.readDouble();
			System.out.println("이름 = " + name);
			System.out.println("나이 = " + age);
			System.out.println("키 = " + height);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
