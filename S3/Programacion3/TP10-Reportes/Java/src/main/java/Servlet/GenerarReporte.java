package Servlet;

import Data.DAO;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@WebServlet(name = "GenerarReporte", urlPatterns = {"/GenerarReporte"})
public class GenerarReporte extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            String pais = request.getParameter("pais");
            String region = request.getParameter("region");
            String tipoArchivo = request.getParameter("file-type");
            
            DAO data = new DAO();
            ArrayList<String[]> listado = data.getRegiones(region, pais);
            System.out.println(listado.size());
            System.out.println(region);
            System.out.println(pais);
            
            if (tipoArchivo.equals("pdf")) {
                response.setContentType("application/pdf");
                generarPdf(response.getOutputStream(), listado);
            } else {
                response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
                response.setHeader("Content-Disposition", "attachment; filename=ReporteXLSX.xlsx");
                generarExcel(response.getOutputStream(), listado);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GenerarReporte.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(GenerarReporte.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void generarExcel(ServletOutputStream resp, List<String[]> listado) {
        Workbook workbook = new XSSFWorkbook();

        try {

            XSSFCellStyle styleAmarillo = (XSSFCellStyle) workbook.createCellStyle();
            styleAmarillo.setFillForegroundColor(IndexedColors.YELLOW.index);
            styleAmarillo.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            XSSFCellStyle styleVerde = (XSSFCellStyle) workbook.createCellStyle();
            styleVerde.setFillForegroundColor(IndexedColors.GREEN.index);
            styleVerde.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            Sheet sheet = workbook.createSheet("Reporte");

            int rowNum = 0;
            for (String[] row : listado) {
                Row excelRow = sheet.createRow(rowNum++);

                int colNum = 0;
                for (int i = 0; i < row.length; i++) {
                    if (i == 1) {
                        int poblacion = Integer.valueOf(row[i]);
                        Cell cell = excelRow.createCell(colNum++);
                        cell.setCellValue(poblacion);
                        if (poblacion > 5000000) {
                            cell.setCellStyle(styleAmarillo);
                        } else if (poblacion < 100000) {
                            cell.setCellStyle(styleVerde);
                        }

                    } else {
                        Cell cell = excelRow.createCell(colNum++);
                        cell.setCellValue(row[i]);
                    }
                }
            }
            workbook.write(resp);
            workbook.close();
        } catch (IOException ex) {
            Logger.getLogger(GenerarReporte.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void generarPdf(ServletOutputStream resp, List<String[]> listado) throws DocumentException {
        Document document = null;
        try {

            document = new Document(PageSize.A4, 10, 10, 10, 10);
            document.addTitle("ReportePDF");

            PdfWriter.getInstance(document, resp);
            document.open();
            PdfPTable table = new PdfPTable(4);
            
            table.setWidthPercentage(100);
            table.addCell(generarCelda("Ciudad"));
            table.addCell(generarCelda("Poblacion"));
            table.addCell(generarCelda("Pais"));
            table.addCell(generarCelda("Region"));

            for (String[] row : listado) {
                for (String str : row) {
                    System.out.println(str);
                    table.addCell(generarCelda(str));
                }
            }
            
            document.add(table);
            document.close();
        } catch (Exception e){
            System.out.println("[ERROR] " + e.getMessage());
        }
    }

    private PdfPCell generarCelda(String frase) {
        PdfPCell celda = new PdfPCell(new Phrase(frase));
        return celda;
    }

}