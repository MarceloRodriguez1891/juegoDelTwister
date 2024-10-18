package sobreviviendoAlTwister;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static sobreviviendoAlTwister.MetodosSobreviviendoAlTwiter.elegirRefugio;
import static sobreviviendoAlTwister.MetodosSobreviviendoAlTwiter.nombreIngresado;
import static sobreviviendoAlTwister.MetodosSobreviviendoAlTwiter.refugiosDisponibles;

public class sobreviviendoAlTwister {

    public static void main(String[] args) {
// Mostrar un mensaje con la imagen antes de pedir el nombre
        ImageIcon iconoHuracan = new ImageIcon(MetodosSobreviviendoAlTwiter.class.getResource("/fotosprog/huracanfot.png"));

        // Cargar la imagen como ícono
        //    ImageIcon IconoHuracan = new ImageIcon("\"C:\\Users\\29775345\\Download
        //Mostrar pregunta nombre y asignarlo
        //  MetodosSobreviviendoAlTwiter.nombreIngresado();
        String nombreUsuario = MetodosSobreviviendoAlTwiter.nombreIngresado();
        // mostrar texto bienvenida al usuario
        //   ImageIcon iconoHuracan = new ImageIcon(MetodosSobreviviendoAlTwiter.class.getResource("/fotosprog/seestaformando.png"));
        ImageIcon iconoHuracan2 = new ImageIcon(MetodosSobreviviendoAlTwiter.class.getResource("/fotosprog/viene.png"));
        JOptionPane.showMessageDialog(null, "HOLA \n" + nombreUsuario + "!!"
                + " \n***TE DAMOS LA BIENVENIDA AL JUEGO DEL TWISTER***\n"
                + "\nAUNQUE EN REALIDAD TE DAMOS LA OPORTUNIDAD DE REFUGIARTE\n"
                + "PARA INTENTAR SOBREVIVIR",
                "COMENCEMOS A JUGAR",
                JOptionPane.INFORMATION_MESSAGE,
                iconoHuracan);
        //      IconoHuracan);
//    System.out.println(" Hola " + nombreUsuario + " te damos la bienvenida al juego del Twiter ");

// Lista de refugios disponibles con eleccion y devolucion
        String[] refugios = {"SUBTERRANEO", "MONTANA", "BOSQUE"};
        int opcion = elegirRefugio();

        if (opcion != -1) {
            JOptionPane.showMessageDialog(null, nombreUsuario + " ESPERO QUE EL REFUGIO: " + refugios[opcion]
                    + " \nSOPORTE LA TORMENTA QUE SE VIENE\n"
                    + " PRESIONA OK PARA IR POR SUMINISTROS",
                    "REFUGIO ELEGIDO PARA SOBREVIVIR", JOptionPane.INFORMATION_MESSAGE,
                    iconoHuracan2
            );
        }
// Mostrar los refugios disponibles
        MetodosSobreviviendoAlTwiter.refugiosDisponibles(refugios);
// String opciones= refugiosDisponibles(refugios);
// JOptionPane.showMessageDialog(null,refugios,  "OPCIONES DE REFUGIO DISPONIBLES", JOptionPane.INFORMATION_MESSAGE);
//  JOptionPane.showInputDialog( "Hola \n" + nombreUsuario+ " LAS OPCIONES DISPONIBLES PARA REFUGIARTE DEL HURACAN SON:\n"+MetodosSobreviviendoAlTwiter.refugiosDisponibles(refugios));

// Elección del refugio por parte del usuario
//    int eleccionUsuRefugio = MetodosSobreviviendoAlTwiter.elegirRefugio();
//  System.out.println("USTED HA ELEGIDO PARA SOBREVIVIR EN: " + refugios[eleccionUsuRefugio]);
// Lista de suministros clave
        String[] suministroElegir = {"1-MANTA TERMICA", "2-ENCENDEDOR", "3-COMIDA ENLATADA",
            "4-BOTIQUIN BASICO", "5-KIT DE PRIMEROS AUXILIOS", "6-LINTERNA", "7-RADIO",
            "8-FILTRO DE AGUA", "9-COBIJA", "10-HERRAMIENTAS"};
//int opSuministro=MetodosSobreviviendoAlTwiter.recolectarSuministros(refugios, suministroElegir);
// Mostrar suministros clave disponibles
//    MetodosSobreviviendoAlTwiter.suministrosClaves(suministroElegir);
//lista de suminnistro con devolucion


        /* if (opSuministro!=1){
JOptionPane.showMessageDialog(null, "PARA SOBREVIVIR HAS ELEGIDO: " + opSuministro[suministroElegir],"  SOBREVIVIR",JOptionPane.INFORMATION_MESSAGE);
}*/
// Inicializar inventario vacío
// MetodosSobreviviendoAlTwiter.suministrosClaves(suministroElegir);
        String[] inventarioUsuario = new String[5];

// Recolectar suministros con capacidad limitada (máximo 5)
        MetodosSobreviviendoAlTwiter.recolectarSuministros(inventarioUsuario, suministroElegir);
        //   ImageIcon iconoHuracan = new ImageIcon(sobreviviendoAlTwister.main(args).class.getResource("/fotosprog/seestaformando.png"));
        ImageIcon iconollegaste = new ImageIcon(MetodosSobreviviendoAlTwiter.class.getResource("/fotosprog/casi.png"));
        ImageIcon iconollegaste2 = new ImageIcon(MetodosSobreviviendoAlTwiter.class.getResource("/fotosprog/bienvenidasugerencia.png"));
        JOptionPane.showMessageDialog(null, nombreUsuario
                + " LLEGASTE HASTA AQUI, \n "
                + " HAZ TOMADO TUS DECISIONES.\n "
                + "     MUCHA SUERTE!!!\n"+"\n"
                + "******************************************"
                + "*  PRESIONA OK PARA PONERTE A RESGUARDO  *"
                + "******************************************",
                 "AHI VIENE !! YA LLEGO!!!!!!!!!",
                JOptionPane.INFORMATION_MESSAGE,
                iconollegaste);
        JOptionPane.showMessageDialog(null, nombreUsuario
                + "* - * - * - * - * - * - * - * - * - * - * - * - * - * - *\n"
                + "* CORREEEEEEEEEE A REFUGIARTEEEEEEEE!!!!* \n "
                + "* - * - * - * - * - * - * - * - * - * - * - * - * - * - *\n",
                "LLEGO!!!!!!!!!",
                JOptionPane.INFORMATION_MESSAGE,
                iconollegaste2
        );
//JOptionPane.showMessageDialog(null,nombreUsuario+  " LLEGASTE AL LIMITE DE " + inventarioUsuario.length+" SUMINISTROS\n  A UTILIZAR BIEN TUS ELECCIONES \n MUCHA SUERTE!!! ","SERA LA ELECCION CORRECTA ???",JOptionPane.INFORMATION_MESSAGE);
// Generar nivel de peligrosidad del Twister (0 a 9)
        int furiaDelTwister = new Random().nextInt(10);

// Evaluar si el refugio es seguro con base en los suministros recolectados
        boolean esSeguro = MetodosSobreviviendoAlTwiter.fortalecerRefugio(inventarioUsuario, suministroElegir[furiaDelTwister]);

// Evaluar si el refugio resiste al Twister
        MetodosSobreviviendoAlTwiter.evaluacionFinal(esSeguro, suministroElegir[furiaDelTwister], nombreUsuario);
    }

}
