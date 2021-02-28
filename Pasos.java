
package ED;

public class Pasos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pasos p = new Pasos();
		switch(p.esfuerzo(2000)) {
		case -1:
			System.out.println("ERROR: No puede haber pasos negativos");
			break;
		case -2:
			System.out.println("ERROR: Creo que te has pasado de pasos");
			break;
		
		case 1:
			System.out.println("Mueve el culo");
			break;
		case 2:
			System.out.println("Vas mejorando");
			break;		
		case 3:
			System.out.println("Así me gusta");
			break;		
		case 4:
			System.out.println("My bien");
			break;	
		case 5:
			System.out.println("Eres una máquina");
			break;
		}

	}
	public int esfuerzo(int n){
		int salida=1;
		
		if(n<0) {
			return -1;
		}else if (n<1000) 
			salida = 1;
		else if(n>=1000 && n<2000) 
			salida = 2;
		else if(n>=2000 && n<4000) 
			salida = 3;
		else if(n>=4000 && n<6000) 
			salida = 4;
		else if(n>=6000 && n<999999999)
			salida = 5;
		else if(n>=999999999)
			return -2;
		
		return salida;
			
			
	}

}

