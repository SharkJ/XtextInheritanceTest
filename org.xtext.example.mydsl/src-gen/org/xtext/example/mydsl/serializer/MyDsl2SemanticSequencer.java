/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl2.List;
import org.xtext.example.mydsl.myDsl2.MainModel;
import org.xtext.example.mydsl.myDsl2.MyDsl2Package;
import org.xtext.example.mydsl.myDsl2.Season;
import org.xtext.example.mydsl.services.MyDsl2GrammarAccess;

@SuppressWarnings("all")
public class MyDsl2SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDsl2GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDsl2Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDsl2Package.LIST:
				sequence_List(context, (List) semanticObject); 
				return; 
			case MyDsl2Package.MAIN_MODEL:
				sequence_MainModel(context, (MainModel) semanticObject); 
				return; 
			case MyDsl2Package.SEASON:
				sequence_Season(context, (Season) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     List returns List
	 *
	 * Constraint:
	 *     (alt='Spring' | alt='Summer' | alt='Autumn' | alt='Winter')
	 */
	protected void sequence_List(ISerializationContext context, List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MainModel returns MainModel
	 *
	 * Constraint:
	 *     seasons+=Season+
	 */
	protected void sequence_MainModel(ISerializationContext context, MainModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Season returns Season
	 *
	 * Constraint:
	 *     alt=List
	 */
	protected void sequence_Season(ISerializationContext context, Season semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDsl2Package.Literals.SEASON__ALT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDsl2Package.Literals.SEASON__ALT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSeasonAccess().getAltListParserRuleCall_1_0(), semanticObject.getAlt());
		feeder.finish();
	}
	
	
}