import java.io.*;
import java.util.StringTokenizer;

public class draft2 {
	private static FileInputStream inFile;
	private static InputStreamReader inReader;
	private static BufferedReader reader;
	
	private static String line;
	private static String firstWord;
	private static String secondWord;
	private static String word;
	//private static String suffix;
	private static String wordString = " ";
	private static String suffixString = " ";
	private static int numStr = 0;
	private static int endStr;
	private static int wordCount = 0;
	private static String plural;

	private static StringTokenizer strTkn;

   public static void main (String[] args) throws IOException
   {
	   initFile();
	   storeData();
	   findPlural();
	   findSuffix();
   }
   
   public static void initFile() throws IOException
   {
     inFile = new FileInputStream ("c:\\!!JavaDownload\\vowels.txt"); 
     inReader = new InputStreamReader(inFile);
     reader = new BufferedReader(inReader);
   }
   
   public static void storeData() throws IOException
   {
	   for(int i = 0; i< 13; i++) {
		   line = reader.readLine();   
		   
		   strTkn = new StringTokenizer(line);  
		       
		   firstWord = strTkn.nextToken();
		   secondWord = strTkn.nextToken();
		   
		   wordString = wordString + firstWord + " ";
		   suffixString = suffixString + secondWord + " ";
	   }
   }		   
   public static void findPlural() throws IOException
   {
		   //System.out.println(wordString);
		   while(wordCount < 14) {
			   endStr = wordString.indexOf(" ", numStr+1);
			   word = wordString.substring(numStr, endStr); 
			   System.out.print("Orginal word:  ");
			   System.out.println(word);
			   System.out.println(" ");
			   numStr = endStr;
			   wordCount++;
			   int length = word.length();
			   String lastLetter = word.substring(length -1);
			   int secondLetter = length -2;
			   String secondLLetter = word.substring(secondLetter, length-1);
		   
			   if ((lastLetter.equals("A") || lastLetter.equals("C") || lastLetter.equals("S") || lastLetter.equals("L") || 
			   lastLetter.equals("a") || lastLetter.equals("c") || lastLetter.equals("s") || lastLetter.equals("l")) && 
			   (secondLLetter.equals("A") || secondLLetter.equals("C") || secondLLetter.equals("S") || secondLLetter.equals("L") || 
			   secondLLetter.equals("a") || secondLLetter.equals("c") || secondLLetter.equals("s") || secondLLetter.equals("l"))) {
				   plural = word + lastLetter + "H";
				   System.out.print(" PLural word:  ");
				   System.out.println(plural);
				   System.out.println(" ");
				   System.out.println(" ");
			   } else if (lastLetter.equals("A") || lastLetter.equals("C") || lastLetter.equals("S") || lastLetter.equals("L") || 
			   lastLetter.equals("a") || lastLetter.equals("c") || lastLetter.equals("s") || lastLetter.equals("l")) {
				   plural = word.substring(0, length-1);
				   plural = plural + "G";
				   System.out.print(" PLural word:  ");
				   System.out.println(plural);
				   System.out.println(" ");
				   System.out.println(" ");
			   }else if (!(lastLetter.equals("A") || lastLetter.equals("C") || lastLetter.equals("S") || lastLetter.equals("L") || 
			   lastLetter.equals("a") || lastLetter.equals("c") || lastLetter.equals("s") || lastLetter.equals("l")) && 
			   (!(secondLLetter.equals("A") || secondLLetter.equals("C") || secondLLetter.equals("S") || secondLLetter.equals("L") || 
			   secondLLetter.equals("a") || secondLLetter.equals("c") || secondLLetter.equals("s") || secondLLetter.equals("l")))) {
				   plural = word + lastLetter + "H";
				   System.out.print(" PLural word:  ");
				   System.out.println(plural);
				   System.out.println(" ");
				   System.out.println(" ");
			   } else {
				   plural = word + "GH";
				   System.out.print(" PLural word:  ");
				   System.out.println(plural);
				   System.out.println(" ");
				   System.out.println(" ");
			   }
		   }
   }
   public static void findSuffix() throws IOException
   {
	   
   }
}

		   
