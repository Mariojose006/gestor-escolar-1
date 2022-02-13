/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.TabelModels;

import controller.Aluno;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author adria
 */
public class AdmAlunoTableModel extends AbstractTableModel {
    private ArrayList<Aluno> dados = new ArrayList<>();
    private String[] colunas = {"id","senha","login","cpf","nome","telefone","tipo"};
    
    
    @Override
    public String getColumnName(int column) {
        return colunas[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int getRowCount() {
        return dados.size();
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
                return dados.get(linha).getId();
            case 1:
                //return dados.get(linha).getQtd();
                return dados.get(linha).getSenha();
            case 2: 
                //return dados.get(linha).getValor();
                return dados.get(linha).getLogin();
            case 3:
                return dados.get(linha).getCpf();
            case 4:
                return dados.get(linha).getNome();
            case 5:
                return dados.get(linha).getTelefone();    
            case 6:
                return dados.get(linha).getTipoUsuário();
                //dados.get(linha).setNotas(notas);
        }
        
        return null;
        
    }
    
    public void addRow(Aluno p){
        this.dados.add(p);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
    public ArrayList<Aluno> getAlunos(){
        return dados;
    }
}
