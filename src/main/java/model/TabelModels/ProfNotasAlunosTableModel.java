/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.TabelModels;

import controller.Aluno;
<<<<<<< HEAD
=======
import controller.Escola;
>>>>>>> d1c76cdfa63ec677ca26675317a3677d98c53b1b
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

<<<<<<< HEAD
/**
 *
 * @author adria
 */
public class ProfNotasAlunosTableModel extends AbstractTableModel{
    private List<Aluno> dados = new ArrayList<>();
    //int id, String senha, String login, String cpf, String nome, String telefone, int tipoUsuario
    private String[] colunas = {"id","login","senha","Nome","CPF","telefone"};
=======
>>>>>>> d1c76cdfa63ec677ca26675317a3677d98c53b1b

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
<<<<<<< HEAD
                return dados.get(linha).getId();
=======
                 return dados.get(linha).getNotas();
                
>>>>>>> d1c76cdfa63ec677ca26675317a3677d98c53b1b
            case 1:
                return dados.get(linha).getLogin();
            case 2: 
                return dados.get(linha).getSenha();
            case 3:
                return dados.get(linha).getNome();
            case 4:
                return dados.get(linha).getCpf();
            case 5:
                return dados.get(linha).getTelefone();
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
