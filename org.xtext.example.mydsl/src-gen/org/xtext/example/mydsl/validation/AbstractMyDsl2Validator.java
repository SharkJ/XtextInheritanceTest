/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractMyDsl2Validator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.example.mydsl.myDsl2.MyDsl2Package.eINSTANCE);
		return result;
	}
}