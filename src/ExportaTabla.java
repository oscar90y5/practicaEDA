import java.io.File;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;


public class ExportaTabla {
	public static void exportaTabla(int[][] tabla){
		String ruta = System.getProperty("user.home")+"workspace/TrabajoEDA/analisis.xls";
		
		File archivo = new File(ruta);
		
		Workbook libro = new HSSFWorkbook();
		
	}
}
