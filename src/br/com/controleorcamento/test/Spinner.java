/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleorcamento.test;

/**
 *
 * @author rosaan
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class Spinner extends JPanel implements ActionListener {
    // Declara Labels

    JLabel titulo;
    JLabel texto;
    JLabel numero;
    JLabel lista;
    JLabel ano;

    // Declara Spinners
    JSpinner spinner1;
    JSpinner spinner2;
    JSpinner spinner3;

    // Declara modelos de Spinner
    SpinnerModel numeros;
    SpinnerModel estacao;
    SpinnerModel data;

    // Declara Botão
    JButton botao;

    // Declara Array
    String[] tEstacao = {"Primavera", "Verão", "Outono", "Inverno"};

    Spinner() {
        // Cria Componentes
        titulo = new JLabel("Desenvolvoimento Aberto - JSpinner");
        texto = new JLabel("Texto:");
        numero = new JLabel("Incio= 1, min= 0, max= 10, alimeta= 1");
        lista = new JLabel("Lista de estações do ano");
        ano = new JLabel("inicio= ano atual, min= -10, max= +10, alimenta= 1");

        // Cria Modelos de Spinner
        numeros = new SpinnerNumberModel(1, 0, 10, 1);
        estacao = new SpinnerListModel(tEstacao);

        // Cria um calendario e assoia a um modelo de spinner
        Calendar calendario = Calendar.getInstance();
        Date dataInicial = calendario.getTime();

        calendario.add(calendario.YEAR, -10);
        Date minData = calendario.getTime();

        calendario.add(calendario.YEAR, +20);
        Date maxData = calendario.getTime();

        // Cria modelo de Spinner
        data = new SpinnerDateModel(dataInicial, minData, maxData, 1);

        // Cria Spinners
        spinner1 = new JSpinner(numeros);
        spinner2 = new JSpinner(estacao);
        spinner3 = new JSpinner(data);

        // Cria botão e seu evento on click
        botao = new JButton("OK");
        botao.addActionListener(this);

        // Cria um Layout
        GridLayout layout = new GridLayout(0, 1, 5, 5);
        setLayout(layout);

        // Adiciona componentes ao painel
        add(titulo);
        add(texto);
        add(numero);
        add(spinner1);
        add(lista);
        add(spinner2);
        add(ano);
        add(spinner3);
        add(botao);

        // Cria uma borda no painel
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

    }

    public void actionPerformed(ActionEvent arg0) {

        // Evento on click do botão
        if (arg0.getSource() == botao) {
            texto.setText("Numero: " + String.valueOf(spinner1.getValue()) + " "
                    + "Texto: " + String.valueOf(spinner2.getValue()) + " "
                    + "Data: " + String.valueOf(spinner3.getValue()));
        }

    }

    private static void mostraGui() {
        // Cria Formulario, adiciona suas propriedades e associa seus componentes
        JFrame formulario = new JFrame("Lista de Música");
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent painel = new Spinner();
        painel.setOpaque(true);

        formulario.setContentPane(painel);
        formulario.pack();
        formulario.setVisible(true);
    }

    public static void main(String[] args) {

        // Cria GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                mostraGui();

            }
        });
    }
}
