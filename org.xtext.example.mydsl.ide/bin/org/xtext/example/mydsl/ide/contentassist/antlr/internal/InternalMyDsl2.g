/*
 * generated by Xtext 2.15.0
 */
grammar InternalMyDsl2;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDsl2GrammarAccess;

}
@parser::members {
	private MyDsl2GrammarAccess grammarAccess;

	public void setGrammarAccess(MyDsl2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleMainModel
entryRuleMainModel
:
{ before(grammarAccess.getMainModelRule()); }
	 ruleMainModel
{ after(grammarAccess.getMainModelRule()); } 
	 EOF 
;

// Rule MainModel
ruleMainModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMainModelAccess().getSeasonsAssignment()); }
		(rule__MainModel__SeasonsAssignment)*
		{ after(grammarAccess.getMainModelAccess().getSeasonsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSeason
entryRuleSeason
:
{ before(grammarAccess.getSeasonRule()); }
	 ruleSeason
{ after(grammarAccess.getSeasonRule()); } 
	 EOF 
;

// Rule Season
ruleSeason 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSeasonAccess().getGroup()); }
		(rule__Season__Group__0)
		{ after(grammarAccess.getSeasonAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleList
entryRuleList
:
{ before(grammarAccess.getListRule()); }
	 ruleList
{ after(grammarAccess.getListRule()); } 
	 EOF 
;

// Rule List
ruleList 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getListAccess().getAltAssignment()); }
		(rule__List__AltAssignment)
		{ after(grammarAccess.getListAccess().getAltAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__List__AltAlternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getListAccess().getAltSpringKeyword_0_0()); }
		'Spring'
		{ after(grammarAccess.getListAccess().getAltSpringKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getListAccess().getAltSummerKeyword_0_1()); }
		'Summer'
		{ after(grammarAccess.getListAccess().getAltSummerKeyword_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getListAccess().getAltAutumnKeyword_0_2()); }
		'Autumn'
		{ after(grammarAccess.getListAccess().getAltAutumnKeyword_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getListAccess().getAltWinterKeyword_0_3()); }
		'Winter'
		{ after(grammarAccess.getListAccess().getAltWinterKeyword_0_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Season__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Season__Group__0__Impl
	rule__Season__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Season__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSeasonAccess().getThis_isKeyword_0()); }
	'This_is'
	{ after(grammarAccess.getSeasonAccess().getThis_isKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Season__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Season__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Season__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSeasonAccess().getAltAssignment_1()); }
	(rule__Season__AltAssignment_1)
	{ after(grammarAccess.getSeasonAccess().getAltAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MainModel__SeasonsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMainModelAccess().getSeasonsSeasonParserRuleCall_0()); }
		ruleSeason
		{ after(grammarAccess.getMainModelAccess().getSeasonsSeasonParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Season__AltAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSeasonAccess().getAltListParserRuleCall_1_0()); }
		ruleList
		{ after(grammarAccess.getSeasonAccess().getAltListParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__List__AltAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getListAccess().getAltAlternatives_0()); }
		(rule__List__AltAlternatives_0)
		{ after(grammarAccess.getListAccess().getAltAlternatives_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
