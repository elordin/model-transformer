/**
 */
package mdd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudo State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdd.PseudoState#getPseudoStateKind <em>Pseudo State Kind</em>}</li>
 * </ul>
 *
 * @see mdd.MddPackage#getPseudoState()
 * @model
 * @generated
 */
public interface PseudoState extends Vertex {
	/**
	 * Returns the value of the '<em><b>Pseudo State Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link mdd.PseudoStateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pseudo State Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pseudo State Kind</em>' attribute.
	 * @see mdd.PseudoStateKind
	 * @see #setPseudoStateKind(PseudoStateKind)
	 * @see mdd.MddPackage#getPseudoState_PseudoStateKind()
	 * @model
	 * @generated
	 */
	PseudoStateKind getPseudoStateKind();

	/**
	 * Sets the value of the '{@link mdd.PseudoState#getPseudoStateKind <em>Pseudo State Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pseudo State Kind</em>' attribute.
	 * @see mdd.PseudoStateKind
	 * @see #getPseudoStateKind()
	 * @generated
	 */
	void setPseudoStateKind(PseudoStateKind value);

} // PseudoState
