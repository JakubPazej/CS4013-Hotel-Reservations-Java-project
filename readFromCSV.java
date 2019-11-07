import java.io.*;
public class readFromCSV{
	public static void reservation(String fileName) {
		try {
			CsvReader reader = new CsvReader(fileName);
			reader.readHeaders();

			while (reader.readRecord())
			{
				String productID = reader.get("ProductID");
				String productName = reader.get("ProductName");
				String supplierID = reader.get("SupplierID");
				String categoryID = reader.get("CategoryID");
				String quantityPerUnit = reader.get("QuantityPerUnit");
				String unitPrice = reader.get("UnitPrice");
				String unitsInStock = reader.get("UnitsInStock");
				String unitsOnOrder = reader.get("UnitsOnOrder");
				String reorderLevel = reader.get("ReorderLevel");
				String discontinued = reader.get("Discontinued");
				
				// perform program logic here
				System.out.println(productID + ":" + productName);
			}
	
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}