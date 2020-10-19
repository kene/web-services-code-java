package com.example.service;

import java.util.Collection;

import com.example.CodigoPostal;

public interface ICodigoPostalService {

	/**
	 * Este metodo retorna todos los DP desde la BD
	 * @return
	 */
	Collection<CodigoPostal> consultarCodigosPostales();

	/**
	 * Este metodo retorna un codigo potal a partir de un codigo
	 * @param codigo El codigo a buscar
	 * @return
	 */
	CodigoPostal consultarCodigoPostal(String codigo);

}