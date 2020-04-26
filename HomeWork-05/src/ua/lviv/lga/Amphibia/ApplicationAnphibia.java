package ua.lviv.lga.Amphibia;

public class ApplicationAnphibia {
	public static void main(String[] args) {
		
		Frog f = new Frog();
		Amphibia a = (Amphibia) f;
		a.toEat();
		a.toSleep();
		a.toSweem();
		a.toJump();
		
	}

}
