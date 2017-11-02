import java.io.*;

public class Compile {
	
	public static void main(String args[]){
		String s;
		
	try{
		
		Write w = new Write();
		w.write();
		//Process oProcess = new ProcessBuilder("./terminal.app", "/c", "ls", "/?").start();
		//Process oProcess =new ProcessBuilder("./hello.c").start();
		Process compile = new ProcessBuilder("gcc", "./hello.c").start();
		Process execute = new ProcessBuilder("./a.out").start();
		
		BufferedReader stdOut = new BufferedReader(new InputStreamReader(execute.getInputStream()));
		BufferedReader stdError = new BufferedReader(new InputStreamReader(execute.getErrorStream()));
		//Write w = new Write();
		//w.write();
		
		//BufferedWriter write = new BufferedWriter(new outputStreamReader())
		while((s = stdOut.readLine())!=null)
		System.out.println(s);
		while((s=stdError.readLine())!=null)
		System.out.println(s);
		
	}catch(IOException e){
		System.err.println("에러! 외부 명령 실행에 실패했습니다.\n" +  e.getMessage());
		System.exit(-1);
		}
	}
}
