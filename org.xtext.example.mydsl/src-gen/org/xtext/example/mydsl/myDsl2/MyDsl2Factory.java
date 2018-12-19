/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.myDsl2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl2.MyDsl2Package
 * @generated
 */
public interface MyDsl2Factory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDsl2Factory eINSTANCE = org.xtext.example.mydsl.myDsl2.impl.MyDsl2FactoryImpl.init();

  /**
   * Returns a new object of class '<em>Main Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Main Model</em>'.
   * @generated
   */
  MainModel createMainModel();

  /**
   * Returns a new object of class '<em>Season</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Season</em>'.
   * @generated
   */
  Season createSeason();

  /**
   * Returns a new object of class '<em>List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List</em>'.
   * @generated
   */
  List createList();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDsl2Package getMyDsl2Package();

} //MyDsl2Factory
