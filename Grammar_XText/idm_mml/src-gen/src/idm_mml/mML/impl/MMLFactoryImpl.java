/**
 * generated by Xtext 2.19.0
 */
package src.idm_mml.mML.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import src.idm_mml.mML.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MMLFactoryImpl extends EFactoryImpl implements MMLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MMLFactory init()
  {
    try
    {
      MMLFactory theMMLFactory = (MMLFactory)EPackage.Registry.INSTANCE.getEFactory(MMLPackage.eNS_URI);
      if (theMMLFactory != null)
      {
        return theMMLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MMLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MMLFactoryImpl()
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
      case MMLPackage.MML: return createMML();
      case MMLPackage.IMPLEMENTATION: return createImplementation();
      case MMLPackage.DATASET: return createDataset();
      case MMLPackage.STRATEGIE: return createStrategie();
      case MMLPackage.VALIDATION: return createValidation();
      case MMLPackage.CROSS_VALIDATION: return createCrossValidation();
      case MMLPackage.CIBLE: return createCible();
      case MMLPackage.PREDICTIVES: return createPredictives();
      case MMLPackage.ID_COLONNE: return createidColonne();
      case MMLPackage.ALGORITHME: return createAlgorithme();
      case MMLPackage.METRIQUE: return createMetrique();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MML createMML()
  {
    MMLImpl mml = new MMLImpl();
    return mml;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Implementation createImplementation()
  {
    ImplementationImpl implementation = new ImplementationImpl();
    return implementation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Dataset createDataset()
  {
    DatasetImpl dataset = new DatasetImpl();
    return dataset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Strategie createStrategie()
  {
    StrategieImpl strategie = new StrategieImpl();
    return strategie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Validation createValidation()
  {
    ValidationImpl validation = new ValidationImpl();
    return validation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CrossValidation createCrossValidation()
  {
    CrossValidationImpl crossValidation = new CrossValidationImpl();
    return crossValidation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Cible createCible()
  {
    CibleImpl cible = new CibleImpl();
    return cible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Predictives createPredictives()
  {
    PredictivesImpl predictives = new PredictivesImpl();
    return predictives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public idColonne createidColonne()
  {
    idColonneImpl idColonne = new idColonneImpl();
    return idColonne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Algorithme createAlgorithme()
  {
    AlgorithmeImpl algorithme = new AlgorithmeImpl();
    return algorithme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Metrique createMetrique()
  {
    MetriqueImpl metrique = new MetriqueImpl();
    return metrique;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MMLPackage getMMLPackage()
  {
    return (MMLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MMLPackage getPackage()
  {
    return MMLPackage.eINSTANCE;
  }

} //MMLFactoryImpl
