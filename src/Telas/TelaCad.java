package Telas;

// importação biblioteca
import DAO.CarroDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaCad extends javax.swing.JFrame {
    
    private Carro carro;

    public TelaCad() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jtfDescricao = new javax.swing.JTextField();
        jtfPotencia = new javax.swing.JTextField();
        jtfCor = new javax.swing.JTextField();
        jButtonCad = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cadastro de Carros");

        jLabel2.setText("Descrição");

        jLabel3.setText("Código");

        jLabel4.setText("Potência");

        jLabel5.setText("Cor");

        jtfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoActionPerformed(evt);
            }
        });

        jtfCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCorActionPerformed(evt);
            }
        });

        jButtonCad.setText("Cadastro");
        jButtonCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadActionPerformed(evt);
            }
        });

        jButtonListar.setText("Listar");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfDescricao))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(17, 17, 17)
                        .addComponent(jtfPotencia))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCodigo)
                            .addComponent(jtfCor))))
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAlterar)
                .addGap(18, 18, 18)
                .addComponent(jButtonCad)
                .addGap(18, 18, 18)
                .addComponent(jButtonListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonListar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonCad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jtfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoActionPerformed

    }//GEN-LAST:event_jtfCodigoActionPerformed

    private void jtfCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCorActionPerformed

    }//GEN-LAST:event_jtfCorActionPerformed

    //cadastro de carros
    private void jButtonCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadActionPerformed
        // Verifica se o campo de descrição não está vazio
if (!jtfDescricao.getText().isEmpty()) { 
    // Verifica se o campo de potência não está vazio
    if (!jtfPotencia.getText().isEmpty()) { 
        // Verifica se o campo de cor não está vazio
        if (!jtfCor.getText().isEmpty()) { 
            // Cria uma instância de CarroDAO para interagir com o banco de dados
            CarroDAO dao = new CarroDAO(); 
            // Cria um objeto Carro com os valores dos campos de descrição, potência e cor
            carro = new Carro(jtfDescricao.getText(), jtfPotencia.getText(), jtfCor.getText()); 
            // Chama o método cadastrarCarro para registrar o carro no banco de dados
            dao.cadastrarCarro(carro); 
            
            // Limpa os campos de entrada após o cadastro
            jtfDescricao.setText(""); 
            jtfPotencia.setText(""); 
            jtfCor.setText(""); 
        } else {
            // Exibe mensagem de erro se o campo "Cor" estiver vazio
            JOptionPane.showMessageDialog(null, "Cor está vazio!"); 
        }
    } else {
        // Exibe mensagem de erro se o campo "Potência" estiver vazio
        JOptionPane.showMessageDialog(null, "Potência está vazio!"); 
    }
} else {
    // Exibe mensagem de erro se o campo "Descrição" estiver vazio
    JOptionPane.showMessageDialog(null, "Descrição está vazio!"); 
}
    }//GEN-LAST:event_jButtonCadActionPerformed

    //alteração no cadastro
    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
         int selectedRow = jTable1.getSelectedRow(); // Obtém a linha selecionada

        if (selectedRow >= 0) {
            // Obtém o código do carro a ser alterado a partir da linha selecionada
            int codigo = (int) jTable1.getValueAt(selectedRow, 0);

            // Exibe diálogos para entrada de novos valores
            String novaDescricao = JOptionPane.showInputDialog(this, "Nova Descrição:", jTable1.getValueAt(selectedRow, 1));
            String novaPotencia = JOptionPane.showInputDialog(this, "Nova Potência:", jTable1.getValueAt(selectedRow, 2));
            String novaCor = JOptionPane.showInputDialog(this, "Nova Cor:", jTable1.getValueAt(selectedRow, 3));

            if (novaDescricao != null && novaPotencia != null && novaCor != null) {
                // Cria um novo objeto Carro com os novos valores
                Carro carroAtualizado = new Carro(codigo, novaDescricao, novaPotencia, novaCor);

                // Atualiza no banco de dados
                CarroDAO dao = new CarroDAO();
                dao.alterarCarro(carroAtualizado);

                // Atualiza a tabela na interface
                jTable1.setValueAt(novaDescricao, selectedRow, 1);
                jTable1.setValueAt(novaPotencia, selectedRow, 2);
                jTable1.setValueAt(novaCor, selectedRow, 3);

                JOptionPane.showMessageDialog(this, "Carro atualizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Alteração cancelada.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um carro para alterar.");
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    //listar carros caadstrados
    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Limpa as linhas da tabela antes de popular novamente

        CarroDAO dao = new CarroDAO();
        ArrayList<Carro> listaCarro = dao.getCarro(); // Obtenha a lista de carros

        for (Carro carro : listaCarro) {
            Object[] linha = {
                carro.getCod(),
                carro.getDesc(),
                carro.getPoten(),
                carro.getCor()
            };
            model.addRow(linha);
        }
    }//GEN-LAST:event_jButtonListarActionPerformed
 
    //Exclui carros cadastrados
    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        CarroDAO dao = new CarroDAO();
            
        try {
            int numero = Integer.parseInt(jtfCodigo.getText());
            dao.excluirCarro(numero);
            JOptionPane.showMessageDialog(null, "Usuário excluido com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir Usuário!");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCad;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfCor;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfPotencia;
    // End of variables declaration//GEN-END:variables
}
