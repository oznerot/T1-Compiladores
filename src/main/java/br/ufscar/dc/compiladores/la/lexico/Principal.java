package br.ufscar.dc.compiladores.la.lexico;

import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Principal 
{
    public static void main( String[] args )
    {
        try
        {
            CharStream cs = CharStreams.fromFileName(args[0]);
            Lalex lexer = new Lalex(cs);
            
            Token t = null;
            
            //Escrevendo a saída no arquivo do segundo argumento
            String filename = args[1];
            FileWriter writer = new FileWriter(filename);

            while((t = lexer.nextToken()).getType() != Token.EOF)
            {
                String tokenName = lalex.VOCABULARY.getDisplayName(t.getType());

                if (tokenName.equals ("ERRO_CADEIA"))
                {
                    writer.write("Linha " + t.getLine() + ": cadeia literal nao fechada\n");
                    break;
                }
                else if (tokenName.equals("ERRO_COMENTARIO"))
                {
                    writer.write("Linha " + t.getLine() + ": comentario nao fechado\n");
                    break;
                }
                else if (tokenName.equals("NAO_RECONHECIDO"))
                {
                    writer.write("Linha " + t.getLine() + ": " + t.getText() + " - simbolo nao identificado\n");
                    break;
                }
                else if (tokenName != "PALAVRA_CHAVE")
                {
                    writer.write("<'" + t.getText() + "', " + tokenName + ">\n");
                }
                else
                    writer.write("<'" + t.getText() + "','" + t.getText() + "'>\n");

            }

            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
