package visitor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import nodos.Asignacion;
import nodos.ConstanteInt;
import nodos.Division;
import nodos.Print;
import nodos.Producto;
import nodos.Programa;
import nodos.Read;
import nodos.Sentencia;
import nodos.Suma;
import nodos.Variable;

public class InterpreteVisitor implements Visitor{
	
	private BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
	private Map<String, Integer> variables = new HashMap<String, Integer>();

	@Override
	public Object visit(Programa program, Object param) {
		for (Sentencia sent : program.sentencias)
			sent.accept(this, null);
		return null;
	}

	@Override
	public Object visit(Print print, Object param) {
		System.out.println(print.expr.accept(this, null));
		return null;
	}

	@Override
	public Object visit(Read read, Object param) {
		int valor;
		System.out.println("Introduzca valor para "+read.var.name);
		try {
			valor = Integer.parseInt(consola.readLine());
		} catch (Exception e) {
			valor = 0;
		}
		variables.put(read.var.name, valor);
		return null;
	}


	@Override
	public Object visit(Suma suma, Object param) {
		return (Integer)(suma.left.accept(this, null))+(Integer)(suma.right.accept(this, null));
	}

	@Override
	public Object visit(Producto product, Object param) {
		return (Integer)(product.left.accept(this, null))*(Integer)(product.right.accept(this, null));
	}

	@Override
	public Object visit(Division div, Object param) {
		return (Integer)(div.left.accept(this, null))/(Integer)(div.right.accept(this, null));
	}

	@Override
	public Object visit(Asignacion asig, Object param) {
		int valor=(Integer)asig.expr.accept(this, null);
		variables.put(asig.variable.name, valor);
		return null;
	}

	@Override
	public Object visit(Variable var, Object param) {
		Integer valor=variables.get(var.name);
		if(valor==null)
			valor=0;
		return valor;
	}

	@Override
	public Object visit(ConstanteInt constInt, Object param) {
		return Integer.parseInt(constInt.valor);
	}

}