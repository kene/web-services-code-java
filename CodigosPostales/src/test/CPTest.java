package test;

import java.util.Collection;
import java.util.Iterator;

import com.example.CodigoPostal;
import com.example.service.CodigoPostalService;
import com.example.service.ICodigoPostalService;

public class CPTest {

	public static void main(String[] args) {
		ICodigoPostalService cpService = new CodigoPostalService();
		
		CodigoPostal cp = cpService.consultarCodigoPostal("04500");
		System.out.println("CP: " + cp);
		
		Collection <CodigoPostal>c = cpService.consultarCodigosPostales();
		
		for (Iterator iterator = c.iterator(); iterator.hasNext();) {
			System.out.println("Item CP:" + iterator.next());
		}
		
		for (CodigoPostal tmp : c) {
			System.out.println("Item2 CP: " + tmp);
		}
		
	}

}
