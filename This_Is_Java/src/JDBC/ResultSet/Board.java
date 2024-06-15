package JDBC.ResultSet;

import java.io.FileInputStream;
import java.sql.Blob;

public class Board {
	
	private String bNo;
	private String bTitle;
	private String bContent;
	private String bWriter;
	private String bDate;
	private String bFileName;
	private Blob bFilData;
	public String getbNo() {
		return bNo;
	}
	public void setbNo(String bNo) {
		this.bNo = bNo;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public String getbWriter() {
		return bWriter;
	}
	public void setbWriter(String bWriter) {
		this.bWriter = bWriter;
	}
	public String getbDate() {
		return bDate;
	}
	public void setbDate(String bDate) {
		this.bDate = bDate;
	}
	public String getbFileName() {
		return bFileName;
	}
	public void setbFileName(String bFileName) {
		this.bFileName = bFileName;
	}
	public Blob getbFilData() {
		return bFilData;
	}
	public void setbFilData(Blob blob) {
		this.bFilData = blob;
	}
	@Override
	public String toString() {
		return "Board [bNo=" + bNo + ", bTitle=" + bTitle + ", bContent=" + bContent + ", bWriter=" + bWriter
				+ ", bDate=" + bDate + ", bFileName=" + bFileName + ", bFilData=" + bFilData + "]";
	} 
	
	
	
}
