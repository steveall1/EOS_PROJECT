package exec;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Runtime;
import java.util.ArrayList;
import java.util.List;
public class exec {
	


	public static void main(String args[]) throws IOException, InterruptedException{
		List<String> args1 = new ArrayList<String>();
		args1.add("./name");
		String s;
		//SystemCommandExecutor commandExecutor = new SystemCommandExecutor(args1);
		//Runtime r = Runtime.getRuntime();
		//Process p = r.exec(args1);
		//BufferedReader stdOut = new BufferedReader(new InputStreamReader(p.getInputStream()));
		SystemCommandExecutor commandExecutor = new SystemCommandExecutor(args1);
		int result = commandExecutor.executeCommand();
		StringBuilder stdout =  commandExecutor.getStandardOutputFromCommand();
		//while((s = stdout.readLine())!=null)
		System.out.println(stdout);
		//System.out.println(p.getOutputStream());
		//System.out.println(p.getInputStream());
		//System.out.println(p.getErrorStream());
			
	}
	
}
