# beginTess
Beginners guide to start using OCR (macOS Sierra 10.12.x)

# environment 
1. Eclipse Java EE IDE for Web Developers. Version: Neon.2 Release (4.6.2)
2. macOS Sierra 10.12.6
3. Maven

## Installing tesseract :

sudo port install tesseract #using mac port
#### - OR -
brew install tesseract

## Using tesseract via command line 
1. Download a sample image which you can pass to tesseract (keep in mind the image should be noise free and have black text                       over white background) 
### - OR -
Use the sample image provided with this example

'''
tesseract $imageName $outputFile
'''

## Creating project 
1. Create a maven project using eclipse 
2. copy the dependencies from pom.xml and run a maven build 
- build goal : clean verify -U
3. Refer the App.java 
### - OR -
clone this repository and import it into eclipse

### NOTE:

1. If you rename the folder tessdata in the project, change inside InitTess.java :
tesseract.setDatapath("{folder.name}");
