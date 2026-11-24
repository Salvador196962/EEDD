package paquete;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ejercicioprueba {
    JFrame jfrLayout = null;
    JTextField jtfNorte = null;
    JPanel jpnCentro = null;

    // PARTIDO 1: Honduras vs Chile
	    JPanel jpnPartido1 = null;
	    JPanel jpnFechaCiudad1 = null;
	    JLabel jlbFecha1 = null;
	    JLabel jlbCiudad1 = null;
	    JPanel jpnFila1 = null;
	    JLabel jlbHonduras1 = null;
	    JLabel jlbResHonduras1 = null;
	    JLabel jlbVS1 = null;
	    JLabel jlbResChile1 = null;
	    JLabel jlbChile1 = null;

    // PARTIDO 2: España vs Suiza
	    JPanel jpnPartido2 = null;
	    JPanel jpnFechaCiudad2 = null;
	    JLabel jlbFecha2 = null;
	    JLabel jlbCiudad2 = null;
	    JPanel jpnFila2 = null;
	    JLabel jlbEspana1 = null;
	    JLabel jlbResEspana1 = null;
	    JLabel jlbVS2 = null;
	    JLabel jlbResSuiza1 = null;
	    JLabel jlbSuiza1 = null;

    // PARTIDO 3: Chile vs Suiza
	    JPanel jpnPartido3 = null;
	    JPanel jpnFechaCiudad3 = null;
	    JLabel jlbFecha3 = null;
	    JLabel jlbCiudad3 = null;
	    JPanel jpnFila3 = null;
	    JLabel jlbChile2 = null;
	    JLabel jlbResChile2 = null;
	    JLabel jlbVS3 = null;
	    JLabel jlbResSuiza2 = null;
	    JLabel jlbSuiza2 = null;

    // PARTIDO 4: España vs Honduras
	    JPanel jpnPartido4 = null;
	    JPanel jpnFechaCiudad4 = null;
	    JLabel jlbFecha4 = null;
	    JLabel jlbCiudad4 = null;
	    JPanel jpnFila4 = null;
	    JLabel jlbEspana2 = null;
	    JLabel jlbResEspana2 = null;
	    JLabel jlbVS4 = null;
	    JLabel jlbResHonduras2 = null;
	    JLabel jlbHonduras2 = null;

    public ejercicioprueba() {
        disenio();
        jfrLayout.setVisible(true);
    }

    public void disenio() {
        // VENTANA PRINCIPAL
	        jfrLayout = new JFrame("JFrame");
	        jfrLayout.setSize(500, 600);
	        jfrLayout.setLayout(new BorderLayout(0, 5));
	        jfrLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // PANEL NORTE
	        jtfNorte = new JTextField("GRUPO H");
	        jtfNorte.setHorizontalAlignment(JTextField.CENTER);
	        jtfNorte.setEditable(false);
	        jtfNorte.setBackground(Color.RED);
	        jfrLayout.add(jtfNorte, BorderLayout.NORTH);

        // PANEL CENTRO (4 partidos)
	        jpnCentro = new JPanel(new GridLayout(4, 1, 0, 5));
	        jfrLayout.add(jpnCentro, BorderLayout.CENTER);

        // PARTIDO 1
	        jpnPartido1 = new JPanel(new BorderLayout());
	        jpnFechaCiudad1 = new JPanel(new BorderLayout());
	        jlbFecha1 = new JLabel("miércoles, 16 de jun 8:00h");
	        jlbCiudad1 = new JLabel("Nelspruit");
	        jpnFechaCiudad1.add(jlbFecha1, BorderLayout.WEST);
	        jpnFechaCiudad1.add(jlbCiudad1, BorderLayout.EAST);
	
	        jpnFila1 = new JPanel(new GridLayout(1, 5));
	        jlbHonduras1 = new JLabel("HONDURAS", JLabel.CENTER);
	        jlbResHonduras1 = new JLabel("0", JLabel.CENTER);
	        jlbVS1 = new JLabel("VS", JLabel.CENTER);
	        jlbResChile1 = new JLabel("1", JLabel.CENTER);
	        jlbChile1 = new JLabel("CHILE", JLabel.CENTER);
	
	        jpnFila1.add(jlbHonduras1);
	        jpnFila1.add(jlbResHonduras1);
	        jpnFila1.add(jlbVS1);
	        jpnFila1.add(jlbResChile1);
	        jpnFila1.add(jlbChile1);
	
	        jpnPartido1.add(jpnFechaCiudad1, BorderLayout.NORTH);
	        jpnPartido1.add(jpnFila1, BorderLayout.CENTER);
	        jpnCentro.add(jpnPartido1);

        // PARTIDO 2
	        jpnPartido2 = new JPanel(new BorderLayout());
	        jpnFechaCiudad2 = new JPanel(new BorderLayout());
	        jlbFecha2 = new JLabel("miércoles, 16 de jun 11:00h");
	        jlbCiudad2 = new JLabel("Durban");
	        jpnFechaCiudad2.add(jlbFecha2, BorderLayout.WEST);
	        jpnFechaCiudad2.add(jlbCiudad2, BorderLayout.EAST);
	
	        jpnFila2 = new JPanel(new GridLayout(1, 5));
	        jlbEspana1 = new JLabel("ESP", JLabel.CENTER);
	        jlbResEspana1 = new JLabel("0", JLabel.CENTER);
	        jlbVS2 = new JLabel("VS", JLabel.CENTER);
	        jlbResSuiza1 = new JLabel("1", JLabel.CENTER);
	        jlbSuiza1 = new JLabel("SUIZA", JLabel.CENTER);
	
	        jpnFila2.add(jlbEspana1);
	        jpnFila2.add(jlbResEspana1);
	        jpnFila2.add(jlbVS2);
	        jpnFila2.add(jlbResSuiza1);
	        jpnFila2.add(jlbSuiza1);
	
	        jpnPartido2.add(jpnFechaCiudad2, BorderLayout.NORTH);
	        jpnPartido2.add(jpnFila2, BorderLayout.CENTER);
	        jpnCentro.add(jpnPartido2);

        // PARTIDO 3
	        jpnPartido3 = new JPanel(new BorderLayout());
	        jpnFechaCiudad3 = new JPanel(new BorderLayout());
	        jlbFecha3 = new JLabel("lunes, 21 de jun 11:00h");
	        jlbCiudad3 = new JLabel("Bahia Nelson");
	        jpnFechaCiudad3.add(jlbFecha3, BorderLayout.WEST);
	        jpnFechaCiudad3.add(jlbCiudad3, BorderLayout.EAST);
	
	        jpnFila3 = new JPanel(new GridLayout(1, 5));
	        jlbChile2 = new JLabel("CHILE", JLabel.CENTER);
	        jlbResChile2 = new JLabel("1", JLabel.CENTER);
	        jlbVS3 = new JLabel("VS", JLabel.CENTER);
	        jlbResSuiza2 = new JLabel("0", JLabel.CENTER);
	        jlbSuiza2 = new JLabel("SUIZA", JLabel.CENTER);
	
	        jpnFila3.add(jlbChile2);
	        jpnFila3.add(jlbResChile2);
	        jpnFila3.add(jlbVS3);
	        jpnFila3.add(jlbResSuiza2);
	        jpnFila3.add(jlbSuiza2);
	
	        jpnPartido3.add(jpnFechaCiudad3, BorderLayout.NORTH);
	        jpnPartido3.add(jpnFila3, BorderLayout.CENTER);
	        jpnCentro.add(jpnPartido3);

        // PARTIDO 4
	        jpnPartido4 = new JPanel(new BorderLayout());
	        jpnFechaCiudad4 = new JPanel(new BorderLayout());
	        jlbFecha4 = new JLabel("lunes, 21 de jun 15:30h");
	        jlbCiudad4 = new JLabel("Johannesburgo");
	        jpnFechaCiudad4.add(jlbFecha4, BorderLayout.WEST);
	        jpnFechaCiudad4.add(jlbCiudad4, BorderLayout.EAST);
	
	        jpnFila4 = new JPanel(new GridLayout(1, 5));
	        jlbEspana2 = new JLabel("ESP", JLabel.CENTER);
	        jlbResEspana2 = new JLabel("2", JLabel.CENTER);
	        jlbVS4 = new JLabel("VS", JLabel.CENTER);
	        jlbResHonduras2 = new JLabel("0", JLabel.CENTER);
	        jlbHonduras2 = new JLabel("HONDURAS", JLabel.CENTER);
	
	        jpnFila4.add(jlbEspana2);
	        jpnFila4.add(jlbResEspana2);
	        jpnFila4.add(jlbVS4);
	        jpnFila4.add(jlbResHonduras2);
	        jpnFila4.add(jlbHonduras2);
	
	        jpnPartido4.add(jpnFechaCiudad4, BorderLayout.NORTH);
	        jpnPartido4.add(jpnFila4, BorderLayout.CENTER);
	        jpnCentro.add(jpnPartido4);
    }

    public static void main(String[] args) {
        new ejercicioprueba();
    }
}