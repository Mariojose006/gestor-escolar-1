/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.TabelModels;

import controller.Aluno;
import controller.Escola;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ProfNotasAlunosTableModel extends AbstractTableModel{
    private List<Aluno> dados = new ArrayList<>();    
    private String[] colunas = {"AV1","AV2","AV3"};
    
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
                 return dados.get(linha).getNotas();
                
            case 1:
                //return dados.get(linha).getQtd();
            case 2: 
                //return dados.get(linha).getValor();
        }
        
        return null;
        
    }

    public carregaAlunos(){
        dados.get(0).buscarTurmaProfessor(professor)
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
