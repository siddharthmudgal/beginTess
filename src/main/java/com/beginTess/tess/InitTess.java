package com.beginTess.tess;

import net.sourceforge.tess4j.Tesseract;

public class InitTess {
	
	private static Tesseract tesseract = null;
	
	/**
	 * @return the tesseract
	 */
	public static Tesseract getTesseract() {
		if (tesseract == null){
			tesseract = new Tesseract();
			tesseract.setDatapath("./tessdata");
			tesseract.setLanguage("eng");
		}
		return tesseract;
	}

	private InitTess(){
		// do nothing
	}
}
