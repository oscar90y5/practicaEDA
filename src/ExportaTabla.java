import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;




public class ExportaTabla {
	public static void exportaTabla(int[][] tabla) throws IOException{
		//String ruta = System.getProperty("/home/oscar/workspace/TrabajoEDA");
		
		File archivoXLS = new File("/home/oscar/workspace/TrabajoEDA/analisis.xls");
		

		
		Workbook libro = new HSSFWorkbook();
		
		FileOutputStream archivo = new FileOutputStream(archivoXLS);
		
		Sheet hoja = libro.createSheet("Hoja1");


		Row fila = hoja.createRow(1);
		Cell celda = fila.createCell(1);
		celda.setCellValue("Nº elmnts");
		celda = fila.createCell(2);
		celda.setCellValue("Media");
		celda = fila.createCell(3);
		celda.setCellValue("Máximo");
		celda = fila.createCell(4);
		celda.setCellValue("Mínimo");
		//Sheet hoja = libro.getSheet(1);
		 for(int i=0;i<20;i++){
			 fila = hoja.createRow(i+2);
			 for(int j=0;j<4;j++){
			//	 Cell celda = hoja.getCell(i,j);
				 celda = fila.createCell(j+1);
				 celda.setCellValue(tabla[i][j]);
			 }
		 }

		 libro.write(archivo);
		 archivo.close();
		 
		 
		 Desktop.getDesktop().open(archivoXLS);
	}
}
