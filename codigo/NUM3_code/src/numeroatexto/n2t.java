package numeroatexto;


public class n2t {
	private int flag;
	public int numero;
	public String importe_parcial;
	public String num;
	public String num_letra;
	public String num_letras;
	public String num_letram;
	public String num_letradm;
	public String num_letracm;
	public String num_letramm;
	public String num_letradmm;
	
	public n2t(){
		//Construye el objeto
		//Valor por defecto (0)
		numero = 0;
		flag=0;
	}
	public n2t(int n){
		//Construye el objeto
		//Valor pasado por parametro
		numero = n;
		flag=0;
	}

	
	private String unidad(int numero){
		//Recibe el numero (una sola unidad).
		//Traduce esa unidadad a texto.
		switch (numero){
		case 9:
				num = "nueve";
				break;
		case 8:
				num = "ocho";//ocho
				break;
		case 7:
				num = "siete";//siete
				break;
		case 6:
				num = "seis";//seis
				break;
		case 5:
				num = "cinco";//cinco
				break;
		case 4:
				num = "cuatro";
				break;
		case 3:
				num = "tres";
				break;
		case 2:
				num = "dos";
				break;
		case 1:
				//si la bandera está en 0, significa que
				//se trata de la unidad propiamente dicha
				if (flag == 0)
					num = "uno";
				else 
					num = "un";
				break;
		case 0:
				if(flag == 0)
					num = "cero";
				else
					num = "";
				break;
		}
		//devuelve la cadena correspondiente
		return num;
	}
	///---------------------- clase decena y sus modulos------------------------------------------------///
	private String decena(int numero){
		/// primera mitad es desde el 10 al 49
		if(primeraMitadDeDecena(numero)){
			return hacerPrimeraMitadDecena(numero);
		}
		/// segunda mitad es de 50 al 99
		return hacerSegundaMitadDecena(numero);
		
   }
	
	
////---------------------- sus modulos--------------------------------------------///
	
	private boolean noventa(int nro){
		//Devuelve true si el numero pasado por parametro esta en el rango de los 90
		return nro >= 90 && nro <= 99;
	}
	private boolean ochenta(int nro){
		//Devuelve true si el numero pasado por parametro esta en el rango de los 80
		return nro >= 80 && nro <= 89;
	}
	private boolean setenta(int nro){
		//Devuelve true si el numero pasado por parametro esta en el rango de los 70
		return nro >= 70 && nro <= 79;
	}
	private boolean sesenta(int nro){
		//Devuelve true si el numero pasado por parametro esta en el rango de los 60
		return nro >= 60 && nro <= 69;
	}
	@SuppressWarnings("unused")
	private boolean cincuenta(int nro){
		//Devuelve true si el numero pasado por parametro esta en el rango de los 50
		return nro >= 50 && nro <= 59;
	}
	private boolean cuarenta(int nro){
		//Devuelve true si el numero pasado por parametro esta en el rango de los 40
		return nro >= 40 && nro <= 49;
	}
	private boolean treinta(int nro){
		//Devuelve true si el numero pasado por parametro esta en el rango de los 30
		return nro >= 30 && nro <= 39;
	}
	private boolean veinte(int nro){
		//Devuelve true si el numero pasado por parametro esta en el rango de los 20
		return nro >= 20 && nro <= 29;
	}
	private boolean diez(int nro){
		//Devuelve true si el numero pasado por parametro esta en el rango de los 10
		return nro >= 10 && nro <= 19;
	}
	private boolean primeraMitadDeDecena(int numero){
		//Devuelve true si esta en el rango de los menores a 50 (terminacion -ti para numeros no "redondos")
		return numero>=0 && numero<=49;
	}
	
	
	private String hacerPrimeraMitadDecena (int nro2){	
		 ///cuarenta 
		 if (cuarenta(nro2))
			return num_letra= nro2==40? "cuarenta " :"cuarenta ".concat("y ").concat(unidad(nro2 - 40));
		///treinta 
		 if (treinta(nro2))
				return num_letra= nro2==30 ? "treinta ":"treinta ".concat("y ").concat(unidad(nro2 - 30));
		 ///veinte
		if (veinte(nro2))
			return num_letra=nro2==20 ? "veinte " : "veinti".concat(unidad(nro2 - 20));
		///diez
		 if (diez(nro2))
			 return hacerSwitch(nro2);
			//return num_letra;
		return num_letra=unidad(nro2);
	}

	private String hacerSegundaMitadDecena(int numero){
	///noventa
		if (noventa(numero))
			return num_letra= numero==90? "noventa " : "noventa y ".concat(unidad(numero - 90));
		///ochenta
		 if (ochenta(numero))
			return num_letra= numero==80? "ochenta " : "ochenta y ".concat(unidad(numero - 80));
		///setenta
		 if (setenta(numero))
			return num_letra= numero==70? "setenta " : "setenta y ".concat(unidad(numero - 70));
		 ///sesenta
		 if (sesenta(numero))
			return num_letra= numero==60? "sesenta " : "sesenta y ".concat(unidad(numero - 60));
		 ///cincuenta
		return num_letra= numero==50? "cincuenta " :"cincuenta y".concat(unidad(numero - 50));
	}
	
	private String hacerSwitch(int nro2){
	///----------------------utilizo un metodo para desarrollar el switch de los "dieci tantos"---------///
		if(nro2<=15 && nro2>=10)
			return hacerprimeramitadswitch(nro2);
		else
			return hacersegundamitadswitch(nro2);
	}
			
			
			
	private String hacerprimeramitadswitch(int nro2){	
		//Convierte la primera mitad de las primeras decenas.
		//Son aquellas que no se nombran en una forma regular
		switch (nro2){
			case 10: num_letra = "diez ";	break;
			case 11: num_letra = "once ";	break;
			case 12: num_letra = "doce ";	break;
			case 13: num_letra = "trece ";	break;
			case 14: num_letra = "catorce ";break;
			case 15: num_letra = "quince ";	break;		
		}
		return num_letra;
	}
		private String hacersegundamitadswitch(int nro2){	
			//Convierte la segunda mitad de las primeras decenas
			//Son aquellas empezadas por 'dieci', siguiendo un patron mas o menos regular
			switch (nro2){		
				case 16: num_letra = "dieciseis ";	break;
				case 17: num_letra = "diecisiete ";	break;
				case 18: num_letra = "dieciocho ";	break;
				case 19: num_letra = "diecinueve ";	break;
			}
			return num_letra;

		}
	
///-------------------------------- clase centena y sus modulos--------------------------------///
	private String centena(int numero){
		//Determina a que mitad pertenece el numero y ejecuta el metodo correspondiente
		if(primeraMitadDeCientos(numero))
			return hacerPrimeraMitadCientos(numero);
		else
			return hacerSegundaMitadCientos(numero);
}	
	
	///-------------------------------- sus modulos----------------------------------/////
		private boolean novecientos(int nro){
			//Es novecientos
			return nro >= 900 && nro <= 999;
		}
		private boolean ochocientos(int nro){
			//Es ochocientos
			return nro >= 800 && nro <= 899;
		}
		private boolean setecientos(int nro){
			//Es setencientos
			return nro >= 700 && nro <= 799;
		}
		private boolean seiscientos(int nro){
			//Es seiscientos
			return nro >= 600 && nro <= 699;
		}
		private boolean quinientos(int nro){
			//Es quinientos
			return nro >= 500 && nro <= 599;
		}
		private boolean cuatrocientos(int nro){
			//Es cuatrocientos
			return nro >= 400 && nro <= 499;
		}
		private boolean trescientos(int nro){
			//Es trescientos
			return nro >= 300 && nro <= 399;
		}
		private boolean doscientos(int nro){
			//Es Doscientos
			return nro >= 200 && nro <= 299;
		}
		@SuppressWarnings("unused")
		private boolean cien(int nro){
			//Es cien
			return nro >= 100 && nro <= 199;
		}
		private boolean primeraMitadDeCientos(int nro){
			//devuelve true si el numero pasado por parametro esta en la primera mitad de los "cientos"
			return nro>=100 && nro<=599;
		}
		private String hacerPrimeraMitadCientos(int numero){
			///es quinientos///
			if (quinientos(numero))
			{
				
				return num_letra= numero==500 ? "quinientos " : "quinientos ".concat(decena(numero - 500));
			}
			
			///es cuatrocientos///
			 if (cuatrocientos(numero))
			{
				
				return num_letra= numero==400 ? "cuatrocientos " : "cuatrocientos ".concat(decena(numero - 400));
			}
			 ///es trescientos///
			 if (trescientos(numero))
			{
				
				return num_letra= numero==300 ? "trescientos " : "trescientos ".concat(decena(numero - 300));
			}
			 ///es doscientos///
			 if (doscientos(numero))
			{
		
				return num_letra= numero==200 ? "doscientos " : "doscientos ".concat(decena(numero - 200));
			}
			 
			 ///es cienn///
			return num_letra= numero==100 ? "cien " : "ciento ".concat(decena(numero - 100));
			
}
		
		private String hacerSegundaMitadCientos(int numero){
			if (novecientos(numero))
				return num_letra= numero==900 ? "novecientos " : "novecientos ".concat(decena(numero - 900));
			///es ochocientos//
			if (ochocientos(numero))
				return num_letra= numero==800 ? "ochocientos " : "ochocientos ".concat(decena(numero - 800));
			///es setecientos///
			if (setecientos(numero))
				return num_letra= numero==700 ? "setecientos " : "setecientos ".concat(decena(numero - 700));
			///es seiscientos///
			if (seiscientos(numero))
				return num_letra= numero==600 ? "seiscientos " : "seiscientos ".concat(decena(numero - 600));
		  return num_letra=decena(numero);	
}
	
	//------------------------------------------------clase miles y sus modulos-------------------///

	private String miles(int numero){
		// Convierte un numero mil a texto
		
		// Si esta en el rango de los miles
		if (numero >= 1000 && numero <2000)
			num_letram = ("mil ").concat(centena(numero%1000));
		// Si es dos mil o lo supera
		if (numero >= 2000 && numero <10000){
			flag=1;
			num_letram = unidad(numero/1000).concat(" mil ").concat(centena(numero%1000));
		}
		// Si no llega a ser mil
		if (numero < 1000)
			num_letram = centena(numero);
		return num_letram;
}		

	private String decmiles(int numero){
		
		// Es justo diez mil
		if (numero == 10000)
			num_letradm = "diez mil";
		// En la franja de los diez miles
		if (numero > 10000 && numero <20000){
			flag=1;
			num_letradm = decena(numero/1000).concat("mil ").concat(centena(numero%1000));		
		}
		//Supera los veintemil
		if (numero >= 20000 && numero <100000){
			flag=1;
			num_letradm = decena(numero/1000).concat(" mil ").concat(miles(numero%1000));		
		}
		
		//No llega a los diez mil
		if (numero < 10000)
			num_letradm = miles(numero);
		
		return num_letradm;
}		

	private String cienmiles(int numero){
		//Es justo cien mil
		if (numero == 100000)
			num_letracm = "cien mil";
		if (numero >= 100000 && numero <1000000){
			flag=1;
			num_letracm = centena(numero/1000).concat(" mil ").concat(centena(numero%1000));		
		}
		//No llega a los cien mil
		if (numero < 100000)
			num_letracm = decmiles(numero);
		return num_letracm;
}		

	private String millon(int numero){
		// Mas de un millon
		if (numero >= 1000000 && numero <2000000){
			flag=1;
			num_letramm = ("Un millon ").concat(cienmiles(numero%1000000));
		}
		if (numero >= 2000000 && numero <10000000){
			flag=1;
			num_letramm = unidad(numero/1000000).concat(" millones ").concat(cienmiles(numero%1000000));
		}
		// No llega al millon
		if (numero < 1000000)
			num_letramm = cienmiles(numero);
		
		return num_letramm;
}		
	
	private String decmillon(int numero){
		// Es justo diez millones
		if (numero == 10000000)
			num_letradmm = "diez millones";
		// Más de diez millones
		if (numero > 10000000 && numero <20000000){
			flag=1;
			num_letradmm = decena(numero/1000000).concat("millones ").concat(cienmiles(numero%1000000));		
		}
		if (numero >= 20000000 && numero <100000000){
			flag=1;
			num_letradmm = decena(numero/1000000).concat(" milllones ").concat(millon(numero%1000000));		
		}
		
		// No llega a diez millones
		if (numero < 10000000)
			num_letradmm = millon(numero);
		
		return num_letradmm;
}		

	
	public String convertirLetras(int numero){
		// Empieza a convertir el numero
		// (se llaman en cascada los metodos segun correspondan)
		num_letras = decmillon(numero);
		return num_letras;
} 
	
	
	

}
