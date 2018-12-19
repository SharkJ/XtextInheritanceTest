package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDsl2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDsl2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'This_is'", "'Spring'", "'Summer'", "'Autumn'", "'Winter'"
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

        public InternalMyDsl2Parser(TokenStream input, MyDsl2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MainModel";
       	}

       	@Override
       	protected MyDsl2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMainModel"
    // InternalMyDsl2.g:64:1: entryRuleMainModel returns [EObject current=null] : iv_ruleMainModel= ruleMainModel EOF ;
    public final EObject entryRuleMainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainModel = null;


        try {
            // InternalMyDsl2.g:64:50: (iv_ruleMainModel= ruleMainModel EOF )
            // InternalMyDsl2.g:65:2: iv_ruleMainModel= ruleMainModel EOF
            {
             newCompositeNode(grammarAccess.getMainModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainModel=ruleMainModel();

            state._fsp--;

             current =iv_ruleMainModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMainModel"


    // $ANTLR start "ruleMainModel"
    // InternalMyDsl2.g:71:1: ruleMainModel returns [EObject current=null] : ( (lv_seasons_0_0= ruleSeason ) )* ;
    public final EObject ruleMainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_seasons_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl2.g:77:2: ( ( (lv_seasons_0_0= ruleSeason ) )* )
            // InternalMyDsl2.g:78:2: ( (lv_seasons_0_0= ruleSeason ) )*
            {
            // InternalMyDsl2.g:78:2: ( (lv_seasons_0_0= ruleSeason ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl2.g:79:3: (lv_seasons_0_0= ruleSeason )
            	    {
            	    // InternalMyDsl2.g:79:3: (lv_seasons_0_0= ruleSeason )
            	    // InternalMyDsl2.g:80:4: lv_seasons_0_0= ruleSeason
            	    {

            	    				newCompositeNode(grammarAccess.getMainModelAccess().getSeasonsSeasonParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_seasons_0_0=ruleSeason();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getMainModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"seasons",
            	    					lv_seasons_0_0,
            	    					"org.xtext.example.mydsl.MyDsl2.Season");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMainModel"


    // $ANTLR start "entryRuleSeason"
    // InternalMyDsl2.g:100:1: entryRuleSeason returns [EObject current=null] : iv_ruleSeason= ruleSeason EOF ;
    public final EObject entryRuleSeason() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeason = null;


        try {
            // InternalMyDsl2.g:100:47: (iv_ruleSeason= ruleSeason EOF )
            // InternalMyDsl2.g:101:2: iv_ruleSeason= ruleSeason EOF
            {
             newCompositeNode(grammarAccess.getSeasonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeason=ruleSeason();

            state._fsp--;

             current =iv_ruleSeason; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSeason"


    // $ANTLR start "ruleSeason"
    // InternalMyDsl2.g:107:1: ruleSeason returns [EObject current=null] : (otherlv_0= 'This_is' ( (lv_alt_1_0= ruleList ) ) ) ;
    public final EObject ruleSeason() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_alt_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl2.g:113:2: ( (otherlv_0= 'This_is' ( (lv_alt_1_0= ruleList ) ) ) )
            // InternalMyDsl2.g:114:2: (otherlv_0= 'This_is' ( (lv_alt_1_0= ruleList ) ) )
            {
            // InternalMyDsl2.g:114:2: (otherlv_0= 'This_is' ( (lv_alt_1_0= ruleList ) ) )
            // InternalMyDsl2.g:115:3: otherlv_0= 'This_is' ( (lv_alt_1_0= ruleList ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSeasonAccess().getThis_isKeyword_0());
            		
            // InternalMyDsl2.g:119:3: ( (lv_alt_1_0= ruleList ) )
            // InternalMyDsl2.g:120:4: (lv_alt_1_0= ruleList )
            {
            // InternalMyDsl2.g:120:4: (lv_alt_1_0= ruleList )
            // InternalMyDsl2.g:121:5: lv_alt_1_0= ruleList
            {

            					newCompositeNode(grammarAccess.getSeasonAccess().getAltListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_alt_1_0=ruleList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSeasonRule());
            					}
            					set(
            						current,
            						"alt",
            						lv_alt_1_0,
            						"org.xtext.example.mydsl.MyDsl2.List");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSeason"


    // $ANTLR start "entryRuleList"
    // InternalMyDsl2.g:142:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalMyDsl2.g:142:45: (iv_ruleList= ruleList EOF )
            // InternalMyDsl2.g:143:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalMyDsl2.g:149:1: ruleList returns [EObject current=null] : ( ( (lv_alt_0_1= 'Spring' | lv_alt_0_2= 'Summer' | lv_alt_0_3= 'Autumn' | lv_alt_0_4= 'Winter' ) ) ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token lv_alt_0_1=null;
        Token lv_alt_0_2=null;
        Token lv_alt_0_3=null;
        Token lv_alt_0_4=null;


        	enterRule();

        try {
            // InternalMyDsl2.g:155:2: ( ( ( (lv_alt_0_1= 'Spring' | lv_alt_0_2= 'Summer' | lv_alt_0_3= 'Autumn' | lv_alt_0_4= 'Winter' ) ) ) )
            // InternalMyDsl2.g:156:2: ( ( (lv_alt_0_1= 'Spring' | lv_alt_0_2= 'Summer' | lv_alt_0_3= 'Autumn' | lv_alt_0_4= 'Winter' ) ) )
            {
            // InternalMyDsl2.g:156:2: ( ( (lv_alt_0_1= 'Spring' | lv_alt_0_2= 'Summer' | lv_alt_0_3= 'Autumn' | lv_alt_0_4= 'Winter' ) ) )
            // InternalMyDsl2.g:157:3: ( (lv_alt_0_1= 'Spring' | lv_alt_0_2= 'Summer' | lv_alt_0_3= 'Autumn' | lv_alt_0_4= 'Winter' ) )
            {
            // InternalMyDsl2.g:157:3: ( (lv_alt_0_1= 'Spring' | lv_alt_0_2= 'Summer' | lv_alt_0_3= 'Autumn' | lv_alt_0_4= 'Winter' ) )
            // InternalMyDsl2.g:158:4: (lv_alt_0_1= 'Spring' | lv_alt_0_2= 'Summer' | lv_alt_0_3= 'Autumn' | lv_alt_0_4= 'Winter' )
            {
            // InternalMyDsl2.g:158:4: (lv_alt_0_1= 'Spring' | lv_alt_0_2= 'Summer' | lv_alt_0_3= 'Autumn' | lv_alt_0_4= 'Winter' )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
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
                    // InternalMyDsl2.g:159:5: lv_alt_0_1= 'Spring'
                    {
                    lv_alt_0_1=(Token)match(input,12,FOLLOW_2); 

                    					newLeafNode(lv_alt_0_1, grammarAccess.getListAccess().getAltSpringKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getListRule());
                    					}
                    					setWithLastConsumed(current, "alt", lv_alt_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl2.g:170:5: lv_alt_0_2= 'Summer'
                    {
                    lv_alt_0_2=(Token)match(input,13,FOLLOW_2); 

                    					newLeafNode(lv_alt_0_2, grammarAccess.getListAccess().getAltSummerKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getListRule());
                    					}
                    					setWithLastConsumed(current, "alt", lv_alt_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMyDsl2.g:181:5: lv_alt_0_3= 'Autumn'
                    {
                    lv_alt_0_3=(Token)match(input,14,FOLLOW_2); 

                    					newLeafNode(lv_alt_0_3, grammarAccess.getListAccess().getAltAutumnKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getListRule());
                    					}
                    					setWithLastConsumed(current, "alt", lv_alt_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalMyDsl2.g:192:5: lv_alt_0_4= 'Winter'
                    {
                    lv_alt_0_4=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(lv_alt_0_4, grammarAccess.getListAccess().getAltWinterKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getListRule());
                    					}
                    					setWithLastConsumed(current, "alt", lv_alt_0_4, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleList"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000F000L});

}