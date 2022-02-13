
package model.TabelModels;

import controller.Disciplina;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class AlunoTableModel extends AbstractTableModel{
    private List<Disciplina> dados = new ArrayList<>();
    private String[] colunas = {"Avaliação","Notas"};

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
