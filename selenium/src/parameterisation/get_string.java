package parameterisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_string {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\ASUS\\Documents\\test case for fb login.xlsx");
		String data = WorkbookFactory.create(file).getSheet("Sheet2").getRow(7).getCell(3).getStringCellValue();
		System.out.println(data);
	}
		
	}


