package com.example.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.example.CodigoPostal;

public class CodigoPostalDAO {
	private Map<String,CodigoPostal> codigos;
	
	public CodigoPostalDAO() {
		codigos = new HashMap<String, CodigoPostal>();
		
		codigos.put("04444", new CodigoPostal("04444", "CTM Culhuacan"));
		codigos.put("08620", new CodigoPostal("08620", "Coyuya"));
		codigos.put("04500", new CodigoPostal("04500", "Ciudad Universitaria"));
		codigos.put("03500", new CodigoPostal("03500", "Napoles"));
	}
	
	public Collection<CodigoPostal> selectAll() {
		return codigos.values();
	}
	
	public CodigoPostal selectCpById(String codigo) {
		return codigos.get(codigo);
	}
	
}
