package ocp;

public class AuthService {
	private IService service;
	
	public AuthService(IService service) {
		this.service=service;
	}
	public boolean singInWithApple(String log,String pass) {
		return true;
	}	
}
