import java.io.IOException;
class c{
	public static void main(String[] args){
   		try
		{
			//("cmd.exe","yourpath","cls")
			new ProcessBuilder("cmd.exe","/mnt/c","cls").inheritIO().start().waitFor();	
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
  	}
}