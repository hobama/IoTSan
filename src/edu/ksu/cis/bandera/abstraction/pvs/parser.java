package edu.ksu.cis.bandera.abstraction.pvs;

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Bandera, a Java(TM) analysis and transformation toolkit           *
 * Copyright (C) 1998-2001 SAnToS Laboratories (santos@cis.ksu.edu)  *

 * All rights reserved.                                              *
 *                                                                   *
 * This work was done as a project in the SAnToS Laboratory,         *
 * Department of Computing and Information Sciences, Kansas State    *
 * University, USA (http://www.cis.ksu.edu/santos).                  *
 * It is understood that any modification not identified as such is  *
 * not covered by the preceding statement.                           *
 *                                                                   *
 * This work is free software; you can redistribute it and/or        *
 * modify it under the terms of the GNU Library General Public       *
 * License as published by the Free Software Foundation; either      *
 * version 2 of the License, or (at your option) any later version.  *
 *                                                                   *
 * This work is distributed in the hope that it will be useful,      *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of    *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU *
 * Library General Public License for more details.                  *
 *                                                                   *
 * You should have received a copy of the GNU Library General Public *
 * License along with this toolkit; if not, write to the             *
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,      *
 * Boston, MA  02111-1307, USA.                                      *
 *                                                                   *
 * Java is a trademark of Sun Microsystems, Inc.                     *
 *                                                                   *
 * To submit a bug report, send a comment, or get the latest news on *
 * this project and other SAnToS projects, please visit the web-site *
 *                http://www.cis.ksu.edu/santos                      *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Fri Sep 29 14:44:07 CDT 2000
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;
import java.util.*;

/** CUP v0.10k generated parser.
  * @version Fri Sep 29 14:44:07 CDT 2000
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Production table. */
  protected static final short _production_table[][] = 
	unpackFromStrings(new String[] {
	"\000\036\000\002\003\012\000\002\002\004\000\002\004" +
	"\003\000\002\004\003\000\002\005\010\000\002\007\003" +
	"\000\002\007\005\000\002\013\002\000\002\006\012\000" +
	"\002\010\004\000\002\010\003\000\002\011\006\000\002" +
	"\012\005\000\002\012\005\000\002\012\005\000\002\012" +
	"\005\000\002\012\005\000\002\012\005\000\002\012\005" +
	"\000\002\012\005\000\002\012\005\000\002\012\005\000" +
	"\002\012\005\000\002\012\005\000\002\012\005\000\002" +
	"\012\004\000\002\012\004\000\002\012\005\000\002\012" +
	"\003\000\002\012\003" });

  /** Parse-action table. */
  protected static final short[][] _action_table = 
	unpackFromStrings(new String[] {
	"\000\107\000\004\032\004\001\002\000\004\044\007\001" +
	"\002\000\004\002\006\001\002\000\004\002\000\001\002" +
	"\000\004\033\010\001\002\000\006\034\013\035\012\001" +
	"\002\000\004\027\014\001\002\000\004\027\ufffe\001\002" +
	"\000\004\027\uffff\001\002\000\004\036\016\001\002\000" +
	"\004\031\027\001\002\000\004\037\017\001\002\000\004" +
	"\041\020\001\002\000\004\044\021\001\002\000\006\040" +
	"\ufffc\042\ufffc\001\002\000\006\040\024\042\023\001\002" +
	"\000\004\044\026\001\002\000\004\004\025\001\002\000" +
	"\004\031\ufffd\001\002\000\006\040\ufffb\042\ufffb\001\002" +
	"\000\004\024\032\001\002\000\004\030\031\001\002\000" +
	"\004\002\001\001\002\000\004\044\033\001\002\000\004" +
	"\025\ufffa\001\002\000\004\025\035\001\002\000\004\027" +
	"\036\001\002\000\014\006\043\022\040\024\044\043\042" +
	"\044\037\001\002\000\040\005\uffe4\006\uffe4\007\uffe4\010" +
	"\uffe4\011\uffe4\012\uffe4\013\uffe4\014\uffe4\015\uffe4\016\uffe4" +
	"\017\uffe4\020\uffe4\021\uffe4\023\uffe4\025\uffe4\001\002\000" +
	"\014\006\043\022\040\024\044\043\042\044\037\001\002" +
	"\000\016\006\ufff7\022\ufff7\024\ufff7\030\ufff7\043\ufff7\044" +
	"\ufff7\001\002\000\040\005\uffe5\006\uffe5\007\uffe5\010\uffe5" +
	"\011\uffe5\012\uffe5\013\uffe5\014\uffe5\015\uffe5\016\uffe5\017" +
	"\uffe5\020\uffe5\021\uffe5\023\uffe5\025\uffe5\001\002\000\014" +
	"\006\043\022\040\024\044\043\042\044\037\001\002\000" +
	"\014\006\043\022\040\024\044\043\042\044\037\001\002" +
	"\000\016\006\043\022\040\024\044\030\105\043\042\044" +
	"\037\001\002\000\036\005\053\006\047\007\061\010\057" +
	"\011\052\012\050\013\064\014\062\015\054\016\056\017" +
	"\051\020\063\021\060\023\055\001\002\000\014\006\043" +
	"\022\040\024\044\043\042\044\037\001\002\000\014\006" +
	"\043\022\040\024\044\043\042\044\037\001\002\000\014" +
	"\006\043\022\040\024\044\043\042\044\037\001\002\000" +
	"\014\006\043\022\040\024\044\043\042\044\037\001\002" +
	"\000\014\006\043\022\040\024\044\043\042\044\037\001" +
	"\002\000\014\006\043\022\040\024\044\043\042\044\037" +
	"\001\002\000\004\044\074\001\002\000\014\006\043\022" +
	"\040\024\044\043\042\044\037\001\002\000\014\006\043" +
	"\022\040\024\044\043\042\044\037\001\002\000\014\006" +
	"\043\022\040\024\044\043\042\044\037\001\002\000\014" +
	"\006\043\022\040\024\044\043\042\044\037\001\002\000" +
	"\014\006\043\022\040\024\044\043\042\044\037\001\002" +
	"\000\014\006\043\022\040\024\044\043\042\044\037\001" +
	"\002\000\014\006\043\022\040\024\044\043\042\044\037" +
	"\001\002\000\040\005\053\006\047\007\061\010\057\011" +
	"\052\012\050\013\ufff5\014\062\015\054\016\056\017\051" +
	"\020\063\021\060\023\ufff5\025\ufff5\001\002\000\040\005" +
	"\053\006\047\007\061\010\057\011\052\012\ufff0\013\ufff0" +
	"\014\ufff0\015\ufff0\016\ufff0\017\ufff0\020\ufff0\021\ufff0\023" +
	"\ufff0\025\ufff0\001\002\000\040\005\053\006\047\007\061" +
	"\010\057\011\052\012\ufff2\013\ufff2\014\ufff2\015\ufff2\016" +
	"\ufff2\017\ufff2\020\ufff2\021\ufff2\023\ufff2\025\ufff2\001\002" +
	"\000\040\005\uffeb\006\uffeb\007\uffeb\010\uffeb\011\uffeb\012" +
	"\uffeb\013\uffeb\014\uffeb\015\uffeb\016\uffeb\017\uffeb\020\uffeb" +
	"\021\uffeb\023\uffeb\025\uffeb\001\002\000\040\005\053\006" +
	"\047\007\061\010\057\011\052\012\uffee\013\uffee\014\uffee" +
	"\015\uffee\016\uffee\017\uffee\020\uffee\021\uffee\023\uffee\025" +
	"\uffee\001\002\000\040\005\uffea\006\uffea\007\uffea\010\uffea" +
	"\011\uffea\012\uffea\013\uffea\014\uffea\015\uffea\016\uffea\017" +
	"\uffea\020\uffea\021\uffea\023\uffea\025\uffea\001\002\000\040" +
	"\005\053\006\047\007\061\010\057\011\052\012\ufff1\013" +
	"\ufff1\014\ufff1\015\ufff1\016\ufff1\017\ufff1\020\ufff1\021\ufff1" +
	"\023\ufff1\025\ufff1\001\002\000\004\004\075\001\002\000" +
	"\016\006\ufff6\022\ufff6\024\ufff6\030\ufff6\043\ufff6\044\ufff6" +
	"\001\002\000\040\005\053\006\047\007\061\010\057\011" +
	"\052\012\ufff3\013\ufff3\014\ufff3\015\ufff3\016\ufff3\017\ufff3" +
	"\020\ufff3\021\ufff3\023\ufff3\025\ufff3\001\002\000\040\005" +
	"\uffed\006\uffed\007\061\010\057\011\052\012\uffed\013\uffed" +
	"\014\uffed\015\uffed\016\uffed\017\uffed\020\uffed\021\uffed\023" +
	"\uffed\025\uffed\001\002\000\040\005\uffe9\006\uffe9\007\uffe9" +
	"\010\uffe9\011\uffe9\012\uffe9\013\uffe9\014\uffe9\015\uffe9\016" +
	"\uffe9\017\uffe9\020\uffe9\021\uffe9\023\uffe9\025\uffe9\001\002" +
	"\000\040\005\053\006\047\007\061\010\057\011\052\012" +
	"\uffef\013\uffef\014\uffef\015\uffef\016\uffef\017\uffef\020\uffef" +
	"\021\uffef\023\uffef\025\uffef\001\002\000\040\005\053\006" +
	"\047\007\061\010\057\011\052\012\ufff4\013\ufff4\014\062" +
	"\015\054\016\056\017\051\020\063\021\060\023\ufff4\025" +
	"\ufff4\001\002\000\040\005\uffec\006\uffec\007\061\010\057" +
	"\011\052\012\uffec\013\uffec\014\uffec\015\uffec\016\uffec\017" +
	"\uffec\020\uffec\021\uffec\023\uffec\025\uffec\001\002\000\016" +
	"\006\ufff8\022\ufff8\024\ufff8\030\ufff8\043\ufff8\044\ufff8\001" +
	"\002\000\004\030\ufff9\001\002\000\036\005\053\006\047" +
	"\007\061\010\057\011\052\012\050\013\064\014\062\015" +
	"\054\016\056\017\051\020\063\021\060\025\107\001\002" +
	"\000\040\005\uffe6\006\uffe6\007\uffe6\010\uffe6\011\uffe6\012" +
	"\uffe6\013\uffe6\014\uffe6\015\uffe6\016\uffe6\017\uffe6\020\uffe6" +
	"\021\uffe6\023\uffe6\025\uffe6\001\002\000\040\005\uffe8\006" +
	"\uffe8\007\uffe8\010\uffe8\011\uffe8\012\uffe8\013\uffe8\014\uffe8" +
	"\015\uffe8\016\uffe8\017\uffe8\020\uffe8\021\uffe8\023\uffe8\025" +
	"\uffe8\001\002\000\040\005\053\006\047\007\061\010\057" +
	"\011\052\012\uffe7\013\uffe7\014\062\015\054\016\056\017" +
	"\051\020\063\021\060\023\uffe7\025\uffe7\001\002" });

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
	unpackFromStrings(new String[] {
	"\000\107\000\004\003\004\001\001\000\002\001\001\000" +
	"\002\001\001\000\002\001\001\000\002\001\001\000\004" +
	"\004\010\001\001\000\002\001\001\000\002\001\001\000" +
	"\002\001\001\000\004\005\014\001\001\000\004\006\027" +
	"\001\001\000\002\001\001\000\002\001\001\000\004\007" +
	"\021\001\001\000\002\001\001\000\002\001\001\000\002" +
	"\001\001\000\002\001\001\000\002\001\001\000\002\001" +
	"\001\000\002\001\001\000\002\001\001\000\002\001\001" +
	"\000\002\001\001\000\004\013\033\001\001\000\002\001" +
	"\001\000\002\001\001\000\010\010\044\011\040\012\045" +
	"\001\001\000\002\001\001\000\004\012\110\001\001\000" +
	"\002\001\001\000\002\001\001\000\004\012\107\001\001" +
	"\000\004\012\105\001\001\000\006\011\103\012\045\001" +
	"\001\000\002\001\001\000\004\012\102\001\001\000\004" +
	"\012\101\001\001\000\004\012\100\001\001\000\004\012" +
	"\077\001\001\000\004\012\076\001\001\000\004\012\075" +
	"\001\001\000\002\001\001\000\004\012\072\001\001\000" +
	"\004\012\071\001\001\000\004\012\070\001\001\000\004" +
	"\012\067\001\001\000\004\012\066\001\001\000\004\012" +
	"\065\001\001\000\004\012\064\001\001\000\002\001\001" +
	"\000\002\001\001\000\002\001\001\000\002\001\001\000" +
	"\002\001\001\000\002\001\001\000\002\001\001\000\002" +
	"\001\001\000\002\001\001\000\002\001\001\000\002\001" +
	"\001\000\002\001\001\000\002\001\001\000\002\001\001" +
	"\000\002\001\001\000\002\001\001\000\002\001\001\000" +
	"\002\001\001\000\002\001\001\000\002\001\001\000\002" +
	"\001\001" });

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

		public static Node tree;
	// public static SymbolTable symbol;

		public static int TOKEN = 1;
		public static int VAR = 2;

	public static int basic_type;
	public static int npredicates=0;

	public static Vector tokens = new Vector();
		public static String name;
	public static String variable;

  /** Default constructor. */
  public parser() {super();}  
  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}  
  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}  
  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
	int                        act_num,
	java_cup.runtime.lr_parser parser,
	java.util.Stack            stack,
	int                        top)
	throws java.lang.Exception
  {
	/* call code in generated class */
	return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }  
  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}  
  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}  
  /** Action encapsulation object initializer. */
  protected void init_actions()
	{
	  action_obj = new CUP$parser$actions(this);
	}
  /** Access to production table. */
  public short[][] production_table() {return _production_table;}  
  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}  
	public void report_error(String message, Object info)
			{	System.err.print("Line: "+ 
				((Yylex) getScanner()).line() +" ");
	  			System.err.print(message);
			System.err.println("");
		}
  /** Indicates start production. */
  public int start_production() {return 1;}  
  /** Indicates start state. */
  public int start_state() {return 0;}  
}
