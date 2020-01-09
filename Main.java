package cuentas;
public class Main implements opertiva_cuenta {

    private static String nom;
	private static String cue;
	private static Float cantidad;

	public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        nom = "Antonio López";
		cue = "1000-2365-85-1230456789";
		cuenta1 = new CCuenta(nom,cue,2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

	public static String getCue() {
		return cue;
	}

	public static void setCue(String cue) {
		Main.cue = cue;
	}

	public static String getNom() {
		return nom;
	}

	public static void setNom(String nom) {
		Main.nom = nom;
	}
}
