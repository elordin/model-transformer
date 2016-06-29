/**
 */
package mdd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdd.Vertex#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link mdd.Vertex#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see mdd.MddPackage#getVertex()
 * @model
 * @generated
 */
public interface Vertex extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link mdd.Transition}.
	 * It is bidirectional and its opposite is '{@link mdd.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see mdd.MddPackage#getVertex_Outgoing()
	 * @see mdd.Transition#getSource
	 * @model opposite="source" derived="true"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link mdd.Transition}.
	 * It is bidirectional and its opposite is '{@link mdd.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see mdd.MddPackage#getVertex_Incoming()
	 * @see mdd.Transition#getTarget
	 * @model opposite="target" derived="true"
	 * @generated
	 */
	EList<Transition> getIncoming();

} // Vertex
