/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.myDsl2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl2.List#getAlt <em>Alt</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl2.MyDsl2Package#getList()
 * @model
 * @generated
 */
public interface List extends EObject
{
  /**
   * Returns the value of the '<em><b>Alt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alt</em>' attribute.
   * @see #setAlt(String)
   * @see org.xtext.example.mydsl.myDsl2.MyDsl2Package#getList_Alt()
   * @model
   * @generated
   */
  String getAlt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl2.List#getAlt <em>Alt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alt</em>' attribute.
   * @see #getAlt()
   * @generated
   */
  void setAlt(String value);

} // List
