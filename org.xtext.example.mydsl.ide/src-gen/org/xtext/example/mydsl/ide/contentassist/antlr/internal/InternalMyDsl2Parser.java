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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDsl2Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Spring'", "'Summer'", "'Autumn'", "'Winter'", "'This_is'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDsl2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDsl2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDsl2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl2.g"; }


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



    // $ANTLR start "entryRuleMainModel"
    // InternalMyDsl2.g:53:1: entryRuleMainModel : ruleMainModel EOF ;
    public final void entryRuleMainModel() throws RecognitionException {
        try {
            // InternalMyDsl2.g:54:1: ( ruleMainModel EOF )
            // InternalMyDsl2.g:55:1: ruleMainModel EOF
            {
             before(grammarAccess.getMainModelRule()); 
            pushFollow(FOLLOW_1);
            ruleMainModel();

            state._fsp--;

             after(grammarAccess.getMainModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMainModel"


    // $ANTLR start "ruleMainModel"
    // InternalMyDsl2.g:62:1: ruleMainModel : ( ( rule__MainModel__SeasonsAssignment )* ) ;
    public final void ruleMainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl2.g:66:2: ( ( ( rule__MainModel__SeasonsAssignment )* ) )
            // InternalMyDsl2.g:67:2: ( ( rule__MainModel__SeasonsAssignment )* )
            {
            // InternalMyDsl2.g:67:2: ( ( rule__MainModel__SeasonsAssignment )* )
            // InternalMyDsl2.g:68:3: ( rule__MainModel__SeasonsAssignment )*
            {
             before(grammarAccess.getMainModelAccess().getSeasonsAssignment()); 
            // InternalMyDsl2.g:69:3: ( rule__MainModel__SeasonsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl2.g:69:4: rule__MainModel__SeasonsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__MainModel__SeasonsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMainModelAccess().getSeasonsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMainModel"


    // $ANTLR start "entryRuleSeason"
    // InternalMyDsl2.g:78:1: entryRuleSeason : ruleSeason EOF ;
    public final void entryRuleSeason() throws RecognitionException {
        try {
            // InternalMyDsl2.g:79:1: ( ruleSeason EOF )
            // InternalMyDsl2.g:80:1: ruleSeason EOF
            {
             before(grammarAccess.getSeasonRule()); 
            pushFollow(FOLLOW_1);
            ruleSeason();

            state._fsp--;

             after(grammarAccess.getSeasonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSeason"


    // $ANTLR start "ruleSeason"
    // InternalMyDsl2.g:87:1: ruleSeason : ( ( rule__Season__Group__0 ) ) ;
    public final void ruleSeason() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl2.g:91:2: ( ( ( rule__Season__Group__0 ) ) )
            // InternalMyDsl2.g:92:2: ( ( rule__Season__Group__0 ) )
            {
            // InternalMyDsl2.g:92:2: ( ( rule__Season__Group__0 ) )
            // InternalMyDsl2.g:93:3: ( rule__Season__Group__0 )
            {
             before(grammarAccess.getSeasonAccess().getGroup()); 
            // InternalMyDsl2.g:94:3: ( rule__Season__Group__0 )
            // InternalMyDsl2.g:94:4: rule__Season__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Season__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeasonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeason"


    // $ANTLR start "entryRuleList"
    // InternalMyDsl2.g:103:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalMyDsl2.g:104:1: ( ruleList EOF )
            // InternalMyDsl2.g:105:1: ruleList EOF
            {
             before(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalMyDsl2.g:112:1: ruleList : ( ( rule__List__AltAssignment ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl2.g:116:2: ( ( ( rule__List__AltAssignment ) ) )
            // InternalMyDsl2.g:117:2: ( ( rule__List__AltAssignment ) )
            {
            // InternalMyDsl2.g:117:2: ( ( rule__List__AltAssignment ) )
            // InternalMyDsl2.g:118:3: ( rule__List__AltAssignment )
            {
             before(grammarAccess.getListAccess().getAltAssignment()); 
            // InternalMyDsl2.g:119:3: ( rule__List__AltAssignment )
            // InternalMyDsl2.g:119:4: rule__List__AltAssignment
            {
            pushFollow(FOLLOW_2);
            rule__List__AltAssignment();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getAltAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "rule__List__AltAlternatives_0"
    // InternalMyDsl2.g:127:1: rule__List__AltAlternatives_0 : ( ( 'Spring' ) | ( 'Summer' ) | ( 'Autumn' ) | ( 'Winter' ) );
    public final void rule__List__AltAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl2.g:131:1: ( ( 'Spring' ) | ( 'Summer' ) | ( 'Autumn' ) | ( 'Winter' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl2.g:132:2: ( 'Spring' )
                    {
                    // InternalMyDsl2.g:132:2: ( 'Spring' )
                    // InternalMyDsl2.g:133:3: 'Spring'
                    {
                     before(grammarAccess.getListAccess().getAltSpringKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getListAccess().getAltSpringKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl2.g:138:2: ( 'Summer' )
                    {
                    // InternalMyDsl2.g:138:2: ( 'Summer' )
                    // InternalMyDsl2.g:139:3: 'Summer'
                    {
                     before(grammarAccess.getListAccess().getAltSummerKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getListAccess().getAltSummerKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl2.g:144:2: ( 'Autumn' )
                    {
                    // InternalMyDsl2.g:144:2: ( 'Autumn' )
                    // InternalMyDsl2.g:145:3: 'Autumn'
                    {
                     before(grammarAccess.getListAccess().getAltAutumnKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getListAccess().getAltAutumnKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl2.g:150:2: ( 'Winter' )
                    {
                    // InternalMyDsl2.g:150:2: ( 'Winter' )
                    // InternalMyDsl2.g:151:3: 'Winter'
                    {
                     before(grammarAccess.getListAccess().getAltWinterKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getListAccess().getAltWinterKeyword_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__AltAlternatives_0"


    // $ANTLR start "rule__Season__Group__0"
    // InternalMyDsl2.g:160:1: rule__Season__Group__0 : rule__Season__Group__0__Impl rule__Season__Group__1 ;
    public final void rule__Season__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl2.g:164:1: ( rule__Season__Group__0__Impl rule__Season__Group__1 )
            // InternalMyDsl2.g:165:2: rule__Season__Group__0__Impl rule__Season__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Season__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Season__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Season__Group__0"


    // $ANTLR start "rule__Season__Group__0__Impl"
    // InternalMyDsl2.g:172:1: rule__Season__Group__0__Impl : ( 'This_is' ) ;
    public final void rule__Season__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl2.g:176:1: ( ( 'This_is' ) )
            // InternalMyDsl2.g:177:1: ( 'This_is' )
            {
            // InternalMyDsl2.g:177:1: ( 'This_is' )
            // InternalMyDsl2.g:178:2: 'This_is'
            {
             before(grammarAccess.getSeasonAccess().getThis_isKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSeasonAccess().getThis_isKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Season__Group__0__Impl"


    // $ANTLR start "rule__Season__Group__1"
    // InternalMyDsl2.g:187:1: rule__Season__Group__1 : rule__Season__Group__1__Impl ;
    public final void rule__Season__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl2.g:191:1: ( rule__Season__Group__1__Impl )
            // InternalMyDsl2.g:192:2: rule__Season__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Season__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Season__Group__1"


    // $ANTLR start "rule__Season__Group__1__Impl"
    // InternalMyDsl2.g:198:1: rule__Season__Group__1__Impl : ( ( rule__Season__AltAssignment_1 ) ) ;
    public final void rule__Season__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl2.g:202:1: ( ( ( rule__Season__AltAssignment_1 ) ) )
            // InternalMyDsl2.g:203:1: ( ( rule__Season__AltAssignment_1 ) )
            {
            // InternalMyDsl2.g:203:1: ( ( rule__Season__AltAssignment_1 ) )
            // InternalMyDsl2.g:204:2: ( rule__Season__AltAssignment_1 )
            {
             before(grammarAccess.getSeasonAccess().getAltAssignment_1()); 
            // InternalMyDsl2.g:205:2: ( rule__Season__AltAssignment_1 )
            // InternalMyDsl2.g:205:3: rule__Season__AltAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Season__AltAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSeasonAccess().getAltAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Season__Group__1__Impl"


    // $ANTLR start "rule__MainModel__SeasonsAssignment"
    // InternalMyDsl2.g:214:1: rule__MainModel__SeasonsAssignment : ( ruleSeason ) ;
    public final void rule__MainModel__SeasonsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl2.g:218:1: ( ( ruleSeason ) )
            // InternalMyDsl2.g:219:2: ( ruleSeason )
            {
            // InternalMyDsl2.g:219:2: ( ruleSeason )
            // InternalMyDsl2.g:220:3: ruleSeason
            {
             before(grammarAccess.getMainModelAccess().getSeasonsSeasonParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSeason();

            state._fsp--;

             after(grammarAccess.getMainModelAccess().getSeasonsSeasonParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainModel__SeasonsAssignment"


    // $ANTLR start "rule__Season__AltAssignment_1"
    // InternalMyDsl2.g:229:1: rule__Season__AltAssignment_1 : ( ruleList ) ;
    public final void rule__Season__AltAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl2.g:233:1: ( ( ruleList ) )
            // InternalMyDsl2.g:234:2: ( ruleList )
            {
            // InternalMyDsl2.g:234:2: ( ruleList )
            // InternalMyDsl2.g:235:3: ruleList
            {
             before(grammarAccess.getSeasonAccess().getAltListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleList();

            state._fsp--;

             after(grammarAccess.getSeasonAccess().getAltListParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Season__AltAssignment_1"


    // $ANTLR start "rule__List__AltAssignment"
    // InternalMyDsl2.g:244:1: rule__List__AltAssignment : ( ( rule__List__AltAlternatives_0 ) ) ;
    public final void rule__List__AltAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl2.g:248:1: ( ( ( rule__List__AltAlternatives_0 ) ) )
            // InternalMyDsl2.g:249:2: ( ( rule__List__AltAlternatives_0 ) )
            {
            // InternalMyDsl2.g:249:2: ( ( rule__List__AltAlternatives_0 ) )
            // InternalMyDsl2.g:250:3: ( rule__List__AltAlternatives_0 )
            {
             before(grammarAccess.getListAccess().getAltAlternatives_0()); 
            // InternalMyDsl2.g:251:3: ( rule__List__AltAlternatives_0 )
            // InternalMyDsl2.g:251:4: rule__List__AltAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__List__AltAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getAltAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__AltAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000007800L});

}