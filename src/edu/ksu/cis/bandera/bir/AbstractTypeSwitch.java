package edu.ksu.cis.bandera.bir;

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Bandera, a Java(TM) analysis and transformation toolkit           *
 * Copyright (C) 1998, 1999   James Corbett (corbett@hawaii.edu)     *
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
import ca.mcgill.sable.util.*;

public class AbstractTypeSwitch implements TypeSwitch
{
  Object result;

  public void caseArray(Array type, Object o)
  {
    defaultCase(type);
  }
  public void caseBool(Bool type, Object o)
  {
    defaultCase(type);
  }
  public void caseTid(Tid type, Object o) 
  {
    defaultCase(type);
  }
  public void caseCollection(Collection type, Object o)
  {
    defaultCase(type);
  }
  public void caseEnumerated(Enumerated type, Object o)
  {
    defaultCase(type);
  }
  public void caseField(Field type, Object o)
  {
    defaultCase(type);
  }
  public void caseLock(Lock type, Object o)
  {
    defaultCase(type);
  }
  public void caseRange(Range type, Object o) 
  {
    defaultCase(type);
  }
  public void caseRecord(Record type, Object o)
  {
    defaultCase(type);
  }
  public void caseRef(Ref type, Object o)
  {
    defaultCase(type);
  }
  public void defaultCase(Object obj) 
  {
  }
  public Object getResult() {
    return result;
  }
  public void setResult(Object obj) {
    result = obj;
  }
}
