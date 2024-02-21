import java.util.*;



public class Main {

    public static void main(String[] args) {
        ArrayList<Producto> productosNacionales = new ArrayList<Producto>();
        ArrayList<Producto> productosImportados = new ArrayList<Producto>();

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println(" ");
            System.out.print("""
                    Ingrese el número según la acción deseada:
                    1. Registrar producto nacional.
                    2. Registrar producto importado.
                    3. Listar productos NACIONALES.
                    4. Listar productos IMPORTADOS.
                    5. Buscar producto nacional.
                    6. Buscar producto importado.
                    
                    Presione cualquier otra tecla si desea terminar el programa.
                    ------------------------------>\s""");
            String opcion;
            opcion = sc.nextLine();

            switch (opcion) {
                case "1" -> {

                    System.out.println(" ");
                    System.out.print("Ingrese el nombre (String) del producto: ");
                    String nombre = sc.nextLine();
                    System.out.println(" ");
                    System.out.print("Ingrese el código (Integer) del producto: ");
                    int codigo = sc.nextInt();
                    System.out.println(" ");
                    System.out.print("Ingrese el registro DIAN (String) del producto: ");
                    sc.nextLine();
                    String registro = sc.nextLine();
                    productosNacionales.add(new Nacional(nombre, codigo, registro));


                }
                case "2" -> {

                    System.out.println(" ");
                    System.out.print("Ingrese el nombre (String) del producto: ");
                    String nombre = sc.nextLine();
                    System.out.println(" ");
                    System.out.print("Ingrese el código (Integer) del producto: ");
                    int codigo = sc.nextInt();
                    System.out.println(" ");
                    System.out.print("Ingrese la licencia de Importación (String) del producto: ");
                    sc.nextLine();
                    String registro = sc.nextLine();
                    productosImportados.add(new Importado(nombre, codigo, registro));


                }
                case "3" -> {
                    System.out.println(" ");
                    productosNacionales.forEach(miObjeto -> System.out.println("Producto: " + miObjeto.nombre + " - Código: " + miObjeto.getCodigo()));
                }
                case "4" -> {
                    System.out.println(" ");
                    productosImportados.forEach(miObjeto -> System.out.println("Producto: " + miObjeto.nombre + " - Código: " + miObjeto.getCodigo()));
                }
                case "5" -> {

                    System.out.println(" ");
                    System.out.print("Ingrese el nombre del producto nacional: ");
                    String producto = sc.nextLine();
                    boolean bandera = true;
                    for (Producto products : productosNacionales) {
                        if (Objects.equals(producto, products.nombre)) {
                            System.out.println("Encontrado: Producto: " + products.nombre + " - Código: " + products.nombre);
                            bandera = false;
                            break;
                        }
                    }
                    if (bandera) {
                        System.out.println("Producto nacional no encontrado...");
                    }


                }
                case "6" -> {

                    System.out.println(" ");
                    System.out.print("Ingrese el nombre del producto importado: ");
                    String producto = sc.nextLine();
                    boolean bandera = true;
                    for (Producto products : productosImportados) {
                        if (Objects.equals(producto, products.nombre)) {
                            System.out.println("Encontrado: Producto: " + products.nombre + " - Código: " + products.nombre);
                            bandera = false;
                            break;
                        }
                    }
                    if (bandera) {
                        System.out.println("Producto importado no encontrado...");
                    }


                }
                case null, default -> flag = false;
            }

        }
    }
}