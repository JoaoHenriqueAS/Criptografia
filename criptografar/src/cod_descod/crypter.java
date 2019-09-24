package cod_descod;

public class crypter {
	
    String alfabCripto[] = {" ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", 
    		"s", "t", "u", "v", "w", "y", "x", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    String alfaCripto[] = {" ", "q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", 
    		"l", "z", "x", "c", "n", "b", "v", "m", "8", "6", "4", "2", "0", "9", "7", "5", "3", "1"};
    
    public crypter() {
    	
    }
    
    public String desCriptografa(String texto) {
    	String output = texto;
    	for(int i = 0; i < alfabCripto.length; i++) {
    		output = output.replaceAll(alfaCripto[i], alfabCripto[i]);
    	}
    	return output;
    }
    
    public String criptografa(String texto) {
    	String output = texto;
    	for(int i = 0; i < alfabCripto.length; i++) {
    		output = output.replaceAll(alfabCripto[i], alfaCripto[i]);
    	}
    	return output;
    }


}
