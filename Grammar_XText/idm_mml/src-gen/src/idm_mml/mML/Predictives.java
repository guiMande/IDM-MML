/**
 * generated by Xtext 2.19.0
 */
package src.idm_mml.mML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predictives</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link src.idm_mml.mML.Predictives#getPredictives <em>Predictives</em>}</li>
 * </ul>
 *
 * @see src.idm_mml.mML.MMLPackage#getPredictives()
 * @model
 * @generated
 */
public interface Predictives extends EObject
{
  /**
   * Returns the value of the '<em><b>Predictives</b></em>' containment reference list.
   * The list contents are of type {@link src.idm_mml.mML.idColonne}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predictives</em>' containment reference list.
   * @see src.idm_mml.mML.MMLPackage#getPredictives_Predictives()
   * @model containment="true"
   * @generated
   */
  EList<idColonne> getPredictives();

} // Predictives
