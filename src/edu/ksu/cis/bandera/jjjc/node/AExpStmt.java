package edu.ksu.cis.bandera.jjjc.node;

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
import ca.mcgill.sable.util.*;
import edu.ksu.cis.bandera.jjjc.analysis.*;

public final class AExpStmt extends PStmt
{
	private PExp _exp_;
	private TSemicolon _semicolon_;

	public AExpStmt()
	{
	}
	public AExpStmt(
		PExp _exp_,
		TSemicolon _semicolon_)
	{
		setExp(_exp_);

		setSemicolon(_semicolon_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAExpStmt(this);
	}
	public Object clone()
	{
		return new AExpStmt(
			(PExp) cloneNode(_exp_),
			(TSemicolon) cloneNode(_semicolon_));
	}
	public PExp getExp()
	{
		return _exp_;
	}
	public TSemicolon getSemicolon()
	{
		return _semicolon_;
	}
	void removeChild(Node child)
	{
		if(_exp_ == child)
		{
			_exp_ = null;
			return;
		}

		if(_semicolon_ == child)
		{
			_semicolon_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_exp_ == oldChild)
		{
			setExp((PExp) newChild);
			return;
		}

		if(_semicolon_ == oldChild)
		{
			setSemicolon((TSemicolon) newChild);
			return;
		}

	}
	public void setExp(PExp node)
	{
		if(_exp_ != null)
		{
			_exp_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_exp_ = node;
	}
	public void setSemicolon(TSemicolon node)
	{
		if(_semicolon_ != null)
		{
			_semicolon_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_semicolon_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_exp_)
			+ toString(_semicolon_);
	}
}
