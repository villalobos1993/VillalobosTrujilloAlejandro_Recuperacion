package Vista;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.xml.soap.Text;

import Container.Container;
import Modelos.Pokemon;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class Pokedex {

	private JFrame frmPokedexv;
	private JTextField textNombre;
	private JTextField textNumero;
	private JTextField textEvolucion;
	private JTextField textRegion;
	private JLabel lblNombre ;
	private JLabel lblNumero ;
    private JLabel lblNivelEvolucion;
    private JLabel lblRegion;
    private JTextPane textPane;
    private JLabel lblComentarios;
    private JComboBox comboBox ;
    private JButton btnIzq ;
    private JButton btnDerecha;
    private JLabel lblPokedex;
    private JButton btnInsertar;
   private JButton btnBuscar;
   private String[] tipos= {"Agua","Fuego","Planta","Electrico"};
   private JButton btnVolver;
   private JButton btnBuscar2;
   private int id=0;
   private JLabel lblIndex;
   private JTextField textTipo;
   private JLabel lblTipo;
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pokedex window = new Pokedex();
					window.frmPokedexv.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pokedex() {
		frmPokedexv = new JFrame();
		frmPokedexv.getContentPane().setBackground(Color.ORANGE);
		frmPokedexv.setBackground(Color.BLACK);
		btnIzq = new JButton("<");
		
		btnDerecha = new JButton(">");
		
		lblPokedex = new JLabel("Pokedex");
		lblPokedex.setForeground(Color.BLUE);
		lblPokedex.setBackground(Color.LIGHT_GRAY);
		textNombre = new JTextField();
		textNumero = new JTextField();
		textEvolucion = new JTextField();
		textRegion = new JTextField();
		lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(Color.BLUE);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		 lblNumero = new JLabel("Numero");
		 lblNumero.setForeground(Color.BLUE);
		 lblNumero.setFont(new Font("Tahoma", Font.BOLD, 13));
		 lblNivelEvolucion = new JLabel("Nivel evoluci\u00F3n");
		 lblNivelEvolucion.setForeground(Color.BLUE);
		 lblNivelEvolucion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRegion = new JLabel("Region");
		lblRegion.setForeground(Color.BLUE);
		lblRegion.setFont(new Font("Tahoma", Font.BOLD, 13));
	     textPane = new JTextPane();
		lblComentarios = new JLabel("Comentarios");
		lblComentarios.setForeground(Color.BLUE);
		lblComentarios.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"agua", "fuego", "planta ", "electricidad"}));
		btnBuscar = new JButton("Buscar Pokemon");
		lblTipo = new JLabel("Tipo");
		btnInsertar = new JButton("Insertar Pokemon");
		lblIndex = new JLabel("");
		btnBuscar2 = new JButton("Buscar");
		textTipo = new JTextField();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Propiedades();
		eventos();
	}
	
	/**
	 * Propiedades
	 */
	private void Propiedades(){

		frmPokedexv.setTitle("Pokedex 1.0v");
		frmPokedexv.setBounds(100, 100, 671, 410);
		frmPokedexv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPokedexv.getContentPane().setLayout(null);
		
		
		btnIzq.setBounds(10, 11, 89, 42);
		frmPokedexv.getContentPane().add(btnIzq);
		
		
		btnDerecha.setBounds(556, 11, 89, 42);
		frmPokedexv.getContentPane().add(btnDerecha);
		
		
		lblPokedex.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPokedex.setBounds(281, 16, 83, 28);
		frmPokedexv.getContentPane().add(lblPokedex);
		
		
		textNombre.setBounds(140, 97, 86, 20);
		frmPokedexv.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		
		textNumero.setBounds(140, 140, 86, 20);
		frmPokedexv.getContentPane().add(textNumero);
		textNumero.setColumns(10);
		
		
		textEvolucion.setBounds(140, 186, 86, 20);
		frmPokedexv.getContentPane().add(textEvolucion);
		textEvolucion.setColumns(10);
		
	
		textRegion.setBounds(140, 228, 86, 20);
		frmPokedexv.getContentPane().add(textRegion);
		textRegion.setColumns(10);
		
		
		lblNombre.setBounds(10, 100, 89, 14);
		frmPokedexv.getContentPane().add(lblNombre);
		
		
		lblNumero.setBounds(10, 143, 89, 14);
		frmPokedexv.getContentPane().add(lblNumero);
		
		
		lblNivelEvolucion.setBounds(10, 189, 120, 14);
		frmPokedexv.getContentPane().add(lblNivelEvolucion);
		
	
		lblRegion.setBounds(10, 231, 89, 14);
		frmPokedexv.getContentPane().add(lblRegion);
		
		
		textPane.setBounds(406, 140, 192, 150);
		frmPokedexv.getContentPane().add(textPane);
		
		
		lblComentarios.setBounds(301, 142, 96, 14);
		frmPokedexv.getContentPane().add(lblComentarios);
		
		
		comboBox.setBounds(411, 86, 147, 42);
		frmPokedexv.getContentPane().add(comboBox);
		
		
		btnInsertar.setBounds(49, 319, 201, 42);
		frmPokedexv.getContentPane().add(btnInsertar);
		
		
		btnBuscar.setBounds(398, 319, 180, 42);
		frmPokedexv.getContentPane().add(btnBuscar);
		
		btnVolver = new JButton("Volver");
		
		btnVolver.setBounds(49, 319, 201, 42);
		frmPokedexv.getContentPane().add(btnVolver);
		
		
		
		btnBuscar2.setBounds(398, 319, 180, 42);
		frmPokedexv.getContentPane().add(btnBuscar2);
		
		
		lblIndex.setBounds(406, 25, 46, 14);
		frmPokedexv.getContentPane().add(lblIndex);
		
		
		textTipo.setBounds(411, 97, 147, 20);
		frmPokedexv.getContentPane().add(textTipo);
		textTipo.setColumns(10);
		
		
		lblTipo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTipo.setForeground(Color.BLUE);
		lblTipo.setBounds(302, 99, 62, 14);
		frmPokedexv.getContentPane().add(lblTipo);
		
		btnBuscar2.setVisible(false);
		btnVolver.setVisible(false);
		btnIzq.setVisible(false);
		btnDerecha.setVisible(false);
		textTipo.setVisible(false);
		
		
	}

	/**
     * Eventos
     */
    private void eventos(){
	
    /**
     * Boton de insertar
     * Buscara si existe el nombre del pokemon o el codigo si no existen
     * validara todos los datos y si todo es correcto los añadira
     */
	btnInsertar.addMouseListener(new MouseAdapter() {
		@Override
		public void mousePressed(MouseEvent e) {
			
			boolean correcto=true;
			int numero = 0;
			int numero2 = 0;
			String tipo = null;
			/**
			 * Comprobamos que el nombre no este vacio y si no lo esta comprobamos que no exista en la pokedex
			 */
			if(textNombre.getText().equals("")){
				JOptionPane.showMessageDialog(frmPokedexv,"Debe introducir un nombre");
				correcto=false;
			}
			else{
				
				for(int i = 0 ; i<Container.getPokemons().size();i++){
					
					if(textNombre.getText().equals(Container.getPokemons().get(i).getNombre())){
						JOptionPane.showMessageDialog(frmPokedexv,"Este pokemon ya existe");
						correcto=false;
					}
					if(textNumero.getText().equals(String.valueOf(Container.getPokemons().get(i).getNumero()))){
						JOptionPane.showMessageDialog(frmPokedexv,"Este numero ya existe");
						correcto = false;
					}
				}
			}
			/**
			 * Comprobamos nivel de evolucion no este vacio y si no lo esta lo parseamos a int
			 */
			
			if(textEvolucion.getText().equals("")){
				JOptionPane.showMessageDialog(frmPokedexv,"Debe introducir un nivel");
				correcto=false;
			
			}
			else{
			
			try{
				
				numero = Integer.parseInt(textEvolucion.getText());
				
			}catch(Exception e1)
			{
				   correcto=false;
				JOptionPane.showMessageDialog(frmPokedexv,"Debe introducir un numero");
			}
			
			}
			
			
			/**
			 * Comprobamos numero no este vacio y si no lo esta lo parseamos a int
			 */
			
			if(textNumero.getText().equals("")){
				JOptionPane.showMessageDialog(frmPokedexv,"Debe introducir un numero de pokemon");
				correcto=false;
			}
			
			else{
				
				try{
					
					numero2 = Integer.parseInt(textNumero.getText());
					
				}catch(Exception e1)
				{
					   correcto=false;
					JOptionPane.showMessageDialog(frmPokedexv,"Debe introducir un numero");
				}
				
				}
			
			
			/**
			 * Comprobamos la region no este vacia
			 */
			if(textRegion.getText().equals("")){
				JOptionPane.showMessageDialog(frmPokedexv,"Debe introducir una region");
				correcto=false;
			}
			
			/**
			 * Comprobamos la region no este vacia y depende del indice seleccionaremos el tipo
			 */
			if(comboBox.getSelectedIndex()<0 || comboBox.getSelectedIndex()>4){
				
				correcto=false;
				JOptionPane.showMessageDialog(frmPokedexv, "Debe indicar de que tipo es");
			}else{
				int eleccion;
				eleccion=comboBox.getSelectedIndex();
				
				switch (eleccion){
				
				case 0 : tipo = "Agua";break;
				case 1 : tipo = "Fuego";break;
				case 2 : tipo = "Planta";break;
				case 3 : tipo = "Electricidad";break;
				}
			}
			
			/**
			 * Comprobamos que los comentarios no esten vacios
			 */
			
			if(textPane.getText().equals("")){
				JOptionPane.showMessageDialog(frmPokedexv, "Debe indicar un comentario");
				correcto=false;
			}
			
			
			/**
			 * Si todo es correcto creamos el pokemon y lo metemos en el arrayList
			 */
			if(correcto){
				
		   Pokemon p = new Pokemon(textNombre.getText(),tipo,numero2,numero,textRegion.getText(),textPane.getText());
			Container.getPokemons().add(p);
			JOptionPane.showMessageDialog(frmPokedexv, "El pokemon a sido introducido");


			textNombre.setText("");
			textEvolucion.setText("");
			textNumero.setText("");
			textPane.setText("");
			textRegion.setText("");
			}
			
		}
	});

	
	/**
	 * BtnBuscar
	 * Si pulsamos el boton buscar se desabilitara todo menos el nombre
	 */
	btnBuscar.addMouseListener(new MouseAdapter() {
		@Override
		public void mousePressed(MouseEvent e) {
			boolean correcto=true;
			if(Container.getPokemons().isEmpty()){
				JOptionPane.showMessageDialog(frmPokedexv, "No hay pokemons en la pokedex");
				correcto=false;
			}
			if(correcto){
			textNumero.setEnabled(false);
			textPane.setEnabled(false);
			textEvolucion.setEnabled(false);
			textRegion.setEnabled(false);
			comboBox.setEnabled(false);
			btnBuscar2.setVisible(true);
			btnVolver.setVisible(true);
			btnBuscar.setVisible(false);
			btnInsertar.setVisible(false);
			textTipo.setVisible(true);
			comboBox.setVisible(false);
			}
		}
	});
	
	/**
	 * BtnBuscar2
	 * Cuando pongamos el nombre buscara si existe en la base de datos si existe mostrara los datos
	 */
	btnBuscar2.addMouseListener(new MouseAdapter() {
		@Override
		public void mousePressed(MouseEvent e) {
			boolean correcto=false;
			if(textNombre.getText().equals("")){
				JOptionPane.showMessageDialog(frmPokedexv, "Introduce un nombre para buscar");
				correcto = false;
			}
		
		for(int i = 0; i < Container.getPokemons().size();i++){
		 
			if(textNombre.getText().toUpperCase().equals(Container.getPokemons().get(i).getNombre().toUpperCase().substring(0, textNombre.getText().length()))){
				
				Container.getPokemonsAux().add(Container.getPokemons().get(i));
				correcto=true;
			}
		
	}
		if(!correcto){
			JOptionPane.showMessageDialog(frmPokedexv, "No existe ningun pokemon con ese nombre");
		}
			
		
		
		if(correcto){
			
			btnDerecha.setVisible(true);
			btnIzq.setVisible(true);
			lblIndex.setText( id+1 +" de "+(Container.getPokemonsAux().size()) );
			
			textNombre.setText(Container.getPokemonsAux().get(id).getNombre());
			textRegion.setText(Container.getPokemonsAux().get(id).getRegion());
			textNumero.setText(String.valueOf(Container.getPokemonsAux().get(id).getNumero()));
			textEvolucion.setText(String.valueOf(Container.getPokemonsAux().get(id).getNivelEvolucion()));
			textPane.setText(Container.getPokemonsAux().get(id).getComentarios());
			textTipo.setText((Container.getPokemonsAux().get(id).getTipo()));
			
		}
		}});
	
	
	/**
	 * BtnIzq
	 * disminuira id
	 */
	btnIzq.addMouseListener(new MouseAdapter() {
		@Override
		public void mousePressed(MouseEvent e) {
			
			if(id>0){
				id-=1;
				mostrar();
			}
			
			if(id<0){
				
				JOptionPane.showMessageDialog(frmPokedexv, "esta en el minimo indice");
			}
		}
	});
	
	/**
	 * BtnDerecha
	 * Aumentara id
	 */
	btnDerecha.addMouseListener(new MouseAdapter() {
		@Override
		public void mousePressed(MouseEvent e) {
			if(id<Container.getPokemonsAux().size()-1){
				id+=1;
				
				mostrar();}
			
			if(id > Container.getPokemonsAux().size()-1){
				JOptionPane.showMessageDialog(frmPokedexv, "esta en el mayor indice");
			}
		
		}});
	
	
	/**
	 * btnVolver
	 * Volvera al estado principal
	 */
	btnVolver.addMouseListener(new MouseAdapter() {
		@Override
		public void mousePressed(MouseEvent e) {
			
			textNumero.setEnabled(true);
			textPane.setEnabled(true);
			textEvolucion.setEnabled(true);
			textRegion.setEnabled(true);
			comboBox.setEnabled(true);
			btnBuscar2.setVisible(false);
			btnVolver.setVisible(false);
			btnBuscar.setVisible(true);
			btnInsertar.setVisible(true);
			textTipo.setVisible(false);
			
			btnDerecha.setVisible(false);
			btnIzq.setVisible(false);
			lblIndex.setText("");
			
			textNombre.setText("");
			textEvolucion.setText("");
			textNumero.setText("");
			textPane.setText("");
			textRegion.setText("");
			comboBox.setVisible(true);
			Container.getPokemonsAux().clear();
			
		}
	});
}
    
    /**
     * Mostrara los 
     */
    private void mostrar(){
    	
    	lblIndex.setText(id+1 +" de "+(Container.getPokemonsAux().size()) );
		
		textNombre.setText(Container.getPokemonsAux().get(id).getNombre());
		textRegion.setText(Container.getPokemonsAux().get(id).getRegion());
		textNumero.setText(String.valueOf(Container.getPokemonsAux().get(id).getNumero()));
		textEvolucion.setText(String.valueOf(Container.getPokemonsAux().get(id).getNivelEvolucion()));
		textPane.setText(Container.getPokemonsAux().get(id).getComentarios());
		textTipo.setText((Container.getPokemonsAux().get(id).getTipo()));
    }
}
