/* Morse by Kevin Glenn
Description: program to encode or decode English/Morse code
*/

import java.util.Scanner;

public class Morse
{
	
	public static void usage()
	{
		System.out.println("Morse by Kevin Glenn");
		System.out.println("usage: java Morse [-e, -d] < inputFile > outputFile\n If no output file is specified, the output will print to the command line.");
		System.exit(0);
	}
	public static void encode(String decodedString)
	{	
		String conversion = "";
		for(int i = 0; i < decodedString.length(); i++)
		{
			char c = decodedString.toLowerCase().charAt(i);
			
			switch (c)
			{
				case 'a': conversion += ".- ";
                		  break;
                case 'b': conversion += "-... ";
                		  break;
                case 'c': conversion += "-.-. ";
                		  break;
                case 'd': conversion += "-.. ";
                		  break;
                case 'e': conversion += ". ";
                		  break;
                case 'f': conversion += "..-. ";
                		  break;
				case 'g': conversion += "--. ";
                		  break;
				case 'h': conversion += ".... ";
                		  break;
                case 'i': conversion += ".. ";
                     	  break;  
                case 'j': conversion += ".--- ";
                		  break;
                case 'k': conversion += "-.- ";
                		  break;
                case 'l': conversion += ".-.. ";
                		  break;          
                case 'm': conversion += "-- ";
                		  break;          
                case 'n': conversion += "-. ";
                		  break;
                case 'o': conversion += "--- ";
                		  break;
                case 'p': conversion += ".--. ";
                		  break;   
                case 'q': conversion += "--.- ";
                		  break;  
                case 'r': conversion += ".-. ";
                		  break;  
                case 's': conversion += "... ";
                		  break;          
                case 't': conversion += "- ";
                		  break;          
                case 'u': conversion += "..- ";
                		  break;   
                case 'v': conversion += "...- ";
                		  break;          
                case 'w': conversion += ".-- ";
                		  break;          
                case 'x': conversion += "-..- ";
                		  break;          
                case 'y': conversion += "-.-- ";
                		  break;          
                case 'z': conversion += "--.. ";
                		  break; 
                case '1': conversion += ".---- ";
                		  break;          
                case '2': conversion += "..--- ";
                		  break;          
                case '3': conversion += "...-- ";
                		  break;          
                case '4': conversion += "....- ";
                		  break;          
                case '5': conversion += "..... ";
                		  break;          
                case '6': conversion += "-.... ";
                		  break;          
                case '7': conversion += "--... ";
                		  break;          
                case '8': conversion += "---.. ";
                		  break;          
                case '9': conversion += "----. ";
                		  break;      
                case '0': conversion += "----- ";
                		  break;                      
                case ' ': conversion += " ";
                		  break;                                                                     
			}		
		}
		System.out.println(conversion);
	}

	public static void decode(String encodedString)
	{
		String conversion = "";
		String[] stringArray = encodedString.split(" ");
		for(String s : stringArray)
		{
			switch (s)
			{
				case ".-": conversion += "a";
							break;
				case "-...": conversion += "b";
							break;
				case "-.-.": conversion += "c";
							break;
				case "-..": conversion += "d";
							break;
				case ".": conversion += "e";
							break;
				case "..-.": conversion += "f";
							break;
				case "--.": conversion += "g";
							break;
				case "....": conversion += "h";
							break;
				case "..": conversion += "i";
							break;
				case ".---": conversion += "j";
							break;
				case "-.-": conversion += "k";
							break;
				case ".-..": conversion += "l";
							break;
				case "--": conversion += "m";
							break;
				case "-.": conversion += "n";
							break;
				case "---": conversion += "o";
							break;
				case ".--.": conversion += "p";
							break;
				case "--.-": conversion += "q";
							break;
				case ".-.": conversion += "r";
							break;
				case "...": conversion += "s";
							break;
				case "-": conversion += "t";
							break;
				case "..-": conversion += "u";
							break;
				case "...-": conversion += "v";
							break;
				case ".--": conversion += "w";
							break;
				case "-..-": conversion += "x";
							break;
				case "-.--": conversion += "y";
							break;
				case "--..": conversion += "z";
							break;
				case ".----": conversion += "1";
							break;
				case "..---": conversion += "2";
							break;
				case "...--": conversion += "3";
							break;
				case "....-": conversion += "4";
							break;
				case ".....": conversion += "5";
							break;
				case "-....": conversion += "6";
							break;
				case "--...": conversion += "7";
							break;
				case "---..": conversion += "8";
							break;
				case "----.": conversion += "9";
							break;
				case "-----": conversion += "0";
							break;
				case "": conversion += " ";
							break;
			}

		}
		System.out.println(conversion);
	}

	public static void main(String[] args)
	{	

		if (args.length > 0 && (args[0].equals("-e") || args[0].equals("-d")))
		{	
			Scanner scan = new Scanner(System.in);
			while (scan.hasNextLine()) 
        		{	
        			if(args[0].equals("-e"))
        			{
        				encode(scan.nextLine());
        			}
    				else if(args[0].equals("-d"))
    				{
    					decode(scan.nextLine());
    				}
    			}
	    }
	    else
	    {
	    	usage();
	    }
				
	}
}

