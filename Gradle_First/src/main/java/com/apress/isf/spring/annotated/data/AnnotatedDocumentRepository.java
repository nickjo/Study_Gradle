package com.apress.isf.spring.annotated.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.apress.isf.java.model.Document;
import com.apress.isf.java.model.Type;
import com.apress.isf.spring.data.DocumentDAO;

@Repository("documentDAO")
public class AnnotatedDocumentRepository implements DocumentDAO{
	
	@Override
	public Document[] getAll() {
		// TODO Auto-generated method stub
		return storage();
	}
	
	private Document[] storage(){
		List<Document> result = new ArrayList<Document>();
		
		Type type = new Type();
		type.setName("PDF");
		type.setDesc("Portable Document Format");
		type.setExtension(".pdf");
		
		Document document = new Document();
		document.setName("Book Template");
		document.setType(type);
		document.setLocation("user/pdf/BookTemplate.pdf");
		
		result.add(document);
		
		// List를 Array로 변환
		return result.toArray(new Document[result.size()]);
	}
}
