package domain;

import excepciones.LimiteExcepcion;

public class GYM {

	
	//Persona persona;
	Cliente cliente;
	//Persona persona;
	Profesor profesor;
	//ListaGenerica<Persona> listaPersona;
	ListaGenerica<Persona> listaCliente;
	ListaGenerica<Persona> listaProfesor;
	ListaGenerica<Persona> listaClienteConDeudas;
	
	public GYM() {
		listaCliente = new ListaGenerica<>();
		listaProfesor = new ListaGenerica<>();
		listaClienteConDeudas = new ListaGenerica<>();
	}
	
	public void AgregarPersona(Persona persona) //Usamos un solo agregar
	{
		if(persona instanceof Cliente) {
			listaCliente.Agregar_A_lista(persona);
		}
		else{
			listaProfesor.Agregar_A_lista(persona);
		}
	}
	
	public void ListarCliente() 
	{
		listaCliente.Listar();
	}
	public void ListarProfesor() 
	{
		listaProfesor.Listar();
	}
	public void Boorar() 
	{
		
	}
	public void Buscar() 
	{
		
	}
	/*public void LevantarJson() 
	{
		listaCliente.json();
		listaProfesor.json();
		listaClienteConDeudas.json();
	}
	public void ArchivarJson() 
	{
		listaCliente.json();
		listaProfesor.json();
		listaClienteConDeudas.json();
	}
	public void LevantarMapaJson() 
	{
		mapaTurnos.json();
	}
	public void ArchivarMapaJson() 
	{
		mapaTurnos.json();
	}*/
	public void Chequear_deuda()//Lista la deuda actual tiene el cliente 
	{
		
	}
public void Dar_De_baja()//de la lista Cliente que pasan a la lista deudores
{
	for(Persona cliente : listaCliente.lista){
		if(cliente.getDeuda() > 0){
			listaClienteConDeudas.lista.add(cliente);
		}
	}
}
public void Dar_De_alta()//de la lista deudores que pasan a lista Cliente
{
	for(Persona cliente : listaClienteConDeudas.lista){
		if(cliente.getDeuda() < 0){
			listaCliente.lista.add(cliente);
		}
	}
}
public void Ver_Turnos()//Muestra tipo de clase, Horarios, Profesor y cantidad de cupos 
{
	
}
public void Incribirse_A_Turnos(Cliente cliente)//turnos
{
	
}
public void Cambiar_De_Turnos(Cliente cliente, Profesor profesor)// Turnos
{
	
}
public void Cancelar_Turno(Cliente cliente)//Turnos
{
	
}
public void Vender_Productos() //Tienda
{
	
}
public void Reponer_Stock()//Tienda 
{
	
}
public void Cetificado_De_Salud()//Cliente
{
	
}


}
