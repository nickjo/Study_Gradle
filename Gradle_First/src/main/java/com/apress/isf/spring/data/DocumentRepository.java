package com.apress.isf.spring.data;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.apress.isf.java.model.Document;

public class DocumentRepository implements DocumentDAO{
	private Document doc1;
	private Document doc2;
	private Document doc3;
	private Document doc4;
	
	private static final Logger log = LoggerFactory.getLogger(DocumentRepository.class);
	private List<Document> documents = null;
	
	public List<Document> getDocuments() {
		return documents;
	}
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	public Document getDoc1() {
		return doc1;
	}
	public void setDoc1(Document doc1) {
		this.doc1 = doc1;
	}
	
	public Document getDoc2() {
		return doc2;
	}
	public void setDoc2(Document doc2) {
		this.doc2 = doc2;
	}
	
	public Document getDoc3() {
		return doc3;
	}
	public void setDoc3(Document doc3) {
		this.doc3 = doc3;
	}
	
	public Document getDoc4() {
		return doc4;
	}
	public void setDoc4(Document doc4) {
		this.doc4 = doc4;
	}
	
	@Override
	public Document[] getAll() {
		// TODO Auto-generated method stub
		if(log.isDebugEnabled()){
			log.debug("Start <getAll> Params: ");
		}
		Document[] result = documents.toArray(new Document[documents.size()]);
		
		if(log.isDebugEnabled()){
			log.debug("End <getAll> Result: " + result);
		}
		return result;
		//return new Document[]{doc1,doc2,doc3,doc4};
	}
}
