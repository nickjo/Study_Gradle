package com.apress.isf.java.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.apress.isf.java.model.Document;
import com.apress.isf.java.model.Type;
import com.apress.isf.spring.data.DocumentDAO;


public class SearchEngineService implements SearchEngine{
	private static final Logger log = LoggerFactory.getLogger(SearchEngine.class);
	private DocumentDAO documentDAO;

	public SearchEngineService() {
		// TODO Auto-generated constructor stub
		if(log.isDebugEnabled()){
			log.debug("SearchEngineService created: " + this);
		}
	}
	
	@Override
	public List<Document> findByType(Type documentType) {
		// TODO Auto-generated method stub
		List<Document> result = new ArrayList<>();
		for(Document doc : listAll()){
			if(doc.getType().getName().equals(documentType.getName())){
				result.add(doc);
			}
		}
		return result;
	}

	@Override
	public List<Document> listAll() {
		// TODO Auto-generated method stub
		return Arrays.asList(documentDAO.getAll());
	}
	
	public DocumentDAO getDocumentDAO() {
		return documentDAO;
	}

	public void setDocumentDAO(DocumentDAO documentDAO) {
		if(log.isDebugEnabled()){
			log.debug("Document DAO set: " + documentDAO);
		}
		this.documentDAO = documentDAO;
	}
}
