


public class Conversor {
	
	private String[] unidadesConvertibles;
	private String[] monedas;   //= {"Pesos argentinos", "pesos Chilenos","Soles","pesos colombianos","reales"};
	private double[] tablaDeValores;    // =  {135.54,            897.60,            3.84,     4344.55,          0.19};	
	private String[] monedasEx; //"Dolar","Euros","Libras","Yen japones", "Sul Coreano"};
	private double conversion;
	// procesouno

		
	public String[] getMonedasEx() {
		return monedasEx;
	}
	public void setMonedasEx(String[] monedasEx) {
		this.monedasEx = monedasEx;
	}
	public String[] getMonedas() {
		return monedas;
	}
	public void setMonedas(String[] monedas) {
		this.monedas = monedas;
	}
	
	
	
	public double getConversion() {
		return conversion;
	}
	public void setConversion(double conversion) {
		this.conversion = conversion;
	}
	public String[] getUnidadesConvertibles() {
		return unidadesConvertibles;
	}
	public void setUnidadesConvertibles(String[] unidadesConvertibles) {
		this.unidadesConvertibles = unidadesConvertibles;
	}
	public String getTipoDemoneda() {
		return tipoDemoneda;
	}
	public void setTipoDemoneda(String tipoDemoneda) {
		this.tipoDemoneda = tipoDemoneda;
	}
	public double getCantidadDeDinero() {
		return cantidadDeDinero;
	}
	public void setCantidadDeDinero(double cantidadDeDinero) {
		this.cantidadDeDinero = cantidadDeDinero;
	}
	private String tipoDemoneda;
	private double cantidadDeDinero;

	public double[] getTablaDeValores() {
		return tablaDeValores;
	}
	public void setTablaDeValores(double[] tablaDeValores) {
		this.tablaDeValores = tablaDeValores;
	}



	
	
	
	
	
	
		
	/*
	public static void main(String[] args) {
			
			String[] options = {"Temperatura", "Moneda", "Velocidad Maritima", "Metros"};
			String[] monedas = {"Pesos argentinos", "pesos Chilenos","Soles","pesos colombianos","reales"};
			Double[] factor =  {135.54,            897.60,            3.84,     4344.55,          0.19};
			
			double conversion;
			String opcion;
			String tipoDemoneda;
			double cantidadDeDinero;
			

	        opcion = (String)JOptionPane.showInputDialog(null, "¿Que desea convertir?", null, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
	        
	        System.out.println(opcion);
	        cantidadDeDinero= Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto "+opcion+" desea convertir?"));
	        
	        System.out.println(cantidadDeDinero);

	       	tipoDemoneda = (String)JOptionPane.showInputDialog(null, "¿Tipo de moneda?", null, JOptionPane.QUESTION_MESSAGE, null,monedas, monedas[0]);
	        
	       	System.out.println(tipoDemoneda);
	       	
	       	
	       	switch(opcion) {
	       		case "Moneda":
	       			System.out.println("eligio conversion de monedas");
	       			break;
	       			
	       		case "Temperatura":
	       			System.out.println("Eleigio temperatura");
	       			break;
	       		
	       		default:
	       			break;
	       	
	       	
	       	
	       	}
	       	
	       	
	       	
	       	
	       	
	       	
		} */
		
		
		
		
		
		
	
		
		
		
	}

