package edu.ksu.cis.bandera.abstraction.predicate.parser;

/* Generated By:JJTree: Do not edit this line. ASTCastExpr.java */
public class ASTCastExpr extends SimpleNode {
  // Added attribute begin
  private SimpleNode t, expr;
  // Added code end

  public ASTCastExpr(int id) {
	super(id);
  }  
  public ASTCastExpr(PredicateParser p, int id) {
	super(p, id);
  }  
  public SimpleNode getExpr() { return expr; }  
  public SimpleNode getType() { return t; }  
  /** Accept the visitor. **/
  public Object jjtAccept(PredicateParserVisitor visitor, Object data) {
	return visitor.visit(this, data);
  }  
  public static Node jjtCreate(int id) {
	  return new ASTCastExpr(id);
  }  
  public static Node jjtCreate(PredicateParser p, int id) {
	  return new ASTCastExpr(p, id);
  }  
  public void setExpr(SimpleNode e) { expr = e; }  
  // Added attribute end

  // Added code begin
  public void setType(SimpleNode tt) { t = tt; }  
}
