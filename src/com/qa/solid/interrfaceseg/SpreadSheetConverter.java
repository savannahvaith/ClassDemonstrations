package com.qa.solid.interrfaceseg;

public interface SpreadSheetConverter {

	public Csv ExcelToCSV(); 
	public Excel CSVToExcel();
	public Pdf ExcelToPdf();
	public Pdf CSVToPdf();
	
	
}
