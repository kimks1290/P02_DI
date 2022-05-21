



package com.di.ex06;//수정

import java.io.FileWriter;
import java.io.IOException;

public class FileOutput implements Output{

	private String filePath;
	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
		System.out.println("- 파일 경로와 이름 설정 -");
	}
	
	public String getFilePath() {
		return filePath;
	}
	
	
	public void output(String message) throws IOException{
		
		FileWriter fw = new FileWriter(filePath);
		fw.write(message);
		fw.close();
		System.out.println("- 파일 전송 완료-");
	}
}
