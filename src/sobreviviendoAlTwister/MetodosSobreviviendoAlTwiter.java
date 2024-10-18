package sobreviviendoAlTwister;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MetodosSobreviviendoAlTwiter {

    // Mostrar refugios disponibles
    public static String refugiosDisponibles(String[] refugios) {
        // mostrar opciones personalizadas al usuario

        // Mostrar los refugios disponibles
        for (int i = 0; i < refugios.length; i++) {
            // System.out.println((i + 1) + ". " + refugios[i]);
        }
        return null;
    }

    // Permitir al usuario elegir un refugio
    public static int elegirRefugio() {
        String[] refugios = {"SUBTERRANEO", "MONTANA", "BOSQUE"};
        ImageIcon iconoHuracan = new ImageIcon(MetodosSobreviviendoAlTwiter.class.getResource("/fotosprog/seestaformando.png"));
        // ImageIcon iconoHuracan = new ImageIcon(MetodosSobreviviendoAlTwiter.class.getResource("/fotosprog/seestaformando.png"));

        // Devuelve el índice de la opción seleccionada (0, 1 o 2)
        return JOptionPane.showOptionDialog(
                null,
                "* ES MOMENTO DE TOMAR UNA DECISION PARA LOGRAR SOBREVIVIR.\n*"
                + " PENSA CUAL SERA EL REFUGIO MAS SEGURO!!\n*"
                + " COMO VES SE ESTA COMENZANDO A FORMAR LA TORMENTA\n*"
                + " HAZ CLICK EN TU ELECCION\n*",
                "SE ESTA ACERCANDO : HAZ TU ELECCION !!!",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                iconoHuracan,
                refugios,
                refugios[0]
        );
    }

    // Mostrar suministros clave disponibles
    public static void recolectarSuministros(String[] inventarioUsuario, String[] suministrosClave) {
        int cantidadRecolectada = 0;
        boolean seguir = true;

        // Mientras haya espacio en el inventario, permitir recolección
        while (cantidadRecolectada < inventarioUsuario.length && seguir) {
            // Mostrar diálogo para seleccionar un suministro
            ImageIcon iconoHuracan = new ImageIcon(MetodosSobreviviendoAlTwiter.class.getResource("/fotosprog/seacerca.png"));
            String seleccion = (String) JOptionPane.showInputDialog(
                    null,
                    " ***********************************************************************************************\n*"
                    + "     HORA DE ESCOGER SUMINISTROS!!!     \n*"
                    + "     SIN PRESIONES!!!.                \n*"
                    + "     DE TUS ELLECIONES DEPENDERA TU VIDA             \n*"
                    + "     ' DEBERAS ELEGIR EL SUMINISTRO CORRECTO PARA ASEGURAR TU SUPERVIVENCIA'   \n*"
                    + " * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * \n*"
                    + " \n       ***   OPRIMIENDO EL BOTON DE LA DERECHA        ***     \n"
                    + "      ***        VAS A ELEGIR HASTA 5 SUMINISTROS         ***  \n*"
                    + "    *** O SI LO DESEAS PUEDES OPRIMIR CANCELAR   ***                       \n"
                    + "*************************************************************************************************",
                    "NO MIRES HACIA ARRIBA!!! CADA VEZ ESTA MAS CERCA",
                    JOptionPane.QUESTION_MESSAGE,
                    iconoHuracan,
                    suministrosClave,
                    suministrosClave[0]
            );

            // Verificar si el usuario eligió "Cancelar" para terminar el proceso
            if (seleccion == null) {
                seguir = false;
            } else {
                // Guardar el suministro en el inventario
                inventarioUsuario[cantidadRecolectada] = seleccion;
                cantidadRecolectada++;
            }
        }

        // Mostrar mensaje si se completó el inventario
        if (cantidadRecolectada == inventarioUsuario.length) {
            ImageIcon iconoHuracan = new ImageIcon(MetodosSobreviviendoAlTwiter.class.getResource("/fotosprog/llego.png"));
            ImageIcon iconosuministro = new ImageIcon(MetodosSobreviviendoAlTwiter.class.getResource("/fotosprog/suministros.png"));
            JOptionPane.showMessageDialog(
                    null,
                    "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n*"
                    + "* HAZ COMPLETADO LOS IMPLEMENTOS PARA SOBREVIVIR        \n"
                    + "* ESPERO QUE HAYAS ELEGIDO EL SUMINISTRO PRINCIPAL    \n*"
                    + "\n*               ****OPRIMI EL OK PARA CONTINUAR.****             \n        "
                    + "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ",
                    "YA CASI LLEGA: SUERTE!!!",
                    JOptionPane.INFORMATION_MESSAGE,
                    iconosuministro
            );
        }
    }

    // Fortalecer el refugio con el suministro clave
    public static boolean fortalecerRefugio(String[] inventarioUsuario, String suministroClave) {
        // Verificar si el suministro clave está en el inventario del usuario
        // recorrer con for
        for (String suministro : inventarioUsuario) { //for each
            ImageIcon iconoHuracan = new ImageIcon(MetodosSobreviviendoAlTwiter.class.getResource("/fotosprog/bienvenida.png"));
            if (suministro != null && suministro.equals(suministroClave)) {
                JOptionPane.showMessageDialog(null,
                        "  EXCELENTE \n"
                        + "BUENA ELECCION ",
                        suministro, 2, iconoHuracan);
                //   System.out.println("HAZ fortalecido el refugio con: " + suministroClave);
                return true;  // El refugio está seguro
            }
        }
        // System.out.println("NO TIENES EL SUMINISTRO CLAVE " + suministroClave + ") para fortalecer el refugio.");
        return false;  // El refugio no está seguro
    }

    // Evaluar el resultado final según la seguridad del refugio
    public static void evaluacionFinal(boolean esSeguro, String suministroClave, String nombreUsu) {
        ImageIcon iconoHuracan = new ImageIcon(MetodosSobreviviendoAlTwiter.class.getResource("/fotosprog/yapaso.png"));
        ImageIcon iconoHuracanpaso = new ImageIcon(MetodosSobreviviendoAlTwiter.class.getResource("/fotosprog/alegria.png"));
        if (esSeguro) {

            // mostrar mensaje final con Joption
            JOptionPane.showMessageDialog(null,
                    "FELICITACIONES " + nombreUsu
                    + " EL REFUGIO RESISTIO EL TWISTER GRACIAS AL SUMINISTRO :  " + suministroClave+"."
                    + "\n*************************************************"
                    + "\n  |       CONGRATULATION !!! CAMARADA        |  "
                    + "\n*************************************************",
                    " CONGRATULATION!!!PASO EL HURACAN!!!", 2, iconoHuracanpaso);
            // System.out.println("¡Has sobrevivido al Twister! El refugio resistio gracias al " + suministroClave + ". ¡Felicidades, has ganado!");
        } else {
            JOptionPane.showMessageDialog(null, " NO SOBREVIVISTE AL TWISTER \n"
                    + nombreUsu + " DEBISTE HABER ELEGIDO EL SUMINISTRO\n" + suministroClave
                    + ".\n" + "************************"
                    + "\n   ~  GAME OVER!!!~\n"
                    + "     "
                    + "~    CAMARADA~\n"
                    + "************************",
                    " GAME OVER!!!PASO EL HURACAN !!!", 2, iconoHuracan);
            // System.out.println("El refugio no resistio el Twister. Te falto el " + suministroClave + ". Game Over.");
        }
    }

    // ingreso de nombre usuario con dialogo
    public static String nombreIngresado() {
        ImageIcon iconoHuracan = new ImageIcon(MetodosSobreviviendoAlTwiter.class.getResource("/fotosprog/seestaformando.png"));
        ImageIcon iconoHuracan2 = new ImageIcon(MetodosSobreviviendoAlTwiter.class.getResource("/fotosprog/bienvenidasugerencia.png"));
      ImageIcon iconoHuracan3 = new ImageIcon(MetodosSobreviviendoAlTwiter.class.getResource("/fotosprog/bienvenida.png"));
        String nombreUsu;

        JOptionPane.showMessageDialog(null, " SE ESTA FORMANDO SOBRE NUESTRA ATMOSFERA UN ENORME HURACAN\n"
                + "TE RECOMENDAMOS QUE TOMES LAS PRECAUCIONES CORRESPONDIENTES\n"
                + "ES POR TU VIDA!!!", "IMPORTANTE",
                JOptionPane.INFORMATION_MESSAGE, iconoHuracan);
        JOptionPane.showMessageDialog(null,
                "TE DAMOS LA BIENVENIDA!!!\n"
                + "PARA SER PARTE DE LOS REFUGIADOS,\n"
                + "POR FAVOR A CONTINUACION INGRESA TU NOMBRE.",
                "SUGERENCIA PARA REFUGIARSE DEL TWISTER",
                JOptionPane.INFORMATION_MESSAGE,
                iconoHuracan2);

        nombreUsu = (String) JOptionPane.showInputDialog(null, "ESCRIBE TU NOMBRE POR FAVOR ",
                "INSCIPCION PARA REFUGIARSE DEL TWISTER",JOptionPane.QUESTION_MESSAGE,iconoHuracan3,null,null);
        return nombreUsu;
    }

}
