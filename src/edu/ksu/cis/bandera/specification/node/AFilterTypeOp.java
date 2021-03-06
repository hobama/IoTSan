package edu.ksu.cis.bandera.specification.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.analysis.*;

public final class AFilterTypeOp extends PTypeOp
{
	private TMinus _minus_;

	public AFilterTypeOp()
	{
	}
	public AFilterTypeOp(
		TMinus _minus_)
	{
		setMinus(_minus_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAFilterTypeOp(this);
	}
	public Object clone()
	{
		return new AFilterTypeOp(
			(TMinus) cloneNode(_minus_));
	}
	public TMinus getMinus()
	{
		return _minus_;
	}
	void removeChild(Node child)
	{
		if(_minus_ == child)
		{
			_minus_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_minus_ == oldChild)
		{
			setMinus((TMinus) newChild);
			return;
		}

	}
	public void setMinus(TMinus node)
	{
		if(_minus_ != null)
		{
			_minus_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_minus_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_minus_);
	}
}
