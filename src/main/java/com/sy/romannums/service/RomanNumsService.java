/**
 * 
 */
package com.sy.romannums.service;

import org.springframework.stereotype.Service;

/**
 * Roma rakamı çevrim işlemleri için kullanacağımız servis sınıfıdır.
 * 
 * @author sinan.yumak
 *
 */
@Service
public class RomanNumsService {

	
	/**
	 * Verilen sayının Roma rakamı karşılığını döndürür.
	 * 
	 * @param number
	 * 		Çevrimi yapılacak sayı
	 * 
	 * @return
	 * 		Çevrim sonucu
	 * 
	 */
	public String toRoman( Integer number ) {
		
		// FIXME: burayı düzelt. 
		
		return "IX";
	}
	
}
