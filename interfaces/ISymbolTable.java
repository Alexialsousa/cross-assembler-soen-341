package interfaces;

import components.Label;
import components.Mnemonic;
/**
 * intefaces for the symbol table class
 */
public interface ISymbolTable {

    public Mnemonic getMnemonic(String token);
    public boolean hasMnemonic(String token);
    public void addLabel(Label label);
    public Label getLabel(String labelName);
    public boolean hasLabel(String labelName);
    public void verboseLabelsTable();

}
