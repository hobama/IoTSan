/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.parser;

import edu.ksu.cis.bandera.birp.node.*;

public class ParserException extends Exception
{
    Token token;

    public ParserException(Token token, String  message)
    {
        super(message);
        this.token = token;
    }

    public Token getToken()
    {
        return token;
    }
}
