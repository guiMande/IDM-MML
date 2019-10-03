package src.idm_mml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import src.idm_mml.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MML'", "'{'", "'}'", "'Implementation'", "'Scikit-learn'", "'Weka'", "'Dataset'", "'Strategie'", "'Validation'", "'CrossValidation'", "'Cible'", "'Predictives'", "'Colonne'", "'Algorithme'", "'Metrique'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MML";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMML"
    // InternalMyDsl.g:64:1: entryRuleMML returns [EObject current=null] : iv_ruleMML= ruleMML EOF ;
    public final EObject entryRuleMML() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMML = null;


        try {
            // InternalMyDsl.g:64:44: (iv_ruleMML= ruleMML EOF )
            // InternalMyDsl.g:65:2: iv_ruleMML= ruleMML EOF
            {
             newCompositeNode(grammarAccess.getMMLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMML=ruleMML();

            state._fsp--;

             current =iv_ruleMML; 
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
    // $ANTLR end "entryRuleMML"


    // $ANTLR start "ruleMML"
    // InternalMyDsl.g:71:1: ruleMML returns [EObject current=null] : (otherlv_0= 'MML' otherlv_1= '{' ( (lv_mml_2_0= ruleImplementation ) )+ ( (lv_mml_3_0= ruleDataset ) )+ otherlv_4= '}' ) ;
    public final EObject ruleMML() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_mml_2_0 = null;

        EObject lv_mml_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'MML' otherlv_1= '{' ( (lv_mml_2_0= ruleImplementation ) )+ ( (lv_mml_3_0= ruleDataset ) )+ otherlv_4= '}' ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'MML' otherlv_1= '{' ( (lv_mml_2_0= ruleImplementation ) )+ ( (lv_mml_3_0= ruleDataset ) )+ otherlv_4= '}' )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'MML' otherlv_1= '{' ( (lv_mml_2_0= ruleImplementation ) )+ ( (lv_mml_3_0= ruleDataset ) )+ otherlv_4= '}' )
            // InternalMyDsl.g:79:3: otherlv_0= 'MML' otherlv_1= '{' ( (lv_mml_2_0= ruleImplementation ) )+ ( (lv_mml_3_0= ruleDataset ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMMLAccess().getMMLKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMMLAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:87:3: ( (lv_mml_2_0= ruleImplementation ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:88:4: (lv_mml_2_0= ruleImplementation )
            	    {
            	    // InternalMyDsl.g:88:4: (lv_mml_2_0= ruleImplementation )
            	    // InternalMyDsl.g:89:5: lv_mml_2_0= ruleImplementation
            	    {

            	    					newCompositeNode(grammarAccess.getMMLAccess().getMmlImplementationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_mml_2_0=ruleImplementation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMMLRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mml",
            	    						lv_mml_2_0,
            	    						"src.idm_mml.MyDsl.Implementation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalMyDsl.g:106:3: ( (lv_mml_3_0= ruleDataset ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:107:4: (lv_mml_3_0= ruleDataset )
            	    {
            	    // InternalMyDsl.g:107:4: (lv_mml_3_0= ruleDataset )
            	    // InternalMyDsl.g:108:5: lv_mml_3_0= ruleDataset
            	    {

            	    					newCompositeNode(grammarAccess.getMMLAccess().getMmlDatasetParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_mml_3_0=ruleDataset();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMMLRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mml",
            	    						lv_mml_3_0,
            	    						"src.idm_mml.MyDsl.Dataset");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMMLAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleMML"


    // $ANTLR start "entryRuleImplementation"
    // InternalMyDsl.g:133:1: entryRuleImplementation returns [EObject current=null] : iv_ruleImplementation= ruleImplementation EOF ;
    public final EObject entryRuleImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementation = null;


        try {
            // InternalMyDsl.g:133:55: (iv_ruleImplementation= ruleImplementation EOF )
            // InternalMyDsl.g:134:2: iv_ruleImplementation= ruleImplementation EOF
            {
             newCompositeNode(grammarAccess.getImplementationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementation=ruleImplementation();

            state._fsp--;

             current =iv_ruleImplementation; 
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
    // $ANTLR end "entryRuleImplementation"


    // $ANTLR start "ruleImplementation"
    // InternalMyDsl.g:140:1: ruleImplementation returns [EObject current=null] : ( ( () otherlv_1= 'Implementation' otherlv_2= 'Scikit-learn' ) | (otherlv_3= 'Weka' otherlv_4= '{' ( (lv_algo_5_0= ruleAlgorithme ) ) ( (lv_metrique_6_0= ruleMetrique ) ) ( (lv_strategie_7_0= ruleStrategie ) ) otherlv_8= '}' ) ) ;
    public final EObject ruleImplementation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_algo_5_0 = null;

        EObject lv_metrique_6_0 = null;

        EObject lv_strategie_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:146:2: ( ( ( () otherlv_1= 'Implementation' otherlv_2= 'Scikit-learn' ) | (otherlv_3= 'Weka' otherlv_4= '{' ( (lv_algo_5_0= ruleAlgorithme ) ) ( (lv_metrique_6_0= ruleMetrique ) ) ( (lv_strategie_7_0= ruleStrategie ) ) otherlv_8= '}' ) ) )
            // InternalMyDsl.g:147:2: ( ( () otherlv_1= 'Implementation' otherlv_2= 'Scikit-learn' ) | (otherlv_3= 'Weka' otherlv_4= '{' ( (lv_algo_5_0= ruleAlgorithme ) ) ( (lv_metrique_6_0= ruleMetrique ) ) ( (lv_strategie_7_0= ruleStrategie ) ) otherlv_8= '}' ) )
            {
            // InternalMyDsl.g:147:2: ( ( () otherlv_1= 'Implementation' otherlv_2= 'Scikit-learn' ) | (otherlv_3= 'Weka' otherlv_4= '{' ( (lv_algo_5_0= ruleAlgorithme ) ) ( (lv_metrique_6_0= ruleMetrique ) ) ( (lv_strategie_7_0= ruleStrategie ) ) otherlv_8= '}' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:148:3: ( () otherlv_1= 'Implementation' otherlv_2= 'Scikit-learn' )
                    {
                    // InternalMyDsl.g:148:3: ( () otherlv_1= 'Implementation' otherlv_2= 'Scikit-learn' )
                    // InternalMyDsl.g:149:4: () otherlv_1= 'Implementation' otherlv_2= 'Scikit-learn'
                    {
                    // InternalMyDsl.g:149:4: ()
                    // InternalMyDsl.g:150:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getImplementationAccess().getImplementationAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getImplementationAccess().getImplementationKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getImplementationAccess().getScikitLearnKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:166:3: (otherlv_3= 'Weka' otherlv_4= '{' ( (lv_algo_5_0= ruleAlgorithme ) ) ( (lv_metrique_6_0= ruleMetrique ) ) ( (lv_strategie_7_0= ruleStrategie ) ) otherlv_8= '}' )
                    {
                    // InternalMyDsl.g:166:3: (otherlv_3= 'Weka' otherlv_4= '{' ( (lv_algo_5_0= ruleAlgorithme ) ) ( (lv_metrique_6_0= ruleMetrique ) ) ( (lv_strategie_7_0= ruleStrategie ) ) otherlv_8= '}' )
                    // InternalMyDsl.g:167:4: otherlv_3= 'Weka' otherlv_4= '{' ( (lv_algo_5_0= ruleAlgorithme ) ) ( (lv_metrique_6_0= ruleMetrique ) ) ( (lv_strategie_7_0= ruleStrategie ) ) otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getImplementationAccess().getWekaKeyword_1_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getImplementationAccess().getLeftCurlyBracketKeyword_1_1());
                    			
                    // InternalMyDsl.g:175:4: ( (lv_algo_5_0= ruleAlgorithme ) )
                    // InternalMyDsl.g:176:5: (lv_algo_5_0= ruleAlgorithme )
                    {
                    // InternalMyDsl.g:176:5: (lv_algo_5_0= ruleAlgorithme )
                    // InternalMyDsl.g:177:6: lv_algo_5_0= ruleAlgorithme
                    {

                    						newCompositeNode(grammarAccess.getImplementationAccess().getAlgoAlgorithmeParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_algo_5_0=ruleAlgorithme();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImplementationRule());
                    						}
                    						add(
                    							current,
                    							"algo",
                    							lv_algo_5_0,
                    							"src.idm_mml.MyDsl.Algorithme");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:194:4: ( (lv_metrique_6_0= ruleMetrique ) )
                    // InternalMyDsl.g:195:5: (lv_metrique_6_0= ruleMetrique )
                    {
                    // InternalMyDsl.g:195:5: (lv_metrique_6_0= ruleMetrique )
                    // InternalMyDsl.g:196:6: lv_metrique_6_0= ruleMetrique
                    {

                    						newCompositeNode(grammarAccess.getImplementationAccess().getMetriqueMetriqueParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_metrique_6_0=ruleMetrique();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImplementationRule());
                    						}
                    						add(
                    							current,
                    							"metrique",
                    							lv_metrique_6_0,
                    							"src.idm_mml.MyDsl.Metrique");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:213:4: ( (lv_strategie_7_0= ruleStrategie ) )
                    // InternalMyDsl.g:214:5: (lv_strategie_7_0= ruleStrategie )
                    {
                    // InternalMyDsl.g:214:5: (lv_strategie_7_0= ruleStrategie )
                    // InternalMyDsl.g:215:6: lv_strategie_7_0= ruleStrategie
                    {

                    						newCompositeNode(grammarAccess.getImplementationAccess().getStrategieStrategieParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_strategie_7_0=ruleStrategie();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImplementationRule());
                    						}
                    						add(
                    							current,
                    							"strategie",
                    							lv_strategie_7_0,
                    							"src.idm_mml.MyDsl.Strategie");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getImplementationAccess().getRightCurlyBracketKeyword_1_5());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleImplementation"


    // $ANTLR start "entryRuleDataset"
    // InternalMyDsl.g:241:1: entryRuleDataset returns [EObject current=null] : iv_ruleDataset= ruleDataset EOF ;
    public final EObject entryRuleDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataset = null;


        try {
            // InternalMyDsl.g:241:48: (iv_ruleDataset= ruleDataset EOF )
            // InternalMyDsl.g:242:2: iv_ruleDataset= ruleDataset EOF
            {
             newCompositeNode(grammarAccess.getDatasetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataset=ruleDataset();

            state._fsp--;

             current =iv_ruleDataset; 
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
    // $ANTLR end "entryRuleDataset"


    // $ANTLR start "ruleDataset"
    // InternalMyDsl.g:248:1: ruleDataset returns [EObject current=null] : (otherlv_0= 'Dataset' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_cible_3_0= ruleCible ) ) ( (lv_predictives_4_0= rulePredictives ) ) otherlv_5= '}' ) ;
    public final EObject ruleDataset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_cible_3_0 = null;

        EObject lv_predictives_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:254:2: ( (otherlv_0= 'Dataset' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_cible_3_0= ruleCible ) ) ( (lv_predictives_4_0= rulePredictives ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:255:2: (otherlv_0= 'Dataset' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_cible_3_0= ruleCible ) ) ( (lv_predictives_4_0= rulePredictives ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:255:2: (otherlv_0= 'Dataset' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_cible_3_0= ruleCible ) ) ( (lv_predictives_4_0= rulePredictives ) ) otherlv_5= '}' )
            // InternalMyDsl.g:256:3: otherlv_0= 'Dataset' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_cible_3_0= ruleCible ) ) ( (lv_predictives_4_0= rulePredictives ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasetAccess().getDatasetKeyword_0());
            		
            // InternalMyDsl.g:260:3: ( (lv_path_1_0= RULE_STRING ) )
            // InternalMyDsl.g:261:4: (lv_path_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:261:4: (lv_path_1_0= RULE_STRING )
            // InternalMyDsl.g:262:5: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

            					newLeafNode(lv_path_1_0, grammarAccess.getDatasetAccess().getPathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getDatasetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:282:3: ( (lv_cible_3_0= ruleCible ) )
            // InternalMyDsl.g:283:4: (lv_cible_3_0= ruleCible )
            {
            // InternalMyDsl.g:283:4: (lv_cible_3_0= ruleCible )
            // InternalMyDsl.g:284:5: lv_cible_3_0= ruleCible
            {

            					newCompositeNode(grammarAccess.getDatasetAccess().getCibleCibleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_cible_3_0=ruleCible();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetRule());
            					}
            					add(
            						current,
            						"cible",
            						lv_cible_3_0,
            						"src.idm_mml.MyDsl.Cible");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:301:3: ( (lv_predictives_4_0= rulePredictives ) )
            // InternalMyDsl.g:302:4: (lv_predictives_4_0= rulePredictives )
            {
            // InternalMyDsl.g:302:4: (lv_predictives_4_0= rulePredictives )
            // InternalMyDsl.g:303:5: lv_predictives_4_0= rulePredictives
            {

            					newCompositeNode(grammarAccess.getDatasetAccess().getPredictivesPredictivesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_predictives_4_0=rulePredictives();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetRule());
            					}
            					add(
            						current,
            						"predictives",
            						lv_predictives_4_0,
            						"src.idm_mml.MyDsl.Predictives");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDatasetAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDataset"


    // $ANTLR start "entryRuleStrategie"
    // InternalMyDsl.g:328:1: entryRuleStrategie returns [EObject current=null] : iv_ruleStrategie= ruleStrategie EOF ;
    public final EObject entryRuleStrategie() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategie = null;


        try {
            // InternalMyDsl.g:328:50: (iv_ruleStrategie= ruleStrategie EOF )
            // InternalMyDsl.g:329:2: iv_ruleStrategie= ruleStrategie EOF
            {
             newCompositeNode(grammarAccess.getStrategieRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStrategie=ruleStrategie();

            state._fsp--;

             current =iv_ruleStrategie; 
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
    // $ANTLR end "entryRuleStrategie"


    // $ANTLR start "ruleStrategie"
    // InternalMyDsl.g:335:1: ruleStrategie returns [EObject current=null] : ( (otherlv_0= 'Strategie' ( (lv_strategie_1_0= ruleValidation ) ) ) | this_CrossValidation_2= ruleCrossValidation ) ;
    public final EObject ruleStrategie() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_strategie_1_0 = null;

        EObject this_CrossValidation_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:341:2: ( ( (otherlv_0= 'Strategie' ( (lv_strategie_1_0= ruleValidation ) ) ) | this_CrossValidation_2= ruleCrossValidation ) )
            // InternalMyDsl.g:342:2: ( (otherlv_0= 'Strategie' ( (lv_strategie_1_0= ruleValidation ) ) ) | this_CrossValidation_2= ruleCrossValidation )
            {
            // InternalMyDsl.g:342:2: ( (otherlv_0= 'Strategie' ( (lv_strategie_1_0= ruleValidation ) ) ) | this_CrossValidation_2= ruleCrossValidation )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:343:3: (otherlv_0= 'Strategie' ( (lv_strategie_1_0= ruleValidation ) ) )
                    {
                    // InternalMyDsl.g:343:3: (otherlv_0= 'Strategie' ( (lv_strategie_1_0= ruleValidation ) ) )
                    // InternalMyDsl.g:344:4: otherlv_0= 'Strategie' ( (lv_strategie_1_0= ruleValidation ) )
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getStrategieAccess().getStrategieKeyword_0_0());
                    			
                    // InternalMyDsl.g:348:4: ( (lv_strategie_1_0= ruleValidation ) )
                    // InternalMyDsl.g:349:5: (lv_strategie_1_0= ruleValidation )
                    {
                    // InternalMyDsl.g:349:5: (lv_strategie_1_0= ruleValidation )
                    // InternalMyDsl.g:350:6: lv_strategie_1_0= ruleValidation
                    {

                    						newCompositeNode(grammarAccess.getStrategieAccess().getStrategieValidationParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_strategie_1_0=ruleValidation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStrategieRule());
                    						}
                    						add(
                    							current,
                    							"strategie",
                    							lv_strategie_1_0,
                    							"src.idm_mml.MyDsl.Validation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:369:3: this_CrossValidation_2= ruleCrossValidation
                    {

                    			newCompositeNode(grammarAccess.getStrategieAccess().getCrossValidationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CrossValidation_2=ruleCrossValidation();

                    state._fsp--;


                    			current = this_CrossValidation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleStrategie"


    // $ANTLR start "entryRuleValidation"
    // InternalMyDsl.g:381:1: entryRuleValidation returns [EObject current=null] : iv_ruleValidation= ruleValidation EOF ;
    public final EObject entryRuleValidation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidation = null;


        try {
            // InternalMyDsl.g:381:51: (iv_ruleValidation= ruleValidation EOF )
            // InternalMyDsl.g:382:2: iv_ruleValidation= ruleValidation EOF
            {
             newCompositeNode(grammarAccess.getValidationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidation=ruleValidation();

            state._fsp--;

             current =iv_ruleValidation; 
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
    // $ANTLR end "entryRuleValidation"


    // $ANTLR start "ruleValidation"
    // InternalMyDsl.g:388:1: ruleValidation returns [EObject current=null] : (otherlv_0= 'Validation' ( (lv_pourcentage_1_0= RULE_INT ) ) ) ;
    public final EObject ruleValidation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_pourcentage_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:394:2: ( (otherlv_0= 'Validation' ( (lv_pourcentage_1_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:395:2: (otherlv_0= 'Validation' ( (lv_pourcentage_1_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:395:2: (otherlv_0= 'Validation' ( (lv_pourcentage_1_0= RULE_INT ) ) )
            // InternalMyDsl.g:396:3: otherlv_0= 'Validation' ( (lv_pourcentage_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getValidationAccess().getValidationKeyword_0());
            		
            // InternalMyDsl.g:400:3: ( (lv_pourcentage_1_0= RULE_INT ) )
            // InternalMyDsl.g:401:4: (lv_pourcentage_1_0= RULE_INT )
            {
            // InternalMyDsl.g:401:4: (lv_pourcentage_1_0= RULE_INT )
            // InternalMyDsl.g:402:5: lv_pourcentage_1_0= RULE_INT
            {
            lv_pourcentage_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_pourcentage_1_0, grammarAccess.getValidationAccess().getPourcentageINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValidationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pourcentage",
            						lv_pourcentage_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleValidation"


    // $ANTLR start "entryRuleCrossValidation"
    // InternalMyDsl.g:422:1: entryRuleCrossValidation returns [EObject current=null] : iv_ruleCrossValidation= ruleCrossValidation EOF ;
    public final EObject entryRuleCrossValidation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossValidation = null;


        try {
            // InternalMyDsl.g:422:56: (iv_ruleCrossValidation= ruleCrossValidation EOF )
            // InternalMyDsl.g:423:2: iv_ruleCrossValidation= ruleCrossValidation EOF
            {
             newCompositeNode(grammarAccess.getCrossValidationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCrossValidation=ruleCrossValidation();

            state._fsp--;

             current =iv_ruleCrossValidation; 
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
    // $ANTLR end "entryRuleCrossValidation"


    // $ANTLR start "ruleCrossValidation"
    // InternalMyDsl.g:429:1: ruleCrossValidation returns [EObject current=null] : ( () otherlv_1= 'CrossValidation' ( (lv_k_2_0= RULE_INT ) )? ) ;
    public final EObject ruleCrossValidation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_k_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:435:2: ( ( () otherlv_1= 'CrossValidation' ( (lv_k_2_0= RULE_INT ) )? ) )
            // InternalMyDsl.g:436:2: ( () otherlv_1= 'CrossValidation' ( (lv_k_2_0= RULE_INT ) )? )
            {
            // InternalMyDsl.g:436:2: ( () otherlv_1= 'CrossValidation' ( (lv_k_2_0= RULE_INT ) )? )
            // InternalMyDsl.g:437:3: () otherlv_1= 'CrossValidation' ( (lv_k_2_0= RULE_INT ) )?
            {
            // InternalMyDsl.g:437:3: ()
            // InternalMyDsl.g:438:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCrossValidationAccess().getCrossValidationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getCrossValidationAccess().getCrossValidationKeyword_1());
            		
            // InternalMyDsl.g:448:3: ( (lv_k_2_0= RULE_INT ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:449:4: (lv_k_2_0= RULE_INT )
                    {
                    // InternalMyDsl.g:449:4: (lv_k_2_0= RULE_INT )
                    // InternalMyDsl.g:450:5: lv_k_2_0= RULE_INT
                    {
                    lv_k_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_k_2_0, grammarAccess.getCrossValidationAccess().getKINTTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCrossValidationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"k",
                    						lv_k_2_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleCrossValidation"


    // $ANTLR start "entryRuleCible"
    // InternalMyDsl.g:470:1: entryRuleCible returns [EObject current=null] : iv_ruleCible= ruleCible EOF ;
    public final EObject entryRuleCible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCible = null;


        try {
            // InternalMyDsl.g:470:46: (iv_ruleCible= ruleCible EOF )
            // InternalMyDsl.g:471:2: iv_ruleCible= ruleCible EOF
            {
             newCompositeNode(grammarAccess.getCibleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCible=ruleCible();

            state._fsp--;

             current =iv_ruleCible; 
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
    // $ANTLR end "entryRuleCible"


    // $ANTLR start "ruleCible"
    // InternalMyDsl.g:477:1: ruleCible returns [EObject current=null] : (otherlv_0= 'Cible' this_idColonne_1= ruleidColonne ) ;
    public final EObject ruleCible() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_idColonne_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:483:2: ( (otherlv_0= 'Cible' this_idColonne_1= ruleidColonne ) )
            // InternalMyDsl.g:484:2: (otherlv_0= 'Cible' this_idColonne_1= ruleidColonne )
            {
            // InternalMyDsl.g:484:2: (otherlv_0= 'Cible' this_idColonne_1= ruleidColonne )
            // InternalMyDsl.g:485:3: otherlv_0= 'Cible' this_idColonne_1= ruleidColonne
            {
            otherlv_0=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getCibleAccess().getCibleKeyword_0());
            		

            			newCompositeNode(grammarAccess.getCibleAccess().getIdColonneParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_idColonne_1=ruleidColonne();

            state._fsp--;


            			current = this_idColonne_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleCible"


    // $ANTLR start "entryRulePredictives"
    // InternalMyDsl.g:501:1: entryRulePredictives returns [EObject current=null] : iv_rulePredictives= rulePredictives EOF ;
    public final EObject entryRulePredictives() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredictives = null;


        try {
            // InternalMyDsl.g:501:52: (iv_rulePredictives= rulePredictives EOF )
            // InternalMyDsl.g:502:2: iv_rulePredictives= rulePredictives EOF
            {
             newCompositeNode(grammarAccess.getPredictivesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredictives=rulePredictives();

            state._fsp--;

             current =iv_rulePredictives; 
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
    // $ANTLR end "entryRulePredictives"


    // $ANTLR start "rulePredictives"
    // InternalMyDsl.g:508:1: rulePredictives returns [EObject current=null] : (otherlv_0= 'Predictives' ( (lv_predictives_1_0= ruleidColonne ) )+ ) ;
    public final EObject rulePredictives() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_predictives_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:514:2: ( (otherlv_0= 'Predictives' ( (lv_predictives_1_0= ruleidColonne ) )+ ) )
            // InternalMyDsl.g:515:2: (otherlv_0= 'Predictives' ( (lv_predictives_1_0= ruleidColonne ) )+ )
            {
            // InternalMyDsl.g:515:2: (otherlv_0= 'Predictives' ( (lv_predictives_1_0= ruleidColonne ) )+ )
            // InternalMyDsl.g:516:3: otherlv_0= 'Predictives' ( (lv_predictives_1_0= ruleidColonne ) )+
            {
            otherlv_0=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getPredictivesAccess().getPredictivesKeyword_0());
            		
            // InternalMyDsl.g:520:3: ( (lv_predictives_1_0= ruleidColonne ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:521:4: (lv_predictives_1_0= ruleidColonne )
            	    {
            	    // InternalMyDsl.g:521:4: (lv_predictives_1_0= ruleidColonne )
            	    // InternalMyDsl.g:522:5: lv_predictives_1_0= ruleidColonne
            	    {

            	    					newCompositeNode(grammarAccess.getPredictivesAccess().getPredictivesIdColonneParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_predictives_1_0=ruleidColonne();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPredictivesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"predictives",
            	    						lv_predictives_1_0,
            	    						"src.idm_mml.MyDsl.idColonne");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


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
    // $ANTLR end "rulePredictives"


    // $ANTLR start "entryRuleidColonne"
    // InternalMyDsl.g:543:1: entryRuleidColonne returns [EObject current=null] : iv_ruleidColonne= ruleidColonne EOF ;
    public final EObject entryRuleidColonne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidColonne = null;


        try {
            // InternalMyDsl.g:543:50: (iv_ruleidColonne= ruleidColonne EOF )
            // InternalMyDsl.g:544:2: iv_ruleidColonne= ruleidColonne EOF
            {
             newCompositeNode(grammarAccess.getIdColonneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleidColonne=ruleidColonne();

            state._fsp--;

             current =iv_ruleidColonne; 
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
    // $ANTLR end "entryRuleidColonne"


    // $ANTLR start "ruleidColonne"
    // InternalMyDsl.g:550:1: ruleidColonne returns [EObject current=null] : (otherlv_0= 'Colonne' ( (lv_id_1_0= RULE_INT ) ) ) ;
    public final EObject ruleidColonne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:556:2: ( (otherlv_0= 'Colonne' ( (lv_id_1_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:557:2: (otherlv_0= 'Colonne' ( (lv_id_1_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:557:2: (otherlv_0= 'Colonne' ( (lv_id_1_0= RULE_INT ) ) )
            // InternalMyDsl.g:558:3: otherlv_0= 'Colonne' ( (lv_id_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getIdColonneAccess().getColonneKeyword_0());
            		
            // InternalMyDsl.g:562:3: ( (lv_id_1_0= RULE_INT ) )
            // InternalMyDsl.g:563:4: (lv_id_1_0= RULE_INT )
            {
            // InternalMyDsl.g:563:4: (lv_id_1_0= RULE_INT )
            // InternalMyDsl.g:564:5: lv_id_1_0= RULE_INT
            {
            lv_id_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_id_1_0, grammarAccess.getIdColonneAccess().getIdINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdColonneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleidColonne"


    // $ANTLR start "entryRuleAlgorithme"
    // InternalMyDsl.g:584:1: entryRuleAlgorithme returns [EObject current=null] : iv_ruleAlgorithme= ruleAlgorithme EOF ;
    public final EObject entryRuleAlgorithme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithme = null;


        try {
            // InternalMyDsl.g:584:51: (iv_ruleAlgorithme= ruleAlgorithme EOF )
            // InternalMyDsl.g:585:2: iv_ruleAlgorithme= ruleAlgorithme EOF
            {
             newCompositeNode(grammarAccess.getAlgorithmeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgorithme=ruleAlgorithme();

            state._fsp--;

             current =iv_ruleAlgorithme; 
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
    // $ANTLR end "entryRuleAlgorithme"


    // $ANTLR start "ruleAlgorithme"
    // InternalMyDsl.g:591:1: ruleAlgorithme returns [EObject current=null] : (otherlv_0= 'Algorithme' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAlgorithme() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:597:2: ( (otherlv_0= 'Algorithme' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:598:2: (otherlv_0= 'Algorithme' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:598:2: (otherlv_0= 'Algorithme' ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:599:3: otherlv_0= 'Algorithme' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAlgorithmeAccess().getAlgorithmeKeyword_0());
            		
            // InternalMyDsl.g:603:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalMyDsl.g:604:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:604:4: (lv_text_1_0= RULE_STRING )
            // InternalMyDsl.g:605:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getAlgorithmeAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlgorithmeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleAlgorithme"


    // $ANTLR start "entryRuleMetrique"
    // InternalMyDsl.g:625:1: entryRuleMetrique returns [EObject current=null] : iv_ruleMetrique= ruleMetrique EOF ;
    public final EObject entryRuleMetrique() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetrique = null;


        try {
            // InternalMyDsl.g:625:49: (iv_ruleMetrique= ruleMetrique EOF )
            // InternalMyDsl.g:626:2: iv_ruleMetrique= ruleMetrique EOF
            {
             newCompositeNode(grammarAccess.getMetriqueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetrique=ruleMetrique();

            state._fsp--;

             current =iv_ruleMetrique; 
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
    // $ANTLR end "entryRuleMetrique"


    // $ANTLR start "ruleMetrique"
    // InternalMyDsl.g:632:1: ruleMetrique returns [EObject current=null] : (otherlv_0= 'Metrique' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMetrique() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:638:2: ( (otherlv_0= 'Metrique' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:639:2: (otherlv_0= 'Metrique' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:639:2: (otherlv_0= 'Metrique' ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:640:3: otherlv_0= 'Metrique' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getMetriqueAccess().getMetriqueKeyword_0());
            		
            // InternalMyDsl.g:644:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalMyDsl.g:645:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:645:4: (lv_text_1_0= RULE_STRING )
            // InternalMyDsl.g:646:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getMetriqueAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetriqueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleMetrique"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800002L});

}