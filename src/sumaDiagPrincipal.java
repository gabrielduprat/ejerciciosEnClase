public class sumaDiagPrincipal {

    public static void main(String[] args) {
        int[][] matriz = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };
        int suma = sumarDiagonalPrincipal(matriz);
        System.out.println("La suma de la digonal principal es: " + suma);

    }

    public static int sumarDiagonalPrincipal(int[][] matriz){
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
          }
        return suma;
      
    }
}
