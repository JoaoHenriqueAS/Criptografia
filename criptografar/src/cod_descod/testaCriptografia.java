package cod_descod;

public class testaCriptografia {
	
	public static void main(String[] args) {
		crypter crypter = new crypter();
		
		String a = "lll";
		
		System.out.println(crypter.criptografa(a));
		
		String b = a;
		
		crypter.desCriptografa(b);
		System.out.println(b);
	}

}
