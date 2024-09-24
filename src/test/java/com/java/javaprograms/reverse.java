package com.java.javaprograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;


public class reverse {
	
	
	@Test
	public void revers1e() {
	String auto = "autokmation";
	
	StringBuilder sb= new StringBuilder(auto).reverse();
	System.out.println(sb);
	
	}

}
