package visitor;

import nodos.Asignacion;
import nodos.ConstanteInt;
import nodos.Division;
import nodos.Print;
import nodos.Producto;
import nodos.Programa;
import nodos.Read;
import nodos.Suma;
import nodos.Variable;

public interface Visitor {
	
	public Object visit(Programa program,Object param);
	public Object visit(Print print,Object param);
	public Object visit(Read read,Object param);
	public Object visit(Suma suma,Object param);
	public Object visit(Producto product,Object param);
	public Object visit(Division div,Object param);
	public Object visit(Asignacion asig,Object param);
	public Object visit(Variable var,Object param);
	public Object visit(ConstanteInt constInt,Object param);
	

}
