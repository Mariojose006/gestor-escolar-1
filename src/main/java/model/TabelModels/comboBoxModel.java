
package model.TabelModels;

import controller.Escola;
import controller.Professor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;


public class comboBoxModel extends AbstractListModel implements ComboBoxModel {
 
    private List<Professor> listProfessor;
    private Professor selectedProfessor;
    private final static int FIRSTINDEX = 0;
 
    public comboBoxModel() {
        this.listProfessor = new ArrayList<Professor>();
    }
     
    public comboBoxModel(List<Professor> listProfessor) {
        this();
        this.listProfessor.addAll(listProfessor);
        if (getSize() > 0) {
            setSelectedItem(this.listProfessor.get(FIRSTINDEX));
        }
    }
     
    @Override
    public Object getElementAt(int index) {
        return listProfessor.get(index);
    }
 
    @Override
    public int getSize() {
        return listProfessor.size();
    }
 
    @Override
    public Object getSelectedItem() {
        return selectedProfessor;
    }
 
    @Override
    public void setSelectedItem(Object anItem) {
        selectedProfessor = (Professor) anItem;
    }
     
    public void addProfessor(Professor pf) {
        listProfessor.add(pf);
        fireIntervalAdded(this, getSize() - 1, getSize() - 1);
        setSelectedItem(listProfessor.get(getSize() - 1));
    }
     
    public void addListProfesor(List<Professor> pf) {
        int primeiraLinha = getSize();
        listProfessor.addAll(pf);
        fireIntervalAdded(this, primeiraLinha, primeiraLinha  + pf.size());
        setSelectedItem(listProfessor.get(getSize() - 1));
    }
     
    public void removeProfessor() {
        listProfessor.remove(getSelectedItem());
        fireIntervalRemoved(this, FIRSTINDEX, getSize() - 1);
        setSelectedItem(listProfessor.get(FIRSTINDEX));
    }
     
    public void clear() {
        listProfessor.clear();
        fireContentsChanged(this, FIRSTINDEX, getSize() - 1);
    }
}



