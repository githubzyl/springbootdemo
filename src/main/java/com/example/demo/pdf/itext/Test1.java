package com.example.demo.pdf.itext;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

public class Test1 {

	public static void htmlToPdf() throws DocumentException, IOException {
		String url = "C:/Users/hspcadmin/Desktop/product_report.html";
		InputStream is = new FileInputStream(url);
		OutputStream os = new FileOutputStream("F:/pdffiles/20170605/demo.pdf");
		Document document = new Document();
		PdfWriter writer = PdfWriter.getInstance(document, os);
		document.open();
		// 将html转pdf
		XMLWorkerHelper.getInstance().parseXHtml(writer, document, is);
		document.close();
	}

	public static void createPdf() throws DocumentException, IOException {
		// 1.新建document对象
		Document document = new Document();

		// 2.建立一个书写器(Writer)与document对象关联，通过书写器(Writer)可以将文档写入到磁盘中。
		// 创建 PdfWriter 对象 第一个参数是对文档对象的引用，第二个参数是文件的实际名称，在该名称中还会给出其输出路径。
		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("F:/pdffiles/20170605/test.pdf"));

		// 3.打开文档
		document.open();

		// 中文字体,解决中文不能显示问题
		BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);

		Paragraph paragraph = new Paragraph("Hello World!");
		Font font = new Font(bfChinese);
		font.setColor(BaseColor.BLUE);
		paragraph.setFont(font);
		paragraph.setAlignment(Element.ALIGN_CENTER);

		// 4.添加一个内容段落
		document.add(paragraph);

		// 5.关闭文档
		document.close();

		writer.close();
	}

	public static void main(String[] args) throws DocumentException, IOException {
		htmlToPdf();
	}

}
