package com.maxglobalsports.sistemagestaofuncionarios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private SistemaGestaoFuncionarios sistema;

    public Main() {
        sistema = new SistemaGestaoFuncionarios();

        setTitle("Sistema de Gestão de Funcionários");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JButton btnAdicionar = new JButton("Adicionar Funcionário");
        btnAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adicionarFuncionario();
            }
        });

        JButton btnBuscar = new JButton("Buscar Funcionário");
        btnBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buscarFuncionario();
            }
        });

        JButton btnListar = new JButton("Listar Funcionários");
        btnListar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listarFuncionarios();
            }
        });

        JButton btnSair = new JButton("Sair");
        btnSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        panel.add(btnAdicionar);
        panel.add(btnBuscar);
        panel.add(btnListar);
        panel.add(btnSair);

        add(panel, BorderLayout.CENTER);
    }

    private void adicionarFuncionario() {
        JTextField nomeField = new JTextField();
        JTextField matriculaField = new JTextField();
        JTextField alergiasField = new JTextField();
        JTextField problemasMedicosField = new JTextField();
        JTextField telefoneField = new JTextField();
        JTextField emailField = new JTextField();

        Object[] fields = {
                "Nome:", nomeField,
                "Matrícula:", matriculaField,
                "Alergias:", alergiasField,
                "Problemas Médicos:", problemasMedicosField,
                "Telefone de Contato:", telefoneField,
                "Email de Contato:", emailField
        };

        int result = JOptionPane.showConfirmDialog(null, fields, "Adicionar Funcionário", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            Funcionario funcionario = new Funcionario(
                    nomeField.getText(),
                    matriculaField.getText(),
                    alergiasField.getText(),
                    problemasMedicosField.getText(),
                    telefoneField.getText(),
                    emailField.getText()
            );
            sistema.adicionarFuncionario(funcionario);
            JOptionPane.showMessageDialog(this, "Funcionário adicionado com sucesso!");
        }
    }

    private void buscarFuncionario() {
        String nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");
        Funcionario funcionario = sistema.buscarFuncionario(nome);
        if (funcionario != null) {
            JOptionPane.showMessageDialog(this, funcionario.toString());
        } else {
            JOptionPane.showMessageDialog(this, "Funcionário não encontrado.");
        }
    }

    private void listarFuncionarios() {
        StringBuilder lista = new StringBuilder();
        for (Funcionario f : sistema.listarFuncionarios()) {
            lista.append(f.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(this, lista.toString(), "Lista de Funcionários", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main frame = new Main();
                frame.setVisible(true);
            }
        });
    }
}