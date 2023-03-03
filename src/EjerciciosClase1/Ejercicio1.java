package EjerciciosClase1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroInicio = 5;
		int numeroFin = 14;
		
		// a)
		while(numeroInicio < numeroFin)
		{ 

			System.out.print(numeroInicio + "\t");
			numeroInicio ++;
		}
		
		
		// b)
		numeroInicio = 5;
		numeroFin = 14;
		
		while(numeroInicio < numeroFin)
		{
			if(numeroInicio%2 == 0)
			{
				System.out.print(numeroInicio + "\t");
			}
			numeroInicio ++;

		}
		
		// c)
		numeroInicio = 5;
		numeroFin = 14;
		boolean pares = false;
		
		while(numeroInicio < numeroFin)
		{
			if(pares == true)
			{
				if(numeroInicio%2 == 0)
				{
					System.out.print(numeroInicio + "\t");
				}
				
			}
			else
			{
				if(numeroInicio%2 != 0)
				{
					System.out.print(numeroInicio + "\t");
				}
			}
			
			numeroInicio ++;

		}
		
	}
}
