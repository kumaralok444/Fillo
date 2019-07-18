package filoRead;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class FilloTest {
	
	public static void main(String[] args) throws FilloException {
		Fillo fillo=new Fillo();
		Connection connection=fillo.getConnection("C:\\Users\\bs\\Desktop\\Test.xlsx");
		
		String strQuery="Select * from Sheet1";
		Recordset recordset=connection.executeQuery(strQuery);
		while(recordset.next()) {
			System.out.println(recordset.getField("Roll")+" "+recordset.getField("Name")+" "+recordset.getField("Class"));
		}
		recordset.close();
	}
}
