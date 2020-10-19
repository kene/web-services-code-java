package com.example.service;

import java.util.Collection;

import com.example.CodigoPostal;
import com.example.dao.CodigoPostalDAO;

public class CodigoPostalService implements ICodigoPostalService {
	/* Aqui la clase es responsable de buscar su DAO */
	private CodigoPostalDAO codigoPostalDAO = new CodigoPostalDAO();
	
	/* (non-Javadoc)
	 * @see com.example.service.ICodigoPostalService#consultarCodigosPostales()
	 */
	@Override
	public Collection<CodigoPostal> consultarCodigosPostales() {
		return codigoPostalDAO.selectAll();
	}
	
	/* (non-Javadoc)
	 * @see com.example.service.ICodigoPostalService#consultarCodigoPostal(java.lang.String)
	 */
	@Override
	public CodigoPostal consultarCodigoPostal(String codigo) {
		return codigoPostalDAO.selectCpById(codigo);
	}
	
}
