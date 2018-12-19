/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.parser.antlr.internal.InternalMyDsl2Parser;
import org.xtext.example.mydsl.services.MyDsl2GrammarAccess;

public class MyDsl2Parser extends AbstractAntlrParser {

	@Inject
	private MyDsl2GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMyDsl2Parser createParser(XtextTokenStream stream) {
		return new InternalMyDsl2Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "MainModel";
	}

	public MyDsl2GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDsl2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
