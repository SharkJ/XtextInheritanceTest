/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.myDsl2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.myDsl2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDsl2FactoryImpl extends EFactoryImpl implements MyDsl2Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDsl2Factory init()
  {
    try
    {
      MyDsl2Factory theMyDsl2Factory = (MyDsl2Factory)EPackage.Registry.INSTANCE.getEFactory(MyDsl2Package.eNS_URI);
      if (theMyDsl2Factory != null)
      {
        return theMyDsl2Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDsl2FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDsl2FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDsl2Package.MAIN_MODEL: return createMainModel();
      case MyDsl2Package.SEASON: return createSeason();
      case MyDsl2Package.LIST: return createList();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MainModel createMainModel()
  {
    MainModelImpl mainModel = new MainModelImpl();
    return mainModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Season createSeason()
  {
    SeasonImpl season = new SeasonImpl();
    return season;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List createList()
  {
    ListImpl list = new ListImpl();
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDsl2Package getMyDsl2Package()
  {
    return (MyDsl2Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDsl2Package getPackage()
  {
    return MyDsl2Package.eINSTANCE;
  }

} //MyDsl2FactoryImpl
