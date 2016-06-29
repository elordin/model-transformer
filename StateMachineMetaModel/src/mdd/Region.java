/**
 */
package mdd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdd.Region#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link mdd.Region#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see mdd.MddPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends EObject {
	/**
	 * Returns the value of the '<em><b>Subvertex</b></em>' containment reference list.
	 * The list contents are of type {@link mdd.Vertex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subvertex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subvertex</em>' containment reference list.
	 * @see mdd.MddPackage#getRegion_Subvertex()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vertex> getSubvertex();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link mdd.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see mdd.MddPackage#getRegion_Transition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransition();

} // Region
