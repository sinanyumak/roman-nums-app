/**
 * 
 */
package com.sy.romannums.service;

import java.util.Map.Entry;
import java.util.TreeMap;

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
	 * En küçük Roma rakamının onluk sistemdeki değeridir.
	 */
	private static final Integer MIN_ROMAN_NUMBER = 1;

	/**
	 * En yüksek Roma rakamının onluk sistemdeki değeridir.
	 */
	private static final Integer MAX_ROMAN_NUMBER = 4999;
	
	/**
	 * Roma rakamlarını onluk sistemdeki karşılıkları ile birlikte tutan map tir.
	 */
	private static final TreeMap<Integer, String> ROMAN_NUMERALS = new TreeMap<>();
	
	
	static {
	
		ROMAN_NUMERALS.put( 1, "I");
		ROMAN_NUMERALS.put( 4, "IV" );
		ROMAN_NUMERALS.put( 5, "V" );
		ROMAN_NUMERALS.put( 9, "IX" );
		ROMAN_NUMERALS.put( 10, "X" );
		ROMAN_NUMERALS.put( 40, "XL" );
		ROMAN_NUMERALS.put( 50, "L" );
		ROMAN_NUMERALS.put( 90, "XC" );
		ROMAN_NUMERALS.put( 100, "C" );
		ROMAN_NUMERALS.put( 400, "CD" );
		ROMAN_NUMERALS.put( 500, "D" );
		ROMAN_NUMERALS.put( 900, "CM" );
		ROMAN_NUMERALS.put( 1000, "M" );

	}
	
	
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
	public String toRomanNumber( Integer number ) {

		checkNumberRange( number );
		
		
		StringBuilder result = new StringBuilder();
		
		while ( number != 0 ) {

			// kullanılması gereken Roma rakamını bul..
			Entry<Integer, String> romanNum = ROMAN_NUMERALS.floorEntry( number );
			
			// bulunan Roma rakamının yazı karşılığını sonuca ekle..
			result.append( romanNum.getValue() );
			
			// sayıyı azalt..
			number -= romanNum.getKey();
		}
		
		
		return result.toString();
	}

	
	/**
	 * Verilen numaranın Roma rakamına çevrilebilecek aralıkta olup olmadığını 
	 * kontrol eder.
	 */
	private void checkNumberRange( Integer number ) {
		
		if ( number >= MIN_ROMAN_NUMBER && number <= MAX_ROMAN_NUMBER ) {
			return;
		}

		throw new RuntimeException( "Girilen sayının " + MIN_ROMAN_NUMBER + " ile "
				+ MAX_ROMAN_NUMBER + " arasında olması gerekmektedir.");
	}

	
}
