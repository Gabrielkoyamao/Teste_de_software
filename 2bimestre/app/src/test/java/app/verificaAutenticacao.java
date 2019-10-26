package app;

public class verificaAutenticacao {
	private static int contErr=0;
	
	public boolean checkStr(String str) {
		if(!str.equals("xyz")) {
			contErr+=1;
			return false;
		}
		return true;
	}
	
	public boolean estaBloqueado() {
		return (contErr >= 3);
	}
}
