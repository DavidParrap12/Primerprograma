public class Main {
    public static void main(String[] args) {
        System.out.println("¡Bienvenido(a) a Screen Match!");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 4.0) /3;
        System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja 
                La mejor pelicula del fin del milenio
                Fue lanzada en:
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        String sinop ="""
                Con una nota de:""" + notaDeLaPelicula;
        System.out.println(sinop);

        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);
    }

}
