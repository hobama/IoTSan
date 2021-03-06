package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class AStrongModMultExp extends PMultExp
{
	private PMultExp _multExp_;
	private TStrongMod _strongMod_;
	private PUnaryExp _unaryExp_;

	public AStrongModMultExp()
	{
	}
	public AStrongModMultExp(
		PMultExp _multExp_,
		TStrongMod _strongMod_,
		PUnaryExp _unaryExp_)
	{
		setMultExp(_multExp_);

		setStrongMod(_strongMod_);

		setUnaryExp(_unaryExp_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAStrongModMultExp(this);
	}
	public Object clone()
	{
		return new AStrongModMultExp(
			(PMultExp) cloneNode(_multExp_),
			(TStrongMod) cloneNode(_strongMod_),
			(PUnaryExp) cloneNode(_unaryExp_));
	}
	public PMultExp getMultExp()
	{
		return _multExp_;
	}
	public TStrongMod getStrongMod()
	{
		return _strongMod_;
	}
	public PUnaryExp getUnaryExp()
	{
		return _unaryExp_;
	}
	void removeChild(Node child)
	{
		if(_multExp_ == child)
		{
			_multExp_ = null;
			return;
		}

		if(_strongMod_ == child)
		{
			_strongMod_ = null;
			return;
		}

		if(_unaryExp_ == child)
		{
			_unaryExp_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_multExp_ == oldChild)
		{
			setMultExp((PMultExp) newChild);
			return;
		}

		if(_strongMod_ == oldChild)
		{
			setStrongMod((TStrongMod) newChild);
			return;
		}

		if(_unaryExp_ == oldChild)
		{
			setUnaryExp((PUnaryExp) newChild);
			return;
		}

	}
	public void setMultExp(PMultExp node)
	{
		if(_multExp_ != null)
		{
			_multExp_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_multExp_ = node;
	}
	public void setStrongMod(TStrongMod node)
	{
		if(_strongMod_ != null)
		{
			_strongMod_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_strongMod_ = node;
	}
	public void setUnaryExp(PUnaryExp node)
	{
		if(_unaryExp_ != null)
		{
			_unaryExp_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_unaryExp_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_multExp_)
			+ toString(_strongMod_)
			+ toString(_unaryExp_);
	}
}
