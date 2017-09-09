package com.beginTess.tess;

import java.awt.image.BufferedImage;

public class OCRImage {
	public static String ocr(BufferedImage bufferedImage) throws Exception{
		return InitTess.getTesseract().doOCR(bufferedImage);
	}
}
