package com.apress.isf.spring.annotated.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.apress.isf.java.model.Document;
import com.apress.isf.java.model.Type;
import com.apress.isf.java.service.SearchEngine;
import com.apress.isf.spring.data.DocumentDAO;

// engine이라는 빈 객체를 생성한다.
@Service("engine")
//@Scope("prototype")
public class AnnotatedSearchEngine implements SearchEngine{
	
	@Autowired
	private DocumentDAO documentDAO; // DocumentDAO 클래스의 객체 생성 

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

}
