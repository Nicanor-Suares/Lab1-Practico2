package Directorio;

import java.util.*;

public class Directorio {

    private TreeMap<Long, Cliente> agenda = new TreeMap();

    public boolean agregarCliente(Cliente cliente, long tel) {

	if (agenda.containsKey(tel)) {
	    return false;
	}

	agenda.put(tel, cliente);

	return true;
    }

    public Cliente buscarCliente(long tel) {

	return agenda.get(tel);

    }

    public ArrayList<Long> buscarTelefono(String apellido) {

	ArrayList<Long> telefonos = new ArrayList();

	for (Map.Entry<Long, Cliente> entry : agenda.entrySet()) {
	    String apel = entry.getValue().getApellido();
	    if (apel.equalsIgnoreCase(apellido)) {
		telefonos.add(entry.getKey());
	    }
	}
	
	return telefonos;

    }

    public ArrayList<Cliente> buscarClientes(String ciudad) {

	ArrayList<Cliente> clientes = new ArrayList();

	for (Map.Entry<Long, Cliente> entry : agenda.entrySet()) {
	    String value = entry.getValue().getCiudad();
	    if (value.equalsIgnoreCase(ciudad)) {
		clientes.add(entry.getValue());
	    }
	}

	return clientes;

    }

    public boolean borrarCliente(long tel) {
	return agenda.remove(tel) != null;
    }

}
