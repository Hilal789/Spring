package com.nit.bean;

import org.springframework.stereotype.Component;

@Component("excel")
public class ExcelReportService implements ReportService {

	@Override
	public void generateReports() {

		System.out.println("Generate report by Excel");
	}

}
