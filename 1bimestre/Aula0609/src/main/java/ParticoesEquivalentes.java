
public class ParticoesEquivalentes {
		
	public int teste(String str) {
		if(str.length() == 0) return -2;
		else if(str.length() > 5) return -3;
		else return str.indexOf('@');
	}	
}
