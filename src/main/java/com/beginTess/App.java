package com.beginTess;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import com.beginTess.tess.InitTess;
import com.beginTess.tess.OCRImage;

import javax.imageio.ImageIO;

import com.beginTess.constants.FileConstants;

public class App 
{
    public static void main( String[] args )
    {
        try{
        	System.out.println(recognizeImages());
        }catch (Exception e){
        	System.out.println(e.toString());
        }
    }
    
    public static String recognizeImages() throws Exception{
    	
    	Map<String,String> results = new HashMap<String,String>();
    	
    	for (int i=0;i<FileConstants.input_files.length;i++){
    		BufferedImage bufferedImage = readInputFiles(FileConstants.input_files[i]);
    		results.put(FileConstants.input_files[i], OCRImage.ocr(bufferedImage));
    	}
    	
    	return results.toString();
    }
    
    public static BufferedImage readInputFiles(String file_name) throws Exception 
    {
        	BufferedImage bufferedImage = ImageIO.read(App.class.getResourceAsStream(file_name));        	
        	return bufferedImage;
    }
}
