package dk.aau;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Pdftesting {
    static Document document = new Document();
    private static final String title = "Warnings model test document";

    @BeforeClass
    public static void setup() throws FileNotFoundException, DocumentException {
        PdfWriter.getInstance(document, new FileOutputStream("WarningModelTest.pdf"));
        
        document.open();
        document.setPageSize(PageSize.A4);
        // Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
        document.addTitle(title);//
		//To add the Author for the PDF
		document.addAuthor("Selenium Easy");
		//To add the subject to the PDF document
		document.addSubject("iText Tutorial");
		//To add the Keywords for the document
		document.addKeywords("keyword1,keyword2,keyword3....etc");
		document.add(new Paragraph("Hello iText advanced example "));
		document.add(new Paragraph("Please check the properties of the PDF"));
        

    }

    @AfterClass
    public static void AfterClass(){
        document.close();
    }
    
    @Test
    public void AddToListMissingResultsForSCEPJ() {
        
    }

    @Test
    public void test(){

    }
}
