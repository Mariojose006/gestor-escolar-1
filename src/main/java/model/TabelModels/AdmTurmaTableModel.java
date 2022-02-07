/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.TabelModels;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author adria
 */
public class AdmTurmaTableModel extends AbstractTableModel{
    //private List<Produto> dados = new ArrayList<>();
    private String[] colunas = {"Descrição","QTD","Valor"};

    @Override
    public String getColumnName(int column) {
        return colunas[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int getRowCount() {
        return 1; //dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            case 0:
                //return dados.get(linha).getDescricao();
            case 1:
                //return dados.get(linha).getQtd();
            case 2: 
                //return dados.get(linha).getValor();
        }
        
        return null;
        
    }
    
//    public void addRow(Produto p){
//        this.dados.add(p);
//        this.fireTableDataChanged();
//    }
    
//    public void removeRow(int linha){
//        this.dados.remove(linha);
//        this.fireTableRowsDeleted(linha, linha);
//    }
}
