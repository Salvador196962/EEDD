package paquete;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio3 {
	JFrame jfrLayout = null;
	JTextField jtfNorte = null;
	JPanel jpnCentro = null;

	// PARTIDO 1: Honduras - Chile
	JPanel jpnPartidoHondurasChile = null;
	JPanel jpnFilaHondurasChile = null;
	JPanel jpnFechaHondurasChile = null;
	JLabel jlbFechaHondurasChile = null;
	JLabel jlbCiudadHondurasChile = null;
	JLabel jlbHonduras1 = null;
	JLabel jlbResultadoHonduras1 = null;
	JLabel jlbContraHondurasChile = null;
	JLabel jlbResultadoChile1 = null;
	JLabel jlbChile1 = null;

	// PARTIDO 2: España - Suiza
	JPanel jpnPartidoEspanaSuiza = null;
	JPanel jpnFilaEspanaSuiza = null;
	JPanel jpnFechaEspanaSuiza = null;
	JLabel jlbFechaEspanaSuiza = null;
	JLabel jlbCiudadEspanaSuiza = null;
	JLabel jlbEspana1 = null;
	JLabel jlbResultadoEspana1 = null;
	JLabel jlbContraEspanaSuiza = null;
	JLabel jlbResultadoSuiza1 = null;
	JLabel jlbSuiza1 = null;

	// PARTIDO 3: Chile - Suiza
	JPanel jpnPartidoChileSuiza = null;
	JPanel jpnFilaChileSuiza = null;
	JPanel jpnFechaChileSuiza = null;
	JLabel jlbFechaChileSuiza = null;
	JLabel jlbCiudadChileSuiza = null;
	JLabel jlbChile2 = null;
	JLabel jlbResultadoChile2 = null;
	JLabel jlbContraChileSuiza = null;
	JLabel jlbResultadoSuiza2 = null;
	JLabel jlbSuiza2 = null;

	// PARTIDO 4: España - Honduras
	JPanel jpnPartidoEspanaHonduras = null;
	JPanel jpnFilaEspanaHonduras = null;
	JPanel jpnFechaEspanaHonduras = null;
	JLabel jlbFechaEspanaHonduras = null;
	JLabel jlbCiudadEspanaHonduras = null;
	JLabel jlbEspana2 = null;
	JLabel jlbResultadoEspana2 = null;
	JLabel jlbContraEspanaHonduras = null;
	JLabel jlbResultadoHonduras2 = null;
	JLabel jlbHonduras2 = null;

	public Ejercicio3() {
		disenio();
		jfrLayout.setVisible(true);
	}

	public void disenio() {

		// VENTANA PRINCIPAL
		jfrLayout = new JFrame();
		jfrLayout.setTitle("");
		jfrLayout.setSize(500, 500);
		jfrLayout.setLayout(new BorderLayout());
		jfrLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// NORTE
		jtfNorte = new JTextField("GRUPO H");
		jtfNorte.setBackground(Color.red);
		jfrLayout.add(jtfNorte, BorderLayout.NORTH);

		// CENTRO
		jpnCentro = new JPanel();
		jpnCentro.setLayout(new GridLayout(4, 1));
		jfrLayout.add(jpnCentro, BorderLayout.CENTER);

		// PARTIDO 1 (COMPLETO, de modelo)
		jpnPartidoHondurasChile = new JPanel();
		jpnPartidoHondurasChile.setLayout(new BorderLayout());
		jpnFilaHondurasChile = new JPanel();
		jpnFilaHondurasChile.setLayout(new GridLayout(1, 5));
		jpnFechaHondurasChile = new JPanel();
		jpnFechaHondurasChile.setLayout(new BorderLayout());

		jlbHonduras1 = new JLabel("HONDURAS", JLabel.CENTER);
		jlbResultadoHonduras1 = new JLabel("0", JLabel.CENTER);
		jlbContraHondurasChile = new JLabel("VS", JLabel.CENTER);
		jlbResultadoChile1 = new JLabel("1", JLabel.CENTER);
		jlbChile1 = new JLabel("CHILE", JLabel.CENTER);
		jpnFilaHondurasChile.add(jlbHonduras1);
		jpnFilaHondurasChile.add(jlbResultadoHonduras1);
		jpnFilaHondurasChile.add(jlbContraHondurasChile);
		jpnFilaHondurasChile.add(jlbResultadoChile1);
		jpnFilaHondurasChile.add(jlbChile1);

		jlbFechaHondurasChile = new JLabel("miércoles, 16 de jun 8:00h");
		jlbCiudadHondurasChile = new JLabel("Nelspruit");
		jpnFechaHondurasChile.add(jlbFechaHondurasChile, BorderLayout.WEST);
		jpnFechaHondurasChile.add(jlbCiudadHondurasChile, BorderLayout.EAST);

		jpnPartidoHondurasChile.add(jpnFechaHondurasChile, BorderLayout.NORTH);
		jpnPartidoHondurasChile.add(jpnFilaHondurasChile, BorderLayout.CENTER);
		jpnCentro.add(jpnPartidoHondurasChile);

		// PARTIDO 2: España 0 - 1 Suiza | miércoles, 16 de jun 11:00h | Durban
		jpnPartidoEspanaSuiza = new JPanel();
		jpnPartidoEspanaSuiza.setLayout(new BorderLayout());
		jpnFilaEspanaSuiza = new JPanel();
		jpnFilaEspanaSuiza.setLayout(new GridLayout(1, 5));
		jpnFechaEspanaSuiza = new JPanel();
		jpnFechaEspanaSuiza.setLayout(new BorderLayout());
		// TODO: crear las 5 etiquetas y añadirlas a la fila (en orden)
		// TODO: crear fecha y ciudad y añadirlas a jpnFecha (WEST / EAST)
		// TODO: añadir jpnFecha (NORTH) y jpnFila (CENTER) al partido
		// TODO: añadir el partido a jpnCentro

		// PARTIDO 3: Chile 1 - 0 Suiza | lunes, 21 de jun 11:00h | Bahia Nelson
		jpnPartidoChileSuiza = new JPanel();
		jpnPartidoChileSuiza.setLayout(new BorderLayout());
		jpnFilaChileSuiza = new JPanel();
		jpnFilaChileSuiza.setLayout(new GridLayout(1, 5));
		jpnFechaChileSuiza = new JPanel();
		jpnFechaChileSuiza.setLayout(new BorderLayout());
		// TODO: igual que el partido 1

		// PARTIDO 4: España 2 - 0 Honduras | lunes, 21 de jun 15:30h | Johannesburgo
		jpnPartidoEspanaHonduras = new JPanel();
		jpnPartidoEspanaHonduras.setLayout(new BorderLayout());
		jpnFilaEspanaHonduras = new JPanel();
		jpnFilaEspanaHonduras.setLayout(new GridLayout(1, 5));
		jpnFechaEspanaHonduras = new JPanel();
		jpnFechaEspanaHonduras.setLayout(new BorderLayout());
		// TODO: igual que el partido 1
	}

	public static void main(String[] args) {
		new Ejercicio3();
	}
}