package src.idm_mml.ide.contentassist.antlr.internal;

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
import src.idm_mml.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMML"
    // InternalMyDsl.g:53:1: entryRuleMML : ruleMML EOF ;
    public final void entryRuleMML() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleMML EOF )
            // InternalMyDsl.g:55:1: ruleMML EOF
            {
             before(grammarAccess.getMMLRule()); 
            pushFollow(FOLLOW_1);
            ruleMML();

            state._fsp--;

             after(grammarAccess.getMMLRule()); 
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
    // $ANTLR end "entryRuleMML"


    // $ANTLR start "ruleMML"
    // InternalMyDsl.g:62:1: ruleMML : ( ( rule__MML__Group__0 ) ) ;
    public final void ruleMML() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__MML__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__MML__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__MML__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__MML__Group__0 )
            {
             before(grammarAccess.getMMLAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__MML__Group__0 )
            // InternalMyDsl.g:69:4: rule__MML__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MML__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMMLAccess().getGroup()); 

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
    // $ANTLR end "ruleMML"


    // $ANTLR start "entryRuleImplementation"
    // InternalMyDsl.g:78:1: entryRuleImplementation : ruleImplementation EOF ;
    public final void entryRuleImplementation() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleImplementation EOF )
            // InternalMyDsl.g:80:1: ruleImplementation EOF
            {
             before(grammarAccess.getImplementationRule()); 
            pushFollow(FOLLOW_1);
            ruleImplementation();

            state._fsp--;

             after(grammarAccess.getImplementationRule()); 
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
    // $ANTLR end "entryRuleImplementation"


    // $ANTLR start "ruleImplementation"
    // InternalMyDsl.g:87:1: ruleImplementation : ( ( rule__Implementation__Alternatives ) ) ;
    public final void ruleImplementation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Implementation__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Implementation__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Implementation__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Implementation__Alternatives )
            {
             before(grammarAccess.getImplementationAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Implementation__Alternatives )
            // InternalMyDsl.g:94:4: rule__Implementation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Implementation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getImplementationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleImplementation"


    // $ANTLR start "entryRuleDataset"
    // InternalMyDsl.g:103:1: entryRuleDataset : ruleDataset EOF ;
    public final void entryRuleDataset() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleDataset EOF )
            // InternalMyDsl.g:105:1: ruleDataset EOF
            {
             before(grammarAccess.getDatasetRule()); 
            pushFollow(FOLLOW_1);
            ruleDataset();

            state._fsp--;

             after(grammarAccess.getDatasetRule()); 
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
    // $ANTLR end "entryRuleDataset"


    // $ANTLR start "ruleDataset"
    // InternalMyDsl.g:112:1: ruleDataset : ( ( rule__Dataset__Group__0 ) ) ;
    public final void ruleDataset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Dataset__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Dataset__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Dataset__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Dataset__Group__0 )
            {
             before(grammarAccess.getDatasetAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Dataset__Group__0 )
            // InternalMyDsl.g:119:4: rule__Dataset__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dataset__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatasetAccess().getGroup()); 

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
    // $ANTLR end "ruleDataset"


    // $ANTLR start "entryRuleStrategie"
    // InternalMyDsl.g:128:1: entryRuleStrategie : ruleStrategie EOF ;
    public final void entryRuleStrategie() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleStrategie EOF )
            // InternalMyDsl.g:130:1: ruleStrategie EOF
            {
             before(grammarAccess.getStrategieRule()); 
            pushFollow(FOLLOW_1);
            ruleStrategie();

            state._fsp--;

             after(grammarAccess.getStrategieRule()); 
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
    // $ANTLR end "entryRuleStrategie"


    // $ANTLR start "ruleStrategie"
    // InternalMyDsl.g:137:1: ruleStrategie : ( ( rule__Strategie__Alternatives ) ) ;
    public final void ruleStrategie() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Strategie__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Strategie__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Strategie__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__Strategie__Alternatives )
            {
             before(grammarAccess.getStrategieAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__Strategie__Alternatives )
            // InternalMyDsl.g:144:4: rule__Strategie__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Strategie__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStrategieAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStrategie"


    // $ANTLR start "entryRuleValidation"
    // InternalMyDsl.g:153:1: entryRuleValidation : ruleValidation EOF ;
    public final void entryRuleValidation() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleValidation EOF )
            // InternalMyDsl.g:155:1: ruleValidation EOF
            {
             before(grammarAccess.getValidationRule()); 
            pushFollow(FOLLOW_1);
            ruleValidation();

            state._fsp--;

             after(grammarAccess.getValidationRule()); 
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
    // $ANTLR end "entryRuleValidation"


    // $ANTLR start "ruleValidation"
    // InternalMyDsl.g:162:1: ruleValidation : ( ( rule__Validation__Group__0 ) ) ;
    public final void ruleValidation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Validation__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Validation__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Validation__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Validation__Group__0 )
            {
             before(grammarAccess.getValidationAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Validation__Group__0 )
            // InternalMyDsl.g:169:4: rule__Validation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Validation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValidationAccess().getGroup()); 

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
    // $ANTLR end "ruleValidation"


    // $ANTLR start "entryRuleCrossValidation"
    // InternalMyDsl.g:178:1: entryRuleCrossValidation : ruleCrossValidation EOF ;
    public final void entryRuleCrossValidation() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleCrossValidation EOF )
            // InternalMyDsl.g:180:1: ruleCrossValidation EOF
            {
             before(grammarAccess.getCrossValidationRule()); 
            pushFollow(FOLLOW_1);
            ruleCrossValidation();

            state._fsp--;

             after(grammarAccess.getCrossValidationRule()); 
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
    // $ANTLR end "entryRuleCrossValidation"


    // $ANTLR start "ruleCrossValidation"
    // InternalMyDsl.g:187:1: ruleCrossValidation : ( ( rule__CrossValidation__Group__0 ) ) ;
    public final void ruleCrossValidation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__CrossValidation__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__CrossValidation__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__CrossValidation__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__CrossValidation__Group__0 )
            {
             before(grammarAccess.getCrossValidationAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__CrossValidation__Group__0 )
            // InternalMyDsl.g:194:4: rule__CrossValidation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CrossValidation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCrossValidationAccess().getGroup()); 

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
    // $ANTLR end "ruleCrossValidation"


    // $ANTLR start "entryRuleCible"
    // InternalMyDsl.g:203:1: entryRuleCible : ruleCible EOF ;
    public final void entryRuleCible() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleCible EOF )
            // InternalMyDsl.g:205:1: ruleCible EOF
            {
             before(grammarAccess.getCibleRule()); 
            pushFollow(FOLLOW_1);
            ruleCible();

            state._fsp--;

             after(grammarAccess.getCibleRule()); 
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
    // $ANTLR end "entryRuleCible"


    // $ANTLR start "ruleCible"
    // InternalMyDsl.g:212:1: ruleCible : ( ( rule__Cible__Group__0 ) ) ;
    public final void ruleCible() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Cible__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Cible__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Cible__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Cible__Group__0 )
            {
             before(grammarAccess.getCibleAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Cible__Group__0 )
            // InternalMyDsl.g:219:4: rule__Cible__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cible__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCibleAccess().getGroup()); 

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
    // $ANTLR end "ruleCible"


    // $ANTLR start "entryRulePredictives"
    // InternalMyDsl.g:228:1: entryRulePredictives : rulePredictives EOF ;
    public final void entryRulePredictives() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( rulePredictives EOF )
            // InternalMyDsl.g:230:1: rulePredictives EOF
            {
             before(grammarAccess.getPredictivesRule()); 
            pushFollow(FOLLOW_1);
            rulePredictives();

            state._fsp--;

             after(grammarAccess.getPredictivesRule()); 
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
    // $ANTLR end "entryRulePredictives"


    // $ANTLR start "rulePredictives"
    // InternalMyDsl.g:237:1: rulePredictives : ( ( rule__Predictives__Group__0 ) ) ;
    public final void rulePredictives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Predictives__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Predictives__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Predictives__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Predictives__Group__0 )
            {
             before(grammarAccess.getPredictivesAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Predictives__Group__0 )
            // InternalMyDsl.g:244:4: rule__Predictives__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Predictives__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredictivesAccess().getGroup()); 

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
    // $ANTLR end "rulePredictives"


    // $ANTLR start "entryRuleidColonne"
    // InternalMyDsl.g:253:1: entryRuleidColonne : ruleidColonne EOF ;
    public final void entryRuleidColonne() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleidColonne EOF )
            // InternalMyDsl.g:255:1: ruleidColonne EOF
            {
             before(grammarAccess.getIdColonneRule()); 
            pushFollow(FOLLOW_1);
            ruleidColonne();

            state._fsp--;

             after(grammarAccess.getIdColonneRule()); 
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
    // $ANTLR end "entryRuleidColonne"


    // $ANTLR start "ruleidColonne"
    // InternalMyDsl.g:262:1: ruleidColonne : ( ( rule__IdColonne__Group__0 ) ) ;
    public final void ruleidColonne() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__IdColonne__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__IdColonne__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__IdColonne__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__IdColonne__Group__0 )
            {
             before(grammarAccess.getIdColonneAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__IdColonne__Group__0 )
            // InternalMyDsl.g:269:4: rule__IdColonne__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IdColonne__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIdColonneAccess().getGroup()); 

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
    // $ANTLR end "ruleidColonne"


    // $ANTLR start "entryRuleAlgorithme"
    // InternalMyDsl.g:278:1: entryRuleAlgorithme : ruleAlgorithme EOF ;
    public final void entryRuleAlgorithme() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleAlgorithme EOF )
            // InternalMyDsl.g:280:1: ruleAlgorithme EOF
            {
             before(grammarAccess.getAlgorithmeRule()); 
            pushFollow(FOLLOW_1);
            ruleAlgorithme();

            state._fsp--;

             after(grammarAccess.getAlgorithmeRule()); 
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
    // $ANTLR end "entryRuleAlgorithme"


    // $ANTLR start "ruleAlgorithme"
    // InternalMyDsl.g:287:1: ruleAlgorithme : ( ( rule__Algorithme__Group__0 ) ) ;
    public final void ruleAlgorithme() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Algorithme__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Algorithme__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Algorithme__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Algorithme__Group__0 )
            {
             before(grammarAccess.getAlgorithmeAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Algorithme__Group__0 )
            // InternalMyDsl.g:294:4: rule__Algorithme__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Algorithme__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmeAccess().getGroup()); 

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
    // $ANTLR end "ruleAlgorithme"


    // $ANTLR start "entryRuleMetrique"
    // InternalMyDsl.g:303:1: entryRuleMetrique : ruleMetrique EOF ;
    public final void entryRuleMetrique() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleMetrique EOF )
            // InternalMyDsl.g:305:1: ruleMetrique EOF
            {
             before(grammarAccess.getMetriqueRule()); 
            pushFollow(FOLLOW_1);
            ruleMetrique();

            state._fsp--;

             after(grammarAccess.getMetriqueRule()); 
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
    // $ANTLR end "entryRuleMetrique"


    // $ANTLR start "ruleMetrique"
    // InternalMyDsl.g:312:1: ruleMetrique : ( ( rule__Metrique__Group__0 ) ) ;
    public final void ruleMetrique() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Metrique__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Metrique__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Metrique__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Metrique__Group__0 )
            {
             before(grammarAccess.getMetriqueAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Metrique__Group__0 )
            // InternalMyDsl.g:319:4: rule__Metrique__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Metrique__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetriqueAccess().getGroup()); 

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
    // $ANTLR end "ruleMetrique"


    // $ANTLR start "rule__Implementation__Alternatives"
    // InternalMyDsl.g:327:1: rule__Implementation__Alternatives : ( ( ( rule__Implementation__Group_0__0 ) ) | ( ( rule__Implementation__Group_1__0 ) ) );
    public final void rule__Implementation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:331:1: ( ( ( rule__Implementation__Group_0__0 ) ) | ( ( rule__Implementation__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:332:2: ( ( rule__Implementation__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:332:2: ( ( rule__Implementation__Group_0__0 ) )
                    // InternalMyDsl.g:333:3: ( rule__Implementation__Group_0__0 )
                    {
                     before(grammarAccess.getImplementationAccess().getGroup_0()); 
                    // InternalMyDsl.g:334:3: ( rule__Implementation__Group_0__0 )
                    // InternalMyDsl.g:334:4: rule__Implementation__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Implementation__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImplementationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:338:2: ( ( rule__Implementation__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:338:2: ( ( rule__Implementation__Group_1__0 ) )
                    // InternalMyDsl.g:339:3: ( rule__Implementation__Group_1__0 )
                    {
                     before(grammarAccess.getImplementationAccess().getGroup_1()); 
                    // InternalMyDsl.g:340:3: ( rule__Implementation__Group_1__0 )
                    // InternalMyDsl.g:340:4: rule__Implementation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Implementation__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImplementationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Implementation__Alternatives"


    // $ANTLR start "rule__Strategie__Alternatives"
    // InternalMyDsl.g:348:1: rule__Strategie__Alternatives : ( ( ( rule__Strategie__Group_0__0 ) ) | ( ruleCrossValidation ) );
    public final void rule__Strategie__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:352:1: ( ( ( rule__Strategie__Group_0__0 ) ) | ( ruleCrossValidation ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:353:2: ( ( rule__Strategie__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:353:2: ( ( rule__Strategie__Group_0__0 ) )
                    // InternalMyDsl.g:354:3: ( rule__Strategie__Group_0__0 )
                    {
                     before(grammarAccess.getStrategieAccess().getGroup_0()); 
                    // InternalMyDsl.g:355:3: ( rule__Strategie__Group_0__0 )
                    // InternalMyDsl.g:355:4: rule__Strategie__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Strategie__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStrategieAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:359:2: ( ruleCrossValidation )
                    {
                    // InternalMyDsl.g:359:2: ( ruleCrossValidation )
                    // InternalMyDsl.g:360:3: ruleCrossValidation
                    {
                     before(grammarAccess.getStrategieAccess().getCrossValidationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCrossValidation();

                    state._fsp--;

                     after(grammarAccess.getStrategieAccess().getCrossValidationParserRuleCall_1()); 

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
    // $ANTLR end "rule__Strategie__Alternatives"


    // $ANTLR start "rule__MML__Group__0"
    // InternalMyDsl.g:369:1: rule__MML__Group__0 : rule__MML__Group__0__Impl rule__MML__Group__1 ;
    public final void rule__MML__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:373:1: ( rule__MML__Group__0__Impl rule__MML__Group__1 )
            // InternalMyDsl.g:374:2: rule__MML__Group__0__Impl rule__MML__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MML__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MML__Group__1();

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
    // $ANTLR end "rule__MML__Group__0"


    // $ANTLR start "rule__MML__Group__0__Impl"
    // InternalMyDsl.g:381:1: rule__MML__Group__0__Impl : ( 'MML' ) ;
    public final void rule__MML__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:385:1: ( ( 'MML' ) )
            // InternalMyDsl.g:386:1: ( 'MML' )
            {
            // InternalMyDsl.g:386:1: ( 'MML' )
            // InternalMyDsl.g:387:2: 'MML'
            {
             before(grammarAccess.getMMLAccess().getMMLKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMMLAccess().getMMLKeyword_0()); 

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
    // $ANTLR end "rule__MML__Group__0__Impl"


    // $ANTLR start "rule__MML__Group__1"
    // InternalMyDsl.g:396:1: rule__MML__Group__1 : rule__MML__Group__1__Impl rule__MML__Group__2 ;
    public final void rule__MML__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:400:1: ( rule__MML__Group__1__Impl rule__MML__Group__2 )
            // InternalMyDsl.g:401:2: rule__MML__Group__1__Impl rule__MML__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MML__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MML__Group__2();

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
    // $ANTLR end "rule__MML__Group__1"


    // $ANTLR start "rule__MML__Group__1__Impl"
    // InternalMyDsl.g:408:1: rule__MML__Group__1__Impl : ( '{' ) ;
    public final void rule__MML__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:412:1: ( ( '{' ) )
            // InternalMyDsl.g:413:1: ( '{' )
            {
            // InternalMyDsl.g:413:1: ( '{' )
            // InternalMyDsl.g:414:2: '{'
            {
             before(grammarAccess.getMMLAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMMLAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__MML__Group__1__Impl"


    // $ANTLR start "rule__MML__Group__2"
    // InternalMyDsl.g:423:1: rule__MML__Group__2 : rule__MML__Group__2__Impl rule__MML__Group__3 ;
    public final void rule__MML__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:427:1: ( rule__MML__Group__2__Impl rule__MML__Group__3 )
            // InternalMyDsl.g:428:2: rule__MML__Group__2__Impl rule__MML__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MML__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MML__Group__3();

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
    // $ANTLR end "rule__MML__Group__2"


    // $ANTLR start "rule__MML__Group__2__Impl"
    // InternalMyDsl.g:435:1: rule__MML__Group__2__Impl : ( ( ( rule__MML__MmlAssignment_2 ) ) ( ( rule__MML__MmlAssignment_2 )* ) ) ;
    public final void rule__MML__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:439:1: ( ( ( ( rule__MML__MmlAssignment_2 ) ) ( ( rule__MML__MmlAssignment_2 )* ) ) )
            // InternalMyDsl.g:440:1: ( ( ( rule__MML__MmlAssignment_2 ) ) ( ( rule__MML__MmlAssignment_2 )* ) )
            {
            // InternalMyDsl.g:440:1: ( ( ( rule__MML__MmlAssignment_2 ) ) ( ( rule__MML__MmlAssignment_2 )* ) )
            // InternalMyDsl.g:441:2: ( ( rule__MML__MmlAssignment_2 ) ) ( ( rule__MML__MmlAssignment_2 )* )
            {
            // InternalMyDsl.g:441:2: ( ( rule__MML__MmlAssignment_2 ) )
            // InternalMyDsl.g:442:3: ( rule__MML__MmlAssignment_2 )
            {
             before(grammarAccess.getMMLAccess().getMmlAssignment_2()); 
            // InternalMyDsl.g:443:3: ( rule__MML__MmlAssignment_2 )
            // InternalMyDsl.g:443:4: rule__MML__MmlAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__MML__MmlAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMMLAccess().getMmlAssignment_2()); 

            }

            // InternalMyDsl.g:446:2: ( ( rule__MML__MmlAssignment_2 )* )
            // InternalMyDsl.g:447:3: ( rule__MML__MmlAssignment_2 )*
            {
             before(grammarAccess.getMMLAccess().getMmlAssignment_2()); 
            // InternalMyDsl.g:448:3: ( rule__MML__MmlAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14||LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:448:4: rule__MML__MmlAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__MML__MmlAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getMMLAccess().getMmlAssignment_2()); 

            }


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
    // $ANTLR end "rule__MML__Group__2__Impl"


    // $ANTLR start "rule__MML__Group__3"
    // InternalMyDsl.g:457:1: rule__MML__Group__3 : rule__MML__Group__3__Impl rule__MML__Group__4 ;
    public final void rule__MML__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:461:1: ( rule__MML__Group__3__Impl rule__MML__Group__4 )
            // InternalMyDsl.g:462:2: rule__MML__Group__3__Impl rule__MML__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__MML__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MML__Group__4();

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
    // $ANTLR end "rule__MML__Group__3"


    // $ANTLR start "rule__MML__Group__3__Impl"
    // InternalMyDsl.g:469:1: rule__MML__Group__3__Impl : ( ( ( rule__MML__MmlAssignment_3 ) ) ( ( rule__MML__MmlAssignment_3 )* ) ) ;
    public final void rule__MML__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:473:1: ( ( ( ( rule__MML__MmlAssignment_3 ) ) ( ( rule__MML__MmlAssignment_3 )* ) ) )
            // InternalMyDsl.g:474:1: ( ( ( rule__MML__MmlAssignment_3 ) ) ( ( rule__MML__MmlAssignment_3 )* ) )
            {
            // InternalMyDsl.g:474:1: ( ( ( rule__MML__MmlAssignment_3 ) ) ( ( rule__MML__MmlAssignment_3 )* ) )
            // InternalMyDsl.g:475:2: ( ( rule__MML__MmlAssignment_3 ) ) ( ( rule__MML__MmlAssignment_3 )* )
            {
            // InternalMyDsl.g:475:2: ( ( rule__MML__MmlAssignment_3 ) )
            // InternalMyDsl.g:476:3: ( rule__MML__MmlAssignment_3 )
            {
             before(grammarAccess.getMMLAccess().getMmlAssignment_3()); 
            // InternalMyDsl.g:477:3: ( rule__MML__MmlAssignment_3 )
            // InternalMyDsl.g:477:4: rule__MML__MmlAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__MML__MmlAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMMLAccess().getMmlAssignment_3()); 

            }

            // InternalMyDsl.g:480:2: ( ( rule__MML__MmlAssignment_3 )* )
            // InternalMyDsl.g:481:3: ( rule__MML__MmlAssignment_3 )*
            {
             before(grammarAccess.getMMLAccess().getMmlAssignment_3()); 
            // InternalMyDsl.g:482:3: ( rule__MML__MmlAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:482:4: rule__MML__MmlAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MML__MmlAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getMMLAccess().getMmlAssignment_3()); 

            }


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
    // $ANTLR end "rule__MML__Group__3__Impl"


    // $ANTLR start "rule__MML__Group__4"
    // InternalMyDsl.g:491:1: rule__MML__Group__4 : rule__MML__Group__4__Impl ;
    public final void rule__MML__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:495:1: ( rule__MML__Group__4__Impl )
            // InternalMyDsl.g:496:2: rule__MML__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MML__Group__4__Impl();

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
    // $ANTLR end "rule__MML__Group__4"


    // $ANTLR start "rule__MML__Group__4__Impl"
    // InternalMyDsl.g:502:1: rule__MML__Group__4__Impl : ( '}' ) ;
    public final void rule__MML__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:506:1: ( ( '}' ) )
            // InternalMyDsl.g:507:1: ( '}' )
            {
            // InternalMyDsl.g:507:1: ( '}' )
            // InternalMyDsl.g:508:2: '}'
            {
             before(grammarAccess.getMMLAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMMLAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__MML__Group__4__Impl"


    // $ANTLR start "rule__Implementation__Group_0__0"
    // InternalMyDsl.g:518:1: rule__Implementation__Group_0__0 : rule__Implementation__Group_0__0__Impl rule__Implementation__Group_0__1 ;
    public final void rule__Implementation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:522:1: ( rule__Implementation__Group_0__0__Impl rule__Implementation__Group_0__1 )
            // InternalMyDsl.g:523:2: rule__Implementation__Group_0__0__Impl rule__Implementation__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Implementation__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Implementation__Group_0__1();

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
    // $ANTLR end "rule__Implementation__Group_0__0"


    // $ANTLR start "rule__Implementation__Group_0__0__Impl"
    // InternalMyDsl.g:530:1: rule__Implementation__Group_0__0__Impl : ( () ) ;
    public final void rule__Implementation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:534:1: ( ( () ) )
            // InternalMyDsl.g:535:1: ( () )
            {
            // InternalMyDsl.g:535:1: ( () )
            // InternalMyDsl.g:536:2: ()
            {
             before(grammarAccess.getImplementationAccess().getImplementationAction_0_0()); 
            // InternalMyDsl.g:537:2: ()
            // InternalMyDsl.g:537:3: 
            {
            }

             after(grammarAccess.getImplementationAccess().getImplementationAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implementation__Group_0__0__Impl"


    // $ANTLR start "rule__Implementation__Group_0__1"
    // InternalMyDsl.g:545:1: rule__Implementation__Group_0__1 : rule__Implementation__Group_0__1__Impl rule__Implementation__Group_0__2 ;
    public final void rule__Implementation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:549:1: ( rule__Implementation__Group_0__1__Impl rule__Implementation__Group_0__2 )
            // InternalMyDsl.g:550:2: rule__Implementation__Group_0__1__Impl rule__Implementation__Group_0__2
            {
            pushFollow(FOLLOW_10);
            rule__Implementation__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Implementation__Group_0__2();

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
    // $ANTLR end "rule__Implementation__Group_0__1"


    // $ANTLR start "rule__Implementation__Group_0__1__Impl"
    // InternalMyDsl.g:557:1: rule__Implementation__Group_0__1__Impl : ( 'Implementation' ) ;
    public final void rule__Implementation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:561:1: ( ( 'Implementation' ) )
            // InternalMyDsl.g:562:1: ( 'Implementation' )
            {
            // InternalMyDsl.g:562:1: ( 'Implementation' )
            // InternalMyDsl.g:563:2: 'Implementation'
            {
             before(grammarAccess.getImplementationAccess().getImplementationKeyword_0_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getImplementationAccess().getImplementationKeyword_0_1()); 

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
    // $ANTLR end "rule__Implementation__Group_0__1__Impl"


    // $ANTLR start "rule__Implementation__Group_0__2"
    // InternalMyDsl.g:572:1: rule__Implementation__Group_0__2 : rule__Implementation__Group_0__2__Impl ;
    public final void rule__Implementation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:576:1: ( rule__Implementation__Group_0__2__Impl )
            // InternalMyDsl.g:577:2: rule__Implementation__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Implementation__Group_0__2__Impl();

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
    // $ANTLR end "rule__Implementation__Group_0__2"


    // $ANTLR start "rule__Implementation__Group_0__2__Impl"
    // InternalMyDsl.g:583:1: rule__Implementation__Group_0__2__Impl : ( 'Scikit-learn' ) ;
    public final void rule__Implementation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:587:1: ( ( 'Scikit-learn' ) )
            // InternalMyDsl.g:588:1: ( 'Scikit-learn' )
            {
            // InternalMyDsl.g:588:1: ( 'Scikit-learn' )
            // InternalMyDsl.g:589:2: 'Scikit-learn'
            {
             before(grammarAccess.getImplementationAccess().getScikitLearnKeyword_0_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getImplementationAccess().getScikitLearnKeyword_0_2()); 

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
    // $ANTLR end "rule__Implementation__Group_0__2__Impl"


    // $ANTLR start "rule__Implementation__Group_1__0"
    // InternalMyDsl.g:599:1: rule__Implementation__Group_1__0 : rule__Implementation__Group_1__0__Impl rule__Implementation__Group_1__1 ;
    public final void rule__Implementation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:603:1: ( rule__Implementation__Group_1__0__Impl rule__Implementation__Group_1__1 )
            // InternalMyDsl.g:604:2: rule__Implementation__Group_1__0__Impl rule__Implementation__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Implementation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Implementation__Group_1__1();

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
    // $ANTLR end "rule__Implementation__Group_1__0"


    // $ANTLR start "rule__Implementation__Group_1__0__Impl"
    // InternalMyDsl.g:611:1: rule__Implementation__Group_1__0__Impl : ( 'Weka' ) ;
    public final void rule__Implementation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:615:1: ( ( 'Weka' ) )
            // InternalMyDsl.g:616:1: ( 'Weka' )
            {
            // InternalMyDsl.g:616:1: ( 'Weka' )
            // InternalMyDsl.g:617:2: 'Weka'
            {
             before(grammarAccess.getImplementationAccess().getWekaKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getImplementationAccess().getWekaKeyword_1_0()); 

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
    // $ANTLR end "rule__Implementation__Group_1__0__Impl"


    // $ANTLR start "rule__Implementation__Group_1__1"
    // InternalMyDsl.g:626:1: rule__Implementation__Group_1__1 : rule__Implementation__Group_1__1__Impl rule__Implementation__Group_1__2 ;
    public final void rule__Implementation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:630:1: ( rule__Implementation__Group_1__1__Impl rule__Implementation__Group_1__2 )
            // InternalMyDsl.g:631:2: rule__Implementation__Group_1__1__Impl rule__Implementation__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__Implementation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Implementation__Group_1__2();

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
    // $ANTLR end "rule__Implementation__Group_1__1"


    // $ANTLR start "rule__Implementation__Group_1__1__Impl"
    // InternalMyDsl.g:638:1: rule__Implementation__Group_1__1__Impl : ( '{' ) ;
    public final void rule__Implementation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:642:1: ( ( '{' ) )
            // InternalMyDsl.g:643:1: ( '{' )
            {
            // InternalMyDsl.g:643:1: ( '{' )
            // InternalMyDsl.g:644:2: '{'
            {
             before(grammarAccess.getImplementationAccess().getLeftCurlyBracketKeyword_1_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getImplementationAccess().getLeftCurlyBracketKeyword_1_1()); 

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
    // $ANTLR end "rule__Implementation__Group_1__1__Impl"


    // $ANTLR start "rule__Implementation__Group_1__2"
    // InternalMyDsl.g:653:1: rule__Implementation__Group_1__2 : rule__Implementation__Group_1__2__Impl rule__Implementation__Group_1__3 ;
    public final void rule__Implementation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:657:1: ( rule__Implementation__Group_1__2__Impl rule__Implementation__Group_1__3 )
            // InternalMyDsl.g:658:2: rule__Implementation__Group_1__2__Impl rule__Implementation__Group_1__3
            {
            pushFollow(FOLLOW_12);
            rule__Implementation__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Implementation__Group_1__3();

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
    // $ANTLR end "rule__Implementation__Group_1__2"


    // $ANTLR start "rule__Implementation__Group_1__2__Impl"
    // InternalMyDsl.g:665:1: rule__Implementation__Group_1__2__Impl : ( ( rule__Implementation__AlgoAssignment_1_2 ) ) ;
    public final void rule__Implementation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:669:1: ( ( ( rule__Implementation__AlgoAssignment_1_2 ) ) )
            // InternalMyDsl.g:670:1: ( ( rule__Implementation__AlgoAssignment_1_2 ) )
            {
            // InternalMyDsl.g:670:1: ( ( rule__Implementation__AlgoAssignment_1_2 ) )
            // InternalMyDsl.g:671:2: ( rule__Implementation__AlgoAssignment_1_2 )
            {
             before(grammarAccess.getImplementationAccess().getAlgoAssignment_1_2()); 
            // InternalMyDsl.g:672:2: ( rule__Implementation__AlgoAssignment_1_2 )
            // InternalMyDsl.g:672:3: rule__Implementation__AlgoAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Implementation__AlgoAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getImplementationAccess().getAlgoAssignment_1_2()); 

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
    // $ANTLR end "rule__Implementation__Group_1__2__Impl"


    // $ANTLR start "rule__Implementation__Group_1__3"
    // InternalMyDsl.g:680:1: rule__Implementation__Group_1__3 : rule__Implementation__Group_1__3__Impl rule__Implementation__Group_1__4 ;
    public final void rule__Implementation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:684:1: ( rule__Implementation__Group_1__3__Impl rule__Implementation__Group_1__4 )
            // InternalMyDsl.g:685:2: rule__Implementation__Group_1__3__Impl rule__Implementation__Group_1__4
            {
            pushFollow(FOLLOW_13);
            rule__Implementation__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Implementation__Group_1__4();

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
    // $ANTLR end "rule__Implementation__Group_1__3"


    // $ANTLR start "rule__Implementation__Group_1__3__Impl"
    // InternalMyDsl.g:692:1: rule__Implementation__Group_1__3__Impl : ( ( rule__Implementation__MetriqueAssignment_1_3 ) ) ;
    public final void rule__Implementation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:696:1: ( ( ( rule__Implementation__MetriqueAssignment_1_3 ) ) )
            // InternalMyDsl.g:697:1: ( ( rule__Implementation__MetriqueAssignment_1_3 ) )
            {
            // InternalMyDsl.g:697:1: ( ( rule__Implementation__MetriqueAssignment_1_3 ) )
            // InternalMyDsl.g:698:2: ( rule__Implementation__MetriqueAssignment_1_3 )
            {
             before(grammarAccess.getImplementationAccess().getMetriqueAssignment_1_3()); 
            // InternalMyDsl.g:699:2: ( rule__Implementation__MetriqueAssignment_1_3 )
            // InternalMyDsl.g:699:3: rule__Implementation__MetriqueAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Implementation__MetriqueAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getImplementationAccess().getMetriqueAssignment_1_3()); 

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
    // $ANTLR end "rule__Implementation__Group_1__3__Impl"


    // $ANTLR start "rule__Implementation__Group_1__4"
    // InternalMyDsl.g:707:1: rule__Implementation__Group_1__4 : rule__Implementation__Group_1__4__Impl rule__Implementation__Group_1__5 ;
    public final void rule__Implementation__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:711:1: ( rule__Implementation__Group_1__4__Impl rule__Implementation__Group_1__5 )
            // InternalMyDsl.g:712:2: rule__Implementation__Group_1__4__Impl rule__Implementation__Group_1__5
            {
            pushFollow(FOLLOW_7);
            rule__Implementation__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Implementation__Group_1__5();

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
    // $ANTLR end "rule__Implementation__Group_1__4"


    // $ANTLR start "rule__Implementation__Group_1__4__Impl"
    // InternalMyDsl.g:719:1: rule__Implementation__Group_1__4__Impl : ( ( rule__Implementation__StrategieAssignment_1_4 ) ) ;
    public final void rule__Implementation__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:723:1: ( ( ( rule__Implementation__StrategieAssignment_1_4 ) ) )
            // InternalMyDsl.g:724:1: ( ( rule__Implementation__StrategieAssignment_1_4 ) )
            {
            // InternalMyDsl.g:724:1: ( ( rule__Implementation__StrategieAssignment_1_4 ) )
            // InternalMyDsl.g:725:2: ( rule__Implementation__StrategieAssignment_1_4 )
            {
             before(grammarAccess.getImplementationAccess().getStrategieAssignment_1_4()); 
            // InternalMyDsl.g:726:2: ( rule__Implementation__StrategieAssignment_1_4 )
            // InternalMyDsl.g:726:3: rule__Implementation__StrategieAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Implementation__StrategieAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getImplementationAccess().getStrategieAssignment_1_4()); 

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
    // $ANTLR end "rule__Implementation__Group_1__4__Impl"


    // $ANTLR start "rule__Implementation__Group_1__5"
    // InternalMyDsl.g:734:1: rule__Implementation__Group_1__5 : rule__Implementation__Group_1__5__Impl ;
    public final void rule__Implementation__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:738:1: ( rule__Implementation__Group_1__5__Impl )
            // InternalMyDsl.g:739:2: rule__Implementation__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Implementation__Group_1__5__Impl();

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
    // $ANTLR end "rule__Implementation__Group_1__5"


    // $ANTLR start "rule__Implementation__Group_1__5__Impl"
    // InternalMyDsl.g:745:1: rule__Implementation__Group_1__5__Impl : ( '}' ) ;
    public final void rule__Implementation__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:749:1: ( ( '}' ) )
            // InternalMyDsl.g:750:1: ( '}' )
            {
            // InternalMyDsl.g:750:1: ( '}' )
            // InternalMyDsl.g:751:2: '}'
            {
             before(grammarAccess.getImplementationAccess().getRightCurlyBracketKeyword_1_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getImplementationAccess().getRightCurlyBracketKeyword_1_5()); 

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
    // $ANTLR end "rule__Implementation__Group_1__5__Impl"


    // $ANTLR start "rule__Dataset__Group__0"
    // InternalMyDsl.g:761:1: rule__Dataset__Group__0 : rule__Dataset__Group__0__Impl rule__Dataset__Group__1 ;
    public final void rule__Dataset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:765:1: ( rule__Dataset__Group__0__Impl rule__Dataset__Group__1 )
            // InternalMyDsl.g:766:2: rule__Dataset__Group__0__Impl rule__Dataset__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Dataset__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dataset__Group__1();

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
    // $ANTLR end "rule__Dataset__Group__0"


    // $ANTLR start "rule__Dataset__Group__0__Impl"
    // InternalMyDsl.g:773:1: rule__Dataset__Group__0__Impl : ( 'Dataset' ) ;
    public final void rule__Dataset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:777:1: ( ( 'Dataset' ) )
            // InternalMyDsl.g:778:1: ( 'Dataset' )
            {
            // InternalMyDsl.g:778:1: ( 'Dataset' )
            // InternalMyDsl.g:779:2: 'Dataset'
            {
             before(grammarAccess.getDatasetAccess().getDatasetKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDatasetAccess().getDatasetKeyword_0()); 

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
    // $ANTLR end "rule__Dataset__Group__0__Impl"


    // $ANTLR start "rule__Dataset__Group__1"
    // InternalMyDsl.g:788:1: rule__Dataset__Group__1 : rule__Dataset__Group__1__Impl rule__Dataset__Group__2 ;
    public final void rule__Dataset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:792:1: ( rule__Dataset__Group__1__Impl rule__Dataset__Group__2 )
            // InternalMyDsl.g:793:2: rule__Dataset__Group__1__Impl rule__Dataset__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Dataset__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dataset__Group__2();

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
    // $ANTLR end "rule__Dataset__Group__1"


    // $ANTLR start "rule__Dataset__Group__1__Impl"
    // InternalMyDsl.g:800:1: rule__Dataset__Group__1__Impl : ( ( rule__Dataset__PathAssignment_1 ) ) ;
    public final void rule__Dataset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:804:1: ( ( ( rule__Dataset__PathAssignment_1 ) ) )
            // InternalMyDsl.g:805:1: ( ( rule__Dataset__PathAssignment_1 ) )
            {
            // InternalMyDsl.g:805:1: ( ( rule__Dataset__PathAssignment_1 ) )
            // InternalMyDsl.g:806:2: ( rule__Dataset__PathAssignment_1 )
            {
             before(grammarAccess.getDatasetAccess().getPathAssignment_1()); 
            // InternalMyDsl.g:807:2: ( rule__Dataset__PathAssignment_1 )
            // InternalMyDsl.g:807:3: rule__Dataset__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Dataset__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDatasetAccess().getPathAssignment_1()); 

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
    // $ANTLR end "rule__Dataset__Group__1__Impl"


    // $ANTLR start "rule__Dataset__Group__2"
    // InternalMyDsl.g:815:1: rule__Dataset__Group__2 : rule__Dataset__Group__2__Impl rule__Dataset__Group__3 ;
    public final void rule__Dataset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:819:1: ( rule__Dataset__Group__2__Impl rule__Dataset__Group__3 )
            // InternalMyDsl.g:820:2: rule__Dataset__Group__2__Impl rule__Dataset__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Dataset__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dataset__Group__3();

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
    // $ANTLR end "rule__Dataset__Group__2"


    // $ANTLR start "rule__Dataset__Group__2__Impl"
    // InternalMyDsl.g:827:1: rule__Dataset__Group__2__Impl : ( '{' ) ;
    public final void rule__Dataset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:831:1: ( ( '{' ) )
            // InternalMyDsl.g:832:1: ( '{' )
            {
            // InternalMyDsl.g:832:1: ( '{' )
            // InternalMyDsl.g:833:2: '{'
            {
             before(grammarAccess.getDatasetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDatasetAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Dataset__Group__2__Impl"


    // $ANTLR start "rule__Dataset__Group__3"
    // InternalMyDsl.g:842:1: rule__Dataset__Group__3 : rule__Dataset__Group__3__Impl rule__Dataset__Group__4 ;
    public final void rule__Dataset__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:846:1: ( rule__Dataset__Group__3__Impl rule__Dataset__Group__4 )
            // InternalMyDsl.g:847:2: rule__Dataset__Group__3__Impl rule__Dataset__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Dataset__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dataset__Group__4();

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
    // $ANTLR end "rule__Dataset__Group__3"


    // $ANTLR start "rule__Dataset__Group__3__Impl"
    // InternalMyDsl.g:854:1: rule__Dataset__Group__3__Impl : ( ( rule__Dataset__CibleAssignment_3 ) ) ;
    public final void rule__Dataset__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:858:1: ( ( ( rule__Dataset__CibleAssignment_3 ) ) )
            // InternalMyDsl.g:859:1: ( ( rule__Dataset__CibleAssignment_3 ) )
            {
            // InternalMyDsl.g:859:1: ( ( rule__Dataset__CibleAssignment_3 ) )
            // InternalMyDsl.g:860:2: ( rule__Dataset__CibleAssignment_3 )
            {
             before(grammarAccess.getDatasetAccess().getCibleAssignment_3()); 
            // InternalMyDsl.g:861:2: ( rule__Dataset__CibleAssignment_3 )
            // InternalMyDsl.g:861:3: rule__Dataset__CibleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Dataset__CibleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDatasetAccess().getCibleAssignment_3()); 

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
    // $ANTLR end "rule__Dataset__Group__3__Impl"


    // $ANTLR start "rule__Dataset__Group__4"
    // InternalMyDsl.g:869:1: rule__Dataset__Group__4 : rule__Dataset__Group__4__Impl rule__Dataset__Group__5 ;
    public final void rule__Dataset__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:873:1: ( rule__Dataset__Group__4__Impl rule__Dataset__Group__5 )
            // InternalMyDsl.g:874:2: rule__Dataset__Group__4__Impl rule__Dataset__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Dataset__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dataset__Group__5();

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
    // $ANTLR end "rule__Dataset__Group__4"


    // $ANTLR start "rule__Dataset__Group__4__Impl"
    // InternalMyDsl.g:881:1: rule__Dataset__Group__4__Impl : ( ( rule__Dataset__PredictivesAssignment_4 ) ) ;
    public final void rule__Dataset__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:885:1: ( ( ( rule__Dataset__PredictivesAssignment_4 ) ) )
            // InternalMyDsl.g:886:1: ( ( rule__Dataset__PredictivesAssignment_4 ) )
            {
            // InternalMyDsl.g:886:1: ( ( rule__Dataset__PredictivesAssignment_4 ) )
            // InternalMyDsl.g:887:2: ( rule__Dataset__PredictivesAssignment_4 )
            {
             before(grammarAccess.getDatasetAccess().getPredictivesAssignment_4()); 
            // InternalMyDsl.g:888:2: ( rule__Dataset__PredictivesAssignment_4 )
            // InternalMyDsl.g:888:3: rule__Dataset__PredictivesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Dataset__PredictivesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDatasetAccess().getPredictivesAssignment_4()); 

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
    // $ANTLR end "rule__Dataset__Group__4__Impl"


    // $ANTLR start "rule__Dataset__Group__5"
    // InternalMyDsl.g:896:1: rule__Dataset__Group__5 : rule__Dataset__Group__5__Impl ;
    public final void rule__Dataset__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:900:1: ( rule__Dataset__Group__5__Impl )
            // InternalMyDsl.g:901:2: rule__Dataset__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dataset__Group__5__Impl();

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
    // $ANTLR end "rule__Dataset__Group__5"


    // $ANTLR start "rule__Dataset__Group__5__Impl"
    // InternalMyDsl.g:907:1: rule__Dataset__Group__5__Impl : ( '}' ) ;
    public final void rule__Dataset__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:911:1: ( ( '}' ) )
            // InternalMyDsl.g:912:1: ( '}' )
            {
            // InternalMyDsl.g:912:1: ( '}' )
            // InternalMyDsl.g:913:2: '}'
            {
             before(grammarAccess.getDatasetAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDatasetAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Dataset__Group__5__Impl"


    // $ANTLR start "rule__Strategie__Group_0__0"
    // InternalMyDsl.g:923:1: rule__Strategie__Group_0__0 : rule__Strategie__Group_0__0__Impl rule__Strategie__Group_0__1 ;
    public final void rule__Strategie__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:927:1: ( rule__Strategie__Group_0__0__Impl rule__Strategie__Group_0__1 )
            // InternalMyDsl.g:928:2: rule__Strategie__Group_0__0__Impl rule__Strategie__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Strategie__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Strategie__Group_0__1();

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
    // $ANTLR end "rule__Strategie__Group_0__0"


    // $ANTLR start "rule__Strategie__Group_0__0__Impl"
    // InternalMyDsl.g:935:1: rule__Strategie__Group_0__0__Impl : ( 'Strategie' ) ;
    public final void rule__Strategie__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:939:1: ( ( 'Strategie' ) )
            // InternalMyDsl.g:940:1: ( 'Strategie' )
            {
            // InternalMyDsl.g:940:1: ( 'Strategie' )
            // InternalMyDsl.g:941:2: 'Strategie'
            {
             before(grammarAccess.getStrategieAccess().getStrategieKeyword_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStrategieAccess().getStrategieKeyword_0_0()); 

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
    // $ANTLR end "rule__Strategie__Group_0__0__Impl"


    // $ANTLR start "rule__Strategie__Group_0__1"
    // InternalMyDsl.g:950:1: rule__Strategie__Group_0__1 : rule__Strategie__Group_0__1__Impl ;
    public final void rule__Strategie__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:954:1: ( rule__Strategie__Group_0__1__Impl )
            // InternalMyDsl.g:955:2: rule__Strategie__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Strategie__Group_0__1__Impl();

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
    // $ANTLR end "rule__Strategie__Group_0__1"


    // $ANTLR start "rule__Strategie__Group_0__1__Impl"
    // InternalMyDsl.g:961:1: rule__Strategie__Group_0__1__Impl : ( ( rule__Strategie__StrategieAssignment_0_1 ) ) ;
    public final void rule__Strategie__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:965:1: ( ( ( rule__Strategie__StrategieAssignment_0_1 ) ) )
            // InternalMyDsl.g:966:1: ( ( rule__Strategie__StrategieAssignment_0_1 ) )
            {
            // InternalMyDsl.g:966:1: ( ( rule__Strategie__StrategieAssignment_0_1 ) )
            // InternalMyDsl.g:967:2: ( rule__Strategie__StrategieAssignment_0_1 )
            {
             before(grammarAccess.getStrategieAccess().getStrategieAssignment_0_1()); 
            // InternalMyDsl.g:968:2: ( rule__Strategie__StrategieAssignment_0_1 )
            // InternalMyDsl.g:968:3: rule__Strategie__StrategieAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Strategie__StrategieAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getStrategieAccess().getStrategieAssignment_0_1()); 

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
    // $ANTLR end "rule__Strategie__Group_0__1__Impl"


    // $ANTLR start "rule__Validation__Group__0"
    // InternalMyDsl.g:977:1: rule__Validation__Group__0 : rule__Validation__Group__0__Impl rule__Validation__Group__1 ;
    public final void rule__Validation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:981:1: ( rule__Validation__Group__0__Impl rule__Validation__Group__1 )
            // InternalMyDsl.g:982:2: rule__Validation__Group__0__Impl rule__Validation__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Validation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Validation__Group__1();

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
    // $ANTLR end "rule__Validation__Group__0"


    // $ANTLR start "rule__Validation__Group__0__Impl"
    // InternalMyDsl.g:989:1: rule__Validation__Group__0__Impl : ( 'Validation' ) ;
    public final void rule__Validation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:993:1: ( ( 'Validation' ) )
            // InternalMyDsl.g:994:1: ( 'Validation' )
            {
            // InternalMyDsl.g:994:1: ( 'Validation' )
            // InternalMyDsl.g:995:2: 'Validation'
            {
             before(grammarAccess.getValidationAccess().getValidationKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getValidationAccess().getValidationKeyword_0()); 

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
    // $ANTLR end "rule__Validation__Group__0__Impl"


    // $ANTLR start "rule__Validation__Group__1"
    // InternalMyDsl.g:1004:1: rule__Validation__Group__1 : rule__Validation__Group__1__Impl ;
    public final void rule__Validation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1008:1: ( rule__Validation__Group__1__Impl )
            // InternalMyDsl.g:1009:2: rule__Validation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Validation__Group__1__Impl();

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
    // $ANTLR end "rule__Validation__Group__1"


    // $ANTLR start "rule__Validation__Group__1__Impl"
    // InternalMyDsl.g:1015:1: rule__Validation__Group__1__Impl : ( ( rule__Validation__PourcentageAssignment_1 ) ) ;
    public final void rule__Validation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1019:1: ( ( ( rule__Validation__PourcentageAssignment_1 ) ) )
            // InternalMyDsl.g:1020:1: ( ( rule__Validation__PourcentageAssignment_1 ) )
            {
            // InternalMyDsl.g:1020:1: ( ( rule__Validation__PourcentageAssignment_1 ) )
            // InternalMyDsl.g:1021:2: ( rule__Validation__PourcentageAssignment_1 )
            {
             before(grammarAccess.getValidationAccess().getPourcentageAssignment_1()); 
            // InternalMyDsl.g:1022:2: ( rule__Validation__PourcentageAssignment_1 )
            // InternalMyDsl.g:1022:3: rule__Validation__PourcentageAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Validation__PourcentageAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValidationAccess().getPourcentageAssignment_1()); 

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
    // $ANTLR end "rule__Validation__Group__1__Impl"


    // $ANTLR start "rule__CrossValidation__Group__0"
    // InternalMyDsl.g:1031:1: rule__CrossValidation__Group__0 : rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1 ;
    public final void rule__CrossValidation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1035:1: ( rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1 )
            // InternalMyDsl.g:1036:2: rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__CrossValidation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CrossValidation__Group__1();

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
    // $ANTLR end "rule__CrossValidation__Group__0"


    // $ANTLR start "rule__CrossValidation__Group__0__Impl"
    // InternalMyDsl.g:1043:1: rule__CrossValidation__Group__0__Impl : ( () ) ;
    public final void rule__CrossValidation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1047:1: ( ( () ) )
            // InternalMyDsl.g:1048:1: ( () )
            {
            // InternalMyDsl.g:1048:1: ( () )
            // InternalMyDsl.g:1049:2: ()
            {
             before(grammarAccess.getCrossValidationAccess().getCrossValidationAction_0()); 
            // InternalMyDsl.g:1050:2: ()
            // InternalMyDsl.g:1050:3: 
            {
            }

             after(grammarAccess.getCrossValidationAccess().getCrossValidationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__Group__0__Impl"


    // $ANTLR start "rule__CrossValidation__Group__1"
    // InternalMyDsl.g:1058:1: rule__CrossValidation__Group__1 : rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2 ;
    public final void rule__CrossValidation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1062:1: ( rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2 )
            // InternalMyDsl.g:1063:2: rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__CrossValidation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CrossValidation__Group__2();

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
    // $ANTLR end "rule__CrossValidation__Group__1"


    // $ANTLR start "rule__CrossValidation__Group__1__Impl"
    // InternalMyDsl.g:1070:1: rule__CrossValidation__Group__1__Impl : ( 'CrossValidation' ) ;
    public final void rule__CrossValidation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1074:1: ( ( 'CrossValidation' ) )
            // InternalMyDsl.g:1075:1: ( 'CrossValidation' )
            {
            // InternalMyDsl.g:1075:1: ( 'CrossValidation' )
            // InternalMyDsl.g:1076:2: 'CrossValidation'
            {
             before(grammarAccess.getCrossValidationAccess().getCrossValidationKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCrossValidationAccess().getCrossValidationKeyword_1()); 

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
    // $ANTLR end "rule__CrossValidation__Group__1__Impl"


    // $ANTLR start "rule__CrossValidation__Group__2"
    // InternalMyDsl.g:1085:1: rule__CrossValidation__Group__2 : rule__CrossValidation__Group__2__Impl ;
    public final void rule__CrossValidation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1089:1: ( rule__CrossValidation__Group__2__Impl )
            // InternalMyDsl.g:1090:2: rule__CrossValidation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CrossValidation__Group__2__Impl();

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
    // $ANTLR end "rule__CrossValidation__Group__2"


    // $ANTLR start "rule__CrossValidation__Group__2__Impl"
    // InternalMyDsl.g:1096:1: rule__CrossValidation__Group__2__Impl : ( ( rule__CrossValidation__KAssignment_2 )? ) ;
    public final void rule__CrossValidation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1100:1: ( ( ( rule__CrossValidation__KAssignment_2 )? ) )
            // InternalMyDsl.g:1101:1: ( ( rule__CrossValidation__KAssignment_2 )? )
            {
            // InternalMyDsl.g:1101:1: ( ( rule__CrossValidation__KAssignment_2 )? )
            // InternalMyDsl.g:1102:2: ( rule__CrossValidation__KAssignment_2 )?
            {
             before(grammarAccess.getCrossValidationAccess().getKAssignment_2()); 
            // InternalMyDsl.g:1103:2: ( rule__CrossValidation__KAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:1103:3: rule__CrossValidation__KAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CrossValidation__KAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCrossValidationAccess().getKAssignment_2()); 

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
    // $ANTLR end "rule__CrossValidation__Group__2__Impl"


    // $ANTLR start "rule__Cible__Group__0"
    // InternalMyDsl.g:1112:1: rule__Cible__Group__0 : rule__Cible__Group__0__Impl rule__Cible__Group__1 ;
    public final void rule__Cible__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1116:1: ( rule__Cible__Group__0__Impl rule__Cible__Group__1 )
            // InternalMyDsl.g:1117:2: rule__Cible__Group__0__Impl rule__Cible__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Cible__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cible__Group__1();

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
    // $ANTLR end "rule__Cible__Group__0"


    // $ANTLR start "rule__Cible__Group__0__Impl"
    // InternalMyDsl.g:1124:1: rule__Cible__Group__0__Impl : ( 'Cible' ) ;
    public final void rule__Cible__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1128:1: ( ( 'Cible' ) )
            // InternalMyDsl.g:1129:1: ( 'Cible' )
            {
            // InternalMyDsl.g:1129:1: ( 'Cible' )
            // InternalMyDsl.g:1130:2: 'Cible'
            {
             before(grammarAccess.getCibleAccess().getCibleKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCibleAccess().getCibleKeyword_0()); 

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
    // $ANTLR end "rule__Cible__Group__0__Impl"


    // $ANTLR start "rule__Cible__Group__1"
    // InternalMyDsl.g:1139:1: rule__Cible__Group__1 : rule__Cible__Group__1__Impl ;
    public final void rule__Cible__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1143:1: ( rule__Cible__Group__1__Impl )
            // InternalMyDsl.g:1144:2: rule__Cible__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cible__Group__1__Impl();

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
    // $ANTLR end "rule__Cible__Group__1"


    // $ANTLR start "rule__Cible__Group__1__Impl"
    // InternalMyDsl.g:1150:1: rule__Cible__Group__1__Impl : ( ruleidColonne ) ;
    public final void rule__Cible__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1154:1: ( ( ruleidColonne ) )
            // InternalMyDsl.g:1155:1: ( ruleidColonne )
            {
            // InternalMyDsl.g:1155:1: ( ruleidColonne )
            // InternalMyDsl.g:1156:2: ruleidColonne
            {
             before(grammarAccess.getCibleAccess().getIdColonneParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleidColonne();

            state._fsp--;

             after(grammarAccess.getCibleAccess().getIdColonneParserRuleCall_1()); 

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
    // $ANTLR end "rule__Cible__Group__1__Impl"


    // $ANTLR start "rule__Predictives__Group__0"
    // InternalMyDsl.g:1166:1: rule__Predictives__Group__0 : rule__Predictives__Group__0__Impl rule__Predictives__Group__1 ;
    public final void rule__Predictives__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1170:1: ( rule__Predictives__Group__0__Impl rule__Predictives__Group__1 )
            // InternalMyDsl.g:1171:2: rule__Predictives__Group__0__Impl rule__Predictives__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Predictives__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predictives__Group__1();

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
    // $ANTLR end "rule__Predictives__Group__0"


    // $ANTLR start "rule__Predictives__Group__0__Impl"
    // InternalMyDsl.g:1178:1: rule__Predictives__Group__0__Impl : ( 'Predictives' ) ;
    public final void rule__Predictives__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1182:1: ( ( 'Predictives' ) )
            // InternalMyDsl.g:1183:1: ( 'Predictives' )
            {
            // InternalMyDsl.g:1183:1: ( 'Predictives' )
            // InternalMyDsl.g:1184:2: 'Predictives'
            {
             before(grammarAccess.getPredictivesAccess().getPredictivesKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPredictivesAccess().getPredictivesKeyword_0()); 

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
    // $ANTLR end "rule__Predictives__Group__0__Impl"


    // $ANTLR start "rule__Predictives__Group__1"
    // InternalMyDsl.g:1193:1: rule__Predictives__Group__1 : rule__Predictives__Group__1__Impl ;
    public final void rule__Predictives__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1197:1: ( rule__Predictives__Group__1__Impl )
            // InternalMyDsl.g:1198:2: rule__Predictives__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Predictives__Group__1__Impl();

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
    // $ANTLR end "rule__Predictives__Group__1"


    // $ANTLR start "rule__Predictives__Group__1__Impl"
    // InternalMyDsl.g:1204:1: rule__Predictives__Group__1__Impl : ( ( ( rule__Predictives__PredictivesAssignment_1 ) ) ( ( rule__Predictives__PredictivesAssignment_1 )* ) ) ;
    public final void rule__Predictives__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1208:1: ( ( ( ( rule__Predictives__PredictivesAssignment_1 ) ) ( ( rule__Predictives__PredictivesAssignment_1 )* ) ) )
            // InternalMyDsl.g:1209:1: ( ( ( rule__Predictives__PredictivesAssignment_1 ) ) ( ( rule__Predictives__PredictivesAssignment_1 )* ) )
            {
            // InternalMyDsl.g:1209:1: ( ( ( rule__Predictives__PredictivesAssignment_1 ) ) ( ( rule__Predictives__PredictivesAssignment_1 )* ) )
            // InternalMyDsl.g:1210:2: ( ( rule__Predictives__PredictivesAssignment_1 ) ) ( ( rule__Predictives__PredictivesAssignment_1 )* )
            {
            // InternalMyDsl.g:1210:2: ( ( rule__Predictives__PredictivesAssignment_1 ) )
            // InternalMyDsl.g:1211:3: ( rule__Predictives__PredictivesAssignment_1 )
            {
             before(grammarAccess.getPredictivesAccess().getPredictivesAssignment_1()); 
            // InternalMyDsl.g:1212:3: ( rule__Predictives__PredictivesAssignment_1 )
            // InternalMyDsl.g:1212:4: rule__Predictives__PredictivesAssignment_1
            {
            pushFollow(FOLLOW_20);
            rule__Predictives__PredictivesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPredictivesAccess().getPredictivesAssignment_1()); 

            }

            // InternalMyDsl.g:1215:2: ( ( rule__Predictives__PredictivesAssignment_1 )* )
            // InternalMyDsl.g:1216:3: ( rule__Predictives__PredictivesAssignment_1 )*
            {
             before(grammarAccess.getPredictivesAccess().getPredictivesAssignment_1()); 
            // InternalMyDsl.g:1217:3: ( rule__Predictives__PredictivesAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:1217:4: rule__Predictives__PredictivesAssignment_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Predictives__PredictivesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPredictivesAccess().getPredictivesAssignment_1()); 

            }


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
    // $ANTLR end "rule__Predictives__Group__1__Impl"


    // $ANTLR start "rule__IdColonne__Group__0"
    // InternalMyDsl.g:1227:1: rule__IdColonne__Group__0 : rule__IdColonne__Group__0__Impl rule__IdColonne__Group__1 ;
    public final void rule__IdColonne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1231:1: ( rule__IdColonne__Group__0__Impl rule__IdColonne__Group__1 )
            // InternalMyDsl.g:1232:2: rule__IdColonne__Group__0__Impl rule__IdColonne__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__IdColonne__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IdColonne__Group__1();

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
    // $ANTLR end "rule__IdColonne__Group__0"


    // $ANTLR start "rule__IdColonne__Group__0__Impl"
    // InternalMyDsl.g:1239:1: rule__IdColonne__Group__0__Impl : ( 'Colonne' ) ;
    public final void rule__IdColonne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1243:1: ( ( 'Colonne' ) )
            // InternalMyDsl.g:1244:1: ( 'Colonne' )
            {
            // InternalMyDsl.g:1244:1: ( 'Colonne' )
            // InternalMyDsl.g:1245:2: 'Colonne'
            {
             before(grammarAccess.getIdColonneAccess().getColonneKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getIdColonneAccess().getColonneKeyword_0()); 

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
    // $ANTLR end "rule__IdColonne__Group__0__Impl"


    // $ANTLR start "rule__IdColonne__Group__1"
    // InternalMyDsl.g:1254:1: rule__IdColonne__Group__1 : rule__IdColonne__Group__1__Impl ;
    public final void rule__IdColonne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1258:1: ( rule__IdColonne__Group__1__Impl )
            // InternalMyDsl.g:1259:2: rule__IdColonne__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IdColonne__Group__1__Impl();

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
    // $ANTLR end "rule__IdColonne__Group__1"


    // $ANTLR start "rule__IdColonne__Group__1__Impl"
    // InternalMyDsl.g:1265:1: rule__IdColonne__Group__1__Impl : ( ( rule__IdColonne__IdAssignment_1 ) ) ;
    public final void rule__IdColonne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1269:1: ( ( ( rule__IdColonne__IdAssignment_1 ) ) )
            // InternalMyDsl.g:1270:1: ( ( rule__IdColonne__IdAssignment_1 ) )
            {
            // InternalMyDsl.g:1270:1: ( ( rule__IdColonne__IdAssignment_1 ) )
            // InternalMyDsl.g:1271:2: ( rule__IdColonne__IdAssignment_1 )
            {
             before(grammarAccess.getIdColonneAccess().getIdAssignment_1()); 
            // InternalMyDsl.g:1272:2: ( rule__IdColonne__IdAssignment_1 )
            // InternalMyDsl.g:1272:3: rule__IdColonne__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IdColonne__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIdColonneAccess().getIdAssignment_1()); 

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
    // $ANTLR end "rule__IdColonne__Group__1__Impl"


    // $ANTLR start "rule__Algorithme__Group__0"
    // InternalMyDsl.g:1281:1: rule__Algorithme__Group__0 : rule__Algorithme__Group__0__Impl rule__Algorithme__Group__1 ;
    public final void rule__Algorithme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1285:1: ( rule__Algorithme__Group__0__Impl rule__Algorithme__Group__1 )
            // InternalMyDsl.g:1286:2: rule__Algorithme__Group__0__Impl rule__Algorithme__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Algorithme__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithme__Group__1();

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
    // $ANTLR end "rule__Algorithme__Group__0"


    // $ANTLR start "rule__Algorithme__Group__0__Impl"
    // InternalMyDsl.g:1293:1: rule__Algorithme__Group__0__Impl : ( 'Algorithme' ) ;
    public final void rule__Algorithme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1297:1: ( ( 'Algorithme' ) )
            // InternalMyDsl.g:1298:1: ( 'Algorithme' )
            {
            // InternalMyDsl.g:1298:1: ( 'Algorithme' )
            // InternalMyDsl.g:1299:2: 'Algorithme'
            {
             before(grammarAccess.getAlgorithmeAccess().getAlgorithmeKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAlgorithmeAccess().getAlgorithmeKeyword_0()); 

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
    // $ANTLR end "rule__Algorithme__Group__0__Impl"


    // $ANTLR start "rule__Algorithme__Group__1"
    // InternalMyDsl.g:1308:1: rule__Algorithme__Group__1 : rule__Algorithme__Group__1__Impl ;
    public final void rule__Algorithme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1312:1: ( rule__Algorithme__Group__1__Impl )
            // InternalMyDsl.g:1313:2: rule__Algorithme__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Algorithme__Group__1__Impl();

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
    // $ANTLR end "rule__Algorithme__Group__1"


    // $ANTLR start "rule__Algorithme__Group__1__Impl"
    // InternalMyDsl.g:1319:1: rule__Algorithme__Group__1__Impl : ( ( rule__Algorithme__TextAssignment_1 ) ) ;
    public final void rule__Algorithme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1323:1: ( ( ( rule__Algorithme__TextAssignment_1 ) ) )
            // InternalMyDsl.g:1324:1: ( ( rule__Algorithme__TextAssignment_1 ) )
            {
            // InternalMyDsl.g:1324:1: ( ( rule__Algorithme__TextAssignment_1 ) )
            // InternalMyDsl.g:1325:2: ( rule__Algorithme__TextAssignment_1 )
            {
             before(grammarAccess.getAlgorithmeAccess().getTextAssignment_1()); 
            // InternalMyDsl.g:1326:2: ( rule__Algorithme__TextAssignment_1 )
            // InternalMyDsl.g:1326:3: rule__Algorithme__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Algorithme__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmeAccess().getTextAssignment_1()); 

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
    // $ANTLR end "rule__Algorithme__Group__1__Impl"


    // $ANTLR start "rule__Metrique__Group__0"
    // InternalMyDsl.g:1335:1: rule__Metrique__Group__0 : rule__Metrique__Group__0__Impl rule__Metrique__Group__1 ;
    public final void rule__Metrique__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1339:1: ( rule__Metrique__Group__0__Impl rule__Metrique__Group__1 )
            // InternalMyDsl.g:1340:2: rule__Metrique__Group__0__Impl rule__Metrique__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Metrique__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metrique__Group__1();

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
    // $ANTLR end "rule__Metrique__Group__0"


    // $ANTLR start "rule__Metrique__Group__0__Impl"
    // InternalMyDsl.g:1347:1: rule__Metrique__Group__0__Impl : ( 'Metrique' ) ;
    public final void rule__Metrique__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1351:1: ( ( 'Metrique' ) )
            // InternalMyDsl.g:1352:1: ( 'Metrique' )
            {
            // InternalMyDsl.g:1352:1: ( 'Metrique' )
            // InternalMyDsl.g:1353:2: 'Metrique'
            {
             before(grammarAccess.getMetriqueAccess().getMetriqueKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMetriqueAccess().getMetriqueKeyword_0()); 

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
    // $ANTLR end "rule__Metrique__Group__0__Impl"


    // $ANTLR start "rule__Metrique__Group__1"
    // InternalMyDsl.g:1362:1: rule__Metrique__Group__1 : rule__Metrique__Group__1__Impl ;
    public final void rule__Metrique__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1366:1: ( rule__Metrique__Group__1__Impl )
            // InternalMyDsl.g:1367:2: rule__Metrique__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Metrique__Group__1__Impl();

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
    // $ANTLR end "rule__Metrique__Group__1"


    // $ANTLR start "rule__Metrique__Group__1__Impl"
    // InternalMyDsl.g:1373:1: rule__Metrique__Group__1__Impl : ( ( rule__Metrique__TextAssignment_1 ) ) ;
    public final void rule__Metrique__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1377:1: ( ( ( rule__Metrique__TextAssignment_1 ) ) )
            // InternalMyDsl.g:1378:1: ( ( rule__Metrique__TextAssignment_1 ) )
            {
            // InternalMyDsl.g:1378:1: ( ( rule__Metrique__TextAssignment_1 ) )
            // InternalMyDsl.g:1379:2: ( rule__Metrique__TextAssignment_1 )
            {
             before(grammarAccess.getMetriqueAccess().getTextAssignment_1()); 
            // InternalMyDsl.g:1380:2: ( rule__Metrique__TextAssignment_1 )
            // InternalMyDsl.g:1380:3: rule__Metrique__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Metrique__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetriqueAccess().getTextAssignment_1()); 

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
    // $ANTLR end "rule__Metrique__Group__1__Impl"


    // $ANTLR start "rule__MML__MmlAssignment_2"
    // InternalMyDsl.g:1389:1: rule__MML__MmlAssignment_2 : ( ruleImplementation ) ;
    public final void rule__MML__MmlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1393:1: ( ( ruleImplementation ) )
            // InternalMyDsl.g:1394:2: ( ruleImplementation )
            {
            // InternalMyDsl.g:1394:2: ( ruleImplementation )
            // InternalMyDsl.g:1395:3: ruleImplementation
            {
             before(grammarAccess.getMMLAccess().getMmlImplementationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImplementation();

            state._fsp--;

             after(grammarAccess.getMMLAccess().getMmlImplementationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MML__MmlAssignment_2"


    // $ANTLR start "rule__MML__MmlAssignment_3"
    // InternalMyDsl.g:1404:1: rule__MML__MmlAssignment_3 : ( ruleDataset ) ;
    public final void rule__MML__MmlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1408:1: ( ( ruleDataset ) )
            // InternalMyDsl.g:1409:2: ( ruleDataset )
            {
            // InternalMyDsl.g:1409:2: ( ruleDataset )
            // InternalMyDsl.g:1410:3: ruleDataset
            {
             before(grammarAccess.getMMLAccess().getMmlDatasetParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDataset();

            state._fsp--;

             after(grammarAccess.getMMLAccess().getMmlDatasetParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MML__MmlAssignment_3"


    // $ANTLR start "rule__Implementation__AlgoAssignment_1_2"
    // InternalMyDsl.g:1419:1: rule__Implementation__AlgoAssignment_1_2 : ( ruleAlgorithme ) ;
    public final void rule__Implementation__AlgoAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1423:1: ( ( ruleAlgorithme ) )
            // InternalMyDsl.g:1424:2: ( ruleAlgorithme )
            {
            // InternalMyDsl.g:1424:2: ( ruleAlgorithme )
            // InternalMyDsl.g:1425:3: ruleAlgorithme
            {
             before(grammarAccess.getImplementationAccess().getAlgoAlgorithmeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAlgorithme();

            state._fsp--;

             after(grammarAccess.getImplementationAccess().getAlgoAlgorithmeParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Implementation__AlgoAssignment_1_2"


    // $ANTLR start "rule__Implementation__MetriqueAssignment_1_3"
    // InternalMyDsl.g:1434:1: rule__Implementation__MetriqueAssignment_1_3 : ( ruleMetrique ) ;
    public final void rule__Implementation__MetriqueAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1438:1: ( ( ruleMetrique ) )
            // InternalMyDsl.g:1439:2: ( ruleMetrique )
            {
            // InternalMyDsl.g:1439:2: ( ruleMetrique )
            // InternalMyDsl.g:1440:3: ruleMetrique
            {
             before(grammarAccess.getImplementationAccess().getMetriqueMetriqueParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMetrique();

            state._fsp--;

             after(grammarAccess.getImplementationAccess().getMetriqueMetriqueParserRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__Implementation__MetriqueAssignment_1_3"


    // $ANTLR start "rule__Implementation__StrategieAssignment_1_4"
    // InternalMyDsl.g:1449:1: rule__Implementation__StrategieAssignment_1_4 : ( ruleStrategie ) ;
    public final void rule__Implementation__StrategieAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1453:1: ( ( ruleStrategie ) )
            // InternalMyDsl.g:1454:2: ( ruleStrategie )
            {
            // InternalMyDsl.g:1454:2: ( ruleStrategie )
            // InternalMyDsl.g:1455:3: ruleStrategie
            {
             before(grammarAccess.getImplementationAccess().getStrategieStrategieParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStrategie();

            state._fsp--;

             after(grammarAccess.getImplementationAccess().getStrategieStrategieParserRuleCall_1_4_0()); 

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
    // $ANTLR end "rule__Implementation__StrategieAssignment_1_4"


    // $ANTLR start "rule__Dataset__PathAssignment_1"
    // InternalMyDsl.g:1464:1: rule__Dataset__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Dataset__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1468:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1469:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1469:2: ( RULE_STRING )
            // InternalMyDsl.g:1470:3: RULE_STRING
            {
             before(grammarAccess.getDatasetAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDatasetAccess().getPathSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Dataset__PathAssignment_1"


    // $ANTLR start "rule__Dataset__CibleAssignment_3"
    // InternalMyDsl.g:1479:1: rule__Dataset__CibleAssignment_3 : ( ruleCible ) ;
    public final void rule__Dataset__CibleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1483:1: ( ( ruleCible ) )
            // InternalMyDsl.g:1484:2: ( ruleCible )
            {
            // InternalMyDsl.g:1484:2: ( ruleCible )
            // InternalMyDsl.g:1485:3: ruleCible
            {
             before(grammarAccess.getDatasetAccess().getCibleCibleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCible();

            state._fsp--;

             after(grammarAccess.getDatasetAccess().getCibleCibleParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Dataset__CibleAssignment_3"


    // $ANTLR start "rule__Dataset__PredictivesAssignment_4"
    // InternalMyDsl.g:1494:1: rule__Dataset__PredictivesAssignment_4 : ( rulePredictives ) ;
    public final void rule__Dataset__PredictivesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1498:1: ( ( rulePredictives ) )
            // InternalMyDsl.g:1499:2: ( rulePredictives )
            {
            // InternalMyDsl.g:1499:2: ( rulePredictives )
            // InternalMyDsl.g:1500:3: rulePredictives
            {
             before(grammarAccess.getDatasetAccess().getPredictivesPredictivesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePredictives();

            state._fsp--;

             after(grammarAccess.getDatasetAccess().getPredictivesPredictivesParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Dataset__PredictivesAssignment_4"


    // $ANTLR start "rule__Strategie__StrategieAssignment_0_1"
    // InternalMyDsl.g:1509:1: rule__Strategie__StrategieAssignment_0_1 : ( ruleValidation ) ;
    public final void rule__Strategie__StrategieAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1513:1: ( ( ruleValidation ) )
            // InternalMyDsl.g:1514:2: ( ruleValidation )
            {
            // InternalMyDsl.g:1514:2: ( ruleValidation )
            // InternalMyDsl.g:1515:3: ruleValidation
            {
             before(grammarAccess.getStrategieAccess().getStrategieValidationParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValidation();

            state._fsp--;

             after(grammarAccess.getStrategieAccess().getStrategieValidationParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Strategie__StrategieAssignment_0_1"


    // $ANTLR start "rule__Validation__PourcentageAssignment_1"
    // InternalMyDsl.g:1524:1: rule__Validation__PourcentageAssignment_1 : ( RULE_INT ) ;
    public final void rule__Validation__PourcentageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1528:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1529:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1529:2: ( RULE_INT )
            // InternalMyDsl.g:1530:3: RULE_INT
            {
             before(grammarAccess.getValidationAccess().getPourcentageINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getValidationAccess().getPourcentageINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Validation__PourcentageAssignment_1"


    // $ANTLR start "rule__CrossValidation__KAssignment_2"
    // InternalMyDsl.g:1539:1: rule__CrossValidation__KAssignment_2 : ( RULE_INT ) ;
    public final void rule__CrossValidation__KAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1543:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1544:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1544:2: ( RULE_INT )
            // InternalMyDsl.g:1545:3: RULE_INT
            {
             before(grammarAccess.getCrossValidationAccess().getKINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCrossValidationAccess().getKINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__CrossValidation__KAssignment_2"


    // $ANTLR start "rule__Predictives__PredictivesAssignment_1"
    // InternalMyDsl.g:1554:1: rule__Predictives__PredictivesAssignment_1 : ( ruleidColonne ) ;
    public final void rule__Predictives__PredictivesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1558:1: ( ( ruleidColonne ) )
            // InternalMyDsl.g:1559:2: ( ruleidColonne )
            {
            // InternalMyDsl.g:1559:2: ( ruleidColonne )
            // InternalMyDsl.g:1560:3: ruleidColonne
            {
             before(grammarAccess.getPredictivesAccess().getPredictivesIdColonneParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleidColonne();

            state._fsp--;

             after(grammarAccess.getPredictivesAccess().getPredictivesIdColonneParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Predictives__PredictivesAssignment_1"


    // $ANTLR start "rule__IdColonne__IdAssignment_1"
    // InternalMyDsl.g:1569:1: rule__IdColonne__IdAssignment_1 : ( RULE_INT ) ;
    public final void rule__IdColonne__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1573:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1574:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1574:2: ( RULE_INT )
            // InternalMyDsl.g:1575:3: RULE_INT
            {
             before(grammarAccess.getIdColonneAccess().getIdINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIdColonneAccess().getIdINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__IdColonne__IdAssignment_1"


    // $ANTLR start "rule__Algorithme__TextAssignment_1"
    // InternalMyDsl.g:1584:1: rule__Algorithme__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Algorithme__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1588:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1589:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1589:2: ( RULE_STRING )
            // InternalMyDsl.g:1590:3: RULE_STRING
            {
             before(grammarAccess.getAlgorithmeAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAlgorithmeAccess().getTextSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Algorithme__TextAssignment_1"


    // $ANTLR start "rule__Metrique__TextAssignment_1"
    // InternalMyDsl.g:1599:1: rule__Metrique__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Metrique__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1603:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1604:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1604:2: ( RULE_STRING )
            // InternalMyDsl.g:1605:3: RULE_STRING
            {
             before(grammarAccess.getMetriqueAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMetriqueAccess().getTextSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Metrique__TextAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800002L});

}