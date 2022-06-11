package Directorio;

public class directorioMain {

    public static void main(String[] args) {

	Cliente client = new Cliente(123455, "Fran", "Cba", "San Luis", "calle falta");
	Cliente client2 = new Cliente(123455, "Fran", "Cba", "San Luis", "calle falta");
	Cliente client3 = new Cliente(123455, "Fran", "Cba", "Concaran", "calle falta");
		
	Directorio miDirect = new Directorio();
	
	miDirect.agregarCliente(client, 134);
	miDirect.agregarCliente(client2, 1234);
	miDirect.agregarCliente(client3, 2344);
	miDirect.buscarCliente(134);

    }
    
}
