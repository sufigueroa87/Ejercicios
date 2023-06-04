public class Main {
    public static void main(String[] args) {
        //creación del objeto libro1
        Libro libro1 = new Libro("8497644735", "Alicia en el País de las Maravillas", "Lewis Carroll", 248);

        //creación del objeto libro2
        Libro libro2 = new Libro("194554046X", "Momo", "Michael Ende",  320);

        //mostrar por pantalla libro1
        System.out.println(libro1.toString());

        //mostrar por pantalla libro2
        System.out.println(libro2.toString());

        //Indicar qué libro de los dos tiene más páginas
        libro1.libroMasPaginas(libro1, libro2);
    }
}