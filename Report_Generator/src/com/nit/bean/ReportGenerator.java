package com.nit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ReportGenerator {
	
	ReportService report;

	@Autowired
	public ReportGenerator(@Qualifier("excel") ReportService report) {
		super();
		this.report = report;
	}
	
	public void Disp() {
		report.generateReports();
	}

}
