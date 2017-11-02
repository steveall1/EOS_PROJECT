import java.io.FileWriter;
import java.io.IOException;

public class Write {
	public static void write(){
	try{
	FileWriter fileWriter = new FileWriter("./hello.c");
	String ans = "#include <stdio.h>\n int main(){ \n int n;  \n printf("+'"'+"input number."+'"'+");\n scanf("+'"'+"%d"+'"'+", &n); \n printf("+'"'+"hello world %d"+'"'+",n);\n}";
	fileWriter.write(ans);
	fileWriter.flush();
	fileWriter.close();
	}catch(IOException e){
		e.printStackTrace();
		}
	}
}	

