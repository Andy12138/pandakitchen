package com.zmg.pandakitchen;

import com.openhtmltopdf.extend.FSSupplier;
import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class OpenhtmltopdfTest {

    @Test
    public void test() throws Exception {
        OutputStream os = new FileOutputStream("D:\\tmp\\test2.pdf");
        PdfRendererBuilder builder = new PdfRendererBuilder();
        builder.useFastMode();
        builder.useFont(setFSFont(new FileInputStream(new File("d:\\tmp\\simsun.ttf"))), "simsun");
        builder.withFile(new File("D:\\tmp\\test.html"));
        builder.toStream(os);
        builder.run();
    }

    public FSSupplier<InputStream> setFSFont(InputStream fontInputSteam) {
        return () -> fontInputSteam;
    }
}
