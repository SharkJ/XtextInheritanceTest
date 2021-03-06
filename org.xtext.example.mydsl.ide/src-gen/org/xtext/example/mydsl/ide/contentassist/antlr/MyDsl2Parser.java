/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDsl2Parser;
import org.xtext.example.mydsl.services.MyDsl2GrammarAccess;

public class MyDsl2Parser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDsl2GrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDsl2GrammarAccess grammarAccess) {
			builder.put(grammarAccess.getListAccess().getAltAlternatives_0(), "rule__List__AltAlternatives_0");
			builder.put(grammarAccess.getSeasonAccess().getGroup(), "rule__Season__Group__0");
			builder.put(grammarAccess.getMainModelAccess().getSeasonsAssignment(), "rule__MainModel__SeasonsAssignment");
			builder.put(grammarAccess.getSeasonAccess().getAltAssignment_1(), "rule__Season__AltAssignment_1");
			builder.put(grammarAccess.getListAccess().getAltAssignment(), "rule__List__AltAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDsl2GrammarAccess grammarAccess;

	@Override
	protected InternalMyDsl2Parser createParser() {
		InternalMyDsl2Parser result = new InternalMyDsl2Parser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDsl2GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDsl2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
