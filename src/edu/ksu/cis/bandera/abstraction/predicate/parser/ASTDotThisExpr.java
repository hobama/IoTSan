package edu.ksu.cis.bandera.abstraction.predicate.parser;

/* Generated By:JJTree: Do not edit this line. ASTDotThisExpr.java */

public class ASTDotThisExpr extends SimpleNode {
  public ASTDotThisExpr(int id) {
	super(id);
  }  
  public ASTDotThisExpr(PredicateParser p, int id) {
	super(p, id);
  }  
  /** Accept the visitor. **/
  public Object jjtAccept(PredicateParserVisitor visitor, Object data) {
	return visitor.visit(this, data);
  }  
  public static Node jjtCreate(int id) {
	  return new ASTDotThisExpr(id);
  }  
  public static Node jjtCreate(PredicateParser p, int id) {
	  return new ASTDotThisExpr(p, id);
  }  
}
