
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Formula 1 Passion");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(400,300);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<head>");
		
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1>FORMULA 1 PASSION</h1>");
		
		
		sb.append("<div style='display:table-table'>");
		sb.append("<div style='display:table-row'>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("<pilota>");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("<punteggio>");
		sb.append("</div>");
		sb.append("</div>");
		
sb.append("<div style='display:table-row'>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("<HAminton l.>");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("<358>");
		sb.append("</div>");
		sb.append("</div>");
		
		sb.append("</div>");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sb.append("<table>");
		sb.append("</table>");
		
		sb.append("<div style='display:table-row'>");
		sb.append("<td>PILOTA</td>");
		sb.append("<td>PUNTEGGIO</td>");
		sb.append("</tr>");
		
		sb.append("<tr>");
		sb.append("<td>HALMINTON L.</td>");
		sb.append("<td>358</td>");
		sb.append("</tr>");
		
		sb.append("<tr>");
		sb.append("<td>VELTYER S.</td>");
		sb.append("<td>294</td>");
		sb.append("</tr>");
		
		sb.append("<tr>");
		sb.append("<td>RAIKEN K.</td>");
		sb.append("<td>236</td>");
		sb.append("</tr>");
		
        sb.append("<tr>");
		
		sb.append("</tr>");
	
		
		sb.append("</body>");
		sb.append("</html>");
		// TODO Creare la stringa HTML per il wireframe
		
		// TODO Convertire lo StringBuilder in String
		
		// TODO Assegnare correttamente la stringa create a JLabel
		
		super.add(new JLabel());
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

