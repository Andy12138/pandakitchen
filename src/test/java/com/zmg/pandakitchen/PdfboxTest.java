package com.zmg.pandakitchen;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDSimpleFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class PdfboxTest {



    @Test
    public void test1() throws IOException {
        PDDocument document = new PDDocument();
        PDPage pdPage = new PDPage(PDRectangle.A4);

        PDPageContentStream contentStream = new PDPageContentStream(document, pdPage);

        contentStream.beginText();
        contentStream.newLineAtOffset(25, 700);
        contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
        String text = "This is the sample document and we are adding content to it.";
        //Adding text in the form of string
        contentStream.showText(text);
        contentStream.endText();
        contentStream.close();
        document.addPage(pdPage);
        document.save("d:\\tmp\\test4.pdf");
        document.close();
    }
}
