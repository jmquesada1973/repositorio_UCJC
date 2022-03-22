import java.io.IOException;

public class clase_prueba {

	//Clase de prueba inicial
	/* Comentario
	 * dsdd
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.printf("Hola Jose1"+args[0]);
Runtime a = Runtime.getRuntime();
try {
	a.exec("dir");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}

}
