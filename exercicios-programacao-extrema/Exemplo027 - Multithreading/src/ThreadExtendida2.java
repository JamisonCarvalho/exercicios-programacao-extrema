
public class ThreadExtendida2 extends Thread{

	ListaNumeros listaNumeros;
	
	ThreadExtendida2(ListaNumeros listaNumeros){
		this.listaNumeros = listaNumeros;
	}
	
	public void run() {
		listaNumeros.printTable(1000);
	}
}
