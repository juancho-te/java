package superconversor;
import javax.swing.JOptionPane;
import java.util.Arrays;



public class Agente {
	
	
	public static void main(String[] args) {
		
		Conversor conversor=new Conversor();   // instancio la clase y genero el objeto
		String opcion;         // almacena la que se convierte---peso grados etc.... iimplementado solo moneda
		String tipoDeMoneda;    // almacena tipo de moneda local....peso argento,shilenoo..etc
		String tipoDeMonedaEx; // almacena moneda extrangera...dollar, euro...etcc
		double cantidad;       // cantidad de dinero aconvertir
		
		String[] unidades={ "Moneda"};
		String[] monedas={"Peso argentino"}; //, "pesos Chilenos","Soles","pesos colombianos","reales"};
		String[] monedasEx=      {"Dolar","Euros","Libras","Yen japones", "Sul Coreano"};
		double[] tablaDeValores= {135.54 , 897.60,    3.84, 4344.55     ,0.19};
		boolean sigue=true;
		
		

		conversor.setUnidadesConvertibles(unidades); //setea array de unidades
		conversor.setMonedas(monedas); // setea array de monedas de latinoamerica;
		conversor.setMonedasEx(monedasEx);
		conversor.setTablaDeValores(tablaDeValores);
		
		
		
		while(sigue==true) {
				int indiceMonedaEx=0; //almacena indice de moneda ex, segun la moneda extragera elegida
				double calculo=0;     //almacena calculo en base a laoneda local y el valo de la moneda ex cuanto le corresponde
								
				//System.out.println(Arrays.asList(monedasEx).indexOf("Libras"));	
				//que se convierte?
				
				opcion = (String)JOptionPane.showInputDialog(null, "¿Que desea convertir?", null, JOptionPane.QUESTION_MESSAGE, null, conversor.getUnidadesConvertibles(), conversor.getUnidadesConvertibles()[0]);
				//System.out.println(opcion);
		
				//cuanta unidad?
				conversor.setCantidadDeDinero(Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto "+opcion+" desea convertir?")));
				cantidad=conversor.getCantidadDeDinero();
				//System.out.println(cantidad);
		       	
				// tipo de moneda local
				tipoDeMoneda = (String)JOptionPane.showInputDialog(null, "¿Tipo de moneda?", null, JOptionPane.QUESTION_MESSAGE, null,monedas, monedas[0]);
		       	//System.out.println(tipoDeMoneda);
		       	
		       	// a que tipo de moneda  extragera
		       	tipoDeMonedaEx = (String)JOptionPane.showInputDialog(null, "¿A que tipo de moneda?", null, JOptionPane.QUESTION_MESSAGE, null,monedasEx, monedasEx[0]);
		       	//System.out.println(tipoDeMonedaEx);
		       	
		       	indiceMonedaEx = Arrays.asList(monedasEx).indexOf(tipoDeMonedaEx);
		       	
		       	calculo=cantidad/tablaDeValores[indiceMonedaEx];
		       	JOptionPane.showMessageDialog(null, "A la cantidad de "+cantidad+ " " + tipoDeMoneda +"le corresponde: "+String.format("%.2f", calculo)+" "+tipoDeMonedaEx+"s");
		       	
		       	int continua=JOptionPane.showConfirmDialog(null, "Desea consitnuar?");
		       	//System.out.println(continua);
		       	
		       	if (continua==1 || continua==2) {
		       		sigue=false;
		       		System.out.println("se termino ");
		       	}
			}
		System.exit(0);
	}

}
