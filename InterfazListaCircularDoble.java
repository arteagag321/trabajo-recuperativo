import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazListaCircularDoble extends JFrame {

    private JTextField txtElemento;
    private JButton btnEliminar;
    private JButton btnBuscar;
    private JButton btnOrdenarAsc;
    private JButton btnOrdenarDesc;
    private JTextArea txtAreaResultados;
    private JLabel lblElemento;
    private JRadioButton rbAscendente;
    private JRadioButton rbDescendente;

    public InterfazListaCircularDoble() {

        setTitle("Lista Circular Doble");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        JPanel panelControles = new JPanel();
        panelControles.setLayout(new FlowLayout());


        lblElemento = new JLabel("Elemento:");
        txtElemento = new JTextField(10);
        btnEliminar = new JButton("Eliminar");
        btnBuscar = new JButton("Buscar");
        btnOrdenarAsc = new JButton("Ordenar Asc");
        btnOrdenarDesc = new JButton("Ordenar Desc");
        rbAscendente = new JRadioButton("Ascendente");
        rbDescendente = new JRadioButton("Descendente");
        ButtonGroup grupoOrden = new ButtonGroup();
        grupoOrden.add(rbAscendente);
        grupoOrden.add(rbDescendente);


        txtAreaResultados = new JTextArea(10, 30);
        txtAreaResultados.setEditable(false);
        JScrollPane scroll = new JScrollPane(txtAreaResultados);


        panelControles.add(lblElemento);
        panelControles.add(txtElemento);
        panelControles.add(btnEliminar);
        panelControles.add(btnBuscar);
        panelControles.add(rbAscendente);
        panelControles.add(rbDescendente);
        panelControles.add(btnOrdenarAsc);
        panelControles.add(btnOrdenarDesc);


        add(panelControles, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);


        configurarAcciones();


        setVisible(true);
    }

    private void configurarAcciones() {

        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String elemento = txtElemento.getText();
                txtAreaResultados.append("Eliminando: " + elemento + "\n");
                txtElemento.setText("");
            }
        });


        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String elemento = txtElemento.getText();
                txtAreaResultados.append("Buscando: " + elemento + "\n");
            }
        });


        btnOrdenarAsc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtAreaResultados.append("Ordenando en Ascendente\n");
            }
        });


        btnOrdenarDesc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtAreaResultados.append("Ordenando en Descendente\n");
            }
        });


        rbAscendente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtAreaResultados.append("Modo Ascendente seleccionado\n");
            }
        });


        rbDescendente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtAreaResultados.append("Modo Descendente seleccionado\n");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(InterfazListaCircularDoble::new);
    }
}
