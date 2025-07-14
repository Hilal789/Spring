package com.nit.bean;

import org.springframework.stereotype.Component;

@Component("pdf")
public class PdfReportService implements  ReportService{

	@Override
	public void generateReports() {
		System.out.println("Generate report by pdf");
		
	}

}
